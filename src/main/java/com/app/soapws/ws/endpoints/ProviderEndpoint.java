package com.app.soapws.ws.endpoints;

import com.app.soapws.model.entities.CountryDTO;
import com.app.soapws.model.entities.ProviderDTO;
import com.app.soapws.model.services.IProviderService;
import com.app.soapws.ws.schemas.providers.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import java.util.List;

@Endpoint
public class ProviderEndpoint {

    private static final String URI_NAMESPACE = "http://soapws.app.com/ws/schemas/providers";

    private IProviderService providerService;

    @Autowired
    public ProviderEndpoint(IProviderService providerService) {
        this.providerService = providerService;
    }

    @PayloadRoot(namespace = URI_NAMESPACE, localPart = "getProviderRequest")
    @ResponsePayload
    public GetProviderResponse getProviderResponse(@RequestPayload GetProviderRequest request) {
        if(request.getOption().equals("list")) {
            return listOrFind(request);
        } else if(request.getOption().equals("add")) {
            return saveOrUpdate(request);
        } else {
            return null;
        }
    }

    private GetProviderResponse listOrFind(GetProviderRequest request) {
        GetProviderResponse response = new GetProviderResponse();
        int id = request.getId()!=null? request.getId() : 0;
        if (id > 0) {
            ProviderDTO provider = providerService.findProvider(id);
            response.getProviders().add(setProperties(provider));
        }else {
            List<ProviderDTO> providers = providerService.listAllProviders();
            for(ProviderDTO x : providers) {
                response.getProviders().add(setProperties(x));
            }
        }
        return response;
    }

    private GetProviderResponse saveOrUpdate(GetProviderRequest request) {
        GetProviderResponse response = new GetProviderResponse();
        ProviderDTO providerDTO;
        if (request.getId() > 0) {
            providerDTO = providerService.findProvider(request.getId());
            providerDTO.setDescription(request.getProviderName());
            providerDTO.setCountryId(request.getCountryId());
            providerService.saveProvider(providerDTO);
            response.setNewProviderStatus("Provider updated successfully");
        } else {
            providerDTO = new ProviderDTO();
            providerDTO.setDescription(request.getProviderName());
            providerDTO.setCountryId(request.getCountryId());
            providerService.saveProvider(providerDTO);
            response.setNewProviderStatus("Provider saved successfully");
        }
        return response;
    }

    private Provider setProperties(ProviderDTO dtoEntity) {
        Provider soapProvider = new Provider();
        soapProvider.setId(dtoEntity.getId());
        soapProvider.setDescription(dtoEntity.getDescription());
        soapProvider.setCountryName(dtoEntity.getCountry().getDescription());
        soapProvider.setRegionName(dtoEntity.getCountry().getRegion().getDescription());
        return soapProvider;
    }

}

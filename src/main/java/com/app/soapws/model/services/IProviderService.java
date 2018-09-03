package com.app.soapws.model.services;

import com.app.soapws.model.entities.ProviderDTO;

import java.util.List;

public interface IProviderService {

    List<ProviderDTO> listAllProviders();
    ProviderDTO findProvider(int id);
    void saveProvider(ProviderDTO provider);

}

package com.app.soapws.model.services.impl;

import com.app.soapws.model.entities.ProviderDTO;
import com.app.soapws.model.repositories.ProviderRepository;
import com.app.soapws.model.services.IProviderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProviderServiceImpl implements IProviderService {

    private final ProviderRepository providerRepository;

    @Autowired
    public ProviderServiceImpl(@Qualifier("providerRepository") ProviderRepository providerRepository) {
        this.providerRepository = providerRepository;
    }

    @Override
    public List<ProviderDTO> listAllProviders() {
        return providerRepository.findAll();
    }

    @Override
    public ProviderDTO findProvider(int id) {
        return providerRepository.findById(id).orElse(null);
    }
}

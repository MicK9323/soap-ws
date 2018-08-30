package com.app.soapws.model.repositories;

import com.app.soapws.model.entities.ProviderDTO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("providerRepository")
public interface ProviderRepository extends JpaRepository<ProviderDTO,Integer> {

    // TODO: Data Object Methods

}

package com.app.soapws.model.repositories;

import com.app.soapws.model.entities.CountryDTO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("countryRepository")
public interface CountryRepository extends JpaRepository<CountryDTO,Integer> {

    // TODO: Data Object Methods

}

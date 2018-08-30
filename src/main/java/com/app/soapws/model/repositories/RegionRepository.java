package com.app.soapws.model.repositories;

import com.app.soapws.model.entities.RegionDTO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("regionRepository")
public interface RegionRepository extends JpaRepository<RegionDTO,Integer> {

    // TODO: Data Object Methods

}

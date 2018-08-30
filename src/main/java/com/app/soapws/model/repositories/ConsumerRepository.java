package com.app.soapws.model.repositories;

import com.app.soapws.model.entities.ConsumerDTO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("consumerRepository")
public interface ConsumerRepository extends JpaRepository<ConsumerDTO,Integer> {

    // TODO: Data Object Methods

}

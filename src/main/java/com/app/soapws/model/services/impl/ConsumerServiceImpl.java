package com.app.soapws.model.services.impl;

import com.app.soapws.model.entities.ConsumerDTO;
import com.app.soapws.model.repositories.ConsumerRepository;
import com.app.soapws.model.services.IConsumerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ConsumerServiceImpl implements IConsumerService {

    private final ConsumerRepository consumerRepository;

    @Autowired
    public ConsumerServiceImpl(@Qualifier("consumerRepository") ConsumerRepository consumerRepository) {
        this.consumerRepository = consumerRepository;
    }

    @Override
    public List<ConsumerDTO> listAllConsumers() {
        return consumerRepository.findAll();
    }

    @Override
    public ConsumerDTO findConsumer(int id) {
        return consumerRepository.findById(id).orElse(null);
    }

    // TODO: Validate the save, update and delete of consumer

    @Override
    public void addConsumer(ConsumerDTO consumer) {
        consumerRepository.save(consumer);
    }

    @Override
    public void removeConsumer(int id) {
        consumerRepository.deleteById(id);
    }

}

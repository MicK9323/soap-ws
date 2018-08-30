package com.app.soapws.model.services;

import com.app.soapws.model.entities.ConsumerDTO;

import java.util.List;

public interface IConsumerService {

    List<ConsumerDTO> listAllConsumers();
    ConsumerDTO findConsumer(int id);
    void addConsumer(ConsumerDTO consumer);
    void removeConsumer(int id);

}

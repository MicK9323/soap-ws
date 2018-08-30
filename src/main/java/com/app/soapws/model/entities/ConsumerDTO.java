package com.app.soapws.model.entities;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "CONSUMER", schema = "devsoa")
public class ConsumerDTO implements Serializable {

    @Id
    @Column(name = "consumer_id")
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "consumer_sequence")
    @SequenceGenerator(name = "consumer_sequence", sequenceName = "consumer_seq")
    private int id;

    @Column(name = "consumer_dni")
    private String dni;

    @Column(name = "consumer_name")
    private String name;

    @Column(name = "consumer_lastname")
    private String lastname;

    @Column(name = "consumer_phone")
    private String phoneNumber;

    @ManyToOne(targetEntity = ProviderDTO.class, fetch = FetchType.LAZY)
    @JoinColumn(name = "provider_id")
    private ProviderDTO provider;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public ProviderDTO getProvider() {
        return provider;
    }

    public void setProvider(ProviderDTO provider) {
        this.provider = provider;
    }
}

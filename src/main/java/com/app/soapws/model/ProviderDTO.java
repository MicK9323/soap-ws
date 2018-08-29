package com.app.soapws.model;

import org.hibernate.annotations.LazyToOne;
import org.hibernate.annotations.LazyToOneOption;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Table(name = "PROVIDER", schema = "devsoa")
public class ProviderDTO implements Serializable {

    @Id
    @Column(name = "provider_id")
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "sequence")
    @SequenceGenerator(name = "sequence", sequenceName = "provider_seq")
    private int id;

    @Column(name = "provider_desc")
    private String description;

    @ManyToOne(targetEntity = CountryDTO.class, fetch = FetchType.LAZY)
    @JoinColumn(name = "country_id")
    private CountryDTO country;

    @OneToMany(mappedBy = "provider", fetch = FetchType.LAZY)
    @LazyToOne(LazyToOneOption.FALSE)
    private List<ConsumerDTO> consumers;

    public List<ConsumerDTO> getConsumers() {
        return consumers;
    }

    public void setConsumers(List<ConsumerDTO> consumers) {
        this.consumers = consumers;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public CountryDTO getCountry() {
        return country;
    }

    public void setCountry(CountryDTO country) {
        this.country = country;
    }
}

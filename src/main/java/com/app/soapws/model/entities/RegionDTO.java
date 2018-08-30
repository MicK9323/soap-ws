package com.app.soapws.model.entities;

import org.hibernate.annotations.LazyToOne;
import org.hibernate.annotations.LazyToOneOption;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Table(name = "REGION", schema = "devsoa")
public class RegionDTO implements Serializable {

    @Id
    @Column(name = "region_id")
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "region_sequence")
    @SequenceGenerator(name = "region_sequence", sequenceName = "region_seq")
    private int id;

    @Column(name = "region_desc")
    private String description;

    @OneToMany(mappedBy = "region", fetch = FetchType.LAZY)
    @LazyToOne(LazyToOneOption.FALSE)
    private List<CountryDTO> countries;

    public String toString() {
        return "REGION id: "+id+" name: "+description;
    }

    public List<CountryDTO> getCountries() {
        return countries;
    }

    public void setCountries(List<CountryDTO> countries) {
        this.countries = countries;
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
}

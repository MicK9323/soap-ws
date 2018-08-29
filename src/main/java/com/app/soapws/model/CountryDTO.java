package com.app.soapws.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "COUNTRY", schema = "devsoa")
public class CountryDTO implements Serializable {

    @Id
    @Column(name = "country_id")
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "sequence")
    @SequenceGenerator(name = "sequence", sequenceName = "country_seq")
    private int id;

    @Column(name = "country_desc")
    private String description;

    @Column(name = "country_cod_number")
    private String codNumber;

    @ManyToOne(targetEntity = RegionDTO.class, fetch = FetchType.LAZY)
    @JoinColumn(name = "region_id")
    private RegionDTO region;

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

    public String getCodNumber() {
        return codNumber;
    }

    public void setCodNumber(String codNumber) {
        this.codNumber = codNumber;
    }

    public RegionDTO getRegion() {
        return region;
    }

    public void setRegion(RegionDTO region) {
        this.region = region;
    }
}

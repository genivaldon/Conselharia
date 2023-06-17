package com.api.conselharia.Model;

import com.fasterxml.jackson.annotation.JsonProperty;

import jakarta.persistence.Entity;
import jakarta.persistence.GenerationType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Conselho {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @JsonProperty("advice")
    private String conselho;

    @JsonProperty("id")
    private Integer codConselho;

    public Conselho (){}

    public Conselho(Long id, String conselho, Integer codConselho){

        this.id = id;
        this.conselho = conselho;
        this.codConselho = codConselho;
    }

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getConselho() {
        return conselho;
    }
    public void setConselho(String conselho) {
        this.conselho = conselho;
    }
    public Integer getCodConselho() {
        return codConselho;
    }
    public void setCodConselho(Integer codConselho) {
        this.codConselho = codConselho;
    }

   @Override
    public String toString() {
        return "Conselho{" +
                "id=" + id +
                ", conselho='" + conselho + '\'' +
                ", codConselho='" + codConselho + '\'' +
                '}';
    }

}

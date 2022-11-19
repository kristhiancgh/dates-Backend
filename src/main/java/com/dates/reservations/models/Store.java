/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dates.reservations.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

/**
 *
 * @author a1023942826
 */

@Entity
@Table(name = "comercios")
public class Store {
    
    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator = "id_comercio")
    @SequenceGenerator(name = "id_comercio", sequenceName = "id_comercio")
    private Long idStore;
    
    @Column(name = "nom_comercio")
    private String storeName;
    
    @Column(name = "aforo_maximo")
    private Integer maxCapacity;
    
    @JsonIgnore
    @OneToMany(mappedBy = "store", 
               targetEntity = ServiceModel.class,
               cascade = CascadeType.ALL)
    private List<ServiceModel> services= new ArrayList<>();

    public Long getIdStore() {
        return idStore;
    }

    public String getStoreName() {
        return storeName;
    }

    public Integer getMaxCapacity() {
        return maxCapacity;
    }

    public List<ServiceModel> getServices() {
        return services;
    }

    public void setIdStore(Long idStore) {
        this.idStore = idStore;
    }

    public void setStoreName(String storeName) {
        this.storeName = storeName;
    }

    public void setMaxCapacity(Integer maxCapacity) {
        this.maxCapacity = maxCapacity;
    }

    public void setServices(List<ServiceModel> services) {
        this.services = services;
    }
    
    
    
}

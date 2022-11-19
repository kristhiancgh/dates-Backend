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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import org.hibernate.annotations.Cascade;

/**
 *
 * @author a1023942826
 */

@Entity
@Table(name = "servicios")
public class ServiceModel {
    
    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator = "id_servicio")
    @SequenceGenerator(name = "id_servicio", sequenceName = "id_servicio")
    private Long idService;
    
    @ManyToOne
    @JoinColumn(name = "id_comercio")
    private Store store;
    
    @Column(name = "nom_servicio")
    private String serviceName;
    
    @Column(name = "hora_apertura")
    private String openingHour;
    
    @Column(name = "hora_cierre")
    private String closingHour;
    
    @Column(name = "duracion")
    private String duration;
    
    @JsonIgnore
    @OneToMany(mappedBy = "service", 
               targetEntity = Turn.class,
               cascade = CascadeType.ALL)
    private List<Turn> turns= new ArrayList<>();

    public Long getIdService() {
        return idService;
    }

    public Store getStore() {
        return store;
    }

    public String getServiceName() {
        return serviceName;
    }

    public String getOpeningHour() {
        return openingHour;
    }

    public String getClosingHour() {
        return closingHour;
    }

    public String getDuration() {
        return duration;
    }

    public List<Turn> getTurns() {
        return turns;
    }

    public void setIdService(Long idService) {
        this.idService = idService;
    }

    public void setStore(Store store) {
        this.store = store;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public void setOpeningHour(String openingHour) {
        this.openingHour = openingHour;
    }

    public void setClosingHour(String closingHour) {
        this.closingHour = closingHour;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public void setTurns(List<Turn> turns) {
        this.turns = turns;
    }

    @Override
    public String toString() {
        return "Service{" + "idService=" + idService + ", store=" + store + ", serviceName=" + serviceName + ", openingHour=" + openingHour + ", closingHour=" + closingHour + ", duration=" + duration + '}';
    }
    
    
    
}

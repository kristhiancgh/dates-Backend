/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dates.reservations.models;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import java.util.logging.Logger;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

/**
 *
 * @author a1023942826
 */

@Entity
@Table(name = "turnos")
public class Turn {
   
    
    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator = "id_turno")
    @SequenceGenerator(name = "id_turno", sequenceName = "id_turno")
    private Long idTurn;
    
    @ManyToOne
    @JoinColumn(name = "id_servicio")
    private ServiceModel service;
 
    @JsonFormat(pattern="yyyy-MM-dd")
    @Column(name = "fecha_turno")
    private Date turnDate;
    
    @Column(name = "hora_inicio")
    private String initHour;
    
    @Column(name = "hora_fin")
    private String endHour;
    
    @Column(name = "estado")
    private String status;

    public Long getIdTurn() {
        return idTurn;
    }

    public ServiceModel getService() {
        return service;
    }

    public Date getTurnDate() {
        return turnDate;
    }

    public String getInitHour() {
        return initHour;
    }

    public String getEndHour() {
        return endHour;
    }

    public String getStatus() {
        return status;
    }

    public void setIdTurn(Long idTurn) {
        this.idTurn = idTurn;
    }

    public void setService(ServiceModel service) {
        this.service = service;
    }

    public void setTurnDate(Date turnDate) {
        this.turnDate = turnDate;
    }

    public void setInitHour(String initHour) {
        this.initHour = initHour;
    }

    public void setEndHour(String endHour) {
        this.endHour = endHour;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    
    
}

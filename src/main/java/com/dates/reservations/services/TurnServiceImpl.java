/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dates.reservations.services;

import com.dates.reservations.models.Turn;
import com.dates.reservations.repositories.TurnRepository;
import java.util.List;
import java.util.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author a1023942826
 */
@Service
public class TurnServiceImpl implements ITurnService{
    
    private static final Logger LOG = Logger.getLogger(TurnServiceImpl.class.getName());
    
    @Autowired
    private TurnRepository turnRepository; 
    
    @Override
    public List<Turn> getInfoTurns (){
        
        LOG.info("Entro a la implementacion de turnos");
        
        return turnRepository.getInfoTurnsDashboard();
    }

    @Override
    public void saveTurn(Turn turnIn) {
        turnRepository.save(turnIn);
    }
    
    
}

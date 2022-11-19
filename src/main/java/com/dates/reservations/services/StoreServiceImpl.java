/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dates.reservations.services;

import com.dates.reservations.models.Store;
import com.dates.reservations.repositories.StoreRepository;
import java.util.List;
import java.util.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author a1023942826
 */
@Service
public class StoreServiceImpl implements IStoreService{

    private static final Logger LOG = Logger.getLogger(StoreServiceImpl.class.getName());
    
    @Autowired
    private StoreRepository storeRepository; 

    @Override
    public List<Store> getAllStores() {
        return storeRepository.getAllStores();
    }
    
    
    
}

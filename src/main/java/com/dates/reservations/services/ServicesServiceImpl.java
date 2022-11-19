/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dates.reservations.services;

import com.dates.reservations.models.ServiceModel;
import com.dates.reservations.repositories.ServiceRepository;
import java.util.List;
import org.springframework.stereotype.Service;
import java.util.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author a1023942826
 */

@Service
public class ServicesServiceImpl implements IServicesService {

    @Autowired
    private ServiceRepository serviceRepository; 
    
    private static final Logger LOG = Logger.getLogger(ServicesServiceImpl.class.getName());
   
    
    
    @Override
    public void saveService(ServiceModel service) {
       
        serviceRepository.save(service);
        
    }

    @Override
    public List<ServiceModel> getServicesByStore(Long idStore) {
        return serviceRepository.findByStore(idStore);
    }
    
}

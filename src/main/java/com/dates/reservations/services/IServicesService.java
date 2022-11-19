/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.dates.reservations.services;

import com.dates.reservations.models.ServiceModel;
import java.util.List;

/**
 *
 * @author a1023942826
 */
public interface IServicesService {
    
    void saveService(ServiceModel service); 
    
    List<ServiceModel> getServicesByStore(Long idStore);
}

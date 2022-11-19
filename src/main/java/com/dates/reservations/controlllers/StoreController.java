/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dates.reservations.controlllers;

import com.dates.reservations.models.Store;
import com.dates.reservations.services.IStoreService;
import com.dates.reservations.services.StoreServiceImpl;
import java.util.List;
import java.util.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author a1023942826
 */

@RestController
@RequestMapping("/stores")
public class StoreController {

    private static final Logger LOG = Logger.getLogger(StoreController.class.getName());
 
    
    @Autowired
    private IStoreService storeService = new StoreServiceImpl();
    
    @CrossOrigin(origins = "http://localhost:4200")
    @GetMapping(
      value = "/getAll"
    )
    @ResponseBody
    public ResponseEntity<List<Store>> getInfoDashboard(){
       
        
      LOG.info("Entro correctamente al controlador de comercios");
      
      List<Store> response = storeService.getAllStores();
        
      
      
      return new ResponseEntity<>(response, HttpStatus.OK);  
        
    }
    
}

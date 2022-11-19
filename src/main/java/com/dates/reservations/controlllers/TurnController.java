/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dates.reservations.controlllers;

import com.dates.reservations.models.Turn;
import com.dates.reservations.services.ITurnService;
import com.dates.reservations.services.TurnServiceImpl;
import java.util.List;
import java.util.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author a1023942826
 */

@RestController
@RequestMapping("/turns")
public class TurnController {

    private static final Logger LOG = Logger.getLogger(TurnController.class.getName());
    
    @Autowired
    private ITurnService turnService = new TurnServiceImpl();
    
    @CrossOrigin(origins = "http://localhost:4200")
    @GetMapping(
      value = "/getInfo"
    )
    @ResponseBody
    public ResponseEntity<List<Turn>> getInfoDashboard(){
       
        
      LOG.info("Entro correctamente al controlador de turnos");
      
      List<Turn> response = turnService.getInfoTurns();
        
      return new ResponseEntity<>(response, HttpStatus.OK);  
        
    }
    
    @CrossOrigin(origins = "http://localhost:4200")
    @PostMapping(
            value = "/saveTurn",
            produces = MediaType.APPLICATION_JSON_VALUE,
            consumes = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public ResponseEntity<?> saveTurnService(
            @RequestBody final Turn turnIn
    ) {

        LOG.info("Entro correctamente al controlador");

        turnService.saveTurn(turnIn);

        return new ResponseEntity<>("", HttpStatus.OK);

    }
    
}

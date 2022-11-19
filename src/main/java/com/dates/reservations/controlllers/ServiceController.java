/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dates.reservations.controlllers;

import com.dates.reservations.models.ServiceModel;
import com.dates.reservations.services.IServicesService;
import com.dates.reservations.services.ServicesServiceImpl;
import java.util.List;
import java.util.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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
@RequestMapping("/services")
public class ServiceController {

    private static final Logger LOG = Logger.getLogger(ServiceController.class.getName());

    @Autowired
    private IServicesService servicesService = new ServicesServiceImpl();

    @PostMapping(
            value = "/saveService",
            produces = MediaType.APPLICATION_JSON_VALUE,
            consumes = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public ResponseEntity<?> saveDateService(
            @RequestBody final ServiceModel serviceIn
    ) {

        LOG.info("Entro correctamente al controlador");
        LOG.info(serviceIn.toString());

        servicesService.saveService(serviceIn);

        return new ResponseEntity<>("", HttpStatus.OK);

    }

    @CrossOrigin(origins = "http://localhost:4200")
    @GetMapping(
            value = "/getServicesByStore/{idStore}"
    )
    @ResponseBody
    public ResponseEntity<List<ServiceModel>> getInfoDashboard(@PathVariable String idStore) {

        LOG.info("Entro correctamente al controlador de comercios get");

        List<ServiceModel> response = servicesService.getServicesByStore(Long.valueOf(idStore));

        return new ResponseEntity<>(response, HttpStatus.OK);

    }

}

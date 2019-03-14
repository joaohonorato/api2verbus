/**
 * 
 */
package com.alis.verbus.controller;

import com.alis.verbus.model.Onibus;
import com.alis.verbus.service.OnibusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Endpoint for Onibus Resources
 * @author Gabriel Honorato
 */

@RestController
public class OnibusController {
  
  @Autowired
  OnibusService onibusService;
  @CrossOrigin(origins = "http://localhost:4200")
  @GetMapping(path = "/api/onibus")
  public ResponseEntity<List<Onibus>> getAllOnibuses() {
    return ResponseEntity.ok(onibusService.getAll());
  }
  
}

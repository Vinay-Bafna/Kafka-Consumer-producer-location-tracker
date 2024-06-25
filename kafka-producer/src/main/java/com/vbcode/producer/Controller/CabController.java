package com.vbcode.producer.Controller;

import com.vbcode.producer.Service.CabService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/cab")
public class CabController {

    @Autowired
    private CabService cabService;
    @PutMapping("/location")
    public ResponseEntity<?> CabLocation() throws InterruptedException {
        int range=10;
        while(range>0){
            this.cabService.cabService("Longitude: "+ Math.random() + " Latitude: " + Math.random() );
            range--;
        }
        return new ResponseEntity<>(Map.of("message","Message has be added"), HttpStatus.OK);
    }
}

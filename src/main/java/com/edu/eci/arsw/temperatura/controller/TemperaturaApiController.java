/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.edu.eci.arsw.temperatura.controller;

import com.edu.eci.arsw.temperatura.service.TemperaturaServicios;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Daniel Castiblanco
 */
@RestController
@RequestMapping("/temp")
public class TemperaturaApiController {

    @Autowired
    private TemperaturaServicios ts;

    @RequestMapping(method = RequestMethod.GET, path = "/{tipo}/{valor}")
    public ResponseEntity<?> getConver(@PathVariable("tipo") String tipo, @PathVariable("valor") int valor) {
        System.out.println(tipo + valor);
        try {
            if (tipo == "fahr") {
                System.out.println("entro a fahr ");
                System.out.println(ts.getTemperaturaCelsius(valor));
                return new ResponseEntity<>(ts.getTemperaturaCelsius(valor), HttpStatus.ACCEPTED);
            }
            if (tipo == "cels") {
                System.out.println(ts.getTemperaturaCelsius(valor));
                return new ResponseEntity<>(ts.getTemperaturaFahrenheit(valor), HttpStatus.ACCEPTED);
            }
        } catch (Exception e) {
            System.out.println(" Entro a catch");
            return new ResponseEntity<>("Error al obtener los grados de tipo: " + tipo + " con el valor : " + valor, HttpStatus.NOT_FOUND);
        }
        System.out.println(" No entro al try ");
        return null;
    
    }

}

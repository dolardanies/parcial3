/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.edu.eci.arsw.temperatura.service;

import com.edu.eci.arsw.temperatura.model.Temperatura;
import java.io.IOException;
import org.springframework.stereotype.Service;

/**
 *
 * @author 2104481
 */

@Service
public class TemperaturaServiciosImpl implements TemperaturaServicios{
    
    Temperatura temp;
    
    /**
     * Obtiene la temperatura en Celsius
     * @param valor
     * @return
     * @throws IOException 
     */
    @Override
    public int getTemperaturaCelsius(int valor) throws IOException {
        return temp.convertirFaraCel(valor);
    }
    
    /**
     * Obtiene la temperatura Fahrenheit
     * @param valor
     * @return
     * @throws IOException 
     */
    @Override
    public int getTemperaturaFahrenheit(int valor) throws IOException {
        return temp.convertirCelaFar(valor);
    }
    
}

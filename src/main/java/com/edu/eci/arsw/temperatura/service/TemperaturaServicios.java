/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.edu.eci.arsw.temperatura.service;

import java.io.IOException;

/**
 *
 * @author Daniel Castiblanco
 */
public interface TemperaturaServicios {
    
    /**
     * Obtiene la temperatura en grados Celsius
     * @param valor
     * @return
     * @throws IOException 
     */
    public int getTemperaturaCelsius(int valor ) throws IOException;
             
    /**
     * Obtiene la temperatura en grados Fahrenheit
     * @param valor
     * @return
     * @throws IOException 
     */
    public int getTemperaturaFahrenheit(int valor ) throws IOException;
}

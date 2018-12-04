/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.edu.eci.arsw.temperatura.controller;

/**
 *
 * @author Daniel Castiblanco
 */
public class Temperatura {
    String tipo;
    int valor;

    public Temperatura(String tipo, int valor) {
        this.tipo = tipo;
        this.valor = valor;
    }
    
    
    /**
     * Convierte de grados Celsius a Fahrenheit
     * @param valor
     * @return 
     */
    public int convertirCelaFar(int valor){
        int fahr =(valor*(9/5))+32;
        return fahr;
    }
    
    /**
     * Convierte de grados Fahrenheit a Celsius
     * @param valor
     * @return 
     */
    public int convertirFaraCel(int valor){       
        int cel =(valor-32)*(5/9);
        return cel;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    @Override
    public String toString() {
        return "Temperatura{" + "tipo=" + tipo + ", valor=" + valor + '}';
    }
    
    
    
}

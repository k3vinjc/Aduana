/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.aduana;

/**
 *
 * @author christianescobar
 * Clase que almacena toda la informacion de un vehiculo
 */
public class Vehiculo {
    private String Marca;
    private String Linea;
    private int Modelo;
    /**
     * Constructor de la clase
     */
    public Vehiculo(String Marca, String Linea, int Modelo){
        this.Marca=Marca;
        this.Linea=Linea;
        this.Modelo=Modelo;
    }
    /**
     * Se ve si el vehiculo que quiere ingresar a Aduana existe en la base de datos de precio
     */
    public int Existe(){
        int retorno=0;
        return retorno;
    }
    /**
     * Se calcula el costo de impuesto utilizando la formula: Precio(“Marca, Linea”)+(2000/(AñoActual-Modelo+1))+1000
     */
    public double CalcularPrecio(){
        double retorno=0.0;
        
        return retorno;
    }
}

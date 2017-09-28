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
    private double Costo;
    MySqlHanddler MSH;
    /**
     * Constructor de la clase
     */
    public Vehiculo(String Marca, String Linea, int Modelo){
        this.Marca=Marca;
        this.Linea=Linea;
        this.Modelo=Modelo;
        MSH=new MySqlHanddler();
    }
    public String getMarca(){
        return this.Marca;
    }
    public String getLinea(){
        return this.Linea;
    }
    public int Coneccion(){
        return MSH.Conectar();
    }
    /**
     * Se calcula el costo de impuesto utilizando la formula: Precio(“Marca, Linea”)+(2000/(AñoActual-Modelo+1))+1000
     */
    public double CalcularCosto(){
        double CostoBase= MSH.Costo(this);
        int AnioActual=MSH.Anio();
        if(CostoBase==0.00 || AnioActual==0){
            Costo=0.00;
        }else{
            Costo=CostoBase+(2000/(AnioActual-Modelo+1))+1000;
        }
        return Costo;
    }
}

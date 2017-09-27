/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.aduana;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author christianescobar
 */
@WebService(serviceName = "Aduana")
public class Aduana {
    /**
     * Web service que retorna el costo total que se debe pagar por un vehiculo que ingresara en aduana
     */
    @WebMethod(operationName = "calcular_Costo_Aduana")
    public String calcular_Costo_Aduana(@WebParam(name = "marca") String marca, @WebParam(name = "linea") String linea, @WebParam(name = "modelo") int modelo) {
        Vehiculo vehiculo=new Vehiculo(marca, linea, modelo);
        vehiculo.Coneccion();
        return vehiculo.CalcularCosto()+"";
    }
}

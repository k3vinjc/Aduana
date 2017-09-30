/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.aduana;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author christianescobar
 */
public class VehiculoTest {
    
    public VehiculoTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of getMarca method, of class Vehiculo.
     */
    @org.junit.Test
    public void testGetMarca() {
        String expResult = "Kia";
        System.out.println("getLinea");
        Vehiculo instance = new Vehiculo(expResult,"Venga",2006);
        String result = instance.getMarca();
        assertEquals(result, expResult);
    }

    /**
     * Test of getLinea method, of class Vehiculo.
     */
    @org.junit.Test
    public void testGetLinea() {
        String expResult = "Venga";
        System.out.println("getLinea");
        Vehiculo instance = new Vehiculo("Kia",expResult,2006);
        String result = instance.getLinea();
        assertEquals(result, expResult);
    }

    /**
     * Test of Coneccion method, of class Vehiculo.
     */
    @org.junit.Test
    public void testConeccion() {
        System.out.println("Coneccion");
        Vehiculo instance = new Vehiculo("Kia","Venga",2006);
        int expResult = 1;
        int result = instance.Coneccion();
        assertEquals(expResult, result);
    }

    /**
     * Test of CalcularCosto method, of class Vehiculo.
     */
    @org.junit.Test
    public void testCalcularCosto() {
        System.out.println("CalcularCosto");
        Vehiculo instance = new Vehiculo("Kia","Venga",2006);
        instance.Coneccion();
        double expResult = 1338.68;
        double result = instance.CalcularCosto();
        System.out.println(Math.round(result * 100));
        System.out.println(Math.round(expResult * 100));
        assertEquals(Math.round(result * 100), (Math.round(expResult * 100)));
    }
    @org.junit.Test
    public void testCalcularCostoNoExiste() {
        System.out.println("CalcularCosto");
        Vehiculo instance = new Vehiculo("No_Existe","No_Existe",2006);
        instance.Coneccion();
        double expResult = 1566.00;
        double result = instance.CalcularCosto();
        System.out.println(Math.round(result * 100));
        System.out.println(Math.round(expResult * 100));
        assertEquals(Math.round(result * 100), (Math.round(expResult * 100)));
    }
}

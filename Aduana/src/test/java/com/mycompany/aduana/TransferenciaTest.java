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
public class TransferenciaTest {
    
    public TransferenciaTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of getNombreBanco method, of class Transferencia.
     */
    @Test
    public void testGetNombreBanco() {
        System.out.println("getNombreBanco");
        String expResult = "Banco";
        Transferencia instance = new Transferencia(2,2006.43);
        String result = instance.getNombreBanco();
        assertEquals(result, expResult);
    }

    /**
     * Test of getNumeroTransferencia method, of class Transferencia.
     */
    @Test
    public void testGetNumeroTransferencia() {
        System.out.println("getNumeroTransferencia");
        int expResult = 14;
        Transferencia instance = new Transferencia(expResult,2006.43);
        int result = instance.getNumeroTransferencia();
        assertEquals(result, expResult);
    }

    /**
     * Test of getMonto method, of class Transferencia.
     */
    @Test
    public void testGetMonto() {
        System.out.println("getMonto");
        double expResult = 1200.98;
        Transferencia instance = new Transferencia(14,expResult);
        double result = instance.getMonto();
        assertEquals(Math.round(result * 100), (Math.round(expResult * 100)));
    }

    /**
     * Test of Coneccion method, of class Transferencia.
     */
    @Test
    public void testConeccion() {
        System.out.println("Coneccion");
        Transferencia instance = new Transferencia(14,1200.98);
        int expResult = 1;
        int result = instance.Coneccion();
        assertEquals(expResult, result);
    }

    /**
     * Test of IngresarTransferencia method, of class Transferencia.
     */
    @Test
    public void testIngresarTransferencia() {
        System.out.println("IngresarTransferencia");
        //Transferencia instance = null;
        //int expResult = 0;
        //int result = instance.IngresarTransferencia();
        //assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}

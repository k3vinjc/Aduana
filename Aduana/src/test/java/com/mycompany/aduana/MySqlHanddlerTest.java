/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.aduana;

import java.text.DecimalFormat;
import static jdk.nashorn.internal.objects.NativeMath.round;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author christianescobar
 */
public class MySqlHanddlerTest {
    
    public MySqlHanddlerTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of Conectar method, of class MySqlHanddler.
     */
    @Test
    public void testConectar() {
        System.out.println("Test MySqlHanddler Conectar.");
        MySqlHanddler instance = new MySqlHanddler();
        int expResult = 1;
        int result = instance.Conectar();
        assertEquals(expResult, result);
    }

    /**
     * Test of Costo method, of class MySqlHanddler.
     */
    @Test
    public void testCostoNoExiste() {
        System.out.println("Test MySqlHanddler Costo No existe.");
        MySqlHanddler instance = new MySqlHanddler();
        instance.Conectar();
        double expResult = 400.00;
        double result = instance.Costo(new Vehiculo("No Existe","No Existe",2006));
        assertEquals(result, expResult,0.001);
    }
    
    /**
     * Test of Costo method, of class MySqlHanddler.
     */
    @Test
    public void testCostoExiste() {
        DecimalFormat df2 = new DecimalFormat(".##");
        System.out.println("Test MySqlHanddler Costo No existe.");
        MySqlHanddler instance = new MySqlHanddler();
        instance.Conectar();
        double ExpResulst = 172.68;
        double result = instance.Costo(new Vehiculo("Kia","Venga",2006));
        assertEquals(Math.round(result * 100), (Math.round(ExpResulst * 100)));
    }

    /**
     * Test of Anio method, of class MySqlHanddler.
     */
    @Test
    public void testAnio() {
        System.out.println("Test MySqlHanddler Anio.");
        MySqlHanddler instance = new MySqlHanddler();
        instance.Conectar();
        int NoExpResulst = 0;
        int result = instance.Anio();
        assertThat(result, not(equalTo(NoExpResulst)));
    }

    /**
     * Test of IngresarTransferencia method, of class MySqlHanddler.
     */
    @Test
    public void testIngresarTransferencia() {
        /*
        System.out.println("IngresarTransferencia");
        Transferencia transferencia = null;
        MySqlHanddler instance = new MySqlHanddler();
        int expResult = 0;
        int result = instance.IngresarTransferencia(transferencia);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
*/
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.aduana;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author christianescobar
 */
public class AduanaTest {
    
    public AduanaTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of calcular_Costo_Aduana method, of class Aduana.
     */
    @Test
    public void testCalcular_Costo_Aduana() throws Exception {
        System.out.println("calcular_Costo_Aduana");
        String marca = "Kia";
        String linea = "Venga";
        int modelo = 2006;
        Aduana instance = new Aduana();
        ObjectMapper mapper = new ObjectMapper();
        JsonNode rootNode = mapper.createObjectNode();
        ((ObjectNode) rootNode).put("status", 0);
        ((ObjectNode) rootNode).put("costo_Aduana", 1338.68);
        ((ObjectNode) rootNode).put("descripcion", "Exitoso");
        String expResult = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(rootNode);
        String result = instance.calcular_Costo_Aduana(marca, linea, modelo);
        System.out.println(result);
        System.out.println(expResult);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of guardar_Id_Transferencia method, of class Aduana.
     */
    @Test
    public void testGuardar_Id_Transferencia() throws Exception {
        //System.out.println("guardar_Id_Transferencia");
        //int id_Transferencia = 0;
        //double monto_Compra = 0.0;
        //Aduana instance = new Aduana();
        //String expResult = "";
        //String result = instance.guardar_Id_Transferencia(id_Transferencia, monto_Compra);
        //assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}

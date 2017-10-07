/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.aduana;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;
import java.text.DecimalFormat;
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
    public String calcular_Costo_Aduana(@WebParam(name = "marca") String marca, @WebParam(name = "linea") String linea, @WebParam(name = "modelo") int modelo) throws JsonProcessingException {
        DecimalFormat df = new DecimalFormat("#.00"); 
        ObjectMapper mapper = new ObjectMapper();
        JsonNode rootNode = mapper.createObjectNode();
        if(!marca.equals("") && !linea.equals("")){
            Vehiculo vehiculo=new Vehiculo(marca, linea, modelo);
            int coneccion=vehiculo.Coneccion();
            if(coneccion==0){
                ((ObjectNode) rootNode).put("status", 1);
                ((ObjectNode) rootNode).put("descripción", "No se pudo conectar a la base de datos");
            }else{
                double Costo=vehiculo.CalcularCosto();
                if(Costo==0.00){
                    ((ObjectNode) rootNode).put("status", 1);
                    ((ObjectNode) rootNode).put("descripción", "No se pudo conectar a la base de datos");
                }else{
                    ((ObjectNode) rootNode).put("status", 0);
                    ((ObjectNode) rootNode).put("costo_Aduana", Double.parseDouble(df.format(Costo)));
                    ((ObjectNode) rootNode).put("descripción", "Exitoso");
                }
            }
            return mapper.writerWithDefaultPrettyPrinter().writeValueAsString(rootNode);
        }else{
            ((ObjectNode) rootNode).put("status", 1);
            ((ObjectNode) rootNode).put("descripción", "Los parametros son incorrectos");
            return mapper.writerWithDefaultPrettyPrinter().writeValueAsString(rootNode);
        }
    }
    /**
     * Web service para agregar transferencia
     */
    @WebMethod(operationName = "guardar_Id_Transferencia")
    public String guardar_Id_Transferencia(@WebParam(name = "id_Transferencia") int id_Transferencia, @WebParam(name = "monto_Compra") double monto_Compra) throws JsonProcessingException {
        ObjectMapper mapper = new ObjectMapper();
        JsonNode rootNode = mapper.createObjectNode();
        if(id_Transferencia>=0 && monto_Compra>0.0){
            
            Transferencia transferencia=new Transferencia(id_Transferencia,monto_Compra);
            int coneccion=transferencia.Coneccion();
            if(coneccion==0){
                ((ObjectNode) rootNode).put("status", 1);
                ((ObjectNode) rootNode).put("descripción", "No se pudo conectar a la base de datos");
            }else{
                int Ingreso=transferencia.IngresarTransferencia();
                if(Ingreso==0){
                    ((ObjectNode) rootNode).put("status", 1);
                    ((ObjectNode) rootNode).put("descripción", "No se pudo conectar a la base de datos");
                }else{
                    ((ObjectNode) rootNode).put("status", 0);
                    ((ObjectNode) rootNode).put("descripción", "Exitoso");
                }
            }
            return mapper.writerWithDefaultPrettyPrinter().writeValueAsString(rootNode);
        }else{
            ((ObjectNode) rootNode).put("status", 1);
            ((ObjectNode) rootNode).put("descripción", "Los parametros son incorrectos");
            return mapper.writerWithDefaultPrettyPrinter().writeValueAsString(rootNode);
        }
    }
}

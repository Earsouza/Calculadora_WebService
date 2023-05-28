/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package engtelecom.std;

import jakarta.xml.ws.Endpoint;

/**
 *
 * @author Eduardo
 */
public class Application {
    public static void main(String[] args) {
        
        Calc calculadora = new Calc();
        Endpoint.publish("http://localhost:8085/servico/calculadora", calculadora);
        System.out.println("Servico publicado");
    }
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifsp.pep.servidor;

import javax.xml.ws.Endpoint;

/**
 *
 * @author tobias
 */
public class ServidorPublisher {

    public static void main(String[] args) {
        Endpoint.publish("http://127.0.0.1:8080/server",
                new ServidorImpl());
        System.out.println("Servidor Iniciado..");
    }
}

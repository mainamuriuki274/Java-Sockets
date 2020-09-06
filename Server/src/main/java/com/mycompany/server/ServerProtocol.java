/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.server;

import java.sql.Timestamp;

/**
 *
 * @author hp
 */
public class ServerProtocol {
      String message;
    public ServerProtocol(String sender,String msg){
        Timestamp t = new Timestamp(new java.util.Date().getTime());
        message =  t.toString() + " Server: " + msg;
    }
     public ServerProtocol(String msg){
       Timestamp t = new Timestamp(new java.util.Date().getTime());
        message = t.toString() + " Client: " + msg;
    }   
}

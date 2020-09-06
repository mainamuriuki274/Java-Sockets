
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.Socket;
import java.sql.Timestamp;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hp
 */

public class ClientProtocol {
    String message;
    public ClientProtocol(String sender,String msg){
        Timestamp t = new Timestamp(new java.util.Date().getTime());
        message = t.toString() + " Client: " + msg;
    }
     public ClientProtocol(String msg){
        Timestamp t = new Timestamp(new java.util.Date().getTime());
        message =  t.toString() + " Server: " + msg;
    }    
}


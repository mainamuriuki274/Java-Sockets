
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.Socket;

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
        message = "Client: " + msg;
    }
     public ClientProtocol(String msg){
        message = "Server: " + msg;
    }    
}




import java.io.DataInputStream;
import java.io.DataOutputStream;
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
public class SocketClient {
       private String host_name;
       private int port;
       Socket sock;
       String result;
       String msgin,msgout;
       static DataInputStream dis;
       static DataOutputStream dos;
       
     public Socket getSock() {
        return sock;
    }

    public void setSock(Socket sock) {
        this.sock = sock;
    }
      
   public SocketClient(String host_name, int port) {
 
    try{
               sock = new Socket(host_name,port);
               result = "success";
                    
        }
        catch(Exception e)
        {
          result = "Failed to connect to Host: " + host_name + " at Port: " + port;
        }
            
     }   
    public SocketClient(Socket socket,String data) {
        try{
        dos = new DataOutputStream(socket.getOutputStream());
        dos.writeUTF(data);
        ClientProtocol cp = new ClientProtocol("C",data);
        msgout = cp.message;           
        }
        catch(Exception e)
        {
          
        }
            
     } 
     public SocketClient(Socket socket) {
        try{
        dis = new DataInputStream(socket.getInputStream());
        msgin = dis.readUTF();
        ClientProtocol cp = new ClientProtocol(msgin);
        msgin = cp.message;
                    
        }
        catch(Exception e)
        {
         msgin = "DIS Error! " + e;
         msgin = "Server Exited";
        }
            
     }
     
}
       

 
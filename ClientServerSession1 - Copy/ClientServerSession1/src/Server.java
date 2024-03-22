
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ramtha_PC
 */
public class Server {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        try {
            
            ServerSocket Server1=new ServerSocket(3030);
         Socket Cl1= Server1.accept();
         Socket Cl2=Server1.accept();
   
            System.out.println("C1 & 2 is connected..");
            
            
           DataInputStream in1=new DataInputStream(Cl1.getInputStream());
           String Msg1=in1.readUTF();
           
           DataOutputStream out=new DataOutputStream(Cl2.getOutputStream());
           out.writeUTF(Msg1);
           
           
           
        } catch (IOException ex) {
            Logger.getLogger(Server.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
    }
    
}


import java.io.DataInputStream;
import java.io.IOException;
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
public class Client2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        try {
            Socket client2=new Socket("localhost", 3030);
            
            DataInputStream in=new DataInputStream(client2.getInputStream());
            System.out.println(in.readUTF());
            
            
            
            
        } catch (IOException ex) {
            Logger.getLogger(Client2.class.getName()).log(Level.SEVERE, null, ex);
        }
        

    }
    
}

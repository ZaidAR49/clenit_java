
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;
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
public class Client {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        try {
            Socket Client1=new Socket("localhost", 3030);
            
        String Msg;
            Scanner input=new Scanner(System.in);
            Msg=input.nextLine();
            DataOutputStream out=new DataOutputStream(Client1.getOutputStream());
            out.writeUTF(Msg);
            
            
        } catch (IOException ex) {
            Logger.getLogger(Client.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}

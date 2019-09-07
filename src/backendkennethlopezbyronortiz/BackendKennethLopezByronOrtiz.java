/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package backendkennethlopezbyronortiz;

import Data.APIClient;
import GUI.MainWindow;
import java.awt.Dimension;
import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import javax.swing.JFrame;

/**
 *
 * @author Kenneth
 */
public class BackendKennethLopezByronOrtiz {

    
    public static void main(String[] args) throws UnsupportedEncodingException {
       JFrame jFrame = new JFrame("Sistema administrativo");
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setPreferredSize(new Dimension(610, 625));
        jFrame.add(new MainWindow());
        jFrame.pack();
        jFrame.setLocationRelativeTo(null);
        jFrame.setResizable(false);
        jFrame.setVisible(true);
       
       /*
        APIClient a = new APIClient();
        a.transferProducts(1);
       /*String a = "642639";
        byte[] encoded = Base64.getEncoder().encodeToString(a.getBytes()).getBytes();
        String str = new String(encoded, "UTF-8");
       
        System.err.println(Base64.getDecoder().decode("NjQyNjM5"));
      */
    }
    public static String cifrarBase64(String a){
        Base64.Encoder encoder = Base64.getEncoder();
        String b = encoder.encodeToString(a.getBytes(StandardCharsets.UTF_8) );        
        return b;
    }
    
    public static String descifrarBase64(String a){
        Base64.Decoder decoder = Base64.getDecoder();
        byte[] decodedByteArray = decoder.decode(a);
        
        String b = new String(decodedByteArray);        
        return b;
    }
}

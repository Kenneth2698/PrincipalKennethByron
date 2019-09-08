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
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.

*/
package model;
import java.awt.*;
import javax.swing.*;


/**
 *
 * @author PC GOOSE
 */
public class BarraDeProgreso {
    JFrame frame = new JFrame();
    JProgressBar bar = new JProgressBar();
    
    public BarraDeProgreso(){
        bar.setValue(0);
        bar.setBounds(0,0,420,50);
        bar.setStringPainted(true);
        this.crecerContador();
        
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(420, 420);
        frame.setLayout(null);
        frame.setVisible(true);
    }
    
    
    
    public void crecerContador(){
       bar.setValue(10);
    }
}

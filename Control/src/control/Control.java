/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import ventanas_SupervisorCajero.Supervisor_Cajero;
import java.awt.Dimension;
import java.awt.Toolkit;

/**
 *
 * @author Vinicio
 */
public class Control {

    /**
     * @param args the command line arguments
     */
      public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                   Supervisor_Cajero p = new Supervisor_Cajero();
                   p.setLocationRelativeTo(null);        // Centering on screen...
                    p.setSize(1365, 730);
                     p.setVisible(true);
                    
            }
        });
    }
    
}

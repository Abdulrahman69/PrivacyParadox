/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package privacy;

/**
 *
 * @author Abdulrahman_69
 */
public class Main {
    public static void main (String []args){
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new LogChooser().setVisible(true);
            }
        });
    }
    
}

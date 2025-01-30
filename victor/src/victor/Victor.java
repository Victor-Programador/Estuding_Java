/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package victor;
import javax.swing.JOptionPane;

/**
 *
 * @author logon
 */
public class Victor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num;
        num = Integer.parseInt(JOptionPane.showInputDialog("Entre com um numero inteiro"));
        if(num%2==0){
            JOptionPane.showMessageDialog(null, "o numero " + num +"É par");
        }
        else{
            JOptionPane.showMessageDialog(null, "o numero" + num + "é impar");
        }
    }
    
}

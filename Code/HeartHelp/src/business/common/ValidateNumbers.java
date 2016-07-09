/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.common;

import java.awt.Color;
import javax.swing.InputVerifier;
import javax.swing.JComponent;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author tejageetla
 */
public class ValidateNumbers extends InputVerifier{
    
     @Override
    public boolean verify(JComponent input) {
        String text = ((JTextField) input).getText();
        if (text.length() > 0) {
            try {
                int i=Integer.parseInt(text);
                input.setBackground(Color.white);
                if(i<=0)
                {
                    input.setBackground(Color.red);
                    JOptionPane.showMessageDialog(input, "Please enter positive integer value", "Error", JOptionPane.ERROR_MESSAGE);
                    return false;
                }
                return true;
            } catch (NumberFormatException e) {
                input.setBackground(Color.red);
                JOptionPane.showMessageDialog(input, "Please enter integer value", "Error", JOptionPane.ERROR_MESSAGE);
                return false;
            }
        } else {
            input.setBackground(Color.white);
            return true;
        }
    }
}

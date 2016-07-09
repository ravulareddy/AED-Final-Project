/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.common;

import java.awt.Color;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.InputVerifier;
import javax.swing.JComponent;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author tejageetla
 */
public class ValidatePhoneNumber extends InputVerifier{
    
     @Override
    public boolean verify(JComponent input) {
        String text = ((JTextField) input).getText();
        
         String pattern = "^[1-9]{1}+[0-9]{9}$" ;
         Pattern dobPattern = Pattern.compile(pattern);
            Matcher matcher = dobPattern.matcher(text);
            if (text.length() > 0) {
               if (text.toLowerCase().startsWith(" ") || text.length() == 0 || matcher.matches() != true) {
                input.setBackground(Color.red);
                JOptionPane.showMessageDialog(input, "Please Enter Valid number", "Error", JOptionPane.ERROR_MESSAGE);
                return false;
            } else {
                input.setBackground(Color.white);
                return true;
            }
            }    
        else {
            input.setBackground(Color.white);
            return true;
        }
    
   
    }
}

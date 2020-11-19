/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Util;

import javax.swing.JComponent;
import javax.swing.JOptionPane;

/**
 *
 * @author Admin
 */
public class MessageConfig {
    public static void messageText(String text,JComponent component){
        JOptionPane.showMessageDialog(component, text);
    }
}

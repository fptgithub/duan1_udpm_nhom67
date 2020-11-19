/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JComponent;

import java.awt.Font;
import java.awt.Insets;
import javax.swing.JRadioButton;

/**
 *
 * @author Admin
 */
public class anwserRdoButton extends JRadioButton{

    public anwserRdoButton(String tittle) {
        setText(tittle);
        setFont(new Font("TimesRoman", Font.BOLD, 36));
        setMargin(new Insets(25, 75, 25, 25));
    }
    
}

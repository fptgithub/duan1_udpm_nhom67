/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JComponent;

import Model.CauHoiModel;
import java.awt.Color;
import java.awt.Font;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Enumeration;
import java.util.List;
import javafx.scene.web.WebEngine;
import javax.swing.AbstractButton;
import javax.swing.ButtonGroup;
import javax.swing.JRadioButton;

/**
 *
 * @author Admin
 */
public class QuestionRdoButton extends JRadioButton {
    
    private int Stt;

    public QuestionRdoButton(List<CauHoiModel> list, String text, String actioncommand,ButtonGroup btgroup) {
        setText(text);
        setActionCommand(actioncommand);
        setFont(new Font("TimesRoman", Font.BOLD, 18));
        setForeground(Color.gray);
        setMargin(new Insets(5, 50, 10, RIGHT));
        addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println(getSelectedButtonText(btgroup));
                //format html from list
                // load html
            }
        });
    }

    public int getStt() {
        return Stt;
    }

    public void setStt(int Stt) {
        this.Stt = Stt;
    }
    
    
    public int getSelectedButtonText(ButtonGroup buttonGroup) {
        for (Enumeration<AbstractButton> buttons = buttonGroup.getElements(); buttons.hasMoreElements();) {
            AbstractButton button = buttons.nextElement();

            if (button.isSelected()) {
                return Integer.parseInt(button.getActionCommand().split("-")[1]);
            }
        }

        return 0;
    }


}

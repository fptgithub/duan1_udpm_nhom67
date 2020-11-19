/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JComponent;

import Model.CauHoiModel;
import java.util.List;
import javafx.scene.web.WebEngine;
import javax.swing.BoxLayout;
import javax.swing.ButtonGroup;
import javax.swing.JPanel;

/**
 *
 * @author Admin
 */
public class ExamRdoButton extends JPanel {
    
    private final String questionName = "Question-";
    
    public ExamRdoButton(List<CauHoiModel> list, int size) {
        ButtonGroup btgroup = new ButtonGroup();
        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        QuestionRdoButton rd1 = null;
        for (int i = 1; i <= size; i++) {
            QuestionRdoButton rd = new QuestionRdoButton(list, questionName + i, questionName + i, btgroup);
            if (i == 1) {
                rd1 = rd;
            }
            rd.setStt(i);
            btgroup.add(rd);
            add(rd);
        }
        rd1.setSelected(true);
        
    }
    
}

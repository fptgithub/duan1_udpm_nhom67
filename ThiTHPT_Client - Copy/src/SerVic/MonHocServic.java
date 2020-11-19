/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SerVic;

import DAO.MonHocDAO;
import Model.MonHocModel;
import java.util.List;

/**
 *
 * @author Admin
 */
public class MonHocServic {
    private MonHocDAO monHocDAO;

    public MonHocServic() {
    monHocDAO = new MonHocDAO();
    }
    
    public List<MonHocModel> select(){
    return monHocDAO.selectMonHoc();
    }
}

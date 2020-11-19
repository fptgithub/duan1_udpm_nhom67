/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SerVic;

import DAO.CauHoiDAO;
import Model.CauHoiModel;
import java.util.List;

/**
 *
 * @author Admin
 */
public class CauHoiServic {
    private CauHoiDAO cauHoiDAO;

    public CauHoiServic() {
    cauHoiDAO = new CauHoiDAO();
    }
    
    public List<CauHoiModel> select(String madethi){
    return cauHoiDAO.selectCauHoi(madethi);
    }
}

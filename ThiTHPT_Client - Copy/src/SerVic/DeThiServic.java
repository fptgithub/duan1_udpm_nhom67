/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SerVic;

import DAO.DeThiDAO;
import Model.DeThiModel;
import java.util.List;

/**
 *
 * @author Admin
 */
public class DeThiServic{
    private DeThiDAO deThiDAO;

    public DeThiServic() {
    deThiDAO = new DeThiDAO();
    }
    
    public List<DeThiModel> select(String mamonhoc){
    return deThiDAO.selectDeThi(mamonhoc);
    } 
}

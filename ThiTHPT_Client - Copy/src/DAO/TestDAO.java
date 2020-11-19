/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Model.CauHoiModel;
import Model.DeThiModel;
import Model.MonHocModel;
import Util.JDBC;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author Admin
 */
public class TestDAO {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        JDBC.con = JDBC.getconnect();
        MonHocDAO monhoc = new MonHocDAO();
        DeThiDAO dethi = new DeThiDAO();
        CauHoiDAO cauhoi = new CauHoiDAO();
        List<MonHocModel> listmonhoc = monhoc.selectMonHoc();
        List<DeThiModel> listdethi = dethi.selectDeThi("TOAN");
        List<CauHoiModel> listcauhoi = cauhoi.selectCauHoi(listdethi.get(0).getMadethi());
        int i = 0;
        JDBC.con.close();
    }
}

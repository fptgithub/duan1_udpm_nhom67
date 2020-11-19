/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SerVic;

import DAO.TaiKhoanDAO;
import Model.TaiKhoanModel;
import Util.EmailUtil;
import Util.MessageConfig;
import Util.RegexPattern;
import Util.cookieNguoiDung;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComponent;
import javax.swing.JLabel;

/**
 *
 * @author Admin
 */
public class AccountServic {

    private TaiKhoanDAO taiKhoanDAO;
    public Thread timeOutMaXacNhan;

    public AccountServic() {
        taiKhoanDAO = new TaiKhoanDAO();
    }

    public boolean login(String taikhoanGmail, char[] matkhau, JComponent component) {
        if (taikhoanGmail.equals("") || String.valueOf(matkhau).equals("")) {
            MessageConfig.messageText("Không Được Để Trống Dữ Liệu", component);
            return false;
        } else {
            TaiKhoanModel taikhoan = taiKhoanDAO.selectFindOne(taikhoanGmail);
            if (taikhoan != null) {
                if (taikhoan.getMatkhau().equals(String.valueOf(matkhau))) {
                    cookieNguoiDung.login(taikhoan);
                    return true;
                } else {
                    MessageConfig.messageText("Mật Khẩu Không Đúng", component);
                    return false;
                }
            } else {
                MessageConfig.messageText("Tài Khoản Không Đúng", component);
                return false;
            }
        }
    }

    public boolean signup(TaiKhoanModel taiKhoanModel, JComponent component, char[] pass2) {
        if (taiKhoanModel.getTen().equals("") || taiKhoanModel.getTaikhoan().equals("") || taiKhoanModel.getMatkhau().equals("")) {
            MessageConfig.messageText("Không Được Để Trống Dữ Liệu", component);
            return false;
        }
        if (!RegexPattern.checkgmail(taiKhoanModel.getTaikhoan())) {
            MessageConfig.messageText("Tài Khoản Không Đúng Định Dạng", component);
            return false;
        }
        if (taiKhoanDAO.selectFindOne(taiKhoanModel.getTaikhoan()) != null) {
            MessageConfig.messageText("Tài Khoản Đã Tồn Tại", component);
            return false;
        }
        if (taiKhoanModel.getMatkhau().length() < 6) {
            MessageConfig.messageText("Mật Khẩu Dài Hơn 6 Ký Tự", component);
            return false;
        }
        if (!taiKhoanModel.getMatkhau().equals(String.valueOf(pass2))) {
            MessageConfig.messageText("Mật Khẩu Không Trùng Khớp", component);
            return false;
        }
        return taiKhoanDAO.insertTaiKhoan(taiKhoanModel);
    }

    public void guimaxacnhan(String Email) {
        cookieNguoiDung.MAXACNHAN = String.valueOf((int) ((Math.random() * 89999) + 10000));
        System.out.println(cookieNguoiDung.MAXACNHAN);
        EmailUtil.configAccountTSLAndData("Mã Xác Nhận", cookieNguoiDung.MAXACNHAN, Email);
    }

    public boolean DoiMatKhau(String taikhoan, String pass) {
        return taiKhoanDAO.updatepassworld(pass, taikhoan);
    }

    public TaiKhoanModel selectFindOneServic(String gmail) {
        return taiKhoanDAO.selectFindOne(gmail);
    }

    public void TimeOut(JLabel lbl) {
        timeOutMaXacNhan = new Thread(new Runnable() {
            int i = 60;

            @Override
            public void run() {
                while (i >= 1) {
                    if (i >= 1) {
                        try {
                            lbl.setText(i + " Giây");
                            i--;
                            Thread.sleep(1000);
                        } catch (InterruptedException ex) {
                            Logger.getLogger(AccountServic.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }
                }
                lbl.setText("Hết Giờ, Mã Xác Nhận Không Còn Hiệu Lực");
                cookieNguoiDung.MAXACNHAN = null;
                timeOutMaXacNhan.stop();
            }
        });
        timeOutMaXacNhan.start();
    }
}

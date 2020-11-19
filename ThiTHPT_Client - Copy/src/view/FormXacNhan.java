/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import SerVic.AccountServic;
import Util.MessageConfig;
import Util.cookieNguoiDung;

/**
 *
 * @author Admin
 */
public class FormXacNhan extends javax.swing.JPanel {

    private AccountServic accountServic;

    /**
     * Creates new form FormXacNhan
     */
    public FormXacNhan(AccountServic accountServic) {
        initComponents();
        this.accountServic = accountServic;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnxacnhan = new javax.swing.JPanel();
        lbltimeout = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        txtmaxacnhan = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        txtpass1 = new javax.swing.JPasswordField();
        txtpass2 = new javax.swing.JPasswordField();
        btndoimatkhau = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        lbl = new javax.swing.JLabel();
        lblGmail = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        btnguilaima = new javax.swing.JButton();

        setPreferredSize(new java.awt.Dimension(600, 450));

        pnxacnhan.setBackground(new java.awt.Color(255, 255, 255));
        pnxacnhan.setPreferredSize(new java.awt.Dimension(600, 450));

        lbltimeout.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lbltimeout.setForeground(new java.awt.Color(153, 153, 153));
        lbltimeout.setText("lbl");

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(153, 153, 153));
        jLabel14.setText("Mã Xác Nhận");

        txtmaxacnhan.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(153, 153, 153));
        jLabel15.setText("Mật Khẩu Mới");

        txtpass1.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N

        txtpass2.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N

        btndoimatkhau.setBackground(new java.awt.Color(204, 204, 204));
        btndoimatkhau.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        btndoimatkhau.setText("Đổi Mật Khẩu");
        btndoimatkhau.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndoimatkhauActionPerformed(evt);
            }
        });

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(153, 153, 153));
        jLabel16.setText("Xác Nhận Mã Xác Thực");

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(153, 153, 153));
        jLabel17.setText("Xác Nhận Mật Khẩu");

        lbl.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lbl.setForeground(new java.awt.Color(153, 153, 153));
        lbl.setText("Tài Khoản");

        lblGmail.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblGmail.setForeground(new java.awt.Color(153, 153, 153));
        lblGmail.setText("email");

        jLabel18.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jLabel18.setText("Mã Xác Nhận Sẽ Hết Hiệu Lực Trong");

        btnguilaima.setBackground(new java.awt.Color(204, 204, 204));
        btnguilaima.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnguilaima.setText("Gửi Lại Mã");
        btnguilaima.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnguilaimaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnxacnhanLayout = new javax.swing.GroupLayout(pnxacnhan);
        pnxacnhan.setLayout(pnxacnhanLayout);
        pnxacnhanLayout.setHorizontalGroup(
            pnxacnhanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnxacnhanLayout.createSequentialGroup()
                .addContainerGap(37, Short.MAX_VALUE)
                .addGroup(pnxacnhanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnxacnhanLayout.createSequentialGroup()
                        .addGroup(pnxacnhanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel17)
                            .addComponent(jLabel15)
                            .addComponent(jLabel14))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                        .addGroup(pnxacnhanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnxacnhanLayout.createSequentialGroup()
                                .addGroup(pnxacnhanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtpass1, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtmaxacnhan, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(184, 184, 184))
                            .addGroup(pnxacnhanLayout.createSequentialGroup()
                                .addComponent(txtpass2, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(149, 149, 149))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnxacnhanLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(lbltimeout)
                        .addGap(271, 271, 271))
                    .addGroup(pnxacnhanLayout.createSequentialGroup()
                        .addComponent(lbl)
                        .addGap(68, 68, 68)
                        .addComponent(lblGmail, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnxacnhanLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pnxacnhanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnxacnhanLayout.createSequentialGroup()
                        .addComponent(jLabel18)
                        .addGap(154, 154, 154))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnxacnhanLayout.createSequentialGroup()
                        .addComponent(btndoimatkhau)
                        .addGap(95, 95, 95)
                        .addComponent(btnguilaima)
                        .addGap(123, 123, 123))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnxacnhanLayout.createSequentialGroup()
                        .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 403, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36))))
        );
        pnxacnhanLayout.setVerticalGroup(
            pnxacnhanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnxacnhanLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel16)
                .addGap(41, 41, 41)
                .addGroup(pnxacnhanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblGmail)
                    .addComponent(lbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 64, Short.MAX_VALUE)
                .addGroup(pnxacnhanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(txtmaxacnhan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(pnxacnhanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtpass1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15))
                .addGap(18, 18, 18)
                .addGroup(pnxacnhanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnxacnhanLayout.createSequentialGroup()
                        .addComponent(jLabel17)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnxacnhanLayout.createSequentialGroup()
                        .addComponent(txtpass2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)))
                .addComponent(jLabel18)
                .addGap(18, 18, 18)
                .addComponent(lbltimeout)
                .addGap(18, 18, 18)
                .addGroup(pnxacnhanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btndoimatkhau)
                    .addComponent(btnguilaima))
                .addGap(30, 30, 30))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnxacnhan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnxacnhan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnguilaimaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnguilaimaActionPerformed
        // TODO add your handling code here:
        accountServic.guimaxacnhan(lblGmail.getText());
        accountServic.TimeOut(lbltimeout);
    }//GEN-LAST:event_btnguilaimaActionPerformed

    private void btndoimatkhauActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndoimatkhauActionPerformed
        // TODO add your handling code here:
        doimatkhau();
    }//GEN-LAST:event_btndoimatkhauActionPerformed

    void doimatkhau() {
        if (cookieNguoiDung.MAXACNHAN != null) {
            if (cookieNguoiDung.MAXACNHAN.equals(txtmaxacnhan.getText())) {
                String pass1 = String.valueOf(txtpass1.getPassword());
                String pass2 = String.valueOf(txtpass2.getPassword());
                if (pass1.length() < 6 || pass2.length() < 6) {
                    MessageConfig.messageText("Mật Khẩu Phải Dài Hơn 6 Ký Tự", this);
                } else {
                    if (!pass1.equals(pass2)) {
                        MessageConfig.messageText("Hai Mật Khẩu Không Trùng Khớp", this);
                    } else {
                        accountServic.DoiMatKhau(lblGmail.getText(), pass2);
                        MessageConfig.messageText("Đổi Mật Khẩu Thành Công", this);
                    }
                }
            } else {
                MessageConfig.messageText("Mã Xác Nhận Không Đúng", this);
            }
        } else {
            MessageConfig.messageText("Mã Xác Nhận Đã Hết Hạn", this);
        }
    }

    public void setgmaillbl(String gmail) {
        lblGmail.setText(gmail);
    }

    public void actiontimeOut() {
        accountServic.TimeOut(lbltimeout);
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btndoimatkhau;
    private javax.swing.JButton btnguilaima;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel lbl;
    private javax.swing.JLabel lblGmail;
    private javax.swing.JLabel lbltimeout;
    private javax.swing.JPanel pnxacnhan;
    private javax.swing.JTextField txtmaxacnhan;
    private javax.swing.JPasswordField txtpass1;
    private javax.swing.JPasswordField txtpass2;
    // End of variables declaration//GEN-END:variables
}

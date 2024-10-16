/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package spc.edu;

import javax.swing.JOptionPane;

/**
 *
 * @author SPC
 */
public class Bai13_JF_TinhTienDien extends javax.swing.JFrame {

    /**
     * Creates new form Bai13_JF_TinhTienDien
     */
    public Bai13_JF_TinhTienDien() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txt_socu = new javax.swing.JTextField();
        txt_somoi = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txt_thue = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        btn_Tinh = new javax.swing.JButton();
        txa_KQ = new javax.swing.JScrollPane();
        txa_kq = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("TINH TIEN DIEN");

        jLabel2.setText("Chi so cu");

        jLabel3.setText("Chi so moi");

        jLabel4.setText("Thue GTGT");

        btn_Tinh.setText("Tinh");
        btn_Tinh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_TinhActionPerformed(evt);
            }
        });

        txa_kq.setColumns(20);
        txa_kq.setRows(5);
        txa_KQ.setViewportView(txa_kq);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txt_socu)
                            .addComponent(txt_somoi)
                            .addComponent(txt_thue, javax.swing.GroupLayout.DEFAULT_SIZE, 135, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addComponent(btn_Tinh)
                        .addGap(0, 80, Short.MAX_VALUE))
                    .addComponent(txa_KQ, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(153, 153, 153)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txt_socu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_Tinh))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txt_somoi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_thue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addComponent(txa_KQ, javax.swing.GroupLayout.DEFAULT_SIZE, 181, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_TinhActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_TinhActionPerformed
        // TODO add your handling code here:
        int soCu, soMoi,tieuThu;
        double VAT = 0.1, Bac1;
        try
        {
            soCu = Integer.parseInt(txt_socu.getText());
            soMoi = Integer.parseInt(txt_somoi.getText());
        }
        catch (Exception e)
        {
            JOptionPane.showMessageDialog(null, "Vui long nhap so","Thong bao", JOptionPane.INFORMATION_MESSAGE);
            return;
        }
        tieuThu = soMoi - soCu;
         if (tieuThu > 0 && tieuThu <= 50)
            {
                txa_kq.append("Giá: " + tieuThu * 1893); 
                
            }
            else if (tieuThu > 50 && tieuThu < 101)
            {
                txa_kq.append("Giá: " + (50 * 1893 + (tieuThu - 50) * 1956));
                
            }
            else if (tieuThu > 100 && tieuThu < 201)
            {
                txa_kq.append("Giá: " + (50 * 1893 + 50 * 1956 + (tieuThu - 100) * 2271));               
            }
            else if (tieuThu > 200 && tieuThu < 301)
            {
                txa_kq.append("Giá: " + (50 * 1893 + 50 * 1956 + 100 * 2271 + (tieuThu - 200) * 2860));
            }
            else if (tieuThu > 300 && tieuThu <= 400)
            {
                txa_kq.append("Giá: " + (50 * 1893 + 50 * 1956 + 100 * 2271 + 200 * 2860 + (tieuThu - 300) * 3197));
            }
            else 
            {
                txa_kq.append("Giá: " + (50 * 1893 + 50 * 1956 + 100 * 2271 + 200 * 2860 + 300 * 3197 + (tieuThu - 400) * 3302));
            }
         
         
    }//GEN-LAST:event_btn_TinhActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Bai13_JF_TinhTienDien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Bai13_JF_TinhTienDien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Bai13_JF_TinhTienDien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Bai13_JF_TinhTienDien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Bai13_JF_TinhTienDien().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Tinh;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane txa_KQ;
    private javax.swing.JTextArea txa_kq;
    private javax.swing.JTextField txt_socu;
    private javax.swing.JTextField txt_somoi;
    private javax.swing.JTextField txt_thue;
    // End of variables declaration//GEN-END:variables
}

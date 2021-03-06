/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package tenkinoko;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;

/**
 *
 * @author ACER
 */
public class GUI extends javax.swing.JFrame {

    /**
     * Creates new form GUI
     */
    public GUI() {
        initComponents();
        jPanel1.setVisible(true);
        this.setLocationRelativeTo(null);
    }

    public JButton getBtn_find() {
        return btn_find;
    }

    public JButton getBtn_next() {
        return btn_next;
    }

    public JButton getBtn_back() {
        return btn_back;
    }

    public JComboBox<String> getCb_city() {
        return cb_city;
    }

    public JLabel getLb_apSuat() {
        return lb_apSuat;
    }

    public JLabel getLb_city() {
        return lb_city;
    }

    public JLabel getLb_cloud() {
        return lb_cloud;
    }

    public JLabel getLb_date() {
        return lb_date;
    }

    public JLabel getLb_doAm() {
        return lb_doAm;
    }

    public JLabel getLb_nhietDo() {
        return lb_nhietDo;
    }

    public JLabel getLb_weather() {
        return lb_weather;
    }

    public JLabel getLb_windSpeed() {
        return lb_windSpeed;
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lb_nhietDo = new javax.swing.JLabel();
        lb_apSuat = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lb_date = new javax.swing.JLabel();
        lb_weather = new javax.swing.JLabel();
        lb_city = new javax.swing.JLabel();
        lb_doAm = new javax.swing.JLabel();
        lb_windSpeed = new javax.swing.JLabel();
        lb_cloud = new javax.swing.JLabel();
        btn_next = new javax.swing.JButton();
        btn_back = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        cb_city = new javax.swing.JComboBox<>();
        btn_find = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lb_nhietDo.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        lb_nhietDo.setForeground(new java.awt.Color(255, 255, 255));
        lb_nhietDo.setText("Nhi???t ?????:");
        jPanel1.add(lb_nhietDo, new org.netbeans.lib.awtextra.AbsoluteConstraints(53, 321, 270, 39));

        lb_apSuat.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        lb_apSuat.setForeground(new java.awt.Color(255, 255, 255));
        lb_apSuat.setText("??p su???t:");
        jPanel1.add(lb_apSuat, new org.netbeans.lib.awtextra.AbsoluteConstraints(53, 386, 270, 39));

        jLabel3.setText("jLabel1");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(53, 700, -1, -1));

        lb_date.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        lb_date.setForeground(new java.awt.Color(255, 255, 255));
        lb_date.setText("Ng??y:");
        jPanel1.add(lb_date, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 170, 270, 39));

        lb_weather.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        lb_weather.setForeground(new java.awt.Color(255, 255, 255));
        lb_weather.setText("Th???i ti???t:");
        jPanel1.add(lb_weather, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 250, 270, 39));

        lb_city.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        lb_city.setForeground(new java.awt.Color(255, 255, 255));
        lb_city.setText("Th??nh ph???:");
        jPanel1.add(lb_city, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 170, 200, 39));

        lb_doAm.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        lb_doAm.setForeground(new java.awt.Color(255, 255, 255));
        lb_doAm.setText("????? ???m:");
        jPanel1.add(lb_doAm, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 386, 200, 39));

        lb_windSpeed.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        lb_windSpeed.setForeground(new java.awt.Color(255, 255, 255));
        lb_windSpeed.setText("T???c ????? gi??:");
        jPanel1.add(lb_windSpeed, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 321, 200, 39));

        lb_cloud.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        lb_cloud.setForeground(new java.awt.Color(255, 255, 255));
        lb_cloud.setText("M??y:");
        jPanel1.add(lb_cloud, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 250, 200, 39));

        btn_next.setBackground(new java.awt.Color(153, 153, 153));
        btn_next.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btn_next.setForeground(new java.awt.Color(255, 255, 255));
        btn_next.setText("Next");
        jPanel1.add(btn_next, new org.netbeans.lib.awtextra.AbsoluteConstraints(362, 435, 90, 30));

        btn_back.setBackground(new java.awt.Color(153, 153, 153));
        btn_back.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btn_back.setForeground(new java.awt.Color(255, 255, 255));
        btn_back.setText("Back");
        jPanel1.add(btn_back, new org.netbeans.lib.awtextra.AbsoluteConstraints(205, 435, 90, 30));

        jLabel6.setFont(new java.awt.Font("Kristen ITC", 0, 48)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Weather");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(42, 29, 210, 51));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Ch???n th??nh ph??? :");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 110, -1, 47));

        cb_city.setBackground(new java.awt.Color(153, 153, 153));
        cb_city.setForeground(new java.awt.Color(255, 255, 255));
        cb_city.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "H?? N???i", "Ninh B??nh", "Th??i B??nh", "H???i Ph??ng" }));
        cb_city.setToolTipText("");
        cb_city.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_cityActionPerformed(evt);
            }
        });
        jPanel1.add(cb_city, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 110, 168, 47));

        btn_find.setBackground(new java.awt.Color(153, 153, 153));
        btn_find.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btn_find.setForeground(new java.awt.Color(255, 255, 255));
        btn_find.setText("T??m");
        btn_find.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_findActionPerformed(evt);
            }
        });
        jPanel1.add(btn_find, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 110, 90, 40));

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tenkinoko/z3243134589218_586c2c599e6be2064f4cd2de29e99662.jpg"))); // NOI18N
        jLabel12.setText("jLabel12");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 700, 500));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 700, 500));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cb_cityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_cityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cb_cityActionPerformed

    private void btn_findActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_findActionPerformed

    }//GEN-LAST:event_btn_findActionPerformed

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
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //new GUI().setVisible(true);
                new demo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_back;
    private javax.swing.JButton btn_find;
    private javax.swing.JButton btn_next;
    private javax.swing.JComboBox<String> cb_city;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lb_apSuat;
    private javax.swing.JLabel lb_city;
    private javax.swing.JLabel lb_cloud;
    private javax.swing.JLabel lb_date;
    private javax.swing.JLabel lb_doAm;
    private javax.swing.JLabel lb_nhietDo;
    private javax.swing.JLabel lb_weather;
    private javax.swing.JLabel lb_windSpeed;
    // End of variables declaration//GEN-END:variables
}

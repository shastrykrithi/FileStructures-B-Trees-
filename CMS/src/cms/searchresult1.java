/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cms;

import java.awt.Dimension;
import java.awt.Toolkit;

/**
 *
 * @author Rajesh
 */
public class searchresult1 extends javax.swing.JFrame {
String a,b,c,d,e,f,g,h;

    /**
     * Creates new form searchresult
     */
    public searchresult1(int k,String name,String adhar,String email_id,String phone,String dat,String bill,String addr) {
       a=""+k;
       b=name;
       c=adhar;
       d=email_id;
       e=phone;
       f=dat;
       g=bill;
       h=addr;
        initComponents();
        change();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField5 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        jTextField8 = new javax.swing.JTextField();
        jTextField9 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        jTextField5.setText("jTextField5");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);
        getContentPane().add(jLabel6);
        jLabel6.setBounds(0, 582, 99, 28);

        jLabel1.setFont(new java.awt.Font("Impact", 3, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 51, 51));
        jLabel1.setText("SEARCH RESULT");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(270, 30, 210, 31);

        jLabel2.setFont(new java.awt.Font("Times New Roman", 2, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 255, 102));
        jLabel2.setText("ID");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(200, 150, 60, 22);

        jLabel3.setFont(new java.awt.Font("Times New Roman", 2, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 255, 102));
        jLabel3.setText("NAME");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(200, 200, 70, 22);

        jLabel4.setFont(new java.awt.Font("Times New Roman", 2, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 255, 102));
        jLabel4.setText("ADHAR_DETAILS");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(200, 240, 150, 22);

        jLabel5.setFont(new java.awt.Font("Times New Roman", 2, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 255, 102));
        jLabel5.setText("EMAIL_ID");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(200, 290, 120, 30);

        jLabel7.setFont(new java.awt.Font("Times New Roman", 2, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 255, 102));
        jLabel7.setText("PHONE");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(200, 340, 80, 22);

        jLabel8.setFont(new java.awt.Font("Times New Roman", 2, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 255, 102));
        jLabel8.setText("ADDRESS");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(200, 390, 100, 30);

        jLabel9.setFont(new java.awt.Font("Times New Roman", 2, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 255, 102));
        jLabel9.setText("DATE");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(200, 440, 80, 30);

        jLabel10.setFont(new java.awt.Font("Times New Roman", 2, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 255, 102));
        jLabel10.setText("BILL");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(200, 490, 70, 30);

        jTextField1.setFont(new java.awt.Font("Times New Roman", 2, 14)); // NOI18N
        jTextField1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(jTextField1);
        jTextField1.setBounds(420, 140, 140, 30);

        jTextField2.setFont(new java.awt.Font("Times New Roman", 2, 14)); // NOI18N
        jTextField2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(jTextField2);
        jTextField2.setBounds(420, 190, 140, 30);

        jTextField3.setFont(new java.awt.Font("Times New Roman", 2, 14)); // NOI18N
        jTextField3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(jTextField3);
        jTextField3.setBounds(420, 240, 140, 30);

        jTextField4.setFont(new java.awt.Font("Times New Roman", 2, 14)); // NOI18N
        jTextField4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jTextField4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField4ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField4);
        jTextField4.setBounds(420, 290, 140, 30);

        jTextField6.setFont(new java.awt.Font("Times New Roman", 2, 14)); // NOI18N
        jTextField6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jTextField6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField6ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField6);
        jTextField6.setBounds(420, 340, 140, 30);

        jTextField7.setFont(new java.awt.Font("Times New Roman", 2, 14)); // NOI18N
        jTextField7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(jTextField7);
        jTextField7.setBounds(420, 390, 140, 30);

        jTextField8.setFont(new java.awt.Font("Times New Roman", 2, 14)); // NOI18N
        jTextField8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(jTextField8);
        jTextField8.setBounds(420, 440, 140, 30);

        jTextField9.setFont(new java.awt.Font("Times New Roman", 2, 14)); // NOI18N
        jTextField9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jTextField9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField9ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField9);
        jTextField9.setBounds(420, 490, 140, 30);

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cms/Webp.net-resizeimage (2).jpg"))); // NOI18N
        getContentPane().add(jLabel11);
        jLabel11.setBounds(0, 0, 750, 630);

        jButton1.setText("jButton1");
        getContentPane().add(jButton1);
        jButton1.setBounds(330, 553, 110, 40);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField4ActionPerformed

    private void jTextField6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField6ActionPerformed

    private void jTextField9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField9ActionPerformed

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
            java.util.logging.Logger.getLogger(searchresult1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(searchresult1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(searchresult1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(searchresult1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    // End of variables declaration//GEN-END:variables

private void change()
{
    this.setSize(775,650);
         Dimension dim =Toolkit.getDefaultToolkit().getScreenSize();
       this.setLocation(dim.width/2-this.getSize().width/2,dim.height/2-this.getSize().height/2);
jTextField1.setText(a);
jTextField2.setText(b);
jTextField3.setText(c);
jTextField4.setText(d);
jTextField6.setText(e);
jTextField7.setText(h);
jTextField8.setText(f);
jTextField9.setText(g);

}
}
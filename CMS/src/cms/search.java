/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cms;
import static cms.Fs.countno;
import javax.swing.JOptionPane;
import static cms.Fs.recs;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.io.IOException;
import javax.swing.*;
/**
 *
 * @author Rajesh
 */
public class search extends javax.swing.JFrame{

    /**
     * Creates new form search
     */
    public search() {
        initComponents();
        setTitle("SEARCH");
        this.setSize(800,630);
         Dimension dim =Toolkit.getDefaultToolkit().getScreenSize();
       this.setLocation(dim.width/2-this.getSize().width/2,dim.height/2-this.getSize().height/2);
        
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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Impact", 3, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 0, 204));
        jLabel1.setText("ENTER THE ID TO SEARCH THE RECORD");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(250, 60, 400, 37);

        jLabel2.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        jLabel2.setText("Customer_ID");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(180, 172, 120, 30);

        jTextField1.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(0, 255, 255), null));
        jPanel1.add(jTextField1);
        jTextField1.setBounds(340, 170, 128, 28);

        jButton1.setFont(new java.awt.Font("Rod", 1, 14)); // NOI18N
        jButton1.setText("SEARCH");
        jButton1.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(0, 255, 0), null));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(180, 330, 92, 48);

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton2.setText("BACK");
        jButton2.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(0, 255, 51), null));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(420, 330, 100, 48);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cms/Webp.net-resizeimage (3).jpg"))); // NOI18N
        jPanel1.add(jLabel3);
        jLabel3.setBounds(0, 0, 780, 590);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 820, 600);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String name,adhar,email_id,phone,addr,count;
        String[] nodes=new String[100];
        btree b = new btree();
        int choice=1,key=1,no = 0,rkey;
        try {
            no=countno();

            System.out.println("No. of records: "+no+"\n");
            for(int i=0;i<=no;i++)
            recs[i]=new records();
           BufferedReader f3 = new BufferedReader(new FileReader("G:\\6th  sem\\FS\\CyberManagement\\bpluss.txt"));
            for(int i=0;i<=no;i++)
            {
                String lineRead=f3.readLine();
                String [] st = lineRead.split("\\|");
                recs[i].keyf=st[0];
                recs[i].name=st[1];
                recs[i].adhar=st[2];
                recs[i].email_id=st[3];
                recs[i].phone=st[4];
                recs[i].dat=st[5];
                recs[i].bill=st[6];
                recs[i].addr=st[7];
                rkey=Integer.valueOf(recs[i].keyf);
                b.insert1(rkey);
            }
            f3.close();

            key=Integer.valueOf(jTextField1.getText());
            b.search(key);
            f3=new BufferedReader(new FileReader("G:\\6th  sem\\FS\\CyberManagement\\bpluss.txt"));
            for(int i=0;i<no;i++)
            {
                String lineRead=f3.readLine();
                String [] t=lineRead.split("\\|");
                recs[i].keyf=t[0];
                recs[i].name=t[1];
                recs[i].adhar=t[2];
                recs[i].email_id=t[3];
                recs[i].phone=t[4];
                recs[i].dat=t[5];
                recs[i].bill=t[6];
                recs[i].addr=t[7];
                rkey=Integer.valueOf(recs[i].keyf);

                if(key==rkey)
                {
                    new searchresult1(key,recs[i].name,recs[i].adhar,recs[i].email_id,recs[i].phone,recs[i].dat,recs[i].bill,recs[i].addr).setVisible(true);
                    this.setVisible(false);
                }
            }
            f3.close();
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(rootPane," not success");
            Logger.getLogger(insert.class.getName()).log(Level.SEVERE, null, ex);
        }
        // TODO add your handling code here:
        
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
new home().setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
records recs[]=new records[100];
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
            java.util.logging.Logger.getLogger(search.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(search.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(search.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(search.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new search().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}

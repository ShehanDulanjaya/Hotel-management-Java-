/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package manager;

import hotelreservation.*;
import database.DBconnect;
import static database.DBconnect.connect;
import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


/**
 *
 * @author Sharan
 */
public class Addroom1 extends javax.swing.JFrame {
Connection connect = null;
ResultSet rst=null;
PreparedStatement pst=null;
Statement st = null;
    /**
     * Creates new form Checkout
     */
    public Addroom1() {
        initComponents();
        connect = DBconnect.connect();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane4 = new javax.swing.JTabbedPane();
        jLabel2 = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel4 = new javax.swing.JPanel();
        jButton4 = new javax.swing.JButton();
        txt1 = new javax.swing.JTextField();
        txt2 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txt7 = new javax.swing.JTextField();
        jButton7 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        txt3 = new javax.swing.JTextField();
        txt4 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        txt8 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        txt5 = new javax.swing.JTextField();
        txt6 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jButton10 = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        txt9 = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        jPanel6 = new javax.swing.JPanel();
        jButton9 = new javax.swing.JButton();
        txt12 = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbl1 = new javax.swing.JTable();
        jLabel17 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        txt13 = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jButton8 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl2 = new javax.swing.JTable();
        jPanel8 = new javax.swing.JPanel();
        jButton11 = new javax.swing.JButton();
        txt14 = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        tbl3 = new javax.swing.JTable();
        jLabel18 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Add or remove room");
        setPreferredSize(new java.awt.Dimension(1280, 725));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel2.setText("Add Room");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(306, 18, 100, 35));

        jTabbedPane1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton4.setText("Add");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 220, -1, -1));
        jPanel4.add(txt1, new org.netbeans.lib.awtextra.AbsoluteConstraints(242, 63, 144, -1));
        jPanel4.add(txt2, new org.netbeans.lib.awtextra.AbsoluteConstraints(242, 125, 144, -1));

        jLabel5.setText("New room no");
        jPanel4.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 66, -1, -1));

        jLabel6.setText("Extra");
        jPanel4.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 128, -1, -1));

        jLabel1.setText("Price");
        jPanel4.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 192, 51, -1));
        jPanel4.add(txt7, new org.netbeans.lib.awtextra.AbsoluteConstraints(242, 179, 144, -1));

        jButton7.setText("Clear");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 220, -1, -1));

        jTabbedPane1.addTab("Single room", jPanel4);

        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel3.add(txt3, new org.netbeans.lib.awtextra.AbsoluteConstraints(242, 63, 144, -1));
        jPanel3.add(txt4, new org.netbeans.lib.awtextra.AbsoluteConstraints(242, 125, 144, -1));

        jLabel7.setText("New room no");
        jPanel3.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 66, -1, -1));

        jLabel8.setText("Extra");
        jPanel3.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 128, -1, -1));

        jButton5.setText("Add");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(266, 217, -1, -1));

        jLabel4.setText("Price");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 188, 52, 22));
        jPanel3.add(txt8, new org.netbeans.lib.awtextra.AbsoluteConstraints(242, 179, 144, -1));

        jButton2.setText("Clear");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 220, -1, -1));

        jTabbedPane1.addTab("Double room", jPanel3);

        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel5.add(txt5, new org.netbeans.lib.awtextra.AbsoluteConstraints(242, 63, 144, -1));
        jPanel5.add(txt6, new org.netbeans.lib.awtextra.AbsoluteConstraints(242, 125, 144, -1));

        jLabel9.setText("New room no");
        jPanel5.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 66, -1, -1));

        jLabel10.setText("Extra");
        jPanel5.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 128, -1, -1));

        jButton10.setText("Add");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });
        jPanel5.add(jButton10, new org.netbeans.lib.awtextra.AbsoluteConstraints(266, 217, -1, -1));

        jLabel11.setText("Price");
        jPanel5.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 192, 44, -1));
        jPanel5.add(txt9, new org.netbeans.lib.awtextra.AbsoluteConstraints(242, 179, 144, -1));

        jButton3.setText("Clear");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel5.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 220, -1, -1));

        jTabbedPane1.addTab("Trible room", jPanel5);

        getContentPane().add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(142, 71, 420, 310));

        jButton6.setText("Back");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 630, 78, -1));

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel3.setText("Remove room");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(798, 18, 100, 35));

        jTabbedPane2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jTabbedPane2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTabbedPane2MouseClicked(evt);
            }
        });

        jPanel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel6MouseEntered(evt);
            }
        });

        jButton9.setText("Remove");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        txt12.setEditable(false);

        tbl1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Room no", "Status", "Extra"
            }
        ));
        tbl1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl1MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tbl1);

        jLabel17.setText("Selected room");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                        .addComponent(jButton9)
                        .addGap(98, 98, 98))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel17)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt12, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(134, 134, 134))))
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 345, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 33, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap(44, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton9)
                .addGap(32, 32, 32))
        );

        jTabbedPane2.addTab("Single room", jPanel6);

        jPanel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel7MouseEntered(evt);
            }
        });

        txt13.setEditable(false);

        jLabel14.setText("Selected room");

        jButton8.setText("Remove");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        tbl2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Room no", "Status", "Extra"
            }
        ));
        tbl2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl2MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbl2);

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                        .addComponent(jButton8)
                        .addGap(98, 98, 98))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                        .addComponent(jLabel14)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt13, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(134, 134, 134))))
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 345, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 33, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap(44, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton8)
                .addGap(32, 32, 32))
        );

        jTabbedPane2.addTab("Double room", jPanel7);

        jPanel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel8MouseEntered(evt);
            }
        });

        jButton11.setText("Remove");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });

        txt14.setEditable(false);

        tbl3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Room no", "Status", "Extra"
            }
        ));
        tbl3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl3MouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tbl3);

        jLabel18.setText("Selected room");

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                        .addComponent(jButton11)
                        .addGap(98, 98, 98))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                        .addComponent(jLabel18)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt14, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(134, 134, 134))))
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 345, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 33, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap(44, Short.MAX_VALUE)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel18))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton11)
                .addGap(32, 32, 32))
        );

        jTabbedPane2.addTab("Trible room", jPanel8);

        getContentPane().add(jTabbedPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(644, 71, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
    Admin1 rsp = new Admin1();
     rsp.setVisible(true);
     this.setVisible(false);
        



// TODO add your handling code here:
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed

            String queryco = "Insert into single_rooms (room_no,status,extra,Price) values (?,?,?,?)";
           
          
                String coitemname = txt1.getText();
                String cocateg = txt2.getText();
                String p = txt7.getText(); 
                
         if("".equals(coitemname) || ("".equals(cocateg)) )
         {
             JOptionPane.showMessageDialog(null, "please fill the text field!");
         }
         else
         {
             int dbb =   JOptionPane.showConfirmDialog (null, "Would You Like Add New Room?","Warning",JOptionPane.YES_NO_OPTION);
     if(dbb == JOptionPane.YES_OPTION){ 
        
        
                 try{
                pst = connect.prepareStatement(queryco);
                pst.setString(1, coitemname);
                pst.setString(2, "Available");
                pst.setString(3, cocateg); 
                pst.setString(4, p);
                pst.execute();
            //onnect.commit();
            JOptionPane.showMessageDialog(null,"success");
        }catch(Exception e)
        {

            JOptionPane.showMessageDialog(this,e.getMessage());
        }
     }}
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
String queryco = "Insert into double_rooms (room_no,status,extra,Price) values (?,?,?,?)";
           
          
                String coitemname = txt3.getText();
                String cocateg = txt4.getText();
                String p = txt8.getText();
                          
         if("".equals(coitemname) || ("".equals(cocateg)) )
         {
             JOptionPane.showMessageDialog(null, "please fill the text field!");
         }
         else
         {
              int dbb =   JOptionPane.showConfirmDialog (null, "Would You Like Add New Room?","Warning",JOptionPane.YES_NO_OPTION);
     if(dbb == JOptionPane.YES_OPTION){ 
        
        
                 try{
                pst = connect.prepareStatement(queryco);
                pst.setString(1, coitemname);
                pst.setString(2, "Available");
                pst.setString(3, cocateg); 
                pst.setString(4, p);
                pst.execute();
            //onnect.commit();
            JOptionPane.showMessageDialog(null,"success");
        }catch(Exception e)
        {

            JOptionPane.showMessageDialog(this,e.getMessage());
        }
     }}        // TODO add your handling code here:
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
String queryco = "Insert into thrible_rooms (room_no,status,extra,Price) values (?,?,?,?)";
           
          
                String coitemname = txt5.getText();
                String cocateg = txt6.getText();
                  String p = txt9.getText();
                          
         if("".equals(coitemname) || ("".equals(cocateg)) )
         {
             JOptionPane.showMessageDialog(null, "please fill the text field!");
         }
         else
         {
              int dbb =   JOptionPane.showConfirmDialog (null, "Would You Like Add New Room?","Warning",JOptionPane.YES_NO_OPTION);
     if(dbb == JOptionPane.YES_OPTION){ 
        
        
                 try{
                pst = connect.prepareStatement(queryco);
                pst.setString(1, coitemname);
                pst.setString(2, "Available");
                pst.setString(3, cocateg); 
                 pst.setString(4, p);
                pst.execute();
            //onnect.commit();
            JOptionPane.showMessageDialog(null,"success");
        }catch(Exception e)
        {

            JOptionPane.showMessageDialog(this,e.getMessage());
        }
     }}        // TODO add your handling code here:
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
String A=txt13.getText();
        if(!"".equals(A)){
    


        int dbb =   JOptionPane.showConfirmDialog (null, "Would You Like to delete Room "+A+"","Warning",JOptionPane.YES_NO_OPTION);
     if(dbb == JOptionPane.YES_OPTION){ 
      
     
    
     try {
         
     
        String sql1;
         sql1 = "delete from double_rooms where room_no=?";
        pst = connect.prepareStatement(sql1);
        pst.setString(1, A);
        pst.execute();
        
        

    int i=0;       
while(i<10)  
{
    
    tbl2.setValueAt("", i, 0);
    tbl2.setValueAt("", i, 1);
    tbl2.setValueAt("", i, 2);
    i++;
}
        
        txt13.setText("");
        JOptionPane.showMessageDialog(null, "Succes!");
    } catch (SQLException ex) {
        Logger.getLogger(Changereceptionistpass1.class.getName()).log(Level.SEVERE, null, ex);
    }
     } 
        }
        else{
            JOptionPane.showMessageDialog(null, "Please select one room!");
        }

    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
 String A=txt12.getText();
 if(!"".equals(A)){
    


        int dbb =   JOptionPane.showConfirmDialog (null, "Would You Like to delete Room "+A+"","Warning",JOptionPane.YES_NO_OPTION);
     if(dbb == JOptionPane.YES_OPTION){ 
      
        
       
     
    
     try {
         
     
        String sql1;
         sql1 = "delete from single_rooms where room_no=?";
        pst = connect.prepareStatement(sql1);
        pst.setString(1, A);
        pst.execute();
        
        

    int i=0;       
while(i<10)  
{
    
    tbl1.setValueAt("", i, 0);
    tbl1.setValueAt("", i, 1);
    tbl1.setValueAt("", i, 2);
    i++;
}
        
        txt12.setText("");
        JOptionPane.showMessageDialog(null, "Succes!");
    } catch (SQLException ex) {
        Logger.getLogger(Changereceptionistpass1.class.getName()).log(Level.SEVERE, null, ex);
    }
     }
     }
 else{
     JOptionPane.showMessageDialog(null, "Please select one room!");
 }
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
String A=txt14.getText();
if(!"".equals(A)){
    


        int dbb =   JOptionPane.showConfirmDialog (null, "Would You Like to delete Room "+A+"","Warning",JOptionPane.YES_NO_OPTION);
     if(dbb == JOptionPane.YES_OPTION){ 
     
    
     try {
         
     
        String sql1;
         sql1 = "delete from thrible_rooms where room_no=?";
        pst = connect.prepareStatement(sql1);
        pst.setString(1, A);
        pst.execute();
        
        int i=0;       
while(i<20)  
{
    
    tbl3.setValueAt("", i, 0);
    tbl3.setValueAt("", i, 1);
    tbl3.setValueAt("", i, 2);
    i++;
}

   
        txt14.setText("");
        JOptionPane.showMessageDialog(null, "Succes!");
    } catch (SQLException ex) {
        Logger.getLogger(Changereceptionistpass1.class.getName()).log(Level.SEVERE, null, ex);
    }
     }
}
else{
JOptionPane.showMessageDialog(null, "Please select one room!");
}
    }//GEN-LAST:event_jButton11ActionPerformed

    private void jTabbedPane2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTabbedPane2MouseClicked
       
     // TODO add your handling code here:
    }//GEN-LAST:event_jTabbedPane2MouseClicked

    private void jPanel6MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel6MouseEntered
  
      
           String idd;
   String idd1;
   String idd2;  
        int i=0;
        
        try {
            
        String sql2 = "SELECT *  FROM single_rooms";
        pst = connect.prepareStatement(sql2);
        rst=pst.executeQuery(sql2);
        
            while(rst.next()) {
                idd=rst.getString("room_no");
                idd1=rst.getString("status");
                idd2=rst.getString("extra");
                tbl1.setValueAt(idd, i, 0);
                tbl1.setValueAt(idd1, i, 1);
                tbl1.setValueAt(idd2, i, 2);
                i++;}  
      
        } catch (SQLException ex) {
            Logger.getLogger(Removereceptionist1.class.getName()).log(Level.SEVERE, null, ex);
        }
      // TODO add your handling code here:
    }//GEN-LAST:event_jPanel6MouseEntered

    private void jPanel7MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel7MouseEntered
int j=0;
           String idd3;
   String idd13;
   String idd23;
        String sql3 = "SELECT *  FROM double_rooms";
    try {
        pst = connect.prepareStatement(sql3);
    
        rst=pst.executeQuery(sql3);
        
            while(rst.next()) {
                idd3=rst.getString("room_no");
                idd13=rst.getString("status");
                idd23=rst.getString("extra");
                tbl2.setValueAt(idd3, j, 0);
                tbl2.setValueAt(idd13, j, 1);
                tbl2.setValueAt(idd23, j, 2);
                j++;} 
            } catch (SQLException ex) {
        Logger.getLogger(Addroom1.class.getName()).log(Level.SEVERE, null, ex);
    }// TODO add your handling code here:
    }//GEN-LAST:event_jPanel7MouseEntered

    private void tbl1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl1MouseClicked
int row=tbl1.getSelectedRow();
        
        String Table_click=(tbl1.getModel().getValueAt(row,0).toString());
        
        txt12.setText(Table_click);        // TODO add your handling code here:
    }//GEN-LAST:event_tbl1MouseClicked

    private void tbl2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl2MouseClicked
int row=tbl2.getSelectedRow();
        
        String Table_click=(tbl2.getModel().getValueAt(row,0).toString());
        
        txt13.setText(Table_click);        // TODO add your handling code here:
    }//GEN-LAST:event_tbl2MouseClicked

    private void tbl3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl3MouseClicked
int row=tbl3.getSelectedRow();
        
        String Table_click=(tbl3.getModel().getValueAt(row,0).toString());
        
        txt14.setText(Table_click);        // TODO add your handling code here:
    }//GEN-LAST:event_tbl3MouseClicked

    private void jPanel8MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel8MouseEntered
       int k=0;
           String idd4;
   String idd14;
   String idd24;
        String sql4 = "SELECT *  FROM thrible_rooms";
    try {
        pst = connect.prepareStatement(sql4);
    
        rst=pst.executeQuery(sql4);
        
            while(rst.next()) {
                idd4=rst.getString("room_no");
                idd14=rst.getString("status");
                idd24=rst.getString("extra");
                tbl3.setValueAt(idd4, k, 0);
                tbl3.setValueAt(idd14, k, 1);
                tbl3.setValueAt(idd24, k, 2);
                k++;} 
            } catch (SQLException ex) {
        Logger.getLogger(Addroom1.class.getName()).log(Level.SEVERE, null, ex);
    }// TODO add your handling code here:
    }//GEN-LAST:event_jPanel8MouseEntered

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
          txt1.setText("");  
          txt2.setText(""); 
          txt7.setText(""); 
          
// TODO add your handling code here:
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        txt3.setText("");  
          txt4.setText(""); 
          txt8.setText(""); 


// TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
      txt5.setText("");  
          txt6.setText(""); 
          txt9.setText(""); 
        

// TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(Addroom1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Addroom1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Addroom1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Addroom1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Addroom1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JTabbedPane jTabbedPane4;
    private javax.swing.JTable tbl1;
    private javax.swing.JTable tbl2;
    private javax.swing.JTable tbl3;
    private javax.swing.JTextField txt1;
    private javax.swing.JTextField txt12;
    private javax.swing.JTextField txt13;
    private javax.swing.JTextField txt14;
    private javax.swing.JTextField txt2;
    private javax.swing.JTextField txt3;
    private javax.swing.JTextField txt4;
    private javax.swing.JTextField txt5;
    private javax.swing.JTextField txt6;
    private javax.swing.JTextField txt7;
    private javax.swing.JTextField txt8;
    private javax.swing.JTextField txt9;
    // End of variables declaration//GEN-END:variables



}

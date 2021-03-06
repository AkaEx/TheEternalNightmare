/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Controller.*;
import Model.*;
import java.awt.Color;
import javax.swing.UIManager;

/**
 *
 * @author danie_000
 */
public class Arena extends javax.swing.JFrame {

    /**
     * Creates new form Arena
     */
    public Arena() {
        initComponents();
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/" + (bf1.getRival1().getName()) + ".png")));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/" + (bf1.getRival2().getName()) + ".png")));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/" + (bf1.getRival3().getName()) + ".png")));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/" + (bf1.getRival4().getName()) + ".png")));

        jProgressBar1.setStringPainted(true);
        jProgressBar1.setForeground(Color.green);
        jProgressBar3.setStringPainted(true);
        jProgressBar3.setForeground(Color.green);
        jProgressBar4.setStringPainted(true);
        jProgressBar4.setForeground(Color.green);
        jProgressBar5.setStringPainted(true);
        jProgressBar5.setForeground(Color.green);
        jProgressBar6.setStringPainted(true);
        jProgressBar6.setForeground(Color.green);

        jButton1.setVisible(false);
        jButton2.setVisible(false);
        jButton4.setVisible(false);
        jButton5.setVisible(false);
        jButton6.setVisible(false);
       
        
    }

    private static  Battlefield bf1 = new Battlefield(new Allen(), new Eddy(), new Pearl(),
            new Ghost(), new Ghost(), new Ghost(), new Ghost());

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPopupMenu1 = new javax.swing.JPopupMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        jMenuItem2 = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        jMenuItem3 = new javax.swing.JMenuItem();
        jPopupMenu2 = new javax.swing.JPopupMenu();
        jMenuItem4 = new javax.swing.JMenuItem();
        jSeparator3 = new javax.swing.JPopupMenu.Separator();
        jMenuItem5 = new javax.swing.JMenuItem();
        jSeparator4 = new javax.swing.JPopupMenu.Separator();
        jMenuItem6 = new javax.swing.JMenuItem();
        jPopupMenu3 = new javax.swing.JPopupMenu();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem34 = new javax.swing.JMenuItem();
        jSeparator29 = new javax.swing.JPopupMenu.Separator();
        jMenuItem35 = new javax.swing.JMenuItem();
        jSeparator30 = new javax.swing.JPopupMenu.Separator();
        jMenuItem36 = new javax.swing.JMenuItem();
        jSeparator5 = new javax.swing.JPopupMenu.Separator();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem37 = new javax.swing.JMenuItem();
        jSeparator31 = new javax.swing.JPopupMenu.Separator();
        jMenuItem38 = new javax.swing.JMenuItem();
        jSeparator32 = new javax.swing.JPopupMenu.Separator();
        jMenuItem39 = new javax.swing.JMenuItem();
        jSeparator10 = new javax.swing.JPopupMenu.Separator();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem40 = new javax.swing.JMenuItem();
        jSeparator33 = new javax.swing.JPopupMenu.Separator();
        jMenuItem41 = new javax.swing.JMenuItem();
        jSeparator34 = new javax.swing.JPopupMenu.Separator();
        jMenuItem42 = new javax.swing.JMenuItem();
        jPopupMenu4 = new javax.swing.JPopupMenu();
        jMenu10 = new javax.swing.JMenu();
        jMenuItem43 = new javax.swing.JMenuItem();
        jSeparator35 = new javax.swing.JPopupMenu.Separator();
        jMenuItem44 = new javax.swing.JMenuItem();
        jSeparator36 = new javax.swing.JPopupMenu.Separator();
        jMenuItem45 = new javax.swing.JMenuItem();
        jSeparator37 = new javax.swing.JPopupMenu.Separator();
        jMenu11 = new javax.swing.JMenu();
        jMenuItem46 = new javax.swing.JMenuItem();
        jSeparator38 = new javax.swing.JPopupMenu.Separator();
        jMenuItem47 = new javax.swing.JMenuItem();
        jSeparator39 = new javax.swing.JPopupMenu.Separator();
        jMenuItem48 = new javax.swing.JMenuItem();
        jSeparator40 = new javax.swing.JPopupMenu.Separator();
        jMenu12 = new javax.swing.JMenu();
        jMenuItem49 = new javax.swing.JMenuItem();
        jSeparator41 = new javax.swing.JPopupMenu.Separator();
        jMenuItem50 = new javax.swing.JMenuItem();
        jSeparator42 = new javax.swing.JPopupMenu.Separator();
        jMenuItem51 = new javax.swing.JMenuItem();
        jPopupMenu5 = new javax.swing.JPopupMenu();
        jMenu13 = new javax.swing.JMenu();
        jMenuItem52 = new javax.swing.JMenuItem();
        jSeparator43 = new javax.swing.JPopupMenu.Separator();
        jMenuItem53 = new javax.swing.JMenuItem();
        jSeparator45 = new javax.swing.JPopupMenu.Separator();
        jMenu14 = new javax.swing.JMenu();
        jMenuItem55 = new javax.swing.JMenuItem();
        jSeparator46 = new javax.swing.JPopupMenu.Separator();
        jMenuItem56 = new javax.swing.JMenuItem();
        jSeparator48 = new javax.swing.JPopupMenu.Separator();
        jMenu15 = new javax.swing.JMenu();
        jMenuItem58 = new javax.swing.JMenuItem();
        jSeparator49 = new javax.swing.JPopupMenu.Separator();
        jMenuItem59 = new javax.swing.JMenuItem();
        jProgressBar1 = new javax.swing.JProgressBar();
        jProgressBar3 = new javax.swing.JProgressBar();
        jProgressBar4 = new javax.swing.JProgressBar();
        jProgressBar5 = new javax.swing.JProgressBar();
        jProgressBar6 = new javax.swing.JProgressBar();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextPane2 = new javax.swing.JTextPane();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();

        jMenuItem1.setText(bf1.getRival1().getName()+" Left");
        jMenuItem1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenuItem1MouseClicked(evt);
            }
        });
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jPopupMenu1.add(jMenuItem1);
        jPopupMenu1.add(jSeparator1);

        jMenuItem2.setText(bf1.getRival2().getName()+" Center");
        jMenuItem2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenuItem2MouseClicked(evt);
            }
        });
        jPopupMenu1.add(jMenuItem2);
        jPopupMenu1.add(jSeparator2);

        jMenuItem3.setText(bf1.getRival3().getName()+" Right");
        jMenuItem3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenuItem3MouseClicked(evt);
            }
        });
        jPopupMenu1.add(jMenuItem3);

        jMenuItem4.setText(bf1.getRival1().getName()+" Left");
        jPopupMenu2.add(jMenuItem4);
        jPopupMenu2.add(jSeparator3);

        jMenuItem5.setText(bf1.getRival2().getName()+" Center");
        jPopupMenu2.add(jMenuItem5);
        jPopupMenu2.add(jSeparator4);

        jMenuItem6.setText(bf1.getRival3().getName()+" Right");
        jPopupMenu2.add(jMenuItem6);

        jMenu1.setText("Fire Fist");

        jMenuItem34.setText(bf1.getRival1().getName()+" Left");
        jMenu1.add(jMenuItem34);
        jMenu1.add(jSeparator29);

        jMenuItem35.setText(bf1.getRival2().getName()+" Center");
        jMenu1.add(jMenuItem35);
        jMenu1.add(jSeparator30);

        jMenuItem36.setText(bf1.getRival3().getName()+" Right");
        jMenu1.add(jMenuItem36);

        jPopupMenu3.add(jMenu1);
        jPopupMenu3.add(jSeparator5);

        jMenu2.setText("Shuriken");

        jMenuItem37.setText(bf1.getRival1().getName()+" Left");
        jMenu2.add(jMenuItem37);
        jMenu2.add(jSeparator31);

        jMenuItem38.setText(bf1.getRival2().getName()+" Center");
        jMenu2.add(jMenuItem38);
        jMenu2.add(jSeparator32);

        jMenuItem39.setText(bf1.getRival3().getName()+" Right");
        jMenu2.add(jMenuItem39);

        jPopupMenu3.add(jMenu2);
        jPopupMenu3.add(jSeparator10);

        jMenu3.setText("Freeze");

        jMenuItem40.setText(bf1.getRival1().getName()+" Left");
        jMenu3.add(jMenuItem40);
        jMenu3.add(jSeparator33);

        jMenuItem41.setText(bf1.getRival2().getName()+" Center");
        jMenu3.add(jMenuItem41);
        jMenu3.add(jSeparator34);

        jMenuItem42.setText(bf1.getRival3().getName()+" Right");
        jMenu3.add(jMenuItem42);

        jPopupMenu3.add(jMenu3);

        jMenu10.setText("Throw Thorns");

        jMenuItem43.setText(bf1.getRival1().getName()+" Left");
        jMenuItem43.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem43ActionPerformed(evt);
            }
        });
        jMenu10.add(jMenuItem43);
        jMenu10.add(jSeparator35);

        jMenuItem44.setText(bf1.getRival2().getName()+" Center");
        jMenu10.add(jMenuItem44);
        jMenu10.add(jSeparator36);

        jMenuItem45.setText(bf1.getRival3().getName()+" Right");
        jMenu10.add(jMenuItem45);

        jPopupMenu4.add(jMenu10);
        jPopupMenu4.add(jSeparator37);

        jMenu11.setText("Bite");

        jMenuItem46.setText(bf1.getRival1().getName()+" Left");
        jMenu11.add(jMenuItem46);
        jMenu11.add(jSeparator38);

        jMenuItem47.setText(bf1.getRival2().getName()+" Center");
        jMenu11.add(jMenuItem47);
        jMenu11.add(jSeparator39);

        jMenuItem48.setText(bf1.getRival3().getName()+" Right");
        jMenu11.add(jMenuItem48);

        jPopupMenu4.add(jMenu11);
        jPopupMenu4.add(jSeparator40);

        jMenu12.setText("Rotation Attack");

        jMenuItem49.setText(bf1.getRival1().getName()+" Left");
        jMenu12.add(jMenuItem49);
        jMenu12.add(jSeparator41);

        jMenuItem50.setText(bf1.getRival2().getName()+" Center");
        jMenu12.add(jMenuItem50);
        jMenu12.add(jSeparator42);

        jMenuItem51.setText(bf1.getRival3().getName()+" Right");
        jMenu12.add(jMenuItem51);

        jPopupMenu4.add(jMenu12);

        jMenu13.setText("Heal");

        jMenuItem52.setText("Allen");
        jMenu13.add(jMenuItem52);
        jMenu13.add(jSeparator43);

        jMenuItem53.setText("Eddy");
        jMenu13.add(jMenuItem53);

        jPopupMenu5.add(jMenu13);
        jPopupMenu5.add(jSeparator45);

        jMenu14.setText("Increase Atk");

        jMenuItem55.setText("Allen");
        jMenu14.add(jMenuItem55);
        jMenu14.add(jSeparator46);

        jMenuItem56.setText("Eddy");
        jMenu14.add(jMenuItem56);

        jPopupMenu5.add(jMenu14);
        jPopupMenu5.add(jSeparator48);

        jMenu15.setText("Bring Shield");

        jMenuItem58.setText("Allen");
        jMenu15.add(jMenuItem58);
        jMenu15.add(jSeparator49);

        jMenuItem59.setText("Eddy");
        jMenu15.add(jMenuItem59);

        jPopupMenu5.add(jMenu15);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(780, 506));
        setResizable(false);
        getContentPane().setLayout(null);
        getContentPane().add(jProgressBar1);
        jProgressBar1.setBounds(560, 80, 146, 20);
        getContentPane().add(jProgressBar3);
        jProgressBar3.setBounds(560, 140, 146, 20);
        getContentPane().add(jProgressBar4);
        jProgressBar4.setBounds(560, 200, 146, 20);
        getContentPane().add(jProgressBar5);
        jProgressBar5.setBounds(560, 260, 146, 20);
        getContentPane().add(jProgressBar6);
        jProgressBar6.setBounds(560, 320, 146, 20);

        jTextPane2.setEditable(false);
        jTextPane2.setFocusable(false);
        jScrollPane2.setViewportView(jTextPane2);

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(560, 30, 110, 22);

        jTextField2.setEditable(false);
        jTextField2.setFocusable(false);
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField2);
        jTextField2.setBounds(710, 80, 60, 40);

        jTextField3.setEditable(false);
        jTextField3.setFocusable(false);
        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField3);
        jTextField3.setBounds(710, 140, 60, 40);

        jTextField4.setEditable(false);
        jTextField4.setFocusable(false);
        jTextField4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField4ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField4);
        jTextField4.setBounds(710, 200, 60, 30);

        jTextField5.setEditable(false);
        jTextField5.setFocusable(false);
        jTextField5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField5ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField5);
        jTextField5.setBounds(710, 260, 60, 30);

        jTextField6.setEditable(false);
        jTextField6.setFocusable(false);
        jTextField6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField6ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField6);
        jTextField6.setBounds(710, 320, 60, 30);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/01.png"))); // NOI18N
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel4);
        jLabel4.setBounds(90, 280, 80, 100);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/Eddy.png"))); // NOI18N
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel5);
        jLabel5.setBounds(200, 300, 150, 100);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/Pearl.png"))); // NOI18N
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel6);
        jLabel6.setBounds(360, 290, 100, 90);

        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel7MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel7);
        jLabel7.setBounds(100, 170, 90, 100);

        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel8MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel8);
        jLabel8.setBounds(220, 170, 100, 100);

        jLabel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel9MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel9);
        jLabel9.setBounds(370, 170, 100, 100);

        jLabel10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel10MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel10);
        jLabel10.setBounds(200, 70, 150, 120);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/Arena.PNG"))); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, 0, 540, 430);

        jTextArea1.setEditable(false);
        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jTextArea1.setText("Right Click on the buttons to choose\n the direction of an atk or skill");
        jTextArea1.setAutoscrolls(false);
        jTextArea1.setFocusable(false);
        jScrollPane1.setViewportView(jTextArea1);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(460, 430, 310, 50);

        jButton1.setText("Special Skill");
        jButton1.setComponentPopupMenu(jPopupMenu3);
        jButton1.setFocusable(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(220, 430, 170, 23);

        jButton2.setText("Attack");
        jButton2.setComponentPopupMenu(jPopupMenu1);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(10, 430, 63, 23);

        jButton4.setText("Attack");
        jButton4.setComponentPopupMenu(jPopupMenu2);
        jButton4.setFocusable(false);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4);
        jButton4.setBounds(10, 430, 63, 23);

        jButton5.setText("Special Skill");
        jButton5.setComponentPopupMenu(jPopupMenu4);
        jButton5.setFocusable(false);
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5);
        jButton5.setBounds(220, 430, 170, 23);

        jButton6.setText("Special Skill");
        jButton6.setComponentPopupMenu(jPopupMenu5);
        jButton6.setFocusable(false);
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton6);
        jButton6.setBounds(220, 430, 170, 23);

        jLabel1.setText("Armor");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(560, 240, 110, 14);

        jLabel11.setText("Health Points");
        getContentPane().add(jLabel11);
        jLabel11.setBounds(560, 60, 110, 14);

        jLabel12.setText("Magic Points");
        getContentPane().add(jLabel12);
        jLabel12.setBounds(560, 120, 110, 14);

        jLabel13.setText("Attack");
        getContentPane().add(jLabel13);
        jLabel13.setBounds(560, 180, 110, 14);

        jLabel14.setText("Magical Resistance");
        getContentPane().add(jLabel14);
        jLabel14.setBounds(560, 300, 110, 14);

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/Gray.jpg"))); // NOI18N
        getContentPane().add(jLabel15);
        jLabel15.setBounds(540, 10, 240, 410);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3ActionPerformed

    private void jTextField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField4ActionPerformed

    private void jTextField5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField5ActionPerformed

    private void jTextField6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField6ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jMenuItem43ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem43ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem43ActionPerformed

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        // TODO add your handling code here:
        paintProgressBarsTextFieldsAndButtons(bf1.getAllen());
    }//GEN-LAST:event_jLabel4MouseClicked

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
        // TODO add your handling code here:
        paintProgressBarsTextFieldsAndButtons(bf1.getEddy());
    }//GEN-LAST:event_jLabel5MouseClicked

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
        // TODO add your handling code here:
        paintProgressBarsTextFieldsAndButtons(bf1.getPearl());
    }//GEN-LAST:event_jLabel6MouseClicked

    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseClicked
        // TODO add your handling code here:
        paintProgressBarsTextFieldsAndButtons(bf1.getRival1());
    }//GEN-LAST:event_jLabel7MouseClicked

    private void jLabel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseClicked
        // TODO add your handling code here:
        paintProgressBarsTextFieldsAndButtons(bf1.getRival2());
    }//GEN-LAST:event_jLabel8MouseClicked

    private void jLabel9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseClicked
        // TODO add your handling code here:
        paintProgressBarsTextFieldsAndButtons(bf1.getRival3());
    }//GEN-LAST:event_jLabel9MouseClicked

    private void jLabel10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseClicked
        // TODO add your handling code here:
        paintProgressBarsTextFieldsAndButtons(bf1.getRival4());
    }//GEN-LAST:event_jLabel10MouseClicked

    private void jMenuItem1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuItem1MouseClicked
        // TODO add your handling code here:
       
    }//GEN-LAST:event_jMenuItem1MouseClicked

    private void jMenuItem2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuItem2MouseClicked
        // TODO add your handling code here:
         bf1.attack(bf1.getAllen(), bf1.getRival2());
    }//GEN-LAST:event_jMenuItem2MouseClicked

    private void jMenuItem3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuItem3MouseClicked
        // TODO add your handling code here:
         bf1.attack(bf1.getAllen(), bf1.getRival3());
    }//GEN-LAST:event_jMenuItem3MouseClicked

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
         bf1.attack(bf1.getAllen(), bf1.getRival1());
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    public void paintProgressBarsTextFieldsAndButtons(Characters char1) {
        jButton1.setVisible(false);
        jButton2.setVisible(false);
        jButton4.setVisible(false);
        jButton5.setVisible(false);
        jButton6.setVisible(false);

        jTextPane2.setText(char1.getName());
        jTextField2.setText(char1.getHp() + "/" + char1.getHpLimit());
        jTextField3.setText(char1.getMp() + "/" + char1.getMpLimit());
        jTextField4.setText(char1.getAtk() + "/100");
        jTextField5.setText(char1.getArmor() + "/100");
        jTextField6.setText(char1.getMagicalResistence() + "/100");

        jProgressBar1.setMinimum(0);
        jProgressBar1.setMaximum(char1.getHpLimit());
        jProgressBar1.setValue(char1.getHp());

        jProgressBar3.setMinimum(0);
        jProgressBar3.setMaximum(char1.getMpLimit());
        jProgressBar3.setValue(char1.getMp());

        jProgressBar4.setValue(char1.getAtk());

        jProgressBar5.setValue(char1.getArmor());

        jProgressBar6.setValue(char1.getMagicalResistence());

        if (char1 instanceof Ghost || char1 instanceof Darkness
                || char1 instanceof TheDeath) {
            jButton1.setVisible(false);
            jButton2.setVisible(false);
            jButton4.setVisible(false);
            jButton5.setVisible(false);
            jButton6.setVisible(false);
        } else if (char1 instanceof Allen) {
            jButton1.setVisible(true);
            jButton2.setVisible(true);
        } else if (char1 instanceof Eddy) {
            jButton4.setVisible(true);
            jButton5.setVisible(true);
        } else {
            jButton6.setVisible(true);
        }
    }

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
            java.util.logging.Logger.getLogger(Arena.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Arena.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Arena.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Arena.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Arena().setVisible(true);
            }
        });
        System.out.println("It's executing bitch");
        int v =666;
         bf1.battle();
         System.out.println("It's executing bitch 2");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu10;
    private javax.swing.JMenu jMenu11;
    private javax.swing.JMenu jMenu12;
    private javax.swing.JMenu jMenu13;
    private javax.swing.JMenu jMenu14;
    private javax.swing.JMenu jMenu15;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem34;
    private javax.swing.JMenuItem jMenuItem35;
    private javax.swing.JMenuItem jMenuItem36;
    private javax.swing.JMenuItem jMenuItem37;
    private javax.swing.JMenuItem jMenuItem38;
    private javax.swing.JMenuItem jMenuItem39;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem40;
    private javax.swing.JMenuItem jMenuItem41;
    private javax.swing.JMenuItem jMenuItem42;
    private javax.swing.JMenuItem jMenuItem43;
    private javax.swing.JMenuItem jMenuItem44;
    private javax.swing.JMenuItem jMenuItem45;
    private javax.swing.JMenuItem jMenuItem46;
    private javax.swing.JMenuItem jMenuItem47;
    private javax.swing.JMenuItem jMenuItem48;
    private javax.swing.JMenuItem jMenuItem49;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem50;
    private javax.swing.JMenuItem jMenuItem51;
    private javax.swing.JMenuItem jMenuItem52;
    private javax.swing.JMenuItem jMenuItem53;
    private javax.swing.JMenuItem jMenuItem55;
    private javax.swing.JMenuItem jMenuItem56;
    private javax.swing.JMenuItem jMenuItem58;
    private javax.swing.JMenuItem jMenuItem59;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JPopupMenu jPopupMenu2;
    private javax.swing.JPopupMenu jPopupMenu3;
    private javax.swing.JPopupMenu jPopupMenu4;
    private javax.swing.JPopupMenu jPopupMenu5;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JProgressBar jProgressBar3;
    private javax.swing.JProgressBar jProgressBar4;
    private javax.swing.JProgressBar jProgressBar5;
    private javax.swing.JProgressBar jProgressBar6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator10;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JPopupMenu.Separator jSeparator29;
    private javax.swing.JPopupMenu.Separator jSeparator3;
    private javax.swing.JPopupMenu.Separator jSeparator30;
    private javax.swing.JPopupMenu.Separator jSeparator31;
    private javax.swing.JPopupMenu.Separator jSeparator32;
    private javax.swing.JPopupMenu.Separator jSeparator33;
    private javax.swing.JPopupMenu.Separator jSeparator34;
    private javax.swing.JPopupMenu.Separator jSeparator35;
    private javax.swing.JPopupMenu.Separator jSeparator36;
    private javax.swing.JPopupMenu.Separator jSeparator37;
    private javax.swing.JPopupMenu.Separator jSeparator38;
    private javax.swing.JPopupMenu.Separator jSeparator39;
    private javax.swing.JPopupMenu.Separator jSeparator4;
    private javax.swing.JPopupMenu.Separator jSeparator40;
    private javax.swing.JPopupMenu.Separator jSeparator41;
    private javax.swing.JPopupMenu.Separator jSeparator42;
    private javax.swing.JPopupMenu.Separator jSeparator43;
    private javax.swing.JPopupMenu.Separator jSeparator45;
    private javax.swing.JPopupMenu.Separator jSeparator46;
    private javax.swing.JPopupMenu.Separator jSeparator48;
    private javax.swing.JPopupMenu.Separator jSeparator49;
    private javax.swing.JPopupMenu.Separator jSeparator5;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextPane jTextPane2;
    // End of variables declaration//GEN-END:variables
}

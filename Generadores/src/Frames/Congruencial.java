/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Frames;

import java.text.DecimalFormat;
import java.util.ArrayList;
import javax.swing.DefaultListModel;

/**
 *
 * @author andrespinzon
 */
public class Congruencial extends javax.swing.JInternalFrame {

    /**
     * Creates new form Congruencial
     */
    public Congruencial() {
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
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        Semilla_cgr = new javax.swing.JTextField();
        a_cgr = new javax.swing.JTextField();
        b_cgr = new javax.swing.JTextField();
        m_cgr = new javax.swing.JTextField();
        Itera_cgr = new javax.swing.JTextField();
        Generar_btn = new javax.swing.JButton();
        Limpiar_btn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        ListaX = new javax.swing.JList<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        ListaU = new javax.swing.JList<>();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setClosable(true);
        setTitle("Congruencial lineal");
        setToolTipText("");

        jLabel1.setText("Semilla (Xo):");

        jLabel2.setText("a:");

        jLabel3.setText("b:");

        jLabel4.setText("m:");

        jLabel5.setText("Iteraciones (n):");

        Generar_btn.setText("Generar");
        Generar_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Generar_btnActionPerformed(evt);
            }
        });

        Limpiar_btn.setText("Limpiar");
        Limpiar_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Limpiar_btnActionPerformed(evt);
            }
        });

        jScrollPane1.setViewportView(ListaX);
        ListaX.getAccessibleContext().setAccessibleName("ListaX");

        jScrollPane2.setViewportView(ListaU);
        ListaU.getAccessibleContext().setAccessibleName("ListaU");

        jLabel6.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel6.setText("X");
        jLabel6.setToolTipText("");

        jLabel7.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel7.setText("U");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4))
                                .addGap(31, 31, 31))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(15, 15, 15)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(Itera_cgr, javax.swing.GroupLayout.DEFAULT_SIZE, 136, Short.MAX_VALUE)
                            .addComponent(Semilla_cgr, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(a_cgr, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 136, Short.MAX_VALUE)
                            .addComponent(b_cgr, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(m_cgr, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Generar_btn)
                            .addComponent(Limpiar_btn)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(70, 70, 70)
                                .addComponent(jLabel6))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addGap(72, 72, 72)))))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(Semilla_cgr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(a_cgr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Generar_btn))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(b_cgr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(m_cgr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Limpiar_btn))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(Itera_cgr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(28, Short.MAX_VALUE))
        );

        Semilla_cgr.getAccessibleContext().setAccessibleName("Semilla_cgr");
        Semilla_cgr.getAccessibleContext().setAccessibleDescription("");

        getAccessibleContext().setAccessibleName("Congruencial");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Generar_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Generar_btnActionPerformed
        int ite = Integer.parseInt(Itera_cgr.getText());
        DefaultListModel listax = new DefaultListModel();
        DefaultListModel listau = new DefaultListModel();
        double x = Double.parseDouble(Semilla_cgr.getText());
        int a = Integer.parseInt(a_cgr.getText());
        int b = Integer.parseInt(b_cgr.getText());
        int m = Integer.parseInt(m_cgr.getText());
        double resu;
        DecimalFormat df = new DecimalFormat("#");
//        Congruencial cgr = new Congruencial();
//        cgr.congruencialLineal(x, ite, a, b, m);
        //Xn = (a*x+b)%m
        for (int i = 0; i < ite; i++) {
            resu = ((a * x) + b) % m;
            x = resu;
            listax.addElement(df.format(x));
            double u = x / (m - 1);
            listau.addElement(u);
            ListaX.setModel(listax);
            ListaU.setModel(listau);
        }
    }//GEN-LAST:event_Generar_btnActionPerformed
    
    public void congruencialLineal(double semilla, int ite, int a, int b, int m) {
        double resu;
        DecimalFormat df = new DecimalFormat("#.##");
        for (int i = 0; i < ite; i++) {
            System.out.print((i + 1) + " - Semilla=" + df.format(semilla));
            resu = ((a * semilla) + b) % m;
            semilla = resu;
            double u = semilla / (m - 1);
            System.out.println("     X=" + resu + "      U=" + u);
        }
    }
    
    private void Limpiar_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Limpiar_btnActionPerformed
        DefaultListModel limpiar = new DefaultListModel();
        Semilla_cgr.setText("");
        Itera_cgr.setText("");
        a_cgr.setText("");
        b_cgr.setText("");
        m_cgr.setText("");
        ListaX.setModel(limpiar);
        ListaU.setModel(limpiar);
    }//GEN-LAST:event_Limpiar_btnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Generar_btn;
    private javax.swing.JTextField Itera_cgr;
    private javax.swing.JButton Limpiar_btn;
    private javax.swing.JList<String> ListaU;
    private javax.swing.JList<String> ListaX;
    private javax.swing.JTextField Semilla_cgr;
    private javax.swing.JTextField a_cgr;
    private javax.swing.JTextField b_cgr;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField m_cgr;
    // End of variables declaration//GEN-END:variables
}

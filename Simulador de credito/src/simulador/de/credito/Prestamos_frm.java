/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simulador.de.credito;

import java.math.BigDecimal;
import java.text.DecimalFormat;

/**
 *
 * @author andrespinzon
 */
public class Prestamos_frm extends javax.swing.JFrame {

    int valor;
    DecimalFormat miles = new DecimalFormat("###,###.##");
    DecimalFormat decimal = new DecimalFormat("###.##");

    /**
     * Creates new form Prestamos_frm
     */
    public Prestamos_frm() {
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

        Periodicidad_btgr = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        Nombre_jtf = new javax.swing.JTextField();
        Id_jtf = new javax.swing.JTextField();
        Valor_jtf = new javax.swing.JTextField();
        Plazo_jtf = new javax.swing.JTextField();
        EA_jtf = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        Mensual_rbt = new javax.swing.JRadioButton();
        Bimestral_rbt = new javax.swing.JRadioButton();
        Trimestral_rbt = new javax.swing.JRadioButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        NA_jtf = new javax.swing.JTextField();
        Ip_jtf = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        Calcular_btn = new javax.swing.JButton();
        Limpiar_btn = new javax.swing.JButton();
        Imprimir_btn = new javax.swing.JButton();
        Salir_btn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("El EURO Prestamos");
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon("/Users/andrespinzon/Documents/UNIMINUTO/Ingeniería económica/EuroPrestamos.png")); // NOI18N

        jLabel2.setFont(new java.awt.Font("Lucida Grande", 1, 24)); // NOI18N
        jLabel2.setText("El EURO Prestamos");

        jLabel3.setText("Nombre:");

        jLabel4.setText("Identificación:");

        jLabel5.setText("Valor:                $");

        jLabel6.setText("Plazo:");

        jLabel7.setText("Periodicidad");

        Id_jtf.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                Id_jtfFocusLost(evt);
            }
        });

        Valor_jtf.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                Valor_jtfFocusLost(evt);
            }
        });

        EA_jtf.setText("0.0");
        EA_jtf.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                EA_jtfFocusLost(evt);
            }
        });
        EA_jtf.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                EA_jtfKeyTyped(evt);
            }
        });

        jLabel8.setText("Años");

        Periodicidad_btgr.add(Mensual_rbt);
        Mensual_rbt.setText("Mensual");

        Periodicidad_btgr.add(Bimestral_rbt);
        Bimestral_rbt.setText("Bimestral");

        Periodicidad_btgr.add(Trimestral_rbt);
        Trimestral_rbt.setText("Trimestral");

        jLabel9.setText("Tasas de interés");

        jLabel10.setText("Efectivo anual:");

        jLabel11.setText("Nominal anual:");

        jLabel12.setText("Interés periodico:");

        NA_jtf.setText("0.0");
        NA_jtf.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                NA_jtfFocusLost(evt);
            }
        });
        NA_jtf.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                NA_jtfKeyTyped(evt);
            }
        });

        Ip_jtf.setText("0.0");
        Ip_jtf.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                Ip_jtfKeyTyped(evt);
            }
        });

        jLabel13.setText("%");

        jLabel14.setText("%");

        jLabel15.setText("%");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Cuota", "Fecha", "Saldo de capital", "Amortización a capital", "Amortización a interés", "Flujo de caja"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Cuota", "Fecha", "Saldo a capital", "Amortización a capital", "Amortización a interés", "Cuota fija", "Flujo de caja"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(jTable2);

        jLabel16.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        jLabel16.setText("Cuota igual a capital");

        jLabel17.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        jLabel17.setText("Cuota igual de amortización gradual");

        Calcular_btn.setText("Calcular");
        Calcular_btn.setPreferredSize(new java.awt.Dimension(100, 29));
        Calcular_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Calcular_btnActionPerformed(evt);
            }
        });

        Limpiar_btn.setText("Limpiar");
        Limpiar_btn.setPreferredSize(new java.awt.Dimension(100, 29));
        Limpiar_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Limpiar_btnActionPerformed(evt);
            }
        });

        Imprimir_btn.setText("Imprimir");
        Imprimir_btn.setPreferredSize(new java.awt.Dimension(100, 29));

        Salir_btn.setText("Salir");
        Salir_btn.setPreferredSize(new java.awt.Dimension(100, 29));
        Salir_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Salir_btnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(248, 248, 248)
                        .addComponent(jLabel2)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(Nombre_jtf)
                                    .addComponent(Id_jtf)
                                    .addComponent(Valor_jtf)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(Plazo_jtf, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel8))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(215, 215, 215)
                                .addComponent(Calcular_btn, javax.swing.GroupLayout.DEFAULT_SIZE, 108, Short.MAX_VALUE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(59, 59, 59)
                                .addComponent(Imprimir_btn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(52, 52, 52)
                                .addComponent(Limpiar_btn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(47, 47, 47)
                                .addComponent(Salir_btn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 76, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(122, 122, 122)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Trimestral_rbt)
                                    .addComponent(Mensual_rbt)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel7)
                                        .addComponent(Bimestral_rbt)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel10)
                                            .addComponent(jLabel11)
                                            .addComponent(jLabel12))
                                        .addGap(19, 19, 19)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(NA_jtf, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(EA_jtf, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(Ip_jtf, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel14)
                                            .addComponent(jLabel13)
                                            .addComponent(jLabel15)))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jLabel9)
                                        .addGap(39, 39, 39)))))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1037, Short.MAX_VALUE)
                    .addComponent(jScrollPane2))
                .addGap(20, 20, 20))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(457, 457, 457)
                        .addComponent(jLabel16))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(413, 413, 413)
                        .addComponent(jLabel17)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel10)
                                    .addComponent(EA_jtf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel13))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(6, 6, 6)
                                        .addComponent(jLabel11)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel12))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(NA_jtf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel14))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(Ip_jtf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel15)))))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel3)
                                    .addComponent(Nombre_jtf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel7))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(Mensual_rbt)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(Bimestral_rbt)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(Trimestral_rbt))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabel4)
                                            .addComponent(Id_jtf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabel5)
                                            .addComponent(Valor_jtf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabel6)
                                            .addComponent(Plazo_jtf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel8))))))
                        .addGap(35, 35, 35)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Calcular_btn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Limpiar_btn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Imprimir_btn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Salir_btn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(40, 40, 40)
                .addComponent(jLabel16)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, Short.MAX_VALUE)
                .addComponent(jLabel17)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Calcular_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Calcular_btnActionPerformed

    }//GEN-LAST:event_Calcular_btnActionPerformed

    private void Salir_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Salir_btnActionPerformed
        System.exit(0);
    }//GEN-LAST:event_Salir_btnActionPerformed

    private void Valor_jtfFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_Valor_jtfFocusLost
        if (!Valor_jtf.getText().equals("")) {
            valor = Integer.parseInt(Valor_jtf.getText());
            Valor_jtf.setText(miles.format(valor));
        }
    }//GEN-LAST:event_Valor_jtfFocusLost

    private void Id_jtfFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_Id_jtfFocusLost
        if (!Id_jtf.getText().equals("")) {
            int cedula = Integer.parseInt(Id_jtf.getText());
            Id_jtf.setText(miles.format(cedula));
        }
    }//GEN-LAST:event_Id_jtfFocusLost

    private void EA_jtfKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_EA_jtfKeyTyped
        NA_jtf.setEnabled(false);
        Ip_jtf.setEnabled(false);
    }//GEN-LAST:event_EA_jtfKeyTyped

    private void NA_jtfKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_NA_jtfKeyTyped
        EA_jtf.setEnabled(false);
        Ip_jtf.setEnabled(false);
    }//GEN-LAST:event_NA_jtfKeyTyped

    private void Ip_jtfKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Ip_jtfKeyTyped
        NA_jtf.setEnabled(false);
        EA_jtf.setEnabled(false);
    }//GEN-LAST:event_Ip_jtfKeyTyped

    private void Limpiar_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Limpiar_btnActionPerformed
        Nombre_jtf.setText("");
        Id_jtf.setText("");
        Valor_jtf.setText("");
        Plazo_jtf.setText("");
        EA_jtf.setText("0.0");
        EA_jtf.setEnabled(true);
        NA_jtf.setText("0.0");
        NA_jtf.setEnabled(true);
        Ip_jtf.setText("0.0");
        Ip_jtf.setEnabled(true);
        Periodicidad_btgr.clearSelection();
    }//GEN-LAST:event_Limpiar_btnActionPerformed

    private void EA_jtfFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_EA_jtfFocusLost
        Double n = 0.0;
        Double ip_EA = 0.0;
        Double na_EA = 0.0;
        int periodo = 0;
        //Calculo ip
        if (Mensual_rbt.isSelected()) {
            //30/360
            n = 0.08333333333;
            periodo = 12;
        } else if (Bimestral_rbt.isSelected()) {
            //60/360
            n = 0.1666666667;
            periodo = 6;
        } else if (Trimestral_rbt.isSelected()) {
            //90/360
            n = 0.25;
            periodo = 4;
        }

        Double ea_EA = Double.parseDouble(EA_jtf.getText());
        ea_EA = ea_EA / 100;
        //ip=((1+ea)^(n)) - 1
        ip_EA = ((Math.pow(1 + ea_EA, n)) - 1) * 100;
        System.out.println("ip_EA=" + ip_EA);
        Ip_jtf.setText(decimal.format(ip_EA));

        //Calculo NA
        na_EA = (ip_EA * periodo);
        System.out.println("na_EA=" + na_EA);
        NA_jtf.setText(decimal.format(na_EA));
    }//GEN-LAST:event_EA_jtfFocusLost

    private void NA_jtfFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_NA_jtfFocusLost
        Double n = 0.0;
        int periodo = 0;
        Double ea_NA = 0.0;
        Double ip_NA = 0.0;
        //Calculo ip
        if (Mensual_rbt.isSelected()) {
            n = 360.0 / 30.0;
            periodo = 12;
        } else if (Bimestral_rbt.isSelected()) {
            n = 360.0 / 60.0;
            periodo = 6;
        } else if (Trimestral_rbt.isSelected()) {
            n = 360.0 / 90.0;
            periodo = 4;
        }

        Double na_NA = Double.parseDouble(NA_jtf.getText());
        na_NA = na_NA / 100;

        //Calculo el ip
        //ip=(na)/periodo
        ip_NA = na_NA / periodo;
        Ip_jtf.setText(decimal.format(ip_NA * 100));
        System.out.println("ip_NA=" + ip_NA);

        //Calculo el ea
        //ea=((1+ip)^360/dias) -1
        ea_NA = ((Math.pow((1 + ip_NA), n)) - 1);
        EA_jtf.setText(decimal.format(ea_NA * 100));
        System.out.println("ea_NA=" + ea_NA);
    }//GEN-LAST:event_NA_jtfFocusLost

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
            java.util.logging.Logger.getLogger(Prestamos_frm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Prestamos_frm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Prestamos_frm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Prestamos_frm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Prestamos_frm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton Bimestral_rbt;
    private javax.swing.JButton Calcular_btn;
    private javax.swing.JTextField EA_jtf;
    private javax.swing.JTextField Id_jtf;
    private javax.swing.JButton Imprimir_btn;
    private javax.swing.JTextField Ip_jtf;
    private javax.swing.JButton Limpiar_btn;
    private javax.swing.JRadioButton Mensual_rbt;
    private javax.swing.JTextField NA_jtf;
    private javax.swing.JTextField Nombre_jtf;
    private javax.swing.ButtonGroup Periodicidad_btgr;
    private javax.swing.JTextField Plazo_jtf;
    private javax.swing.JButton Salir_btn;
    private javax.swing.JRadioButton Trimestral_rbt;
    private javax.swing.JTextField Valor_jtf;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    // End of variables declaration//GEN-END:variables
}

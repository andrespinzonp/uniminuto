/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Frames;

import java.awt.List;
import java.util.ArrayList;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;
import sun.misc.FormattedFloatingDecimal;

/**
 *
 * @author andrespinzon
 */
public class Basico extends javax.swing.JInternalFrame {

    /**
     * Creates new form Basico
     */
    public Basico() {
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
        Semilla_b = new javax.swing.JTextField();
        Iteraciones_b = new javax.swing.JTextField();
        Tx_b = new javax.swing.JTextField();
        Gx_b = new javax.swing.JTextField();
        Generar = new javax.swing.JButton();
        Limpiar = new javax.swing.JButton();

        setClosable(true);
        setTitle("Generador Básico");

        jLabel1.setText("Semilla (Xo):");

        jLabel2.setText("Iteraciones (n):");

        jLabel3.setText("T(x):");

        jLabel4.setText("G(x):");

        Semilla_b.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Semilla_bActionPerformed(evt);
            }
        });

        Generar.setText("Generar");
        Generar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GenerarActionPerformed(evt);
            }
        });

        Limpiar.setText("Limpiar");
        Limpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LimpiarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Semilla_b)
                            .addComponent(Iteraciones_b)
                            .addComponent(Tx_b)
                            .addComponent(Gx_b, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Generar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Limpiar)))
                .addContainerGap(32, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(Semilla_b, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(Iteraciones_b, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(Tx_b, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(Gx_b, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Generar)
                    .addComponent(Limpiar))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        getAccessibleContext().setAccessibleName("Gen_basico");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Semilla_bActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Semilla_bActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Semilla_bActionPerformed

    private void LimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LimpiarActionPerformed
        Semilla_b.setText("");
        Iteraciones_b.setText("");
        Tx_b.setText("");
        Gx_b.setText("");
    }//GEN-LAST:event_LimpiarActionPerformed

    private void GenerarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GenerarActionPerformed
        ScriptEngineManager manager = new ScriptEngineManager();
        ScriptEngine engine = manager.getEngineByName("js");
        String x = Semilla_b.getText();
        int ite = Integer.parseInt(Iteraciones_b.getText());
        String Tx = Tx_b.getText();
        String Gx = Gx_b.getText();
        ArrayList<String> Xs = new ArrayList<String>();
        ArrayList<Double> U = new ArrayList<Double>();
        Object resultX = null;
        int i = 0;
        while (i < ite) {
            //Reemplazo variable x para luego evaluar la formula
            String Tx_tmp, Gx_tmp;
            Tx_tmp = Tx.replace("x", x).
                    replace("X", x);
            //Obtengo X
            try {
                resultX = String.valueOf(engine.eval(Tx_tmp));
                System.out.println(Tx + " = " + resultX);
                Xs.add((String) resultX);
            } catch (ScriptException se) {
                se.printStackTrace();
            }
            
            Gx_tmp = Gx.replace("x", Xs.get(i)).
                    replace("X", Xs.get(i));
            //Obtengo U
            try {
                Object resultU = engine.eval(Gx_tmp);
                System.out.println(Gx + " = " + resultU);
                U.add((Double) resultU);
            } catch (ScriptException se) {
                se.printStackTrace();
            }
            x = (String) resultX;
            i++;
        }
    }//GEN-LAST:event_GenerarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Generar;
    private javax.swing.JTextField Gx_b;
    private javax.swing.JTextField Iteraciones_b;
    private javax.swing.JButton Limpiar;
    private javax.swing.JTextField Semilla_b;
    private javax.swing.JTextField Tx_b;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    // End of variables declaration//GEN-END:variables
}

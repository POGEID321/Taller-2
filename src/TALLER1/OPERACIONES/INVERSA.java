/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TALLER1.OPERACIONES;

import javax.swing.table.DefaultTableModel;



/**
 *
 * @author Diepi
 */
public class INVERSA extends javax.swing.JFrame {

   Operaciones operaciones = new Operaciones();
    
    public INVERSA() {
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

        Calcular = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        MATRIZ_A = new javax.swing.JTable();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        Resultado = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        REDUCECOLUMNASA = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        LIMPIARA = new javax.swing.JButton();
        AUMENTAFILASA = new javax.swing.JButton();
        REDUCEFILASA = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        AUMENTACOLUMNASA = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Calcular.setText("Calcular");
        Calcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CalcularActionPerformed(evt);
            }
        });

        MATRIZ_A.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null}
            },
            new String [] {
                ""
            }
        ));
        jScrollPane1.setViewportView(MATRIZ_A);

        jLabel8.setText("INVERSA DE UNA MATRIZ");

        Resultado.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null}
            },
            new String [] {
                ""
            }
        ));
        jScrollPane3.setViewportView(Resultado);

        jLabel3.setText("# DE COLUMNAS :");

        REDUCECOLUMNASA.setText("-");
        REDUCECOLUMNASA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                REDUCECOLUMNASAActionPerformed(evt);
            }
        });

        jLabel4.setText("MATRIZ A");

        LIMPIARA.setText("LIMPIAR");
        LIMPIARA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LIMPIARAActionPerformed(evt);
            }
        });

        AUMENTAFILASA.setText("+");
        AUMENTAFILASA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AUMENTAFILASAActionPerformed(evt);
            }
        });

        REDUCEFILASA.setText("-");
        REDUCEFILASA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                REDUCEFILASAActionPerformed(evt);
            }
        });

        jLabel1.setText("# DE FILAS :");

        AUMENTACOLUMNASA.setText("+");
        AUMENTACOLUMNASA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AUMENTACOLUMNASAActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(317, 317, 317)
                        .addComponent(jLabel8))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(LIMPIARA)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel4)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(layout.createSequentialGroup()
                                                    .addComponent(AUMENTAFILASA)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(REDUCEFILASA))
                                                .addGroup(layout.createSequentialGroup()
                                                    .addComponent(AUMENTACOLUMNASA)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(REDUCECOLUMNASA))))))
                                .addGap(39, 39, 39))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(70, 70, 70)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(51, 51, 51)
                                .addComponent(Calcular, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(39, 39, 39))
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(23, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(74, 74, 74)
                        .addComponent(Calcular, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(AUMENTAFILASA)
                            .addComponent(REDUCEFILASA))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(AUMENTACOLUMNASA)
                            .addComponent(REDUCECOLUMNASA))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(LIMPIARA)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CalcularActionPerformed
        int NFILAS_A = MATRIZ_A.getRowCount(), NCOLUMNAS_A = MATRIZ_A.getColumnCount();
     
            double [][] matrizA = MatrizA();

            OrganizarTabla();
            if(NFILAS_A == NCOLUMNAS_A){
                double determinante = operaciones.Determinante(matrizA);
                 OrganizarTabla();
                if(determinante!=0){
                    double [][] resultado = operaciones.InversaMatriz(matrizA);
                    for(int i = 0; i < NFILAS_A; i++){
                        for(int j = 0; j < NCOLUMNAS_A; j++){
                            Resultado.setValueAt(resultado[i][j], i, j);
                        }
                    } 
                }
            }
        InsertarMatriz();
    }//GEN-LAST:event_CalcularActionPerformed

    private void REDUCECOLUMNASAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_REDUCECOLUMNASAActionPerformed
        operaciones.EliminarColumna(MATRIZ_A, MATRIZ_A.getColumnCount());
        InsertarMatriz();
    }//GEN-LAST:event_REDUCECOLUMNASAActionPerformed

    private void LIMPIARAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LIMPIARAActionPerformed
        for(int i=0;i<(MATRIZ_A.getRowCount());i++)
        {
            for(int j=0;j<(MATRIZ_A.getColumnCount());j++)
            {
                MATRIZ_A.setValueAt(null, i, j);
            }
        }
    }//GEN-LAST:event_LIMPIARAActionPerformed

    private void AUMENTAFILASAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AUMENTAFILASAActionPerformed
        operaciones.AgregarFilas(MATRIZ_A, MATRIZ_A.getRowCount(), MATRIZ_A.getColumnCount());
        InsertarMatriz();
    }//GEN-LAST:event_AUMENTAFILASAActionPerformed

    private void REDUCEFILASAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_REDUCEFILASAActionPerformed
        operaciones.EliminarFilas(MATRIZ_A, MATRIZ_A.getRowCount(), MATRIZ_A.getColumnCount());
        InsertarMatriz();
    }//GEN-LAST:event_REDUCEFILASAActionPerformed

    private void AUMENTACOLUMNASAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AUMENTACOLUMNASAActionPerformed
        operaciones.AgregarColumna(MATRIZ_A, MATRIZ_A.getRowCount(), MATRIZ_A.getColumnCount());
        InsertarMatriz();
    }//GEN-LAST:event_AUMENTACOLUMNASAActionPerformed

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
            java.util.logging.Logger.getLogger(INVERSA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(INVERSA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(INVERSA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(INVERSA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new INVERSA().setVisible(true);
            }
        });
    }
     public void InsertarMatriz()
    {
         for(int i = 0; i < MATRIZ_A.getColumnCount() ; i++)
        {
            MATRIZ_A.getColumnModel().getColumn(i).setPreferredWidth(190/MATRIZ_A.getColumnCount());
        }
         MATRIZ_A.setRowHeight(190/MATRIZ_A.getRowCount());
          
    }
private double [][] MatrizA ()
    {
        double [][] matrizA = new double[MATRIZ_A.getRowCount()][MATRIZ_A.getColumnCount()];
        for(int i=0;i<MATRIZ_A.getRowCount();i++)
        {
            for(int j=0; j<MATRIZ_A.getColumnCount();j++)
            {
                if(MATRIZ_A.getValueAt(i , j)==null)
                {
                    MATRIZ_A.setValueAt("0", i, j);
                }
                matrizA[i][j] = Integer.parseInt((String) MATRIZ_A.getValueAt(i, j));
            }
        }
        return matrizA;
    }  
 
public void OrganizarTabla(){
      
     DefaultTableModel matriz = (DefaultTableModel) Resultado.getModel();
        if(MATRIZ_A.getColumnCount() > Resultado.getColumnCount() )
        {
            do{
            String [] Columnas = new String[MATRIZ_A.getRowCount()-1];
            matriz.addColumn(Columnas);
            }while(MATRIZ_A.getColumnCount() > Resultado.getColumnCount());
        }
        if(Resultado.getColumnCount() > MATRIZ_A.getColumnCount()){
            //Colocar para quitar columnas
        }
        if(MATRIZ_A.getRowCount() > Resultado.getRowCount())
        {
            do{
            String [] fila= new String[MATRIZ_A.getColumnCount()-1];
            matriz.addRow(fila);
            }while(MATRIZ_A.getRowCount() > Resultado.getRowCount());  
        }
        if(Resultado.getRowCount() > MATRIZ_A.getRowCount())
        {
            do{
            matriz.removeRow(Resultado.getRowCount()-1);
            }while(Resultado.getRowCount() > MATRIZ_A.getRowCount()); 
        }
}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AUMENTACOLUMNASA;
    private javax.swing.JButton AUMENTAFILASA;
    private javax.swing.JButton Calcular;
    private javax.swing.JButton LIMPIARA;
    private javax.swing.JTable MATRIZ_A;
    private javax.swing.JButton REDUCECOLUMNASA;
    private javax.swing.JButton REDUCEFILASA;
    private javax.swing.JTable Resultado;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    // End of variables declaration//GEN-END:variables
}
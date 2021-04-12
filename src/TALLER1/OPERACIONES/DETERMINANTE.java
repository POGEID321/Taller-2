package TALLER1.OPERACIONES;



public class DETERMINANTE extends javax.swing.JFrame {

   Operaciones operaciones = new Operaciones();
   
    public DETERMINANTE() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        REDUCEFILASA = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        MATRIZ_A = new javax.swing.JTable();
        jLabel8 = new javax.swing.JLabel();
        Calcular = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        AUMENTACOLUMNASA = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        REDUCECOLUMNASA = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        AUMENTAFILASA = new javax.swing.JButton();
        LIMPIARA = new javax.swing.JButton();
        Resultado = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        REDUCEFILASA.setText("-");
        REDUCEFILASA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                REDUCEFILASAActionPerformed(evt);
            }
        });

        MATRIZ_A.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null}
            },
            new String [] {
                ""
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(MATRIZ_A);

        jLabel8.setText("DETERMINANTE DE MATRIZ");

        Calcular.setText("Calcular");
        Calcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CalcularActionPerformed(evt);
            }
        });

        jLabel1.setText("# DE FILAS :");

        AUMENTACOLUMNASA.setText("+");
        AUMENTACOLUMNASA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AUMENTACOLUMNASAActionPerformed(evt);
            }
        });

        jLabel3.setText("# DE COLUMNAS :");

        REDUCECOLUMNASA.setText("-");
        REDUCECOLUMNASA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                REDUCECOLUMNASAActionPerformed(evt);
            }
        });

        jLabel4.setText("MATRIZ");

        AUMENTAFILASA.setText("+");
        AUMENTAFILASA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AUMENTAFILASAActionPerformed(evt);
            }
        });

        LIMPIARA.setText("LIMPIAR");
        LIMPIARA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LIMPIARAActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(69, 69, 69)
                                .addComponent(Calcular, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(Resultado, javax.swing.GroupLayout.PREFERRED_SIZE, 294, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(230, 230, 230)
                        .addComponent(jLabel8)))
                .addContainerGap(46, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8)
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
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
                        .addComponent(LIMPIARA))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(Calcular, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Resultado, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(58, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void REDUCEFILASAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_REDUCEFILASAActionPerformed
       operaciones.EliminarFilas(MATRIZ_A, MATRIZ_A.getRowCount(), MATRIZ_A.getColumnCount());
       InsertarMatriz();
    }//GEN-LAST:event_REDUCEFILASAActionPerformed

    private void CalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CalcularActionPerformed
    
int NFILAS_A = MATRIZ_A.getRowCount(),NCOLUMNAS_A = MATRIZ_A.getColumnCount();
   
      double [][] matrizA = MatrizA();
     
    if(NFILAS_A == NCOLUMNAS_A){
                Resultado.setText(String.valueOf(operaciones.Determinante(matrizA)));        
    }
    else{
                
            }
        InsertarMatriz();
    }//GEN-LAST:event_CalcularActionPerformed

    private void AUMENTACOLUMNASAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AUMENTACOLUMNASAActionPerformed
        operaciones.AgregarColumna(MATRIZ_A, MATRIZ_A.getRowCount(), MATRIZ_A.getColumnCount());
        InsertarMatriz();
    }//GEN-LAST:event_AUMENTACOLUMNASAActionPerformed

    private void REDUCECOLUMNASAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_REDUCECOLUMNASAActionPerformed
        operaciones.EliminarColumna(MATRIZ_A, MATRIZ_A.getColumnCount());
        InsertarMatriz();  
    }//GEN-LAST:event_REDUCECOLUMNASAActionPerformed

    private void AUMENTAFILASAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AUMENTAFILASAActionPerformed
        operaciones.AgregarFilas(MATRIZ_A, MATRIZ_A.getRowCount(), MATRIZ_A.getColumnCount());
        InsertarMatriz();  
    }//GEN-LAST:event_AUMENTAFILASAActionPerformed

    private void LIMPIARAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LIMPIARAActionPerformed
        for(int i=0;i<(MATRIZ_A.getRowCount());i++)
        {
            for(int j=0;j<(MATRIZ_A.getColumnCount());j++)
            {
                MATRIZ_A.setValueAt(null, i, j);
            }
        }
    }//GEN-LAST:event_LIMPIARAActionPerformed

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
            java.util.logging.Logger.getLogger(DETERMINANTE.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DETERMINANTE.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DETERMINANTE.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DETERMINANTE.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DETERMINANTE().setVisible(true);
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


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AUMENTACOLUMNASA;
    private javax.swing.JButton AUMENTAFILASA;
    private javax.swing.JButton Calcular;
    private javax.swing.JButton LIMPIARA;
    private javax.swing.JTable MATRIZ_A;
    private javax.swing.JButton REDUCECOLUMNASA;
    private javax.swing.JButton REDUCEFILASA;
    private javax.swing.JLabel Resultado;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}

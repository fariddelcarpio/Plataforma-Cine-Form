package formularios;

public class FMenu extends javax.swing.JFrame {

    public FMenu() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel = new javax.swing.JPanel();
        lblMenu = new javax.swing.JLabel();
        lblCompras = new javax.swing.JLabel();
        lblInsercciones = new javax.swing.JLabel();
        btnRegistroClientes = new javax.swing.JButton();
        btnEntrada = new javax.swing.JButton();
        btnPelicula = new javax.swing.JButton();
        btnCanchita = new javax.swing.JButton();
        btnBebida = new javax.swing.JButton();
        btnPeliculas = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel.setBackground(new java.awt.Color(10, 151, 176));

        lblMenu.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblMenu.setForeground(new java.awt.Color(255, 255, 255));
        lblMenu.setText("Menu Principal");

        lblCompras.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblCompras.setForeground(new java.awt.Color(255, 255, 255));
        lblCompras.setText("Compras");

        lblInsercciones.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblInsercciones.setForeground(new java.awt.Color(255, 255, 255));
        lblInsercciones.setText("Insercciónes");

        btnRegistroClientes.setText("Registro Clientes");
        btnRegistroClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistroClientesActionPerformed(evt);
            }
        });

        btnEntrada.setText("Entrada");
        btnEntrada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEntradaActionPerformed(evt);
            }
        });

        btnPelicula.setText("Pelicula");
        btnPelicula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPeliculaActionPerformed(evt);
            }
        });

        btnCanchita.setText("Canchita");
        btnCanchita.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCanchitaActionPerformed(evt);
            }
        });

        btnBebida.setText("Bebida");
        btnBebida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBebidaActionPerformed(evt);
            }
        });

        btnPeliculas.setText("Peliculas");
        btnPeliculas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPeliculasActionPerformed(evt);
            }
        });

        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelLayout = new javax.swing.GroupLayout(jPanel);
        jPanel.setLayout(jPanelLayout);
        jPanelLayout.setHorizontalGroup(
            jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelLayout.createSequentialGroup()
                .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelLayout.createSequentialGroup()
                        .addGap(109, 109, 109)
                        .addComponent(lblMenu))
                    .addGroup(jPanelLayout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelLayout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(lblCompras))
                            .addGroup(jPanelLayout.createSequentialGroup()
                                .addGap(9, 9, 9)
                                .addComponent(btnEntrada)
                                .addGap(18, 18, 18)
                                .addComponent(btnPelicula)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnCanchita)
                                .addGap(18, 18, 18)
                                .addComponent(btnBebida))
                            .addGroup(jPanelLayout.createSequentialGroup()
                                .addGap(102, 102, 102)
                                .addComponent(btnRegistroClientes))
                            .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(btnPeliculas)
                                .addComponent(lblInsercciones))))
                    .addGroup(jPanelLayout.createSequentialGroup()
                        .addGap(147, 147, 147)
                        .addComponent(btnSalir)))
                .addContainerGap(28, Short.MAX_VALUE))
        );
        jPanelLayout.setVerticalGroup(
            jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(lblMenu)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnRegistroClientes)
                .addGap(17, 17, 17)
                .addComponent(lblCompras)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEntrada)
                    .addComponent(btnPelicula)
                    .addComponent(btnCanchita)
                    .addComponent(btnBebida))
                .addGap(25, 25, 25)
                .addComponent(lblInsercciones)
                .addGap(18, 18, 18)
                .addComponent(btnPeliculas)
                .addGap(18, 18, 18)
                .addComponent(btnSalir)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnEntradaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEntradaActionPerformed
        FCVenta entrada = new FCVenta();
        entrada.setVisible(true); 
        this.dispose();
    }//GEN-LAST:event_btnEntradaActionPerformed

    private void btnPeliculasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPeliculasActionPerformed
        FABBPelicula peliculas = new FABBPelicula();
        peliculas.setVisible(true); 
        this.dispose();
    }//GEN-LAST:event_btnPeliculasActionPerformed

    private void btnRegistroClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistroClientesActionPerformed
        FLDECliente cliente = new FLDECliente();
        cliente.setVisible(true); 
        this.dispose();
    }//GEN-LAST:event_btnRegistroClientesActionPerformed

    private void btnCanchitaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCanchitaActionPerformed
        FLSECanchita canchita = new FLSECanchita();
        canchita.setVisible(true); 
        this.dispose();
    }//GEN-LAST:event_btnCanchitaActionPerformed

    private void btnBebidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBebidaActionPerformed
        FPBebida bebida = new FPBebida();
        bebida.setVisible(true); 
        this.dispose();
    }//GEN-LAST:event_btnBebidaActionPerformed

    private void btnPeliculaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPeliculaActionPerformed
        FAPelicula pelicula = new FAPelicula();
        pelicula.setVisible(true); 
        this.dispose();
    }//GEN-LAST:event_btnPeliculaActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnSalirActionPerformed

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
            java.util.logging.Logger.getLogger(FMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBebida;
    private javax.swing.JButton btnCanchita;
    private javax.swing.JButton btnEntrada;
    private javax.swing.JButton btnPelicula;
    private javax.swing.JButton btnPeliculas;
    private javax.swing.JButton btnRegistroClientes;
    private javax.swing.JButton btnSalir;
    private javax.swing.JPanel jPanel;
    private javax.swing.JLabel lblCompras;
    private javax.swing.JLabel lblInsercciones;
    private javax.swing.JLabel lblMenu;
    // End of variables declaration//GEN-END:variables
}

package formularios;

import clases.ABBPelicula;
import javax.swing.table.DefaultTableModel;

public class FABBPelicula extends javax.swing.JFrame {

    private ABBPelicula arbol = new ABBPelicula();
    
    public FABBPelicula() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblTitulo = new javax.swing.JLabel();
        lblId = new javax.swing.JLabel();
        lblPelicula = new javax.swing.JLabel();
        lblDirector = new javax.swing.JLabel();
        lblValoración = new javax.swing.JLabel();
        txtTitulo = new javax.swing.JTextField();
        txtId = new javax.swing.JTextField();
        txtDirector = new javax.swing.JTextField();
        txtValoracion = new javax.swing.JTextField();
        btnAgregar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnBuscar = new javax.swing.JButton();
        btnActualizar = new javax.swing.JButton();
        btnMostrarInOrden = new javax.swing.JButton();
        btnMostrarPreOrden = new javax.swing.JButton();
        btnMostrarPostOrden = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        jScrollPane = new javax.swing.JScrollPane();
        jTable = new javax.swing.JTable();
        lblFondo = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblTitulo.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblTitulo.setText("Titulo Peliculas /Arbol Binario de Busqueda");
        jPanel1.add(lblTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        lblId.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblId.setText("ID");
        lblId.setToolTipText("");
        jPanel1.add(lblId, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 90, -1, -1));

        lblPelicula.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblPelicula.setText("Titulo de Pelicula");
        lblPelicula.setToolTipText("");
        jPanel1.add(lblPelicula, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, -1, -1));

        lblDirector.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblDirector.setText("Director");
        lblDirector.setToolTipText("");
        jPanel1.add(lblDirector, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 170, -1, -1));

        lblValoración.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblValoración.setText("Valoracion");
        lblValoración.setToolTipText("");
        jPanel1.add(lblValoración, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 170, -1, -1));
        jPanel1.add(txtTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, 250, 30));
        jPanel1.add(txtId, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 120, 50, 30));
        jPanel1.add(txtDirector, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 202, 230, 30));
        jPanel1.add(txtValoracion, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 200, 60, 30));

        btnAgregar.setText("Agregar");
        btnAgregar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });
        jPanel1.add(btnAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 80, -1, -1));

        btnEliminar.setText("Eliminar");
        btnEliminar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        jPanel1.add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 110, -1, -1));

        btnBuscar.setText("Buscar");
        btnBuscar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });
        jPanel1.add(btnBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 150, -1, -1));

        btnActualizar.setText("Actualizar");
        btnActualizar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });
        jPanel1.add(btnActualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 180, -1, -1));

        btnMostrarInOrden.setText(" Mostrar InO.   ");
        btnMostrarInOrden.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnMostrarInOrden.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostrarInOrdenActionPerformed(evt);
            }
        });
        jPanel1.add(btnMostrarInOrden, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 270, -1, -1));

        btnMostrarPreOrden.setText("Mostrar PreO.  ");
        btnMostrarPreOrden.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnMostrarPreOrden.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostrarPreOrdenActionPerformed(evt);
            }
        });
        jPanel1.add(btnMostrarPreOrden, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 310, -1, -1));

        btnMostrarPostOrden.setText("Mostrar PostO.");
        btnMostrarPostOrden.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnMostrarPostOrden.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostrarPostOrdenActionPerformed(evt);
            }
        });
        jPanel1.add(btnMostrarPostOrden, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 350, -1, -1));

        btnSalir.setText("Salir");
        btnSalir.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        jPanel1.add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 400, -1, -1));

        jTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane.setViewportView(jTable);

        jPanel1.add(jScrollPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 250, 440, 180));

        lblFondo.setBackground(new java.awt.Color(0, 102, 102));
        jPanel1.add(lblFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 700, 490));

        jButton3.setBackground(new java.awt.Color(0, 0, 0));
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("MENU");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 220, 90, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 701, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void llenarTabla(String tipoRecorrido) {
        // Crear modelo de tabla
        String[] columnas = {"Título", "Id", "Director", "Valoración"};
        DefaultTableModel modelo = new DefaultTableModel(columnas, 0);
        jTable.setModel(modelo);

        // Llenar tabla según el tipo de recorrido
        switch (tipoRecorrido) {
            case "Preorden" -> arbol.recorrerPreorden(arbol.getRaiz(), modelo);
            case "Inorden" -> arbol.recorrerInorden(arbol.getRaiz(), modelo);
            case "Postorden" -> arbol.recorrerPostorden(arbol.getRaiz(), modelo);
        }
    }
    
    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        String titulo  = txtTitulo.getText();
        int id = Integer.parseInt(txtId.getText());
        String director  = txtDirector.getText();
        String valoracion  = txtValoracion.getText();
        
        arbol.agregar(titulo, id, director, valoracion);
        txtTitulo.setText("");
        txtId.setText("");
        txtDirector.setText("");
        txtValoracion.setText("");
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        int idBuscado = Integer.parseInt(txtId.getText());

        arbol.buscarYMostrar(idBuscado, jTable);
        txtId.setText("");
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        int idAEliminar = Integer.parseInt(txtId.getText());

        arbol.setRaiz(arbol.eliminar(idAEliminar));
        
        txtId.setText("");
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnMostrarInOrdenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarInOrdenActionPerformed
        llenarTabla("Inorden");
    }//GEN-LAST:event_btnMostrarInOrdenActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnMostrarPreOrdenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarPreOrdenActionPerformed
        llenarTabla("Preorden");
    }//GEN-LAST:event_btnMostrarPreOrdenActionPerformed

    private void btnMostrarPostOrdenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarPostOrdenActionPerformed
        llenarTabla("Postorden");
    }//GEN-LAST:event_btnMostrarPostOrdenActionPerformed

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        int id = Integer.parseInt(txtId.getText());
        String nuevaValoracion = txtValoracion.getText(); 

        arbol.actualizarValoracion(id, nuevaValoracion);
        txtId.setText("");
        txtValoracion.setText("");
    }//GEN-LAST:event_btnActualizarActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        FMenu menuForm = new FMenu();
        menuForm.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnMostrarInOrden;
    private javax.swing.JButton btnMostrarPostOrden;
    private javax.swing.JButton btnMostrarPreOrden;
    private javax.swing.JButton btnSalir;
    private javax.swing.JButton jButton3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane;
    private javax.swing.JTable jTable;
    private javax.swing.JLabel lblDirector;
    private javax.swing.JLabel lblFondo;
    private javax.swing.JLabel lblId;
    private javax.swing.JLabel lblPelicula;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JLabel lblValoración;
    private javax.swing.JTextField txtDirector;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtTitulo;
    private javax.swing.JTextField txtValoracion;
    // End of variables declaration//GEN-END:variables
}

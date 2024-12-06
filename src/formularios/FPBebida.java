package formularios;

import clases.PBebida;
import nodos.NBebida;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class FPBebida extends javax.swing.JFrame {
    PBebida pila = new PBebida();
    DefaultTableModel modelo;
    public FPBebida() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        btnSalir = new javax.swing.JButton();
        btnMenu = new javax.swing.JButton();
        btnInsertar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnMostrar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        Mostrar_valor = new javax.swing.JTable();
        txtCantidad = new javax.swing.JTextField();
        comboCategoria = new javax.swing.JComboBox<>();
        txtPrecio = new javax.swing.JTextField();
        lblNumero = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        lblTotal = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 102, 102));

        jLabel4.setFont(new java.awt.Font("Arial Black", 2, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Bebidas (Pilas)");

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("CANTIDAD:");

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("CATEGORIA");

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("PRECIO");

        btnSalir.setBackground(new java.awt.Color(0, 0, 0));
        btnSalir.setForeground(new java.awt.Color(255, 255, 255));
        btnSalir.setText("SALIR");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        btnMenu.setBackground(new java.awt.Color(0, 0, 0));
        btnMenu.setForeground(new java.awt.Color(255, 255, 255));
        btnMenu.setText("MENU");
        btnMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMenuActionPerformed(evt);
            }
        });

        btnInsertar.setBackground(new java.awt.Color(0, 0, 0));
        btnInsertar.setForeground(new java.awt.Color(255, 255, 255));
        btnInsertar.setText("INSERTAR");
        btnInsertar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInsertarActionPerformed(evt);
            }
        });

        btnEliminar.setBackground(new java.awt.Color(0, 0, 0));
        btnEliminar.setForeground(new java.awt.Color(255, 255, 255));
        btnEliminar.setText("ELIMINAR");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        btnMostrar.setBackground(new java.awt.Color(0, 0, 0));
        btnMostrar.setForeground(new java.awt.Color(255, 255, 255));
        btnMostrar.setText("MOSTRAR");
        btnMostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostrarActionPerformed(evt);
            }
        });

        Mostrar_valor.setForeground(new java.awt.Color(0, 0, 255));
        Mostrar_valor.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Cantidad", "Categoria", "Precio", "Total"
            }
        ));
        jScrollPane2.setViewportView(Mostrar_valor);

        txtCantidad.setBackground(new java.awt.Color(0, 0, 0));
        txtCantidad.setForeground(new java.awt.Color(255, 255, 255));

        comboCategoria.setBackground(new java.awt.Color(0, 102, 102));
        comboCategoria.setForeground(new java.awt.Color(255, 255, 255));
        comboCategoria.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar", "Pequeña", "Mediana", "Grande", "Familiar" }));
        comboCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboCategoriaActionPerformed(evt);
            }
        });

        txtPrecio.setBackground(new java.awt.Color(0, 0, 0));
        txtPrecio.setForeground(new java.awt.Color(255, 255, 255));

        lblNumero.setBackground(new java.awt.Color(51, 255, 51));
        lblNumero.setForeground(new java.awt.Color(255, 255, 255));
        lblNumero.setText("-");

        jLabel7.setBackground(new java.awt.Color(51, 255, 51));
        jLabel7.setFont(new java.awt.Font("Segoe UI Black", 2, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Cantidad de Clientes Registrados: ");

        jLabel8.setBackground(new java.awt.Color(51, 255, 51));
        jLabel8.setFont(new java.awt.Font("Segoe UI Black", 2, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Total vendido:");

        lblTotal.setBackground(new java.awt.Color(51, 255, 51));
        lblTotal.setForeground(new java.awt.Color(255, 255, 255));
        lblTotal.setText("-");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 518, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(23, 23, 23)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(comboCategoria, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtPrecio, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(39, 39, 39)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(btnEliminar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(btnInsertar, javax.swing.GroupLayout.DEFAULT_SIZE, 115, Short.MAX_VALUE))
                                        .addGap(17, 17, 17)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(btnMostrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(btnMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(97, 97, 97)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblNumero, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(168, 168, 168)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(37, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jLabel4)
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(btnMostrar)
                        .addGap(18, 18, 18)
                        .addComponent(btnMenu))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(comboCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(11, 11, 11)
                                .addComponent(btnInsertar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnEliminar)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(22, 22, 22)
                                .addComponent(btnSalir)))))
                .addGap(12, 12, 12)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblTotal)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblNumero)
                            .addComponent(jLabel7))))
                .addContainerGap(50, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMenuActionPerformed
        FMenu menuForm = new FMenu();
        menuForm.setVisible(true); 
        this.dispose();
    }//GEN-LAST:event_btnMenuActionPerformed

    private void btnInsertarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInsertarActionPerformed
        int cantidad = Integer.parseInt(txtCantidad.getText());
        String categoria = comboCategoria.getSelectedItem().toString();
        int precio = Integer.parseInt(txtPrecio.getText());
        int subtotal;
        pila.insertarPila(categoria, cantidad, precio);
        subtotal = cantidad * precio;
        modelo = (DefaultTableModel) this.Mostrar_valor.getModel();
        Object fila[] = new Object[]{cantidad, categoria, precio, subtotal};
        modelo.addRow(fila);
    }//GEN-LAST:event_btnInsertarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        pila.eliminarPila(0);    
        JOptionPane.showMessageDialog(null, "ultimo dato eliminado\n");
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnMostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarActionPerformed
        modelo.setRowCount(0);
        int total = 0;
        int filasUsadas = 0;
        NBebida elemento=pila.getInicio();
        while(elemento!=null){
            int subtotal = elemento.getCantidad() * elemento.getPrecio();
            modelo= (DefaultTableModel) this.Mostrar_valor.getModel();
            Object datos[]=new Object[]
            {elemento.getCantidad(),elemento.getCategoria(),elemento.getPrecio(),subtotal};
            modelo.addRow(datos);
            elemento=elemento.getSiguiente();
            total += subtotal;
            filasUsadas++;
        }
        this.lblTotal.setText("" +total);
        this.lblNumero.setText(""+filasUsadas);
    }//GEN-LAST:event_btnMostrarActionPerformed

    private void comboCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboCategoriaActionPerformed
        String categoria=(String)comboCategoria.getSelectedItem();
        if(categoria.equals("Seleccionar")){
            txtPrecio.setText("");
        }
        if(categoria.equals("Pequeña")){
            txtPrecio.setText("20");
        }
        if(categoria.equals("Mediana")){
            txtPrecio.setText("30");
        }
        if(categoria.equals("Grande")){
            txtPrecio.setText("40");
        }
        if(categoria.equals("Familiar")){
            txtPrecio.setText("50");
        }
    }//GEN-LAST:event_comboCategoriaActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable Mostrar_valor;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnInsertar;
    private javax.swing.JButton btnMenu;
    private javax.swing.JButton btnMostrar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JComboBox<String> comboCategoria;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblNumero;
    private javax.swing.JLabel lblTotal;
    private javax.swing.JTextField txtCantidad;
    private javax.swing.JTextField txtPrecio;
    // End of variables declaration//GEN-END:variables
}

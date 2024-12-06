package formularios;
import clases.LSECanchita;
import nodos.NCanchita;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class FLSECanchita extends javax.swing.JFrame {

    
    LSECanchita lista = new LSECanchita();
    DefaultTableModel modelo;
    public FLSECanchita() {
        initComponents();
        
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtA = new javax.swing.JTextArea();
        txtCantidad = new javax.swing.JTextField();
        btnInsertarFin = new javax.swing.JButton();
        btnInsertarIni = new javax.swing.JButton();
        btnInsertarMedio = new javax.swing.JButton();
        btnEliminarIni = new javax.swing.JButton();
        btnEliminarFin = new javax.swing.JButton();
        btnEliminarMedio = new javax.swing.JButton();
        btnMostrar = new javax.swing.JButton();
        btnBuscar = new javax.swing.JButton();
        btnOrdenar = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        comboCategoria = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        txtPrecio = new javax.swing.JTextField();
        lblNumero = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        lblTotal = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        Mostrar_valor = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 51, 153));
        jPanel1.setForeground(new java.awt.Color(60, 63, 65));

        jLabel1.setBackground(new java.awt.Color(51, 255, 51));
        jLabel1.setFont(new java.awt.Font("Arial", 3, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Canchita / Lista Enlazada Simple");

        txtA.setColumns(20);
        txtA.setRows(5);
        jScrollPane1.setViewportView(txtA);

        txtCantidad.setBackground(new java.awt.Color(0, 0, 0));
        txtCantidad.setForeground(new java.awt.Color(255, 255, 255));

        btnInsertarFin.setBackground(new java.awt.Color(0, 0, 0));
        btnInsertarFin.setForeground(new java.awt.Color(255, 255, 255));
        btnInsertarFin.setText("INSERTAR FIN");
        btnInsertarFin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInsertarFinActionPerformed(evt);
            }
        });

        btnInsertarIni.setBackground(new java.awt.Color(0, 0, 0));
        btnInsertarIni.setForeground(new java.awt.Color(255, 255, 255));
        btnInsertarIni.setText("INSERTAR INI");
        btnInsertarIni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInsertarIniActionPerformed(evt);
            }
        });

        btnInsertarMedio.setBackground(new java.awt.Color(0, 0, 0));
        btnInsertarMedio.setForeground(new java.awt.Color(255, 255, 255));
        btnInsertarMedio.setText("INSERTAR MED");
        btnInsertarMedio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInsertarMedioActionPerformed(evt);
            }
        });

        btnEliminarIni.setBackground(new java.awt.Color(0, 0, 0));
        btnEliminarIni.setForeground(new java.awt.Color(255, 255, 255));
        btnEliminarIni.setText("ELIMINAR INI");
        btnEliminarIni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarIniActionPerformed(evt);
            }
        });

        btnEliminarFin.setBackground(new java.awt.Color(0, 0, 0));
        btnEliminarFin.setForeground(new java.awt.Color(255, 255, 255));
        btnEliminarFin.setText("ELIMINAR FIN");
        btnEliminarFin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarFinActionPerformed(evt);
            }
        });

        btnEliminarMedio.setBackground(new java.awt.Color(0, 0, 0));
        btnEliminarMedio.setForeground(new java.awt.Color(255, 255, 255));
        btnEliminarMedio.setText("ELIMINAR MED");
        btnEliminarMedio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarMedioActionPerformed(evt);
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

        btnBuscar.setBackground(new java.awt.Color(0, 0, 0));
        btnBuscar.setForeground(new java.awt.Color(255, 255, 255));
        btnBuscar.setText("BUSCAR");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        btnOrdenar.setBackground(new java.awt.Color(0, 0, 0));
        btnOrdenar.setForeground(new java.awt.Color(255, 255, 255));
        btnOrdenar.setText("ORDENAR");
        btnOrdenar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOrdenarActionPerformed(evt);
            }
        });

        btnSalir.setBackground(new java.awt.Color(0, 0, 0));
        btnSalir.setForeground(new java.awt.Color(255, 255, 255));
        btnSalir.setText("SALIR");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("CANTIDAD:");

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("CATEGORIA");

        comboCategoria.setBackground(new java.awt.Color(0, 102, 102));
        comboCategoria.setForeground(new java.awt.Color(255, 255, 255));
        comboCategoria.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar", "Pequeña", "Mediana", "Grande", "Familiar" }));
        comboCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboCategoriaActionPerformed(evt);
            }
        });

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("PRECIO");

        txtPrecio.setBackground(new java.awt.Color(0, 0, 0));
        txtPrecio.setForeground(new java.awt.Color(255, 255, 255));
        txtPrecio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPrecioActionPerformed(evt);
            }
        });

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

        jButton3.setBackground(new java.awt.Color(0, 0, 0));
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("MENU");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
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

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(32, 32, 32)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(comboCategoria, javax.swing.GroupLayout.Alignment.LEADING, 0, 123, Short.MAX_VALUE)
                                    .addComponent(txtPrecio, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtCantidad)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(btnOrdenar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(20, 20, 20)
                                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnMostrar, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnInsertarFin, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(22, 22, 22)
                                .addComponent(btnEliminarFin, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(btnInsertarMedio, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(btnEliminarMedio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(btnInsertarIni, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(btnEliminarIni, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(30, 30, 30)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 389, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 389, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(30, 30, 30)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(lblNumero, javax.swing.GroupLayout.DEFAULT_SIZE, 87, Short.MAX_VALUE)
                                    .addComponent(lblTotal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(181, 181, 181)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 334, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(24, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(12, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lblTotal)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblNumero)
                                    .addComponent(jLabel7))))
                        .addGap(22, 22, 22))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(comboCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(50, 50, 50)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnInsertarIni)
                            .addComponent(btnEliminarIni))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnInsertarMedio)
                            .addComponent(btnEliminarMedio))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnEliminarFin)
                            .addComponent(btnInsertarFin))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnMostrar)
                            .addComponent(btnSalir))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnOrdenar)
                            .addComponent(jButton3))
                        .addGap(18, 18, 18)
                        .addComponent(btnBuscar)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        FMenu menuForm = new FMenu();
        menuForm.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

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

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnOrdenarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOrdenarActionPerformed
        /*
        NodoCanchita actual=lista.getInicio();
        int temp;
        while(actual!=null){
            NodoCanchita siguiente=actual.getSig();
            while(siguiente!=null){
                if (actual.getCantidad()>siguiente.getCantidad()) {
                    temp=actual.getCantidad();
                    actual.setCantidad(siguiente.getCantidad());
                    siguiente.setCantidad(temp);
                }
                siguiente=siguiente.getSig();
            }
            actual=actual.getSig();
        } 
        */
        lista.ordenar(0);
    }//GEN-LAST:event_btnOrdenarActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
       /*
        int cantidad=Integer.parseInt(txtCantidad.getText());
        String categoria = comboCategoria.getSelectedItem().toString();
        int precio=Integer.parseInt(txtPrecio.getText());
        NodoCanchita elemento=lista.getInicio();
        while (elemento != null && (elemento.getCantidad() != cantidad || !elemento.getCategoria().equals(categoria)||elemento.getPrecio() != precio)) {
            elemento = elemento.getSig();
        }
        if (elemento!=null) {
            JOptionPane.showMessageDialog(null, cantidad+" elemento encontrado\n");
        }else{
            JOptionPane.showMessageDialog(null, cantidad+" elemento no encontrado\n");
        } 
        */
        int cantidad=Integer.parseInt(txtCantidad.getText());
        String categoria = comboCategoria.getSelectedItem().toString();
        int precio=Integer.parseInt(txtPrecio.getText());
        lista.buscar(cantidad, categoria, precio);
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnMostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarActionPerformed
        modelo.setRowCount(0);
        int total = 0;
        int filasUsadas = 0;
        NCanchita elemento=lista.getInicio();
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

    private void btnEliminarMedioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarMedioActionPerformed
        int cantidad=Integer.parseInt(txtCantidad.getText());
        lista.eliminarMedio(cantidad);
        JOptionPane.showMessageDialog(null,cantidad+" dato eliminado\n");
    }//GEN-LAST:event_btnEliminarMedioActionPerformed

    private void btnEliminarFinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarFinActionPerformed
        lista.eliminarFin(0);
        JOptionPane.showMessageDialog(null,"ultimo dato eliminado\n");
    }//GEN-LAST:event_btnEliminarFinActionPerformed

    private void btnEliminarIniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarIniActionPerformed
        lista.eliminarIni(0);
        JOptionPane.showMessageDialog(null, "1er dato eliminado\n");
    }//GEN-LAST:event_btnEliminarIniActionPerformed

    private void btnInsertarMedioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInsertarMedioActionPerformed
        int cantidad= Integer.parseInt(txtCantidad.getText());
        String categoria = comboCategoria.getSelectedItem().toString();
        int precio=Integer.parseInt(txtPrecio.getText());
        int cantidadAnterior = Integer.parseInt(JOptionPane.showInputDialog(this, "Ingrese el número que estará ántes del dato colocado:"));
        int subtotal= cantidad * precio;
        lista.insertarMedio(cantidad,categoria,precio,cantidadAnterior);
        JOptionPane.showMessageDialog(null," Insertado "+ cantidad + categoria + precio +" después de "+ cantidadAnterior+"\n");
        modelo = (DefaultTableModel) this.Mostrar_valor.getModel();
        Object datos[] = new Object[]{cantidad, categoria, precio, subtotal};
        modelo.addRow(datos);
    }//GEN-LAST:event_btnInsertarMedioActionPerformed

    private void btnInsertarIniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInsertarIniActionPerformed
    int cantidad = Integer.parseInt(txtCantidad.getText());
    String categoria = comboCategoria.getSelectedItem().toString();
    int precio = Integer.parseInt(txtPrecio.getText());
    int subtotal;
    lista.insertarIni(cantidad, categoria, precio);
    subtotal = cantidad * precio;
    modelo = (DefaultTableModel) this.Mostrar_valor.getModel();
    Object fila[] = new Object[]{cantidad, categoria, precio, subtotal};
    modelo.addRow(fila);
    }//GEN-LAST:event_btnInsertarIniActionPerformed

    private void btnInsertarFinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInsertarFinActionPerformed
    int cantidad=Integer.parseInt(txtCantidad.getText());
    String categoria = comboCategoria.getSelectedItem().toString();
    int precio=Integer.parseInt(txtPrecio.getText());
    lista.insertarFin(cantidad,categoria,precio);
    int subtotal = cantidad * precio;
    modelo = (DefaultTableModel) this.Mostrar_valor.getModel();
    Object fila[] = new Object[]{cantidad, categoria, precio, subtotal};
    modelo.addRow(fila);  
    }//GEN-LAST:event_btnInsertarFinActionPerformed

    private void txtPrecioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPrecioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPrecioActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable Mostrar_valor;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnEliminarFin;
    private javax.swing.JButton btnEliminarIni;
    private javax.swing.JButton btnEliminarMedio;
    private javax.swing.JButton btnInsertarFin;
    private javax.swing.JButton btnInsertarIni;
    private javax.swing.JButton btnInsertarMedio;
    private javax.swing.JButton btnMostrar;
    private javax.swing.JButton btnOrdenar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JComboBox<String> comboCategoria;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblNumero;
    private javax.swing.JLabel lblTotal;
    private javax.swing.JTextArea txtA;
    private javax.swing.JTextField txtCantidad;
    private javax.swing.JTextField txtPrecio;
    // End of variables declaration//GEN-END:variables
}

package formularios;

import clases.LDECliente;
import nodos.NCliente;
import javax.swing.table.DefaultTableModel;
import javax.swing.JOptionPane;

public class FLDECliente extends javax.swing.JFrame {
    LDECliente lista = new LDECliente();
    DefaultTableModel modelo;
    
    public FLDECliente() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtApellido = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtA = new javax.swing.JTextArea();
        btnRecorrerListasig = new javax.swing.JButton();
        btnBuscar = new javax.swing.JButton();
        btnInsertarIni = new javax.swing.JButton();
        btnInsertarFin = new javax.swing.JButton();
        btnInsertarMedio = new javax.swing.JButton();
        btnEliminarInicio = new javax.swing.JButton();
        btnEliminarFin = new javax.swing.JButton();
        btnRecorrerListaAnt = new javax.swing.JButton();
        btnEliminarMedio = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        comboSexo = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        txtEdad = new javax.swing.JTextField();
        txtTelefono = new javax.swing.JTextField();
        txtCorreo = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        Mostrar_valor = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        txtBuscar = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 51, 153));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 2, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Telefono");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, 70, -1));

        txtApellido.setBackground(new java.awt.Color(0, 0, 0));
        txtApellido.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(txtApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 70, 130, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI Black", 2, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Nombre ");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, 70, -1));

        txtNombre.setBackground(new java.awt.Color(0, 0, 0));
        txtNombre.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 70, 150, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI Black", 2, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Sexo");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, 40, -1));

        txtA.setColumns(20);
        txtA.setRows(5);
        jScrollPane1.setViewportView(txtA);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, 590, 180));

        btnRecorrerListasig.setBackground(new java.awt.Color(0, 0, 0));
        btnRecorrerListasig.setForeground(new java.awt.Color(255, 255, 255));
        btnRecorrerListasig.setText("Recorrer la lista hacia delante");
        btnRecorrerListasig.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRecorrerListasigActionPerformed(evt);
            }
        });
        jPanel1.add(btnRecorrerListasig, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 340, 190, -1));

        btnBuscar.setBackground(new java.awt.Color(0, 0, 0));
        btnBuscar.setForeground(new java.awt.Color(255, 255, 255));
        btnBuscar.setText("Buscar un elemento");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });
        jPanel1.add(btnBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 70, 140, -1));

        btnInsertarIni.setBackground(new java.awt.Color(0, 0, 0));
        btnInsertarIni.setForeground(new java.awt.Color(255, 255, 255));
        btnInsertarIni.setText("Insertar al inicio");
        btnInsertarIni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInsertarIniActionPerformed(evt);
            }
        });
        jPanel1.add(btnInsertarIni, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 120, 190, -1));

        btnInsertarFin.setBackground(new java.awt.Color(0, 0, 0));
        btnInsertarFin.setForeground(new java.awt.Color(255, 255, 255));
        btnInsertarFin.setText("Inserta al final");
        btnInsertarFin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInsertarFinActionPerformed(evt);
            }
        });
        jPanel1.add(btnInsertarFin, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 180, 190, -1));

        btnInsertarMedio.setBackground(new java.awt.Color(0, 0, 0));
        btnInsertarMedio.setForeground(new java.awt.Color(255, 255, 255));
        btnInsertarMedio.setText("Insertar al medio");
        btnInsertarMedio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInsertarMedioActionPerformed(evt);
            }
        });
        jPanel1.add(btnInsertarMedio, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 150, 190, -1));

        btnEliminarInicio.setBackground(new java.awt.Color(0, 0, 0));
        btnEliminarInicio.setForeground(new java.awt.Color(255, 255, 255));
        btnEliminarInicio.setText("Eliminar al inicio");
        btnEliminarInicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarInicioActionPerformed(evt);
            }
        });
        jPanel1.add(btnEliminarInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 230, 190, -1));

        btnEliminarFin.setBackground(new java.awt.Color(0, 0, 0));
        btnEliminarFin.setForeground(new java.awt.Color(255, 255, 255));
        btnEliminarFin.setText("Eliminar al final");
        btnEliminarFin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarFinActionPerformed(evt);
            }
        });
        jPanel1.add(btnEliminarFin, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 290, 190, -1));

        btnRecorrerListaAnt.setBackground(new java.awt.Color(0, 0, 0));
        btnRecorrerListaAnt.setForeground(new java.awt.Color(255, 255, 255));
        btnRecorrerListaAnt.setText("Recorrer lista hacia hacia atras");
        btnRecorrerListaAnt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRecorrerListaAntActionPerformed(evt);
            }
        });
        jPanel1.add(btnRecorrerListaAnt, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 370, 190, -1));

        btnEliminarMedio.setBackground(new java.awt.Color(0, 0, 0));
        btnEliminarMedio.setForeground(new java.awt.Color(255, 255, 255));
        btnEliminarMedio.setText("Eliminar al medio");
        btnEliminarMedio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarMedioActionPerformed(evt);
            }
        });
        jPanel1.add(btnEliminarMedio, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 260, 190, -1));

        btnSalir.setBackground(new java.awt.Color(0, 0, 0));
        btnSalir.setForeground(new java.awt.Color(255, 255, 255));
        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        jPanel1.add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 500, 190, -1));

        comboSexo.setBackground(new java.awt.Color(0, 102, 102));
        comboSexo.setForeground(new java.awt.Color(255, 255, 255));
        comboSexo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar", "Masculino", "Femenino" }));
        comboSexo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboSexoActionPerformed(evt);
            }
        });
        jPanel1.add(comboSexo, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 100, 150, -1));

        jButton1.setBackground(new java.awt.Color(0, 0, 0));
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Ventas");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 420, 190, -1));

        txtEdad.setBackground(new java.awt.Color(0, 0, 0));
        txtEdad.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(txtEdad, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 130, 130, -1));

        txtTelefono.setBackground(new java.awt.Color(0, 0, 0));
        txtTelefono.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(txtTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 130, 150, -1));

        txtCorreo.setBackground(new java.awt.Color(0, 0, 0));
        txtCorreo.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(txtCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 100, 130, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI Black", 2, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Apellido");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 70, 70, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI Black", 2, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Correo");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 100, 50, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI Black", 3, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Edad");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 130, 40, -1));

        jButton2.setBackground(new java.awt.Color(0, 0, 0));
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("MENU");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 450, 190, -1));

        Mostrar_valor.setForeground(new java.awt.Color(0, 0, 255));
        Mostrar_valor.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "Apellido", "Sexo", "Correo", "Telefono", "Edad"
            }
        ));
        jScrollPane2.setViewportView(Mostrar_valor);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 370, 590, 170));

        jLabel4.setFont(new java.awt.Font("Arial Black", 2, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Cliente Lista Doblemente enlazada");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 20, -1, -1));

        txtBuscar.setBackground(new java.awt.Color(255, 51, 51));
        jPanel1.add(txtBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 70, 140, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 839, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 554, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnInsertarMedioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInsertarMedioActionPerformed
        String apellido = txtApellido.getText();
        String nombre = txtNombre.getText();
        String telefono = txtTelefono.getText();
        String correo = txtCorreo.getText();
        String edad = txtEdad.getText();
        String sexo = comboSexo.getSelectedItem().toString();
        String datoAntes = JOptionPane.showInputDialog(this, "Ingrese el dato que estará despues del dato colocado:");
        lista.insertarAntesDeX(apellido, nombre, sexo,telefono,correo,edad, datoAntes);
        modelo = (DefaultTableModel) this.Mostrar_valor.getModel();
        Object fila[] = new Object[]{nombre, apellido, sexo, correo,telefono,edad};
        modelo.addRow(fila);
    }//GEN-LAST:event_btnInsertarMedioActionPerformed

    private void btnInsertarIniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInsertarIniActionPerformed
        String apellido = (txtApellido.getText());
        String nombre = (txtNombre.getText());
        String telefono = (txtTelefono.getText());
        String correo = txtCorreo.getText();
        String edad = txtEdad.getText();
        String sexo = comboSexo.getSelectedItem().toString();
        lista.insertarIni(apellido,nombre,sexo,telefono,correo,edad);   
        modelo = (DefaultTableModel) this.Mostrar_valor.getModel();
        Object fila[] = new Object[]{nombre, apellido, sexo, correo,telefono,edad};
        modelo.addRow(fila);
    }//GEN-LAST:event_btnInsertarIniActionPerformed

    private void btnRecorrerListasigActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRecorrerListasigActionPerformed
        modelo.setRowCount(0);
        NCliente elemento=lista.getInicio();
        while(elemento!=null){
        modelo= (DefaultTableModel) this.Mostrar_valor.getModel();
        Object datos[]=new Object[]
        {elemento.getNombre(),elemento.getApellido(),elemento.getSexo(),elemento.getCorreo(),elemento.getTelefono(),elemento.getEdad()};
        modelo.addRow(datos);
            elemento=elemento.getSiguiente();
        }
    }//GEN-LAST:event_btnRecorrerListasigActionPerformed

    private void btnRecorrerListaAntActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRecorrerListaAntActionPerformed
        modelo.setRowCount(0);
        NCliente elemento=lista.getFin();
        while(elemento!=null){
        modelo= (DefaultTableModel) this.Mostrar_valor.getModel();
        Object datos[]=new Object[]
        {elemento.getNombre(),elemento.getApellido(),elemento.getSexo(),elemento.getCorreo(),elemento.getTelefono(),elemento.getEdad()};
         modelo.addRow(datos);
         elemento=elemento.getAnterior();
        }
    }//GEN-LAST:event_btnRecorrerListaAntActionPerformed

    private void btnInsertarFinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInsertarFinActionPerformed
        String apellido = (txtApellido.getText());
        String nombre = (txtNombre.getText());
        String telefono = (txtTelefono.getText());
        String correo = (txtCorreo.getText());
        String edad = (txtEdad.getText());
        String sexo = comboSexo.getSelectedItem().toString();
        lista.insertarFinal(apellido,nombre,sexo,telefono,correo,edad);
        modelo = (DefaultTableModel) this.Mostrar_valor.getModel();
        Object fila[] = new Object[]{nombre, apellido, sexo, correo,telefono,edad};
        modelo.addRow(fila);
    }//GEN-LAST:event_btnInsertarFinActionPerformed

    private void btnEliminarInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarInicioActionPerformed
        lista.eliminarIni();
        JOptionPane.showMessageDialog(null, "1er dato eliminado\n");
    }//GEN-LAST:event_btnEliminarInicioActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnEliminarFinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarFinActionPerformed
        lista.eliminarFin();
        JOptionPane.showMessageDialog(null,"ultimo dato eliminado\n");
    }//GEN-LAST:event_btnEliminarFinActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed

        String busqueda=txtBuscar.getText();
        NCliente elemento=lista.getInicio();

        while (elemento!=null&&
        !elemento.getApellido().equals(busqueda)&&
        !elemento.getNombre().equals(busqueda)&&
        !elemento.getTelefono().equals(busqueda)&&
        !elemento.getCorreo().equals(busqueda)&&
        !elemento.getEdad().equals(busqueda)&&
        !elemento.getSexo().equals(busqueda)){
        elemento=elemento.getSiguiente();
        }
        if(elemento!=null){
            JOptionPane.showMessageDialog(null,busqueda + " elemento encontrado\n");
        }else{
            JOptionPane.showMessageDialog(null,busqueda+" elemento no encontrado\n");
        }
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnEliminarMedioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarMedioActionPerformed
        String busqueda = txtBuscar.getText();
        lista.eliminarMedio(busqueda); 
        JOptionPane.showMessageDialog(null,"Elemento con búsqueda: "+busqueda+"eliminado\n");
    }//GEN-LAST:event_btnEliminarMedioActionPerformed

    private void comboSexoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboSexoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboSexoActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        FCVenta entrada = new FCVenta();
        entrada.setVisible(true); 
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        FMenu menuForm = new FMenu();
        menuForm.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable Mostrar_valor;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnEliminarFin;
    private javax.swing.JButton btnEliminarInicio;
    private javax.swing.JButton btnEliminarMedio;
    private javax.swing.JButton btnInsertarFin;
    private javax.swing.JButton btnInsertarIni;
    private javax.swing.JButton btnInsertarMedio;
    private javax.swing.JButton btnRecorrerListaAnt;
    private javax.swing.JButton btnRecorrerListasig;
    private javax.swing.JButton btnSalir;
    private javax.swing.JComboBox<String> comboSexo;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea txtA;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtBuscar;
    private javax.swing.JTextField txtCorreo;
    private javax.swing.JTextField txtEdad;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtTelefono;
    // End of variables declaration//GEN-END:variables
}

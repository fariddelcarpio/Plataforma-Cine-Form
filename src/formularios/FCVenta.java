package formularios;

import clases.CVenta;
import nodos.NVenta;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.Timer;
import javax.swing.table.DefaultTableModel;

public class FCVenta extends javax.swing.JFrame {
    CVenta cola= new CVenta();
    DefaultTableModel modelo;
    public FCVenta() {
        initComponents();
        iniciarReloj();
    }
private void iniciarReloj() {
    Timer timer = new Timer(1000, e -> {
        Date fechaActual = new Date();
        SimpleDateFormat formatoFecha = new SimpleDateFormat("dd/MM/yyyy");
        SimpleDateFormat formatoHora = new SimpleDateFormat("HH:mm:ss");
        
        jLabel15.setText("Fecha: " + formatoFecha.format(fechaActual));
        jLabel18.setText("Hora: " + formatoHora.format(fechaActual));
        String fecha="Fecha: " + formatoFecha.format(fechaActual);
        String hora="Hora: " + formatoHora.format(fechaActual);
        //txtA.setText(fecha);
        //txtA.setText(hora); 
    });
    timer.start();
}
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        txtCantidad = new javax.swing.JTextField();
        btnInsertar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnMostrar = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        txtMonto = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtPrecio = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        comboLentes = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        txtDescuento = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        comboMedioPago = new javax.swing.JComboBox<>();
        txtPorcentajeDescuento = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        jLabel33 = new javax.swing.JLabel();
        txtApellido = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txtDni = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        comboPelicula = new javax.swing.JComboBox<>();
        jLabel13 = new javax.swing.JLabel();
        comboSede = new javax.swing.JComboBox<>();
        jLabel16 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        comboAsiento = new javax.swing.JComboBox<>();
        jLabel17 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        Mostrar_valor = new javax.swing.JTable();
        btnImprimir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 102, 102));

        txtCantidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCantidadActionPerformed(evt);
            }
        });

        btnInsertar.setText("INSERTAR");
        btnInsertar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInsertarActionPerformed(evt);
            }
        });

        btnEliminar.setText("ELIMINAR");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        btnMostrar.setText("MOSTRAR");
        btnMostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostrarActionPerformed(evt);
            }
        });

        btnSalir.setText("SALIR");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        jLabel4.setText("MONTO");

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("CANTIDAD:DE BOLETOS");

        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("LENTES");

        txtPrecio.setBackground(new java.awt.Color(0, 0, 0));
        txtPrecio.setForeground(new java.awt.Color(255, 255, 255));

        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("PRECIO");

        comboLentes.setBackground(new java.awt.Color(0, 102, 102));
        comboLentes.setForeground(new java.awt.Color(255, 255, 255));
        comboLentes.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar", "2D", "3D" }));
        comboLentes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboLentesActionPerformed(evt);
            }
        });

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("% DE DESCUENTO");

        txtDescuento.setBackground(new java.awt.Color(0, 0, 0));
        txtDescuento.setForeground(new java.awt.Color(255, 255, 255));

        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("DESCUENTO");

        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("MEDIO DE PAGO");

        comboMedioPago.setBackground(new java.awt.Color(0, 102, 102));
        comboMedioPago.setForeground(new java.awt.Color(255, 255, 255));
        comboMedioPago.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar", "INTERBANK", "BBVA", "SCOTIABANK", "BCP" }));
        comboMedioPago.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboMedioPagoActionPerformed(evt);
            }
        });

        txtPorcentajeDescuento.setBackground(new java.awt.Color(0, 0, 0));
        txtPorcentajeDescuento.setForeground(new java.awt.Color(255, 255, 255));

        jLabel23.setFont(new java.awt.Font("Segoe UI Black", 2, 12)); // NOI18N
        jLabel23.setText("Nombre");

        txtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreActionPerformed(evt);
            }
        });

        jLabel33.setFont(new java.awt.Font("Segoe UI Black", 2, 12)); // NOI18N
        jLabel33.setText("Apellido");

        txtApellido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtApellidoActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Segoe UI Black", 2, 12)); // NOI18N
        jLabel11.setText("Dni");

        txtDni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDniActionPerformed(evt);
            }
        });

        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("PELICULAS");

        comboPelicula.setBackground(new java.awt.Color(0, 102, 102));
        comboPelicula.setForeground(new java.awt.Color(255, 255, 255));
        comboPelicula.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar", "Guerra Mundial Z", "Venon", "Piratas del Caribe", "Shrek", "MI Villano Favorito", "Los Simpson", "El Planeta de Los Simios", "Ralph el Demoledor", "Spiderman 3", "Thor" }));
        comboPelicula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboPeliculaActionPerformed(evt);
            }
        });

        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("SEDE");

        comboSede.setBackground(new java.awt.Color(0, 102, 102));
        comboSede.setForeground(new java.awt.Color(255, 255, 255));
        comboSede.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar", "CP Centro Civico", "CP Brasil", "CP Canto Grande", "CP Centro Jr. De La Unión", "CP La Molina", "CP Lurin", "CP Mall del Sur", "CP Salaverry", "CP San borja", "CP San Juan de Lurigancho", "CP San Miguel", "CP Ventanilla", "CP Villa el Salvador", "CP Villa Maria del Triunfo" }));
        comboSede.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboSedeActionPerformed(evt);
            }
        });

        jLabel16.setFont(new java.awt.Font("Segoe UI Black", 2, 12)); // NOI18N
        jLabel16.setText("Asiento");

        jLabel15.setFont(new java.awt.Font("Segoe UI Black", 2, 12)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("HORA: ");

        jLabel18.setFont(new java.awt.Font("Segoe UI Black", 2, 12)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("FECHA: ");

        comboAsiento.setBackground(new java.awt.Color(0, 102, 102));
        comboAsiento.setForeground(new java.awt.Color(255, 255, 255));
        comboAsiento.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar", "A1", "A2", "A3", "A4", "A5", "B1", "B2", "B3", "B4", "B5", "C1", "C2", "C3", "C4", "C5", "D1", "D2", "D3", "D4", "D5", "E1", "E2", "E3", "E4", "E5" }));
        comboAsiento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboAsientoActionPerformed(evt);
            }
        });

        jLabel17.setFont(new java.awt.Font("Arial Black", 2, 24)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("Ventas (Colas)");

        Mostrar_valor.setForeground(new java.awt.Color(0, 0, 255));
        Mostrar_valor.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "Apellido", "Dni", "Pelicula", "Sede", "Asiento", "Cantidad", "Lentes", "Precio", "Monto", "Paga con", "% Descuento", "Descuento", "Total"
            }
        ));
        jScrollPane2.setViewportView(Mostrar_valor);

        btnImprimir.setText("IMPRIMIR ");
        btnImprimir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnImprimirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(203, 203, 203)
                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(56, 56, 56)
                .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(39, 39, 39)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel16)
                                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(48, 48, 48)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel23)
                                            .addComponent(jLabel33)
                                            .addComponent(jLabel11))
                                        .addGap(41, 41, 41)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(txtApellido)
                                            .addComponent(txtNombre, javax.swing.GroupLayout.DEFAULT_SIZE, 139, Short.MAX_VALUE)
                                            .addComponent(txtDni)))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(comboSede, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(comboPelicula, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(comboAsiento, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                        .addGap(119, 119, 119)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                        .addGap(9, 9, 9)
                                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(txtDescuento, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel10)
                                                .addGap(26, 26, 26))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel6)
                                                .addGap(12, 12, 12)))
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(txtPorcentajeDescuento)
                                            .addComponent(comboMedioPago, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel5)
                                    .addGap(17, 17, 17)
                                    .addComponent(txtCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(32, 32, 32)
                                    .addComponent(comboLentes, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(32, 32, 32)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(txtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtMonto, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(144, 144, 144)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(btnMostrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnInsertar, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btnImprimir, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(35, 35, 35)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnEliminar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 1184, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(29, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel15)
                            .addComponent(jLabel18)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(jLabel17)))
                .addGap(36, 36, 36)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel23)
                            .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel33)
                            .addComponent(txtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11)
                            .addComponent(txtDni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(comboPelicula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel13)
                            .addComponent(comboSede, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel16)
                            .addComponent(comboAsiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(comboLentes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel8))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel9)
                                    .addComponent(txtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(txtMonto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(btnEliminar)
                                    .addComponent(btnInsertar))
                                .addGap(27, 27, 27)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(btnSalir)
                                    .addComponent(btnMostrar))))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(comboMedioPago, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10)
                            .addComponent(btnImprimir))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(txtPorcentajeDescuento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(txtDescuento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(28, 28, 28)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(36, Short.MAX_VALUE))
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

    private void btnInsertarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInsertarActionPerformed
        String nombre = txtNombre.getText();
        String apellido = txtApellido.getText();
        int dni=Integer.parseInt(txtDni.getText());
        String pelicula = comboPelicula.getSelectedItem().toString();
        String sede = comboSede.getSelectedItem().toString();
        String asiento = comboAsiento.getSelectedItem().toString();
        int cantidad=Integer.parseInt(txtCantidad.getText());
        String lentes = comboLentes.getSelectedItem().toString();
        int precio=Integer.parseInt(txtPrecio.getText());
        double monto = Double.parseDouble(txtMonto.getText());
        String medioPago = comboMedioPago.getSelectedItem().toString();
        double porcentajeDescuento=Double.parseDouble(txtPorcentajeDescuento.getText());
        double descuento=Double.parseDouble(txtDescuento.getText());
        
        double total;
        cola.insertarCola(nombre, apellido, dni, sede, asiento, pelicula, lentes, cantidad, precio, monto, medioPago, porcentajeDescuento, descuento);
        total=monto-descuento;
        modelo = (DefaultTableModel) this.Mostrar_valor.getModel();
        Object fila[] = new Object[]{nombre,apellido,dni,pelicula,sede,asiento,cantidad, lentes, precio,monto,medioPago,porcentajeDescuento,descuento,total };
        modelo.addRow(fila);
    }//GEN-LAST:event_btnInsertarActionPerformed

    private void btnMostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarActionPerformed
        modelo.setRowCount(0);
        NVenta elemento=cola.getInicio();
        while(elemento!=null){
            double total=elemento.getMonto()-elemento.getDescuento();
            modelo= (DefaultTableModel) this.Mostrar_valor.getModel();
            Object datos[]=new Object[]
            {elemento.getNombre(),elemento.getApellido(),elemento.getDni(),
             elemento.getPelicula(),elemento.getSede(),elemento.getAsiento(),
             elemento.getCantidad(),elemento.getLentes(),elemento.getPrecio(),
             elemento.getMonto(),elemento.getMedioPago(),elemento.getPorcentajeDescuento(),
             elemento.getDescuento(),total};
            modelo.addRow(datos);
            elemento=elemento.getSiguiente();
        }
    }//GEN-LAST:event_btnMostrarActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        cola.quitarCola();
        JOptionPane.showMessageDialog(null, "1er dato o grupo eliminado\n");
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void txtCantidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCantidadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCantidadActionPerformed

    private void comboLentesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboLentesActionPerformed
        String lentes=(String)comboLentes.getSelectedItem();
        if(lentes.equals("Seleccionar")){
            txtPrecio.setText("");
        }
        if(lentes.equals("2D")){
            txtPrecio.setText("20");
        }
        if(lentes.equals("3D")){
            txtPrecio.setText("30");
        }
        int cantidad=Integer.parseInt(txtCantidad.getText());
        int precio=Integer.parseInt(txtPrecio.getText());
        int monto=precio*cantidad;
        txtMonto.setText(""+monto);

    }//GEN-LAST:event_comboLentesActionPerformed

    private void comboMedioPagoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboMedioPagoActionPerformed
        String MedioPago=(String)comboMedioPago.getSelectedItem();
        if(MedioPago.equals("Seleccionar")){
            txtPorcentajeDescuento.setText("");
        }
        if(MedioPago.equals("INTERBANK")){
            txtPorcentajeDescuento.setText("10");
        }
        if(MedioPago.equals("BBVA")){
            txtPorcentajeDescuento.setText("12");
        }
        if(MedioPago.equals("SCOTIABANK")){
            txtPorcentajeDescuento.setText("15");
        }
        if(MedioPago.equals("BCP")){
            txtPorcentajeDescuento.setText("20");
        }
        double monto=Integer.parseInt(txtMonto.getText());
        double Porcentajedescuento=Integer.parseInt(txtPorcentajeDescuento.getText());
        double descuento=(monto/100)*Porcentajedescuento;

        txtDescuento.setText(""+descuento);

    }//GEN-LAST:event_comboMedioPagoActionPerformed

    private void txtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreActionPerformed
      
    }//GEN-LAST:event_txtNombreActionPerformed

    private void txtApellidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtApellidoActionPerformed
      
    }//GEN-LAST:event_txtApellidoActionPerformed

    private void txtDniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDniActionPerformed
       
    }//GEN-LAST:event_txtDniActionPerformed

    private void comboPeliculaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboPeliculaActionPerformed
       
    }//GEN-LAST:event_comboPeliculaActionPerformed

    private void comboSedeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboSedeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboSedeActionPerformed

    private void comboAsientoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboAsientoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboAsientoActionPerformed

    private void btnImprimirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnImprimirActionPerformed
        String nombre = txtNombre.getText();
        String apellido = txtApellido.getText();
        int dni=Integer.parseInt(txtDni.getText());
        String pelicula = comboPelicula.getSelectedItem().toString();
        String sede = comboSede.getSelectedItem().toString();
        String asiento = comboAsiento.getSelectedItem().toString();
        int cantidad=Integer.parseInt(txtCantidad.getText());
        String lentes = comboLentes.getSelectedItem().toString();
        int precio=Integer.parseInt(txtPrecio.getText());
        double monto = Double.parseDouble(txtMonto.getText());
        String medioPago = comboMedioPago.getSelectedItem().toString();
        double porcentajeDescuento=Double.parseDouble(txtPorcentajeDescuento.getText());
        double descuento=Double.parseDouble(txtDescuento.getText());
        double total;
        total=monto-descuento;
        JOptionPane.showMessageDialog
            (null, "Nombre: " + nombre + 
               "\nApellido: " + apellido+
               "\nDni: " + dni+
               "\nPelicula: " + pelicula+
               "\nSede: " + sede+
               "\nAsiento: " + asiento+
               "\nCantidad: " + cantidad+
               "\nLentes: " + lentes+
               "\nPrecio: " + precio+
               "\nMonto: " + monto+
               "\nPaga con: " + medioPago+
               "\nPorcentaje de Descuento: " + porcentajeDescuento+"%"+
               "\nDescuento: " + descuento+
               "\nTOTAL: " + total);
    }//GEN-LAST:event_btnImprimirActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable Mostrar_valor;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnImprimir;
    private javax.swing.JButton btnInsertar;
    private javax.swing.JButton btnMostrar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JComboBox<String> comboAsiento;
    private javax.swing.JComboBox<String> comboLentes;
    private javax.swing.JComboBox<String> comboMedioPago;
    private javax.swing.JComboBox<String> comboPelicula;
    private javax.swing.JComboBox<String> comboSede;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtCantidad;
    private javax.swing.JTextField txtDescuento;
    private javax.swing.JTextField txtDni;
    private javax.swing.JTextField txtMonto;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtPorcentajeDescuento;
    private javax.swing.JTextField txtPrecio;
    // End of variables declaration//GEN-END:variables
}
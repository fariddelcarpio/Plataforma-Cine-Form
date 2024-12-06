package formularios;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class FAPelicula extends javax.swing.JFrame {
   
    String[] num = new String[5];
    int pos = 0;
    DefaultTableModel modelo;
    
    public FAPelicula() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        btnInsertar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtA = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        txtGenero = new javax.swing.JTextField();
        comboPelicula = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        comboSede = new javax.swing.JComboBox<>();
        comboIdioma = new javax.swing.JComboBox<>();
        txtDuracion = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tbl_tabla = new javax.swing.JTable();
        btnIngresar = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(0, 51, 153));

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("PELICULAS");

        btnInsertar.setBackground(new java.awt.Color(0, 0, 0));
        btnInsertar.setForeground(new java.awt.Color(255, 255, 255));
        btnInsertar.setText("INSERTAR");
        btnInsertar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInsertarActionPerformed(evt);
            }
        });

        txtA.setColumns(20);
        txtA.setRows(5);
        jScrollPane2.setViewportView(txtA);

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("GENERO");

        txtGenero.setBackground(new java.awt.Color(0, 0, 0));
        txtGenero.setForeground(new java.awt.Color(255, 255, 255));

        comboPelicula.setBackground(new java.awt.Color(0, 102, 102));
        comboPelicula.setForeground(new java.awt.Color(255, 255, 255));
        comboPelicula.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar", "Guerra Mundial Z", "Venon", "Piratas del Caribe", "Shrek", "MI Villano Favorito", "Los Simpson", "El Planeta de Los Simios", "Ralph el Demoledor", "Spiderman 3", "Thor" }));
        comboPelicula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboPeliculaActionPerformed(evt);
            }
        });

        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("SEDE");

        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("IDIOMA");

        comboSede.setBackground(new java.awt.Color(0, 102, 102));
        comboSede.setForeground(new java.awt.Color(255, 255, 255));
        comboSede.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar", "CP Centro Civico", "CP Brasil", "CP Canto Grande", "CP Centro Jr. De La Unión", "CP La Molina", "CP Lurin", "CP Mall del Sur", "CP Salaverry", "CP San borja", "CP San Juan de Lurigancho", "CP San Miguel", "CP Ventanilla", "CP Villa el Salvador", "CP Villa Maria del Triunfo" }));
        comboSede.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboSedeActionPerformed(evt);
            }
        });

        comboIdioma.setBackground(new java.awt.Color(0, 102, 102));
        comboIdioma.setForeground(new java.awt.Color(255, 255, 255));
        comboIdioma.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar", "Español", "Ingles", "Italiano", "Frances", "Portuges" }));

        txtDuracion.setBackground(new java.awt.Color(0, 0, 0));
        txtDuracion.setForeground(new java.awt.Color(255, 255, 255));

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("DURACIÓN");

        tbl_tabla.setForeground(new java.awt.Color(51, 51, 255));
        tbl_tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Pelicula", "Genero", "Duración", "Sede", "Idioma"
            }
        ));
        jScrollPane3.setViewportView(tbl_tabla);

        btnIngresar.setBackground(new java.awt.Color(0, 0, 0));
        btnIngresar.setForeground(new java.awt.Color(255, 255, 255));
        btnIngresar.setText("INGRESAR");
        btnIngresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIngresarActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(0, 0, 0));
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("MENU");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(0, 0, 0));
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("SALIR");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        btnEliminar.setBackground(new java.awt.Color(0, 0, 0));
        btnEliminar.setForeground(new java.awt.Color(255, 255, 255));
        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Arial Black", 2, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("PELICULAS ARREGLOS ");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane3))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(28, 28, 28)
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtDuracion, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(31, 31, 31)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(28, 28, 28)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(comboIdioma, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(comboSede, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(29, 29, 29)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 67, Short.MAX_VALUE)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(26, 26, 26)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(comboPelicula, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtGenero))
                                .addGap(32, 32, 32)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnIngresar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnInsertar, javax.swing.GroupLayout.DEFAULT_SIZE, 114, Short.MAX_VALUE)
                                    .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnEliminar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(189, 189, 189))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(btnInsertar)
                            .addComponent(comboPelicula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtGenero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnIngresar))
                            .addComponent(jLabel1))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jButton3)
                                .addGap(23, 23, 23)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel8)
                                    .addComponent(comboSede, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton2))
                                .addGap(28, 28, 28)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel9)
                                    .addComponent(comboIdioma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnEliminar)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel6)
                                    .addComponent(txtDuracion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addComponent(jScrollPane2))
                .addGap(28, 28, 28)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnInsertarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInsertarActionPerformed
        String pelicula = comboPelicula.getSelectedItem().toString();
        String genero = txtGenero.getText();
        String duracion = txtDuracion.getText();
        String sede = comboSede.getSelectedItem().toString();
        String idioma = comboIdioma.getSelectedItem().toString();
        if (pos<num.length) {
            num[pos]=pelicula;
            pos++;
            num[pos] = genero; 
            pos++;
            num[pos] = duracion; 
            pos++;
            num[pos] = sede; 
            pos++;
            num[pos] = idioma; 
            pos++;
            txtA.append(pelicula+"\n");
            txtA.append(genero + "\n");
            txtA.append(duracion+"\n");
            txtA.append(sede + "\n");
            txtA.append(idioma+"\n");
            
        }else{
            txtA.append("el arreglo esta lleno...");
        }
    }//GEN-LAST:event_btnInsertarActionPerformed

    private void btnIngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIngresarActionPerformed
        String pelicula = comboPelicula.getSelectedItem().toString();
        String genero = txtGenero.getText();
        String duracion = txtDuracion.getText();
        String sede = comboSede.getSelectedItem().toString();
        String idioma = comboIdioma.getSelectedItem().toString();
        modelo= (DefaultTableModel) this.tbl_tabla.getModel();
        Object datos[]=new Object[]{pelicula,genero,duracion,sede,idioma};
        modelo.addRow(datos);
    }//GEN-LAST:event_btnIngresarActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        FMenu menuForm = new FMenu();
        menuForm.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        int fila=tbl_tabla.getSelectedRow();
        if(fila>=0){
            modelo.removeRow(fila);
        }else{
            JOptionPane.showMessageDialog(null, "Seleccionar fila para Eliminar");
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void comboPeliculaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboPeliculaActionPerformed
        String pelicula=(String)comboPelicula.getSelectedItem();
         
         if(pelicula.equals("Seleccionar")){
             txtGenero.setText("");
         }
         if(pelicula.equals("Guerra Mundial Z")){
             txtGenero.setText("Terror/Acción");
             txtDuracion.setText("1h 56min");
         }
         if(pelicula.equals("Venon")){
             txtGenero.setText("Superheroes/Accion");
             txtDuracion.setText("1h 49min");
         }
         if(pelicula.equals("Piratas del Caribe")){
             txtGenero.setText("Aventura");
             txtDuracion.setText("2h 23min");
         }
         if(pelicula.equals("Shrek")){
             txtGenero.setText("Animacion/Aventura");
             txtDuracion.setText("1h 32min");
         }
         if(pelicula.equals("MI Villano Favorito")){
             txtGenero.setText("Animacion/Animacion");
             txtDuracion.setText("1h 35min");
         }
         if(pelicula.equals("Los Simpson")){
             txtGenero.setText("Animacion");
             txtDuracion.setText("1h 30min");
         }
         if(pelicula.equals("El Planeta de Los Simios")){
             txtGenero.setText("Ciencia Ficcion");
             txtDuracion.setText("1h 52min");
         }
         if(pelicula.equals("Ralph el Demoledor")){
             txtGenero.setText("Animacion");
             txtDuracion.setText("1h 41min");
         }
         if(pelicula.equals("Spiderman 3")){
             txtGenero.setText("Superheroes");
             txtDuracion.setText("2h 19min");
         }
         if(pelicula.equals("Thor")){
             txtGenero.setText("Superheroes");
             txtDuracion.setText("1h 54min");
         }
    }//GEN-LAST:event_comboPeliculaActionPerformed

    private void comboSedeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboSedeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboSedeActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnIngresar;
    private javax.swing.JButton btnInsertar;
    private javax.swing.JComboBox<String> comboIdioma;
    private javax.swing.JComboBox<String> comboPelicula;
    private javax.swing.JComboBox<String> comboSede;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable tbl_tabla;
    private javax.swing.JTextArea txtA;
    private javax.swing.JTextField txtDuracion;
    private javax.swing.JTextField txtGenero;
    // End of variables declaration//GEN-END:variables
}

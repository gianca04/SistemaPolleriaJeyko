package formularios;
import java.util.ArrayList;
import Clases.Empleado;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.io.*;
import javax.swing.event.TableModelListener;

public class FormularioEmpleados extends javax.swing.JFrame {

    //VESIÓN BETA 
    
    //mover ventana
    int xMouse, yMouse;
    
    String archivoEmpleados = "empleados.txt";
    File archivo = new File(archivoEmpleados); 
    
    int posicion=0;
    static String BLANCO = "";
    
    ArrayList<Empleado> empleados = new ArrayList();
    
    DefaultTableModel tablaEmpleados = new DefaultTableModel();
    
    public FormularioEmpleados() {
        
        setUndecorated(true);
        
        initComponents();
        this.setLocation(430, 100);
        
        String titulos[] = {" NOMBRE", "DNI", "TELÉFONO", "CARGO", "ID"};
        tablaEmpleados.setColumnIdentifiers(titulos);
        jtEmpleados.setModel(tablaEmpleados);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        btndarDeBaja = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtEmpleados = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        bienvenido1 = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        bienvenido2 = new javax.swing.JLabel();
        txttardanzas = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        txtsueldoNeto = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        txtdiasTrabajados = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        bienvenido3 = new javax.swing.JLabel();
        txtid = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        txtnombre = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        txtdni = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txttelefono = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        cbxcargo = new javax.swing.JComboBox<>();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        txtposicion = new javax.swing.JTextField();
        btnguardar = new javax.swing.JButton();
        btnatras = new javax.swing.JButton();
        jLabel25 = new javax.swing.JLabel();
        btnadelante = new javax.swing.JButton();
        btnregistrar = new javax.swing.JButton();
        btnguardarCambios = new javax.swing.JButton();
        txtuser = new javax.swing.JTextField();
        txtpass = new javax.swing.JPasswordField();
        btneditar1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                formMouseDragged(evt);
            }
        });
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                formMousePressed(evt);
            }
        });
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        btndarDeBaja.setFont(new java.awt.Font("Roboto Light", 0, 16)); // NOI18N
        btndarDeBaja.setText("Dar de baja");
        btndarDeBaja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndarDeBajaActionPerformed(evt);
            }
        });

        jtEmpleados.setModel(new javax.swing.table.DefaultTableModel(
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
        jtEmpleados.setColumnSelectionAllowed(true);
        jScrollPane1.setViewportView(jtEmpleados);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/PicsArt_10-25-01.43.59.png"))); // NOI18N

        bienvenido1.setFont(new java.awt.Font("Roboto Black", 0, 30)); // NOI18N
        bienvenido1.setText("Empleados registrados");

        jTabbedPane1.setBackground(new java.awt.Color(255, 255, 255));
        jTabbedPane1.setTabLayoutPolicy(javax.swing.JTabbedPane.SCROLL_TAB_LAYOUT);
        jTabbedPane1.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        bienvenido2.setFont(new java.awt.Font("Roboto Black", 0, 30)); // NOI18N
        bienvenido2.setText("Calcular paga de empleados");

        txttardanzas.setFont(new java.awt.Font("Roboto Light", 0, 16)); // NOI18N
        txttardanzas.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel14.setBackground(new java.awt.Color(0, 0, 0));
        jLabel14.setFont(new java.awt.Font("Roboto Light", 2, 17)); // NOI18N
        jLabel14.setText("Tardanzas:");

        jButton1.setFont(new java.awt.Font("Roboto Light", 0, 16)); // NOI18N
        jButton1.setText("CALCULAR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        txtsueldoNeto.setFont(new java.awt.Font("Roboto Light", 0, 16)); // NOI18N
        txtsueldoNeto.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel17.setBackground(new java.awt.Color(0, 0, 0));
        jLabel17.setFont(new java.awt.Font("Roboto Light", 2, 17)); // NOI18N
        jLabel17.setText("Sueldo neto:");

        txtdiasTrabajados.setFont(new java.awt.Font("Roboto Light", 0, 16)); // NOI18N
        txtdiasTrabajados.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel16.setBackground(new java.awt.Color(0, 0, 0));
        jLabel16.setFont(new java.awt.Font("Roboto Light", 2, 17)); // NOI18N
        jLabel16.setText("Dias trabajados:");

        jLabel3.setFont(new java.awt.Font("Roboto Light", 0, 16)); // NOI18N
        jLabel3.setText("Seleccione un empleado de la tabla y ");

        jLabel4.setFont(new java.awt.Font("Roboto Light", 0, 16)); // NOI18N
        jLabel4.setText("Ingrese los datos solicitados");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(156, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtdiasTrabajados, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txttardanzas, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtsueldoNeto, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(110, 110, 110))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3))
                        .addGap(67, 67, 67))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bienvenido2, javax.swing.GroupLayout.PREFERRED_SIZE, 401, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel16)
                            .addComponent(jLabel14)
                            .addComponent(jLabel17))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(bienvenido2)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addGap(59, 59, 59)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtdiasTrabajados, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txttardanzas, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14))
                .addGap(18, 18, 18)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtsueldoNeto, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17))
                .addGap(302, 302, 302))
        );

        jTabbedPane1.addTab("Calcular Paga", jPanel1);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        bienvenido3.setFont(new java.awt.Font("Roboto Black", 0, 30)); // NOI18N
        bienvenido3.setText("Datos de empleados");
        jPanel2.add(bienvenido3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 420, -1));

        txtid.setEditable(false);
        txtid.setFont(new java.awt.Font("Roboto Light", 0, 16)); // NOI18N
        txtid.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel2.add(txtid, new org.netbeans.lib.awtextra.AbsoluteConstraints(384, 128, 40, 30));

        jLabel19.setBackground(new java.awt.Color(0, 0, 0));
        jLabel19.setFont(new java.awt.Font("Roboto Light", 2, 17)); // NOI18N
        jLabel19.setText("ID:");
        jPanel2.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(356, 132, -1, -1));

        txtnombre.setEditable(false);
        txtnombre.setFont(new java.awt.Font("Roboto Light", 0, 16)); // NOI18N
        txtnombre.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel2.add(txtnombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(139, 128, 180, 30));

        jLabel20.setBackground(new java.awt.Color(0, 0, 0));
        jLabel20.setFont(new java.awt.Font("Roboto Light", 2, 17)); // NOI18N
        jLabel20.setText("Nombre:");
        jPanel2.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(59, 132, -1, -1));

        txtdni.setEditable(false);
        txtdni.setFont(new java.awt.Font("Roboto Light", 0, 16)); // NOI18N
        txtdni.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel2.add(txtdni, new org.netbeans.lib.awtextra.AbsoluteConstraints(139, 169, 180, 30));

        jLabel5.setBackground(new java.awt.Color(0, 0, 0));
        jLabel5.setFont(new java.awt.Font("Roboto Light", 2, 17)); // NOI18N
        jLabel5.setText("DNI:");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(91, 178, -1, -1));

        txttelefono.setEditable(false);
        txttelefono.setFont(new java.awt.Font("Roboto Light", 0, 16)); // NOI18N
        txttelefono.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel2.add(txttelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 210, 180, 30));

        jLabel21.setBackground(new java.awt.Color(0, 0, 0));
        jLabel21.setFont(new java.awt.Font("Roboto Light", 2, 17)); // NOI18N
        jLabel21.setText("Teléfono:");
        jPanel2.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(53, 214, -1, -1));

        cbxcargo.setFont(new java.awt.Font("Roboto Light", 0, 16)); // NOI18N
        cbxcargo.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel2.add(cbxcargo, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 250, 180, 30));

        jLabel22.setBackground(new java.awt.Color(0, 0, 0));
        jLabel22.setFont(new java.awt.Font("Roboto Light", 2, 17)); // NOI18N
        jLabel22.setText("Cargo:");
        jPanel2.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(75, 256, -1, -1));

        jLabel23.setBackground(new java.awt.Color(0, 0, 0));
        jLabel23.setFont(new java.awt.Font("Roboto Light", 2, 17)); // NOI18N
        jLabel23.setText("Contraseña:");
        jPanel2.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 370, -1, -1));

        txtposicion.setEditable(false);
        txtposicion.setBackground(new java.awt.Color(255, 255, 255));
        txtposicion.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jPanel2.add(txtposicion, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 70, 300, 40));

        btnguardar.setFont(new java.awt.Font("Roboto Light", 0, 16)); // NOI18N
        btnguardar.setText("Guardar");
        btnguardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnguardarActionPerformed(evt);
            }
        });
        jPanel2.add(btnguardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 450, 120, 40));

        btnatras.setFont(new java.awt.Font("Roboto Light", 0, 16)); // NOI18N
        btnatras.setText("<");
        btnatras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnatrasActionPerformed(evt);
            }
        });
        jPanel2.add(btnatras, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 57, 40));

        jLabel25.setBackground(new java.awt.Color(0, 0, 0));
        jLabel25.setFont(new java.awt.Font("Roboto Light", 2, 17)); // NOI18N
        jLabel25.setText("Usuario:");
        jPanel2.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 340, -1, -1));

        btnadelante.setFont(new java.awt.Font("Roboto Light", 0, 16)); // NOI18N
        btnadelante.setText(">");
        btnadelante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnadelanteActionPerformed(evt);
            }
        });
        jPanel2.add(btnadelante, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 70, 57, 40));

        btnregistrar.setFont(new java.awt.Font("Roboto Light", 0, 16)); // NOI18N
        btnregistrar.setText("Registrar");
        btnregistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnregistrarActionPerformed(evt);
            }
        });
        jPanel2.add(btnregistrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 500, 120, 40));

        btnguardarCambios.setFont(new java.awt.Font("Roboto Light", 0, 16)); // NOI18N
        btnguardarCambios.setText("Guardar");
        btnguardarCambios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnguardarCambiosActionPerformed(evt);
            }
        });
        jPanel2.add(btnguardarCambios, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 430, 120, 40));

        txtuser.setEditable(false);
        txtuser.setFont(new java.awt.Font("Roboto Light", 0, 16)); // NOI18N
        txtuser.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel2.add(txtuser, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 330, 180, 30));

        txtpass.setEditable(false);
        txtpass.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel2.add(txtpass, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 370, 180, 30));

        btneditar1.setFont(new java.awt.Font("Roboto Light", 0, 16)); // NOI18N
        btneditar1.setText("EDITAR");
        btneditar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btneditar1ActionPerformed(evt);
            }
        });
        jPanel2.add(btneditar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 500, 110, 40));

        jTabbedPane1.addTab("Datos", jPanel2);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btndarDeBaja, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(bienvenido1, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 433, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jLabel2))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addComponent(bienvenido1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                .addComponent(btndarDeBaja, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 359, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnguardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnguardarActionPerformed


        if (!comprobarVacios()) {

            posicion = empleados.size();

            //variables para llenar arreglo
            int id = empleados.size() + 1;

            //llenar con constructor
            Empleado aux = new Empleado(cbxcargo.getSelectedItem().toString(), id, txtnombre.getText(), txttelefono.getText(), txtdni.getText(), txtuser.getText(), String.valueOf(txtpass.getText()));

            empleados.add(aux);

            llenarTabla(aux);

            // Desactivar y activar botones
            btnguardar.setVisible(false);
            btnregistrar.setEnabled(true);
            btnguardarCambios.setEnabled(true);

            mostrar();
            //escribir en datos en archivo;
            escribirEnArchivo(aux);

            ventanaError("Se registro al empleado correctamente", "verde");
            
            activarCampos(false);
            activarBotones(true);
            
        } else {
        
            ventanaError("Es necesario llenar los campos", "anaranjado");
        
        }
    }//GEN-LAST:event_btnguardarActionPerformed

    private void btnatrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnatrasActionPerformed
        if (posicion>0)
        {
            posicion--;
            mostrar();
        }
        else {
            
            ventanaError("Llegó al principio de la lista", "anaranjado");
        }
    }//GEN-LAST:event_btnatrasActionPerformed

    private void btnadelanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnadelanteActionPerformed
        if (posicion<empleados.size()-1)
        {
            posicion++;
            mostrar();
        }
        else 
        {
            ventanaError("Llegó al final de la lista", "anaranjado");
        }
    }//GEN-LAST:event_btnadelanteActionPerformed

    private void btnregistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnregistrarActionPerformed
        
        limpiar();
        btnguardar.setVisible(true);
        btnregistrar.setEnabled(false);
        btnguardarCambios.setEnabled(false);
        btneditar1.setEnabled(false);
        activarCampos(true);
        
    }//GEN-LAST:event_btnregistrarActionPerformed

    private void btnguardarCambiosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnguardarCambiosActionPerformed

        //Guardar cambios
        
        empleados.get(posicion).setNombre(txtnombre.getText());
        empleados.get(posicion).setDNI(txtdni.getText());
        empleados.get(posicion).setTeléfono(txttelefono.getText());
        empleados.get(posicion).setCargo(cbxcargo.getSelectedItem().toString());
        empleados.get(posicion).setUser(txtuser.getText());
        empleados.get(posicion).setPass(String.valueOf(txtpass.getText()));
        
        borrarCeldasTabla();
        
        try {
            //borrar y escribir en fichero 

            BufferedWriter bw = new BufferedWriter(new FileWriter(archivoEmpleados));
            bw.write("");

            for (int i = 0; i < empleados.size(); i++) {
                escribirEnArchivo(empleados.get(i));

                //actualizar tabla de empleados;
                llenarTabla(empleados.get(i));
            }
            bw.close();

            mostrar();

            ventanaError("Se efectuarón los cambios correctamente", "verde");
            
        } catch (IOException e) {
            System.err.println("" + e);
        }
        
        mostrar();
        activarCampos(false);
        activarBotones(true);
        
    }//GEN-LAST:event_btnguardarCambiosActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
       cbxcargo.addItem("administrador");
       cbxcargo.addItem("motorizado");
       cbxcargo.addItem("cocinero");
       cbxcargo.addItem("ayudante de cocina");
       
       btnguardar.setVisible(false);
       btnguardarCambios.setVisible(false);
       
       try {
            lectura();
        } catch (Exception e) {
            System.err.println("Datos no encontrados, se empezaran a escribir nuevos datos "+e);
        }
        activarCampos(false);

    }//GEN-LAST:event_formWindowOpened

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        //Calcular paga
        //Comprobamos si la tabla se encuentra vacia
        
        if (jtEmpleados.getSelectedRow()>-1){
            
            if (!comprobarCamposVacios()){
                txtsueldoNeto.setText(String.valueOf(empleados.get(jtEmpleados.getSelectedRow()).calcularSueldo(Double.parseDouble(txtdiasTrabajados.getText()), Double.parseDouble(txttardanzas.getText()))));
            } else {
                
                ventanaError("Es necesario llenar los campos", "anaranjado");
        
            }
            
        } else {
            
            ventanaError("Seleccione un empledo de la tabla", "anaranjado");
            
        }
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btndarDeBajaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndarDeBajaActionPerformed
        
        
        posicion = jtEmpleados.getSelectedRow();
        
        if (posicion > 0){
            
            if (empleados.size() > 1) {
                tablaEmpleados.removeRow(jtEmpleados.getSelectedRow());
                
                empleados.remove(posicion);

                borrarCeldasTabla();
                
                try {
                    //borrar y escribir en fichero 
                    BufferedWriter bw = new BufferedWriter(new FileWriter(archivoEmpleados));
                    bw.write("");
                    bw.close();
                } catch (IOException e) {
                    System.err.println("" + e);
                }              
                
                for (int i = 0; i < empleados.size(); i++) {
                    empleados.get(i).setId((i) + 1);
                    escribirEnArchivo(empleados.get(i));

                    //actualizar tabla de empleados;
                    llenarTabla(empleados.get(i));

                }
                
                posicion--;
                mostrar();
                
                ventanaError("Se eliminó al empleado", "anaranjado");
                
            } else {
                
            }
        
        } else {
            
            ventanaError("No es posible eliminar a este empleado", "rojo");
            
            mostrar();
        }
        
        
        

    }//GEN-LAST:event_btndarDeBajaActionPerformed

    private void btneditar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btneditar1ActionPerformed
        activarCampos(true);
        btnregistrar.setEnabled(false);
        btnguardarCambios.setVisible(true);
        btneditar1.setEnabled(false);
    }//GEN-LAST:event_btneditar1ActionPerformed

    private void formMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMousePressed
        //obtener posición de la ventana
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_formMousePressed

    private void formMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseDragged
        //mover ventana
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xMouse,y - yMouse);
    }//GEN-LAST:event_formMouseDragged

    public void limpiar ()
    {
        txtuser.setText(BLANCO);
        txtdni.setText(BLANCO);
        cbxcargo.setSelectedIndex(0);
        txtnombre.setText(BLANCO);
        txtpass.setText(BLANCO);
        txttelefono.setText(BLANCO);
        txtid.setText(BLANCO);
        txtposicion.setText(BLANCO);
   }
    
    
    
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
            java.util.logging.Logger.getLogger(FormularioEmpleados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormularioEmpleados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormularioEmpleados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormularioEmpleados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormularioEmpleados().setVisible(true);
            }
        });
    }
    
    public boolean comprobarVacios(){
        if (txtnombre.getText().isEmpty() && txtdni.getText().isEmpty() && txttelefono.getText().isEmpty() && txtuser.getText().isEmpty() && txtpass.getText().isEmpty()){
            return true;
        } else {
            return false;
        }
    }
    
    public boolean comprobarCamposVacios(){
        if (txtdiasTrabajados.getText().isEmpty() && txttardanzas.getText().isEmpty()){
            return true;
        } else {
            return false;
        }
    }
    
    
    public void ventanaError(String MENSAJE, String COLOR) {
        VentarraError actual = new VentarraError(MENSAJE, COLOR);
        actual.setVisible(true);
    }
    
    
    public void borrarCeldasTabla(){
        for (int i = tablaEmpleados.getRowCount() - 1; i >= 0; i--) {
            tablaEmpleados.removeRow(i);
        }
    }
    
    
    private void activarBotones(boolean activar){
        btneditar1.setEnabled(activar);
        btnregistrar.setEnabled(activar);
        btnguardar.setVisible(false);
        btnguardarCambios.setVisible(false);
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bienvenido1;
    private javax.swing.JLabel bienvenido2;
    private javax.swing.JLabel bienvenido3;
    private javax.swing.JButton btnadelante;
    private javax.swing.JButton btnatras;
    private javax.swing.JButton btndarDeBaja;
    private javax.swing.JButton btneditar1;
    private javax.swing.JButton btnguardar;
    private javax.swing.JButton btnguardarCambios;
    private javax.swing.JButton btnregistrar;
    private javax.swing.JComboBox<String> cbxcargo;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jtEmpleados;
    private javax.swing.JTextField txtdiasTrabajados;
    private javax.swing.JTextField txtdni;
    private javax.swing.JTextField txtid;
    private javax.swing.JTextField txtnombre;
    private javax.swing.JPasswordField txtpass;
    private javax.swing.JTextField txtposicion;
    private javax.swing.JTextField txtsueldoNeto;
    private javax.swing.JTextField txttardanzas;
    private javax.swing.JTextField txttelefono;
    private javax.swing.JTextField txtuser;
    // End of variables declaration//GEN-END:variables



    private void mostrar() {
        Empleado aux = new Empleado();
        aux = empleados.get(posicion);
        txtnombre.setText(aux.getNombre());
        txtdni.setText(aux.getDNI());
        txttelefono.setText(aux.getTeléfono());
        cbxcargo.setSelectedItem(aux.getCargo());
        txtuser.setText(aux.getUser());
        txtpass.setText(aux.getPass());
        txtid.setText(String.valueOf(aux.getId()));
        txtposicion.setText("Empleado "+String.valueOf(posicion+1)+" de "+empleados.size());
  }

    private void escribirEnArchivo(Empleado aux) 
    {
        String linea;
        try 
        {
            FileWriter escritura = new FileWriter(archivo, true);
            PrintWriter escribir = new PrintWriter(escritura);
            linea = (aux.getUser()+"-"+aux.getPass()+"-"+aux.getNombre()+"-"+aux.getTeléfono()+"-"+aux.getDNI()+"-"+aux.getCargo()+"-"+String.valueOf(aux.getId())+"-");
            escribir.println(linea);
            escritura.close();
        } catch (IOException e) 
        {
            System.out.println("Hay un error en escribir el archivo");
        }
    }

    private void lectura() 
    {
        String linea;
        int lnuser, lnpass, lnnombre, lnnumero, lndni, lncargo, lnid;
        try
        {
            FileReader lectura = new FileReader(archivo);
            BufferedReader leer = new BufferedReader(lectura);
            linea = leer.readLine();
            
            while (linea != null) {                
                lnuser = linea.indexOf("-", 0);
                lnpass = linea.indexOf("-", lnuser + 1);
                lnnombre = linea.indexOf("-", lnpass + 1);
                lnnumero = linea.indexOf("-", lnnombre + 1);
                lndni = linea.indexOf("-", lnnumero + 1);
                lncargo = linea.indexOf("-", lndni + 1);
                lnid = linea.indexOf("-", lncargo + 1);
                
                //llenar Array empleado
                Empleado aux = new Empleado();
                
                aux.setUser(linea.substring(0, lnuser));
                aux.setPass(linea.substring(lnuser + 1, lnpass));
                aux.setNombre(linea.substring(lnpass + 1, lnnombre));
                aux.setTeléfono(linea.substring(lnnombre + 1, lnnumero));
                aux.setDNI(linea.substring(lnnumero + 1, lndni));
                aux.setCargo((linea.substring(lndni + 1, lncargo)));
                aux.setId(Integer.parseInt(linea.substring(lncargo + 1, lnid)));
                empleados.add(aux);
                linea = leer.readLine();
                
                llenarTabla(aux);
            }
            lectura.close();
            mostrar();
        } catch(IOException ex){
            JOptionPane.showMessageDialog(null, ex);
        }
    }

    private void llenarTabla(Empleado aux) {
        //mostrar en tabla.
        String datos[] = new String[6];
        datos[0] = aux.getNombre();
        datos[1] = aux.getDNI();
        datos[2] = aux.getTeléfono();
        datos[3] = aux.getCargo();
        datos[4] = String.valueOf(aux.getId());
        tablaEmpleados.addRow(datos);
    }

    private void activarCampos(boolean editable) {
        txtnombre.setEditable(editable);
        txtdni.setEditable(editable);
        txttelefono.setEditable(editable);
        txtuser.setEditable(editable);
        txtpass.setEditable(editable);
    }
}



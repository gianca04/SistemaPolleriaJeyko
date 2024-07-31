
package formularios;
import Clases.Empleado;
import java.awt.Color;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Login extends javax.swing.JFrame {

    String archivoEmpleados = "empleados.txt";
    File archivo = new File(archivoEmpleados); 
    
    //mover ventana
    int xMouse, yMouse;
    
    private String cargo;
    private String nombre;
    
    private final String  BLANCO="";
    private final String MENSAJEUSUARIO="Introduzca su usuario";
    private final String MENSAJEPASS="12345";
    
     public Login() {
        setUndecorated(true);                   //Eliminar bordes
        setBackground(new Color(0, 0, 0, 0));
        this.setLocationRelativeTo(null);
        
        initComponents();
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        btnacceder = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtuser = new javax.swing.JTextField();
        txtpass = new javax.swing.JPasswordField();
        jpsalir = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jlpolloFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
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
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnacceder.setBackground(new java.awt.Color(204, 204, 204));
        btnacceder.setFont(new java.awt.Font("Roboto Light", 0, 18)); // NOI18N
        btnacceder.setText("Ingresar");
        btnacceder.setBorderPainted(false);
        btnacceder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnaccederActionPerformed(evt);
            }
        });
        jPanel3.add(btnacceder, new org.netbeans.lib.awtextra.AbsoluteConstraints(123, 315, 154, 40));

        jLabel1.setFont(new java.awt.Font("Roboto Black", 0, 36)); // NOI18N
        jLabel1.setText("Bienvenido");
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, -1, 41));

        jLabel2.setFont(new java.awt.Font("Roboto Light", 0, 16)); // NOI18N
        jLabel2.setText("Es necesario ingresar los datos proporcionados");
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, -1, -1));

        txtuser.setFont(new java.awt.Font("Roboto Light", 2, 18)); // NOI18N
        txtuser.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtuser.setText("Introduzca su usuario");
        txtuser.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        txtuser.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                txtuserMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                txtuserMouseExited(evt);
            }
        });
        jPanel3.add(txtuser, new org.netbeans.lib.awtextra.AbsoluteConstraints(114, 171, 195, 36));

        txtpass.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtpass.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtpass.setText("12345");
        txtpass.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        txtpass.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                txtpassMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                txtpassMouseExited(evt);
            }
        });
        jPanel3.add(txtpass, new org.netbeans.lib.awtextra.AbsoluteConstraints(114, 239, 195, 36));

        jpsalir.setBackground(new java.awt.Color(255, 255, 255));
        jpsalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jpsalirMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jpsalirMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jpsalirMouseExited(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Roboto Medium", 0, 24)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("X");

        javax.swing.GroupLayout jpsalirLayout = new javax.swing.GroupLayout(jpsalir);
        jpsalir.setLayout(jpsalirLayout);
        jpsalirLayout.setHorizontalGroup(
            jpsalirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );
        jpsalirLayout.setVerticalGroup(
            jpsalirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpsalirLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel3.add(jpsalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 0, 40, -1));

        jLabel6.setFont(new java.awt.Font("Roboto Light", 0, 11)); // NOI18N
        jLabel6.setText("@Grupo_07");
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 380, -1, -1));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 40, 390, 420));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/PicsArt_10-25-01.43.59.png"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        jlpolloFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/fondoPolloalabra.jpg"))); // NOI18N
        getContentPane().add(jlpolloFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(-50, 30, 710, 550));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnaccederActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnaccederActionPerformed
        //comprobamos sí los campos estan llenos
        if (!txtuser.getText().equals(MENSAJEUSUARIO) || !txtpass.getText().equals(MENSAJEPASS)) {
            
            //Llamamos al metodo booleanos enviando parametros
            if (validarUsuario(txtuser.getText(), String.valueOf(txtpass.getText()))) {
                
                //Sí se logra complicar
                
                VentanaMenuOpciones actual = new VentanaMenuOpciones(nombre, cargo);
                actual.setVisible(true);
                this.dispose();
                
            } else {
                ventanaError("Usuario o contraseña no encontrado", "rojo");
                vaciarCampos();
            }
        } else {
            ventanaError("Es necesario llenar los campos", "anaranjado");
            vaciarCampos();
        }
    }//GEN-LAST:event_btnaccederActionPerformed

    private void txtuserMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtuserMouseEntered
        if (txtuser.getText().equals(MENSAJEUSUARIO)){
            txtuser.setText(BLANCO);
        } else {
        }
    }//GEN-LAST:event_txtuserMouseEntered

    private void txtuserMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtuserMouseExited
        if (estaVacio()){
            txtuser.setText(MENSAJEUSUARIO);
        } else{
        }
    }//GEN-LAST:event_txtuserMouseExited

    private void txtpassMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtpassMouseEntered
        if (txtpass.getText().equals(MENSAJEPASS)){
            txtpass.setText(BLANCO);
        } else {
        }
    }//GEN-LAST:event_txtpassMouseEntered

    private void txtpassMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtpassMouseExited
        if (estaVacio()){
            txtpass.setText(MENSAJEPASS);
        } else{
        }
    }//GEN-LAST:event_txtpassMouseExited

    private void jpsalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpsalirMouseClicked
        System.exit(0);
    }//GEN-LAST:event_jpsalirMouseClicked

    private void jpsalirMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpsalirMouseEntered
        jpsalir.setBackground(new Color(232, 0, 0));
    }//GEN-LAST:event_jpsalirMouseEntered

    private void jpsalirMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpsalirMouseExited
        jpsalir.setBackground(new java.awt.Color(255, 255, 255));
    }//GEN-LAST:event_jpsalirMouseExited

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }
        
    public boolean estaVacio(){
        if (txtuser.getText().isEmpty() || txtpass.getText().isEmpty() ){
            return true;
        }else{
            return false;
        }
    }
    
    public void vaciarCampos(){
        txtpass.setText(MENSAJEPASS);
        txtuser.setText(MENSAJEUSUARIO);
    }
    
    public void ventanaError(String MENSAJE, String COLOR) {
        VentarraError actual = new VentarraError(MENSAJE, COLOR);
        actual.setVisible(true);
    }
    
    private boolean validarUsuario(String campoUsuario, String campoContraseña) {
        
        boolean acceder = false;
        
        //Leemos los datos fichero empleados
        String linea, contraseña, usuario, nombre, cargo;
        
        int lnuser, lnpass, lnnombre, lnnumero, lndni, lncargo, lnid;
        
        try {
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

                usuario = (linea.substring(0, lnuser));
                contraseña = (linea.substring(lnuser + 1, lnpass));
                nombre = (linea.substring(lnpass + 1, lnnombre));
                cargo = ((linea.substring(lndni + 1, lncargo)));
                linea = leer.readLine();

                //validamos si las campos coninciden con las linas
                if (campoContraseña.equals(contraseña) && campoUsuario.equals(usuario)) {
                    this.nombre = nombre;
                    this.cargo = cargo;
                    
                    //terminamos el bucle
                    linea = null;
                    
                    acceder = true;
                    return acceder;
                
                } else {
                
                }
                
            }
            acceder = false;
            lectura.close();
        } catch (IOException ex) {
            ventanaError("Error critico", "rojo");
            System.err.println("Excepption encontrada al leer"+ex);
        }
        return acceder;
    }
    
 
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnacceder;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel jlpolloFondo;
    private javax.swing.JPanel jpsalir;
    private javax.swing.JPasswordField txtpass;
    private javax.swing.JTextField txtuser;
    // End of variables declaration//GEN-END:variables
}

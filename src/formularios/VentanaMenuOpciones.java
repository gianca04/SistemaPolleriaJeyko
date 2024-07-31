
package formularios;

import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class VentanaMenuOpciones extends javax.swing.JFrame {

    //mover ventana
    int xMouse, yMouse;
    

    //Datos 
    final private String NOMBRE;
    final private String CARGO;
    
    public int ventanaAbierta = 0;
    
    //formularios:
    FormularioEmpleados formularioEmpleados; 
    FormularioVentayRegistro fVentaRegistro;
    VisualizarPedidosLocal fPedidosLocal;
    VisualizarPedidosDelivery fPedidosDelivery;
    
    public VentanaMenuOpciones(String NOMBRE, String CARGO) {
        
        this.NOMBRE = NOMBRE;
        this.CARGO = CARGO;
        
        setUndecorated(true);
        this.setBackground(new Color(0 , 0 , 0, 0));
        
        initComponents();
        this.setLocationRelativeTo(null);
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        txtnombreEmpleado = new javax.swing.JTextField();
        txtcargo = new javax.swing.JTextField();
        bienvenido = new javax.swing.JLabel();
        btnnuevaVenta = new javax.swing.JPanel();
        jlnuevaVenta = new javax.swing.JLabel();
        btnpedidosLocal = new javax.swing.JPanel();
        jlvisualizarPedidosL = new javax.swing.JLabel();
        btnadministrarEmpleados = new javax.swing.JPanel();
        jladministrarEmpleados = new javax.swing.JLabel();
        btnpedidosDelivery = new javax.swing.JPanel();
        jlvisualizarPedidosD = new javax.swing.JLabel();
        btnsalir = new javax.swing.JButton();
        jpsalir = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();

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
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        txtnombreEmpleado.setEditable(false);
        txtnombreEmpleado.setBackground(new java.awt.Color(255, 255, 255));
        txtnombreEmpleado.setFont(new java.awt.Font("Roboto Light", 2, 20)); // NOI18N
        txtnombreEmpleado.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
        txtnombreEmpleado.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 2, 0, 0, new java.awt.Color(204, 153, 0)));

        txtcargo.setEditable(false);
        txtcargo.setBackground(new java.awt.Color(255, 255, 255));
        txtcargo.setFont(new java.awt.Font("Roboto Light", 2, 15)); // NOI18N
        txtcargo.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
        txtcargo.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 2, 0, 0, new java.awt.Color(204, 153, 0)));

        bienvenido.setFont(new java.awt.Font("Roboto Black", 0, 40)); // NOI18N
        bienvenido.setText("Bienvenido");

        btnnuevaVenta.setBackground(new java.awt.Color(255, 255, 255));
        btnnuevaVenta.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 2, 0, 0, new java.awt.Color(255, 255, 255)));
        btnnuevaVenta.setForeground(new java.awt.Color(204, 204, 204));
        btnnuevaVenta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnnuevaVentabtnadministarEmpleados1MouseClicked(evt);
            }
        });

        jlnuevaVenta.setBackground(new java.awt.Color(255, 255, 255));
        jlnuevaVenta.setFont(new java.awt.Font("Roboto", 0, 20)); // NOI18N
        jlnuevaVenta.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlnuevaVenta.setText("Nueva venta");

        javax.swing.GroupLayout btnnuevaVentaLayout = new javax.swing.GroupLayout(btnnuevaVenta);
        btnnuevaVenta.setLayout(btnnuevaVentaLayout);
        btnnuevaVentaLayout.setHorizontalGroup(
            btnnuevaVentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnnuevaVentaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlnuevaVenta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        btnnuevaVentaLayout.setVerticalGroup(
            btnnuevaVentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnnuevaVentaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlnuevaVenta)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnpedidosLocal.setBackground(new java.awt.Color(255, 255, 255));
        btnpedidosLocal.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 2, 0, 0, new java.awt.Color(255, 255, 255)));
        btnpedidosLocal.setForeground(new java.awt.Color(204, 204, 204));
        btnpedidosLocal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnpedidosLocalbtnadministarEmpleados1MouseClicked(evt);
            }
        });

        jlvisualizarPedidosL.setBackground(new java.awt.Color(255, 255, 255));
        jlvisualizarPedidosL.setFont(new java.awt.Font("Roboto", 0, 20)); // NOI18N
        jlvisualizarPedidosL.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlvisualizarPedidosL.setText("Pedidos en local");

        javax.swing.GroupLayout btnpedidosLocalLayout = new javax.swing.GroupLayout(btnpedidosLocal);
        btnpedidosLocal.setLayout(btnpedidosLocalLayout);
        btnpedidosLocalLayout.setHorizontalGroup(
            btnpedidosLocalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnpedidosLocalLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlvisualizarPedidosL, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        btnpedidosLocalLayout.setVerticalGroup(
            btnpedidosLocalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnpedidosLocalLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jlvisualizarPedidosL)
                .addContainerGap())
        );

        btnadministrarEmpleados.setBackground(new java.awt.Color(255, 255, 255));
        btnadministrarEmpleados.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 2, 0, 0, new java.awt.Color(255, 255, 255)));
        btnadministrarEmpleados.setForeground(new java.awt.Color(204, 204, 204));
        btnadministrarEmpleados.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnadministrarEmpleadosMouseClicked1(evt);
            }
        });

        jladministrarEmpleados.setBackground(new java.awt.Color(255, 255, 255));
        jladministrarEmpleados.setFont(new java.awt.Font("Roboto", 0, 20)); // NOI18N
        jladministrarEmpleados.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jladministrarEmpleados.setText("Administrar empleados");

        javax.swing.GroupLayout btnadministrarEmpleadosLayout = new javax.swing.GroupLayout(btnadministrarEmpleados);
        btnadministrarEmpleados.setLayout(btnadministrarEmpleadosLayout);
        btnadministrarEmpleadosLayout.setHorizontalGroup(
            btnadministrarEmpleadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnadministrarEmpleadosLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jladministrarEmpleados, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        btnadministrarEmpleadosLayout.setVerticalGroup(
            btnadministrarEmpleadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnadministrarEmpleadosLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jladministrarEmpleados)
                .addContainerGap())
        );

        btnpedidosDelivery.setBackground(new java.awt.Color(255, 255, 255));
        btnpedidosDelivery.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 2, 0, 0, new java.awt.Color(255, 255, 255)));
        btnpedidosDelivery.setForeground(new java.awt.Color(204, 204, 204));
        btnpedidosDelivery.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnpedidosDeliveryMouseClicked(evt);
            }
        });

        jlvisualizarPedidosD.setBackground(new java.awt.Color(255, 255, 255));
        jlvisualizarPedidosD.setFont(new java.awt.Font("Roboto", 0, 20)); // NOI18N
        jlvisualizarPedidosD.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlvisualizarPedidosD.setText("Pedidos en Delivery");

        javax.swing.GroupLayout btnpedidosDeliveryLayout = new javax.swing.GroupLayout(btnpedidosDelivery);
        btnpedidosDelivery.setLayout(btnpedidosDeliveryLayout);
        btnpedidosDeliveryLayout.setHorizontalGroup(
            btnpedidosDeliveryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnpedidosDeliveryLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlvisualizarPedidosD, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        btnpedidosDeliveryLayout.setVerticalGroup(
            btnpedidosDeliveryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnpedidosDeliveryLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jlvisualizarPedidosD)
                .addContainerGap())
        );

        btnsalir.setBackground(new java.awt.Color(204, 204, 0));
        btnsalir.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        btnsalir.setText("Cerrar");
        btnsalir.setBorder(null);
        btnsalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsalirActionPerformed(evt);
            }
        });

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
        jLabel7.setText("salir");

        javax.swing.GroupLayout jpsalirLayout = new javax.swing.GroupLayout(jpsalir);
        jpsalir.setLayout(jpsalirLayout);
        jpsalirLayout.setHorizontalGroup(
            jpsalirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 121, Short.MAX_VALUE)
        );
        jpsalirLayout.setVerticalGroup(
            jpsalirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpsalirLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel7)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bienvenido, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtnombreEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtcargo, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(btnpedidosLocal, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 281, Short.MAX_VALUE)
                        .addComponent(btnnuevaVenta, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnsalir, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jpsalir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnpedidosDelivery, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnadministrarEmpleados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(bienvenido)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtnombreEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtcargo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 156, Short.MAX_VALUE)
                .addComponent(btnnuevaVenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnpedidosLocal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnpedidosDelivery, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnadministrarEmpleados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnsalir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jpsalir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(23, 23, 23))
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

    private void btnnuevaVentabtnadministarEmpleados1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnnuevaVentabtnadministarEmpleados1MouseClicked
        //Pintar los paneles como por defecto
        paintpanelesDefault();
        
        //pintar los paneles de naranja
        paintSeletecOranje(btnnuevaVenta, jlnuevaVenta);

        cerrarVentanas();
        
        //mandamos un int para conocer la ventana que tenemos abierta
        ventanaAbierta = 1;
        
        fVentaRegistro = new FormularioVentayRegistro();
        fVentaRegistro.setVisible(true);
    }//GEN-LAST:event_btnnuevaVentabtnadministarEmpleados1MouseClicked

    private void btnpedidosLocalbtnadministarEmpleados1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnpedidosLocalbtnadministarEmpleados1MouseClicked
        paintpanelesDefault();
        paintSeletecOranje(btnpedidosLocal, jlvisualizarPedidosL);

        cerrarVentanas();
        ventanaAbierta = 2;
        
        fPedidosLocal = new VisualizarPedidosLocal();
        fPedidosLocal.setVisible(true);
    }//GEN-LAST:event_btnpedidosLocalbtnadministarEmpleados1MouseClicked

    private void btnadministrarEmpleadosMouseClicked1(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnadministrarEmpleadosMouseClicked1
        paintpanelesDefault();
        paintSeletecOranje(btnadministrarEmpleados, jladministrarEmpleados);

        cerrarVentanas();
        ventanaAbierta = 4;

        formularioEmpleados = new FormularioEmpleados();
        formularioEmpleados.setVisible(true);

    }//GEN-LAST:event_btnadministrarEmpleadosMouseClicked1

    private void btnpedidosDeliveryMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnpedidosDeliveryMouseClicked
        paintpanelesDefault();
        paintSeletecOranje(btnpedidosDelivery, jlvisualizarPedidosD);

        cerrarVentanas();
        ventanaAbierta = 3;
        
        fPedidosDelivery = new VisualizarPedidosDelivery();
        fPedidosDelivery.setVisible(true);
    }//GEN-LAST:event_btnpedidosDeliveryMouseClicked

    private void btnsalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsalirActionPerformed
       cerrarVentanas();
        Login login = new Login();
        login.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnsalirActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        txtcargo.setText(CARGO);
        txtnombreEmpleado.setText(NOMBRE);
        paintpanelesDefault();
        
        //activa las opcione segun el tipo de usuario
        activarBotones();
    }//GEN-LAST:event_formWindowOpened

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

    private void jpsalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpsalirMouseClicked
        System.exit(0);
    }//GEN-LAST:event_jpsalirMouseClicked

    private void jpsalirMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpsalirMouseEntered
        jpsalir.setBackground(new Color(232, 0, 0));
    }//GEN-LAST:event_jpsalirMouseEntered

    private void jpsalirMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpsalirMouseExited
        jpsalir.setBackground(new java.awt.Color(255, 255, 255));
    }//GEN-LAST:event_jpsalirMouseExited

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bienvenido;
    private javax.swing.JPanel btnadministrarEmpleados;
    private javax.swing.JPanel btnnuevaVenta;
    private javax.swing.JPanel btnpedidosDelivery;
    private javax.swing.JPanel btnpedidosLocal;
    private javax.swing.JButton btnsalir;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel jladministrarEmpleados;
    private javax.swing.JLabel jlnuevaVenta;
    private javax.swing.JLabel jlvisualizarPedidosD;
    private javax.swing.JLabel jlvisualizarPedidosL;
    private javax.swing.JPanel jpsalir;
    private javax.swing.JTextField txtcargo;
    private javax.swing.JTextField txtnombreEmpleado;
    // End of variables declaration//GEN-END:variables

//metodos

    //ubircar pantalla
    private void ubicarPantalla(){
        this.setLocation(100, 100);
    }
    
    
    //Se le asignara una variable int para saber cual es la ventana abierta
    private void cerrarVentanas() {
        switch (ventanaAbierta) {
            case 0:
                break;
            case 1:
                fVentaRegistro.dispose();
                break;
            case 2:
                fPedidosLocal.dispose();
                break;
            case 3:
                fPedidosDelivery.dispose();
                break;
            case 4:
                formularioEmpleados.dispose();
                break;
                
            default:
                break;
        }
    }

    private void desactivarOActivarBotones(JLabel jlabel, JPanel jpanel, boolean condicion) {
        jlabel.setVisible(condicion);
        jpanel.setVisible(condicion);
    }

    private void activarBotones() {
        //Hacer visibles los botones dependiendo del cargo
        switch (CARGO) {

            case "ayudante de cocina":

                desactivarOActivarBotones(jladministrarEmpleados, btnadministrarEmpleados, false);

                break;

            case "motorizado":

                desactivarOActivarBotones(jlnuevaVenta, btnnuevaVenta, false);
                
                desactivarOActivarBotones(jlvisualizarPedidosL, btnpedidosLocal, false);
                desactivarOActivarBotones(jladministrarEmpleados, btnadministrarEmpleados, false);

                break;

            case "cocinero":

                desactivarOActivarBotones(jladministrarEmpleados, btnadministrarEmpleados, false);

            default:
                break;
        }
    }

    //pintar botones en gris y sin borde izquierdo.
    private void paintpanelesDefault() {

        //nueva venta boton
        jlnuevaVenta.setEnabled(false);
        btnnuevaVenta.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 3, 0, 0, new java.awt.Color(250, 250, 250)));

        //visualizar pedidos Local.
        jlvisualizarPedidosL.setEnabled(false);
        btnpedidosLocal.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 3, 0, 0, new java.awt.Color(250, 250, 250)));

        //Pedidos delivery
        jlvisualizarPedidosD.setEnabled(false);
        btnpedidosDelivery.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 3, 0, 0, new java.awt.Color(250, 250, 250)));

        //administrar empleados botón.
        jladministrarEmpleados.setEnabled(false);
        btnadministrarEmpleados.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 3, 0, 0, new java.awt.Color(250, 250, 250)));

    }

    //pintar el borde del panel presionado y la fuente de negro.
    private void paintSeletecOranje(JPanel panel, JLabel textoBoton) {
        textoBoton.setEnabled(true);
        panel.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 3, 0, 0, new java.awt.Color(204, 153, 0)));
        this.ubicarPantalla();
    }


}

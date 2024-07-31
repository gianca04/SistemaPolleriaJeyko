
package formularios;

import java.util.ArrayList;
import java.io.*;
import Clases.Cliente;
import Clases.Empleado;
import Clases.Producto;
import javax.swing.table.DefaultTableModel;


public class FormularioVentayRegistro extends javax.swing.JFrame {
    
    //Creamos un archivo para los pedidos realizados en el local
    String archivoPedidosLocal = "pedidosLocal.txt";
    File archivoL = new File(archivoPedidosLocal); 
    
    //Creamos un archivo para los pedidos en Delivery
    String archivoPedidosDelivery = "pedidosDelivery.txt";
    File archivoD = new File(archivoPedidosDelivery); 
    
    //Para conocer que tipo de pedido es
    String tipoPedido;
    
    //Creamos un cliente vacio
    Cliente cliente = new Cliente(); 
    
    
    ArrayList<Producto> productos = new ArrayList();
    
    double cantidad = 0;
    
    int menu;
    
    
    //productos
    Producto polloEntero = new Producto("Pollo entero", 1, 45);
    Producto medioPollo = new Producto("1/2 de Pollo", 2, 24.50);
    Producto unCuarto = new Producto("1/4 de Pollo", 3, 12);
    Producto mostrito = new Producto("Mostrito", 4, 10);
    Producto mollejasParrilla = new Producto("Mollejas a la parrilla", 0, 8);
    
    DefaultTableModel tablaProductos = new DefaultTableModel();
    
    public FormularioVentayRegistro() {
        
        initComponents();
        
        this.setLocation(430, 50);
        String titulos[] = {"NOMBRE", "PRECIO U", "CANTIDAD", "PRECIO NETO"};
        tablaProductos.setColumnIdentifiers(titulos);
        jtpedidos.setModel(tablaProductos);
        //jPANELES DEL MENÚ
        
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        btnmedioPollo = new javax.swing.JButton();
        btnunCuarto = new javax.swing.JButton();
        btnpolloentero = new javax.swing.JButton();
        btnmollejas = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtpedidos = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        btndisminuir = new javax.swing.JButton();
        txtdireccion = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        txtnombre = new javax.swing.JTextField();
        txttelefono = new javax.swing.JTextField();
        txtdni = new javax.swing.JTextField();
        bienvenido2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txttotal = new javax.swing.JTextField();
        txtcantida = new javax.swing.JTextField();
        btnagregar = new javax.swing.JButton();
        btnmostrito = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        bienvenido3 = new javax.swing.JLabel();
        bienvenido4 = new javax.swing.JLabel();
        bienvenido5 = new javax.swing.JLabel();
        bienvenido6 = new javax.swing.JLabel();
        bienvenido7 = new javax.swing.JLabel();
        jButton10 = new javax.swing.JButton();
        btnaumentar = new javax.swing.JButton();
        jLabel20 = new javax.swing.JLabel();
        btneliminar = new javax.swing.JButton();
        btnrealizarPedido = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/PicsArt_10-25-01.43.59.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, -1, -1));

        btnmedioPollo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/unmedio.jpg"))); // NOI18N
        btnmedioPollo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmedioPolloActionPerformed(evt);
            }
        });
        getContentPane().add(btnmedioPollo, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 410, 170, 170));

        btnunCuarto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/uncuarto.jpg"))); // NOI18N
        btnunCuarto.setBorder(null);
        btnunCuarto.setBorderPainted(false);
        btnunCuarto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnunCuartoActionPerformed(evt);
            }
        });
        getContentPane().add(btnunCuarto, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 410, 160, 170));

        btnpolloentero.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/1 pollo.jpg"))); // NOI18N
        btnpolloentero.setBorder(null);
        btnpolloentero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnpolloenteroActionPerformed(evt);
            }
        });
        getContentPane().add(btnpolloentero, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 410, 160, 170));

        btnmollejas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/5-mollejitas.jpg"))); // NOI18N
        btnmollejas.setBorder(null);
        btnmollejas.setBorderPainted(false);
        btnmollejas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmollejasActionPerformed(evt);
            }
        });
        getContentPane().add(btnmollejas, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 410, 190, -1));

        jtpedidos.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jtpedidos);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 20, 490, 290));
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, -1, -1));

        btndisminuir.setFont(new java.awt.Font("Roboto Light", 0, 16)); // NOI18N
        btndisminuir.setText("-");
        btndisminuir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndisminuirActionPerformed(evt);
            }
        });
        getContentPane().add(btndisminuir, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 330, 50, 40));

        txtdireccion.setFont(new java.awt.Font("Roboto Light", 0, 16)); // NOI18N
        txtdireccion.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(txtdireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 270, 140, 30));

        jLabel16.setBackground(new java.awt.Color(0, 0, 0));
        jLabel16.setFont(new java.awt.Font("Roboto Light", 2, 17)); // NOI18N
        jLabel16.setText("Teléfono:");
        getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 240, -1, -1));

        jLabel17.setBackground(new java.awt.Color(0, 0, 0));
        jLabel17.setFont(new java.awt.Font("Roboto Light", 2, 17)); // NOI18N
        jLabel17.setText("Dirección:");
        getContentPane().add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 240, -1, -1));

        jLabel18.setBackground(new java.awt.Color(0, 0, 0));
        jLabel18.setFont(new java.awt.Font("Roboto Light", 2, 17)); // NOI18N
        jLabel18.setText("Nombre:");
        getContentPane().add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, -1, -1));

        jLabel19.setBackground(new java.awt.Color(0, 0, 0));
        jLabel19.setFont(new java.awt.Font("Roboto Light", 2, 17)); // NOI18N
        jLabel19.setText("Total:");
        getContentPane().add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 340, -1, -1));

        txtnombre.setFont(new java.awt.Font("Roboto Light", 0, 16)); // NOI18N
        txtnombre.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(txtnombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 190, 140, 30));

        txttelefono.setFont(new java.awt.Font("Roboto Light", 0, 16)); // NOI18N
        txttelefono.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(txttelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 270, 140, 30));

        txtdni.setFont(new java.awt.Font("Roboto Light", 0, 16)); // NOI18N
        txtdni.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(txtdni, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 190, 140, 30));

        bienvenido2.setFont(new java.awt.Font("Roboto Black", 0, 18)); // NOI18N
        bienvenido2.setText("s/. 8.00");
        getContentPane().add(bienvenido2, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 610, 80, -1));

        jLabel3.setFont(new java.awt.Font("Roboto Light", 0, 16)); // NOI18N
        jLabel3.setText("Mollejas a la parrilla");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 590, -1, -1));

        txttotal.setFont(new java.awt.Font("Roboto Light", 0, 16)); // NOI18N
        txttotal.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(txttotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 330, 100, 40));

        txtcantida.setFont(new java.awt.Font("Roboto Light", 0, 16)); // NOI18N
        txtcantida.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtcantida.setText("0");
        getContentPane().add(txtcantida, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 330, 50, 40));

        btnagregar.setFont(new java.awt.Font("Roboto Light", 0, 16)); // NOI18N
        btnagregar.setText("Agregar");
        btnagregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnagregarActionPerformed(evt);
            }
        });
        getContentPane().add(btnagregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 330, 110, 40));

        btnmostrito.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/mostrito (1).jpg"))); // NOI18N
        btnmostrito.setBorder(null);
        btnmostrito.setBorderPainted(false);
        btnmostrito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmostritoActionPerformed(evt);
            }
        });
        getContentPane().add(btnmostrito, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 410, -1, -1));

        jLabel4.setFont(new java.awt.Font("Roboto Light", 0, 16)); // NOI18N
        jLabel4.setText("Ingrese los datos del cliente");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 90, -1, -1));

        jLabel5.setFont(new java.awt.Font("Roboto Light", 0, 16)); // NOI18N
        jLabel5.setText("Pollo entero");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 590, -1, -1));

        jLabel6.setFont(new java.awt.Font("Roboto Light", 0, 16)); // NOI18N
        jLabel6.setText("1/2 Pollo");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 590, -1, -1));

        jLabel7.setFont(new java.awt.Font("Roboto Light", 0, 16)); // NOI18N
        jLabel7.setText("1/4 de pollo");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 590, -1, -1));

        jLabel8.setFont(new java.awt.Font("Roboto Light", 0, 16)); // NOI18N
        jLabel8.setText("Mostrito");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 590, -1, -1));

        bienvenido3.setFont(new java.awt.Font("Roboto Black", 0, 30)); // NOI18N
        bienvenido3.setText("Nueva venta");
        getContentPane().add(bienvenido3, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 50, 187, -1));

        bienvenido4.setFont(new java.awt.Font("Roboto Black", 0, 18)); // NOI18N
        bienvenido4.setText("s/. 45.00");
        getContentPane().add(bienvenido4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 610, 80, -1));

        bienvenido5.setFont(new java.awt.Font("Roboto Black", 0, 18)); // NOI18N
        bienvenido5.setText("s/. 22.50");
        getContentPane().add(bienvenido5, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 610, 80, -1));

        bienvenido6.setFont(new java.awt.Font("Roboto Black", 0, 18)); // NOI18N
        bienvenido6.setText("s/. 12.00");
        getContentPane().add(bienvenido6, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 610, 80, -1));

        bienvenido7.setFont(new java.awt.Font("Roboto Black", 0, 18)); // NOI18N
        bienvenido7.setText("s/. 10.00");
        getContentPane().add(bienvenido7, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 610, 80, -1));

        jButton10.setFont(new java.awt.Font("Roboto Light", 0, 16)); // NOI18N
        jButton10.setText("Registrar datos");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton10, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 330, -1, 40));

        btnaumentar.setFont(new java.awt.Font("Roboto Light", 0, 16)); // NOI18N
        btnaumentar.setText("+");
        btnaumentar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnaumentarActionPerformed(evt);
            }
        });
        getContentPane().add(btnaumentar, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 330, 50, 40));

        jLabel20.setBackground(new java.awt.Color(0, 0, 0));
        jLabel20.setFont(new java.awt.Font("Roboto Light", 2, 17)); // NOI18N
        jLabel20.setText("DNI:");
        getContentPane().add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 160, -1, -1));

        btneliminar.setFont(new java.awt.Font("Roboto Light", 0, 16)); // NOI18N
        btneliminar.setText("Eliminar");
        btneliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btneliminarActionPerformed(evt);
            }
        });
        getContentPane().add(btneliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 330, 110, 40));

        btnrealizarPedido.setFont(new java.awt.Font("Roboto Light", 0, 16)); // NOI18N
        btnrealizarPedido.setText("Realizar pedido");
        btnrealizarPedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnrealizarPedidoActionPerformed(evt);
            }
        });
        getContentPane().add(btnrealizarPedido, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 650, 150, 40));

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        activarBotones(false);
        activarBotonesCompra(false);
    }//GEN-LAST:event_formWindowOpened

    private void btnmedioPolloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmedioPolloActionPerformed
        menu = 1;
        activarBotonesCompra(true);
    }//GEN-LAST:event_btnmedioPolloActionPerformed

    private void btndisminuirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndisminuirActionPerformed
        if (cantidad>0){
            cantidad--;
            txtcantida.setText(String.valueOf(cantidad));
        } else {
            
        }
    }//GEN-LAST:event_btndisminuirActionPerformed

    private void btnagregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnagregarActionPerformed
        
        //validamos que eligan como minimo un producto
        
        if (cantidad > 0){
            
            txtcantida.setText(String.valueOf(cantidad));
            switch (menu) {
                case 0:
                    
                    //añadimos al arreglo;
                    agregarProducto(polloEntero);
                    
                    //desactivamos botones
                    activarBotonesCompra(false);
                    
                    ventanaError("Se agregó el producto", "verde");
                    break;
                case 1:
                    agregarProducto(medioPollo);
                    activarBotonesCompra(false);
                    
                    ventanaError("Se agregó el producto", "verde");
                    break;
                case 2:
                    agregarProducto(unCuarto);
                    activarBotonesCompra(false);
                    
                    ventanaError("Se agregó el producto", "verde");
                    break;
                case 3:
                    agregarProducto(mostrito);
                    activarBotonesCompra(false);
                    
                    ventanaError("Se agregó el producto", "verde");
                    break;
                case 4:
                    agregarProducto(mollejasParrilla);
                    activarBotonesCompra(false);
                    
                    ventanaError("Se agregó el producto", "verde");
                    break;
                default:
                    System.out.println("eliga un producto");
                    break;
            }

        } else {
            ventanaError("Debes tener almenos 1 producto", "anaranjado");
        }
        
    }//GEN-LAST:event_btnagregarActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        if (validarCamposLlenos()) {

            //si el dato de direccion esta vacio entonces es entrega rapida
            if (!(txtdireccion.getText().isEmpty())) {

                cliente.setNombre(txtnombre.getText());
                cliente.setDireccion(txtdireccion.getText());
                cliente.setTeléfono(txttelefono.getText());
                cliente.setDNI(txtdni.getText());
                
                tipoPedido = "delivery";
                activarBotones(true);
                
                
                
            } else {
                cliente.setNombre(txtnombre.getText());
                cliente.setTeléfono(txttelefono.getText());
                cliente.setDNI(txtdni.getText());
                
                tipoPedido = "local";
                activarBotones(true);
                
                System.out.println(""+tipoPedido);
            }
        } else {
            ventanaError("Los campos de nombre, DNI y teléfono son obligatorios", "anaranjado");
        }


    }//GEN-LAST:event_jButton10ActionPerformed

    private void btnaumentarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnaumentarActionPerformed
        cantidad++;
        txtcantida.setText(String.valueOf(cantidad));
    }//GEN-LAST:event_btnaumentarActionPerformed

    private void btnpolloenteroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnpolloenteroActionPerformed
        menu = 0;
        activarBotonesCompra(true);
    }//GEN-LAST:event_btnpolloenteroActionPerformed

    private void btnunCuartoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnunCuartoActionPerformed
        menu = 2;
        activarBotonesCompra(true);
        
    }//GEN-LAST:event_btnunCuartoActionPerformed

    private void btnmostritoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmostritoActionPerformed
        menu = 3;
        activarBotones(true);
    }//GEN-LAST:event_btnmostritoActionPerformed

    private void btnmollejasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmollejasActionPerformed
        menu = 4;
        activarBotonesCompra(true);
    }//GEN-LAST:event_btnmollejasActionPerformed

    private void btneliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btneliminarActionPerformed
        //concatenamos el elemento seleccionado de la tabla
        int eliminar = jtpedidos.getSelectedRow();
        
        //comprobar si hay un elementos esta selecionado
        
        if (jtpedidos.getSelectedRow()>-1){
            
            //removemos de la tabla
            tablaProductos.removeRow(jtpedidos.getSelectedRow());
            
            //Removemos del arreglo con un metodo para restarlo con los productos que antes ya teniamos
            cliente.eliminarProducto(eliminar);
            
            //Calculamos el importe con ayuda del metodo
            cliente.calcularImporteTotal();

            //enviamos el valor total de los pedidos
            txttotal.setText(String.valueOf(cliente.getImporteTotal()));
            
            ventanaError("Producto removido", "verde");
            
        } else {
            //Dado que solo hay un arreglo limpiaremos con clear y borraremos los elementos de la tabla
            txttotal.setText("0");
            
            cliente.getProductos().clear();
            
            for (int i = tablaProductos.getRowCount() - 1; i >= 0; i--) {
                tablaProductos.removeRow(i);
                
            }
            ventanaError("Eliminaste todos los productos", "rojo");
        }
    }//GEN-LAST:event_btneliminarActionPerformed

    private void btnrealizarPedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnrealizarPedidoActionPerformed
        
        //Validamos que exista un pedido para poder imprimir
        
        if (cliente.getProductos().size() >= 0 && cantidad > 0) {

            cliente.setNumeroProductos(cliente.getProductos().size());
            
            //Escribimos dentro del fichero
            String linea;
            
            //validamos si el pedido es local o delivery
            
            if (tipoPedido.equals("local")) {
                try {
                    
                    FileWriter escritura = new FileWriter(archivoL, true);
                    PrintWriter escribir = new PrintWriter(escritura);
                    linea = (String.valueOf(cliente.getImporteTotal()) + "-" + cliente.getNombre() + "-" + cliente.getDNI() + "-" + String.valueOf(cliente.getNumeroProductos()) + "-");
                    
                    escribir.println(linea);
                    escritura.close();
                    
                    ventanaError("El pedido ha sido registrado", "verde");
                    
                    this.dispose();
                    
                } catch (IOException e) {
                
                }
                
            } else {
                try {
                    FileWriter escritura = new FileWriter(archivoD, true);
                    PrintWriter escribir = new PrintWriter(escritura);
                    linea = (String.valueOf(cliente.getImporteTotal()) + "-" + cliente.getNombre() + "-" + cliente.getDireccion() + "-" + cliente.getTeléfono() + "-" + String.valueOf(cliente.getNumeroProductos()) + "-" + cliente.getDNI() + "-");

                    escribir.println(linea);
                    escritura.close();
                    
                    ventanaError("El delivery ha sido registrador", "verde");
                    
                    this.dispose();
                    
                } catch (IOException e) {
                    System.out.println("Hay un error en escribir el archivo");
                }
            }
        }
    }//GEN-LAST:event_btnrealizarPedidoActionPerformed

    
    //metodos
    public void agregarProducto(Producto producto) {
        
        producto.calcularPrecioNeto(cantidad);

        cliente.añadirProductos(producto);
        
        cliente.calcularImporteTotal();
        
        txttotal.setText(String.valueOf(cliente.getImporteTotal()));
        
        llenarTabla(producto);
        
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
            java.util.logging.Logger.getLogger(FormularioVentayRegistro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormularioVentayRegistro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormularioVentayRegistro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormularioVentayRegistro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormularioVentayRegistro().setVisible(true);
            }
        });
    }

    
    public void activarBotonesCompra (boolean condicion){
        btnaumentar.setEnabled(condicion);
        btndisminuir.setEnabled(condicion);
        btnagregar.setEnabled(condicion);
    }
    
    public void activarBotones(boolean condicion){
        btnpolloentero.setEnabled(condicion);
        btnmedioPollo.setEnabled(condicion);
        btnunCuarto.setEnabled(condicion);
        btnmollejas.setEnabled(condicion);
        btnmostrito.setEnabled(condicion);
    }
    
    
    private void llenarTabla(Producto aux) 
    
    {
        //mostrar en tabla.
        String datos[] = new String[4];
        datos[0] = aux.getNombreProducto();
        datos[1] = String.valueOf(aux.getPrecioUnidad());
        datos[2] = String.valueOf(aux.getId());
        datos[3] = String.valueOf(aux.getPrecioNeto());
        tablaProductos.addRow(datos);
    }
    
    
    private boolean validarCamposLlenos(){
        if (txtnombre.getText().isEmpty() && txtdni.getText().isEmpty()){
            return false;
        } else {
            return true;
        }
    }
    
        public void ventanaError(String MENSAJE, String COLOR) {
        VentarraError actual = new VentarraError(MENSAJE, COLOR);
        actual.setVisible(true);
    }
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bienvenido2;
    private javax.swing.JLabel bienvenido3;
    private javax.swing.JLabel bienvenido4;
    private javax.swing.JLabel bienvenido5;
    private javax.swing.JLabel bienvenido6;
    private javax.swing.JLabel bienvenido7;
    private javax.swing.JButton btnagregar;
    private javax.swing.JButton btnaumentar;
    private javax.swing.JButton btndisminuir;
    private javax.swing.JButton btneliminar;
    private javax.swing.JButton btnmedioPollo;
    private javax.swing.JButton btnmollejas;
    private javax.swing.JButton btnmostrito;
    private javax.swing.JButton btnpolloentero;
    private javax.swing.JButton btnrealizarPedido;
    private javax.swing.JButton btnunCuarto;
    private javax.swing.JButton jButton10;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jtpedidos;
    private javax.swing.JTextField txtcantida;
    private javax.swing.JTextField txtdireccion;
    private javax.swing.JTextField txtdni;
    private javax.swing.JTextField txtnombre;
    private javax.swing.JTextField txttelefono;
    private javax.swing.JTextField txttotal;
    // End of variables declaration//GEN-END:variables
}

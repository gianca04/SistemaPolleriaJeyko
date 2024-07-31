
package formularios;

import Clases.Cliente;
import Clases.Pedido;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class VisualizarPedidosDelivery extends javax.swing.JFrame {

    String archivoPedidosDelivery = "pedidosDelivery.txt";
    File archivoD = new File(archivoPedidosDelivery);

    DefaultTableModel tablaPedidos = new DefaultTableModel();
    Pedido pedidos = new Pedido();
    
    
    public VisualizarPedidosDelivery() {
        
        

        
        initComponents();
        
        this.setLocation(430, 100);
        String titulos[] = {"TOTAL", "NOMBRE", "DIRECCIÓN", "TELÉFONO", "N° PRODUCTOS", "DNI"};
        tablaPedidos.setColumnIdentifiers(titulos);
        jtpedidosDelivery.setModel(tablaPedidos);
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jtpedidosDelivery = new javax.swing.JTable();
        bienvenido3 = new javax.swing.JLabel();
        btnlimpiar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        txttotal = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jtpedidosDelivery.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jtpedidosDelivery);

        bienvenido3.setFont(new java.awt.Font("Roboto Black", 0, 30)); // NOI18N
        bienvenido3.setText("Pedidos para delivery");

        btnlimpiar.setFont(new java.awt.Font("Roboto Light", 0, 16)); // NOI18N
        btnlimpiar.setText("Limpiar tabla");
        btnlimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnlimpiarActionPerformed(evt);
            }
        });

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/PicsArt_10-25-01.43.59.png"))); // NOI18N

        txttotal.setFont(new java.awt.Font("Roboto Light", 0, 16)); // NOI18N
        txttotal.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel3.setFont(new java.awt.Font("Roboto Light", 0, 16)); // NOI18N
        jLabel3.setText("Total:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 523, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(26, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txttotal, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(38, 38, 38)
                                .addComponent(btnlimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(bienvenido3, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2)
                        .addGap(79, 79, 79))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(33, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(bienvenido3)
                        .addGap(24, 24, 24)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnlimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txttotal, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(17, 17, 17)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnlimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnlimpiarActionPerformed
        String linea;
        try {
            
            BufferedWriter bw = new BufferedWriter(new FileWriter(archivoD));
            bw.write("");
            
            bw.close();
            
            borrarCeldasTabla();
            txttotal.setText("");
        } catch (IOException e) {
            System.out.println("Hay un error en escribir el archivo");
        }
    }//GEN-LAST:event_btnlimpiarActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        try {
            lectura();
            pedidos.calcularGanancias();
            txttotal.setText(String.valueOf(pedidos.getGananciaDelDia()));
        } catch (Exception e) {
            System.err.println("Datos no encontrados, se empezaran a escribir nuevos datos " + e);
        }
    }//GEN-LAST:event_formWindowOpened

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(VisualizarPedidosDelivery.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VisualizarPedidosDelivery.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VisualizarPedidosDelivery.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VisualizarPedidosDelivery.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VisualizarPedidosDelivery().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bienvenido3;
    private javax.swing.JButton btnlimpiar;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jtpedidosDelivery;
    private javax.swing.JTextField txttotal;
    // End of variables declaration//GEN-END:variables

    
    public void borrarCeldasTabla() {
        for (int i = tablaPedidos.getRowCount() - 1; i >= 0; i--) {
            tablaPedidos.removeRow(i);
        }
    }
            
    private void lectura() {
        
        String linea; 
        int lnTotal, lnNombre, lnDireccion, lnTelefono, lnNProductos, lnDni; 
        //45.0-nombre-direccion-telefono-1-dni-
        try
        {
            FileReader lectura = new FileReader(archivoD);
            BufferedReader leer = new BufferedReader(lectura);
            linea = leer.readLine();
            
            while (linea != null) {                
                lnTotal = linea.indexOf("-", 0);
                lnNombre = linea.indexOf("-", lnTotal + 1);
                lnDireccion = linea.indexOf("-", lnNombre + 1);
                lnTelefono = linea.indexOf("-", lnDireccion + 1);
                lnNProductos = linea.indexOf("-", lnTelefono + 1);
                lnDni = linea.indexOf("-", lnNProductos + 1);
                
                //llenar Array empleado
                Cliente aux = new Cliente();
                aux.setImporteTotal(Double.parseDouble(linea.substring(0, lnTotal)));
                aux.setNombre(linea.substring(lnTotal + 1, lnNombre));
                aux.setDireccion(linea.substring(lnNombre + 1, lnDireccion));
                aux.setTeléfono(linea.substring(lnDireccion + 1, lnTelefono));
                aux.setNumeroProductos(Integer.parseInt(linea.substring(lnTelefono + 1, lnNProductos)));
                aux.setDNI(linea.substring(lnNProductos + 1, lnDni));

                pedidos.agregarClientes(aux);
                
                linea = leer.readLine();
                
                llenarTabla(aux);
            }
            lectura.close();
        } catch(IOException ex){
            JOptionPane.showMessageDialog(null, ex);
        }
    
    }

    private void llenarTabla(Cliente aux) {
        //mostrar en tabla.
        String datos[] = new String[6];
        datos[0] = String.valueOf(aux.getImporteTotal());
        datos[1] = aux.getNombre();
        datos[2] = aux.getDireccion();
        datos[3] = aux.getTeléfono();
        datos[4] = String.valueOf(aux.getNumeroProductos());
        datos[5] = aux.getDNI();
        tablaPedidos.addRow(datos);
    }
}
        


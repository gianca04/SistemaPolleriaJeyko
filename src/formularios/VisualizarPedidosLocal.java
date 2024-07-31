package formularios;

import Clases.Pedido;
import Clases.Cliente;
import Clases.Empleado;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class VisualizarPedidosLocal extends javax.swing.JFrame {

    //Crear fichero para pedidos locales
    String archivoPedidosLocal = "pedidosLocal.txt";
    File archivoL = new File(archivoPedidosLocal);

    
    DefaultTableModel tablaPedidos = new DefaultTableModel();
    
    Pedido pedidos = new Pedido();
    
    public VisualizarPedidosLocal() {
        initComponents();
        
        this.setLocation(430, 100);
        String titulos[] = {"TOTAL", "NOMBRE", "DNI", "N° PRODUCTOS"};
        tablaPedidos.setColumnIdentifiers(titulos);
        jtpedidosLocal.setModel(tablaPedidos);
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bienvenido4 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtpedidosLocal = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        btnlimpiar = new javax.swing.JButton();
        txttotal = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        bienvenido4.setFont(new java.awt.Font("Roboto Black", 0, 30)); // NOI18N
        bienvenido4.setText("Pedidos en local");

        jtpedidosLocal.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(jtpedidosLocal);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/PicsArt_10-25-01.43.59.png"))); // NOI18N

        btnlimpiar.setFont(new java.awt.Font("Roboto Light", 0, 16)); // NOI18N
        btnlimpiar.setText("Limpiar");
        btnlimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnlimpiarActionPerformed(evt);
            }
        });

        txttotal.setFont(new java.awt.Font("Roboto Light", 0, 16)); // NOI18N
        txttotal.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 102, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnlimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txttotal, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(bienvenido4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(97, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 525, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(bienvenido4)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnlimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txttotal, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jLabel2)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnlimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnlimpiarActionPerformed
        String linea;
        try {
            
            BufferedWriter bw = new BufferedWriter(new FileWriter(archivoL));
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
            java.util.logging.Logger.getLogger(VisualizarPedidosLocal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VisualizarPedidosLocal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VisualizarPedidosLocal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VisualizarPedidosLocal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VisualizarPedidosLocal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bienvenido4;
    private javax.swing.JButton btnlimpiar;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jtpedidosLocal;
    private javax.swing.JTextField txttotal;
    // End of variables declaration//GEN-END:variables

    public void borrarCeldasTabla() {
        for (int i = tablaPedidos.getRowCount() - 1; i >= 0; i--) {
            tablaPedidos.removeRow(i);
        }
    }
    
    private void lectura() {
        String linea;
        int lnTotal, lnNombre, lnDni, lnNProductos;
        try
        {
            FileReader lectura = new FileReader(archivoL);
            BufferedReader leer = new BufferedReader(lectura);
            linea = leer.readLine();
            
            while (linea != null) {                
                lnTotal = linea.indexOf("-", 0);
                lnNombre = linea.indexOf("-", lnTotal + 1);
                lnDni = linea.indexOf("-", lnNombre + 1);
                lnNProductos = linea.indexOf("-", lnDni + 1);
                
                //llenar Array empleado
                Cliente aux = new Cliente();
                aux.setImporteTotal(Double.parseDouble(linea.substring(0, lnTotal)));
                aux.setNombre(linea.substring(lnTotal + 1, lnNombre));
                aux.setDNI(linea.substring(lnNombre + 1, lnDni ));
                aux.setNumeroProductos(Integer.parseInt(linea.substring(lnDni + 1, lnNProductos)));
                
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
        String datos[] = new String[4];
        datos[0] = String.valueOf(aux.getImporteTotal());
        datos[1] = aux.getNombre();
        datos[2] = aux.getDNI();
        datos[3] = String.valueOf(aux.getNumeroProductos());
        tablaPedidos.addRow(datos);
    }
}

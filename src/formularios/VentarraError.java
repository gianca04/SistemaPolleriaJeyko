package formularios;

import java.awt.Color;

public class VentarraError extends javax.swing.JFrame {
    final private String MENSAJE;
    private String COLOR;
    
    //mover ventana
    int xMouse, yMouse;
    
    
    public VentarraError(String MENSAJE, String COLOR) {
        
        this.MENSAJE = MENSAJE;
        this.COLOR = COLOR;
        
        setUndecorated(true);
        initComponents();
        
       this.setLocationRelativeTo(null);
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpanelColor = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jlmensaje = new javax.swing.JLabel();
        txtmensaje = new javax.swing.JTextField();
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

        jpanelColor.setBackground(new java.awt.Color(146, 253, 112));

        jlmensaje.setFont(new java.awt.Font("Roboto Black", 0, 36)); // NOI18N
        jlmensaje.setForeground(new java.awt.Color(255, 255, 255));
        jlmensaje.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlmensaje.setText("Mensaje");

        txtmensaje.setEditable(false);
        txtmensaje.setFont(new java.awt.Font("Roboto Medium", 1, 24)); // NOI18N
        txtmensaje.setForeground(new java.awt.Color(255, 255, 255));
        txtmensaje.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtmensaje.setText("Mensaje");
        txtmensaje.setBorder(null);
        txtmensaje.setOpaque(false);

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
            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
        );
        jpsalirLayout.setVerticalGroup(
            jpsalirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpsalirLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jpanelColorLayout = new javax.swing.GroupLayout(jpanelColor);
        jpanelColor.setLayout(jpanelColorLayout);
        jpanelColorLayout.setHorizontalGroup(
            jpanelColorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpanelColorLayout.createSequentialGroup()
                .addGroup(jpanelColorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpanelColorLayout.createSequentialGroup()
                        .addComponent(jpsalir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(369, 369, 369)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jpanelColorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(txtmensaje, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jlmensaje, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 579, Short.MAX_VALUE)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jpanelColorLayout.setVerticalGroup(
            jpanelColorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpanelColorLayout.createSequentialGroup()
                .addGroup(jpanelColorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jpsalir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jpanelColorLayout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(jLabel1)))
                .addGap(11, 11, 11)
                .addComponent(jlmensaje, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(txtmensaje, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(37, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpanelColor, javax.swing.GroupLayout.PREFERRED_SIZE, 580, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpanelColor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    
    
    
    private void jpsalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpsalirMouseClicked
        jpsalir.setBackground(new java.awt.Color(255, 255, 255));
        this.dispose();
    }//GEN-LAST:event_jpsalirMouseClicked

    private void jpsalirMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpsalirMouseEntered
        jpsalir.setBackground(new Color(232, 0, 0));
    }//GEN-LAST:event_jpsalirMouseEntered

    private void jpsalirMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpsalirMouseExited
        jpsalir.setBackground(new java.awt.Color(255, 255, 255));
    }//GEN-LAST:event_jpsalirMouseExited

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        switch (COLOR){
            case "rojo":
                jpanelColor.setBackground(new Color(255, 105, 97));
                jlmensaje.setText("¡Oops!");
                break;
            case "anaranjado":
                jpanelColor.setBackground(Color.ORANGE);
                jlmensaje.setText("¡Atención!");
                break;
            case "verde":
                jpanelColor.setBackground(new Color(146, 253, 112));
                jlmensaje.setText("¡Operación exitosa!");
                break;
            default:
                break;
        }
        txtmensaje.setText(MENSAJE);
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
       
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jlmensaje;
    private javax.swing.JPanel jpanelColor;
    private javax.swing.JPanel jpsalir;
    private javax.swing.JTextField txtmensaje;
    // End of variables declaration//GEN-END:variables
}

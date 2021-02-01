/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.vista;

/**
 *
 * @author ariel
 */
public class VentanaPrincipal extends javax.swing.JFrame {

    VentanaClientes ventanaClientes;
    VentanaGarantes ventanaGarantes;
    VentanaNuevoCliente ventanaNuevoCliente;
    VentanaNuevoGarante ventanaNuevoGarante;
    VentanaNuevoPrestamo ventanaNuevoPrestamo;
    VentanaNuevoUsuario ventanaNuevoUsuario;
    VentanaPrestamos ventanaPrestamos;
    
    public VentanaPrincipal() {
        initComponents();
        
        ventanaClientes = new VentanaClientes();
        ventanaGarantes = new VentanaGarantes();
        ventanaNuevoCliente = new VentanaNuevoCliente();
        ventanaNuevoPrestamo = new VentanaNuevoPrestamo();
        ventanaNuevoUsuario = new VentanaNuevoUsuario();
        ventanaPrestamos = new VentanaPrestamos();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        menuBar = new javax.swing.JMenuBar();
        jMenuInicio = new javax.swing.JMenu();
        jMenuClientes = new javax.swing.JMenu();
        jMenuItemAdministrar = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        jMenuItemNuevo = new javax.swing.JMenuItem();
        jMenuItemAdministarPrestamos = new javax.swing.JMenuItem();
        exitMenuItem = new javax.swing.JMenuItem();
        jMenuConfiguracion = new javax.swing.JMenu();
        jMenuItemActualizar = new javax.swing.JMenuItem();
        jMenuItemEliminar = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Banco Pichincha");

        jPanel1.setBackground(new java.awt.Color(255, 255, 153));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 782, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 449, Short.MAX_VALUE)
        );

        menuBar.setBackground(new java.awt.Color(204, 204, 204));

        jMenuInicio.setMnemonic('f');
        jMenuInicio.setText("Inicio");
        jMenuInicio.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        jMenuClientes.setText("Clientes");
        jMenuClientes.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jMenuItemAdministrar.setText("Prestatarios");
        jMenuItemAdministrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemAdministrarActionPerformed(evt);
            }
        });
        jMenuClientes.add(jMenuItemAdministrar);

        jMenuItem1.setText("Garantes");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenuClientes.add(jMenuItem1);

        jMenuInicio.add(jMenuClientes);

        jMenu1.setText("Prestamos");
        jMenu1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jMenuItemNuevo.setText("Nuevo");
        jMenuItemNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemNuevoActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItemNuevo);

        jMenuItemAdministarPrestamos.setText("Administrar");
        jMenuItemAdministarPrestamos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemAdministarPrestamosActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItemAdministarPrestamos);

        jMenuInicio.add(jMenu1);

        exitMenuItem.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        exitMenuItem.setMnemonic('x');
        exitMenuItem.setText("Salir");
        exitMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitMenuItemActionPerformed(evt);
            }
        });
        jMenuInicio.add(exitMenuItem);

        menuBar.add(jMenuInicio);

        jMenuConfiguracion.setMnemonic('e');
        jMenuConfiguracion.setText("Configuracion");
        jMenuConfiguracion.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        jMenuItemActualizar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jMenuItemActualizar.setMnemonic('y');
        jMenuItemActualizar.setText("Actualizar Datos");
        jMenuConfiguracion.add(jMenuItemActualizar);

        jMenuItemEliminar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jMenuItemEliminar.setMnemonic('p');
        jMenuItemEliminar.setText("Eliminar este Usuario");
        jMenuConfiguracion.add(jMenuItemEliminar);

        menuBar.add(jMenuConfiguracion);

        setJMenuBar(menuBar);

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
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void exitMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitMenuItemActionPerformed
        System.exit(0);
    }//GEN-LAST:event_exitMenuItemActionPerformed

    private void jMenuItemAdministrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemAdministrarActionPerformed
        ventanaClientes.setVisible(true);
    }//GEN-LAST:event_jMenuItemAdministrarActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        ventanaGarantes.setVisible(true);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItemNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemNuevoActionPerformed
        ventanaNuevoPrestamo.setVisible(true);
    }//GEN-LAST:event_jMenuItemNuevoActionPerformed

    private void jMenuItemAdministarPrestamosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemAdministarPrestamosActionPerformed
        ventanaPrestamos.setVisible(true);
    }//GEN-LAST:event_jMenuItemAdministarPrestamosActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem exitMenuItem;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenuClientes;
    private javax.swing.JMenu jMenuConfiguracion;
    private javax.swing.JMenu jMenuInicio;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItemActualizar;
    private javax.swing.JMenuItem jMenuItemAdministarPrestamos;
    private javax.swing.JMenuItem jMenuItemAdministrar;
    private javax.swing.JMenuItem jMenuItemEliminar;
    private javax.swing.JMenuItem jMenuItemNuevo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JMenuBar menuBar;
    // End of variables declaration//GEN-END:variables

}

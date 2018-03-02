package miprograma;
import miprograma.programa;
import static java.lang.System.exit;
import metodo2aproximacion.mtPuntoFijo;
import metodo3.Cuadro;
import metodo4aproximacion.Metod4;
import java.awt.BorderLayout;
import java.awt.Component;
import java.io.File;
import javafx.application.Platform;
import javafx.embed.swing.JFXPanel;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Toshiba
 */
public class Inicio extends javax.swing.JFrame {

    
    public Inicio() {
        initComponents();
       
    }
 
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        biseccion = new javax.swing.JMenuItem();
        pintofijo = new javax.swing.JMenuItem();
        newton = new javax.swing.JMenuItem();
        secante = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(239, 226, 225));
        setCursor(new java.awt.Cursor(java.awt.Cursor.NE_RESIZE_CURSOR));
        setForeground(new java.awt.Color(234, 221, 210));
        setIconImages(null);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 249, Short.MAX_VALUE)
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setForeground(new java.awt.Color(212, 175, 175));

        jLabel3.setText("Wilian Leonel Peña Diaz");

        jLabel2.setText("Euan Uc Jose Rigoberto");

        jLabel4.setText("Pedro Marrufo Fernandez");

        jLabel5.setIcon(new javax.swing.ImageIcon("C:\\Users\\Toshiba\\Pictures\\iconos\\rubio-azul-usuario-varon-blanco-icono-5860-48.png")); // NOI18N

        jPanel3.setOpaque(false);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel1.setText("METODO NUMERICO");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(49, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
                .addGap(20, 20, 20))
        );

        jLabel6.setIcon(new javax.swing.ImageIcon("C:\\Users\\Toshiba\\Documents\\NetBeansProjects\\miPrograma\\depositphotos_5553753-stock-illustration-math-tree-for-your-design.jpg")); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(95, 95, 95))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(101, 101, 101)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel6)))
                .addContainerGap(23, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 358, Short.MAX_VALUE)
                .addGap(38, 38, 38)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4)
                .addGap(22, 22, 22))
        );

        jMenu1.setBackground(new java.awt.Color(0, 0, 0));
        jMenu1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Toshiba\\Documents\\NetBeansProjects\\miPrograma\\src\\miprograma\\iconos\\menu.png")); // NOI18N

        biseccion.setIcon(new javax.swing.ImageIcon("C:\\Users\\Toshiba\\Documents\\NetBeansProjects\\miPrograma\\src\\miprograma\\iconos\\biseccion.png")); // NOI18N
        biseccion.setText("Biseccion");
        biseccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                biseccionActionPerformed(evt);
            }
        });
        jMenu1.add(biseccion);

        pintofijo.setIcon(new javax.swing.ImageIcon("C:\\Users\\Toshiba\\Documents\\NetBeansProjects\\miPrograma\\src\\miprograma\\iconos\\punto fijo.png")); // NOI18N
        pintofijo.setText("Punto Fijo");
        pintofijo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pintofijoActionPerformed(evt);
            }
        });
        jMenu1.add(pintofijo);

        newton.setIcon(new javax.swing.ImageIcon("C:\\Users\\Toshiba\\Documents\\NetBeansProjects\\miPrograma\\src\\miprograma\\iconos\\newton.png")); // NOI18N
        newton.setText("Newton");
        newton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newtonActionPerformed(evt);
            }
        });
        jMenu1.add(newton);

        secante.setIcon(new javax.swing.ImageIcon("C:\\Users\\Toshiba\\Documents\\NetBeansProjects\\miPrograma\\src\\miprograma\\iconos\\meto4.png")); // NOI18N
        secante.setText("Secante");
        secante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                secanteActionPerformed(evt);
            }
        });
        jMenu1.add(secante);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(309, 309, 309)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(174, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(101, 101, 101)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(295, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void biseccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_biseccionActionPerformed
      programa g=new programa();
      g.setVisible(true);
      g.setLocationRelativeTo(null);
      this.hide();
    }//GEN-LAST:event_biseccionActionPerformed

    private void newtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newtonActionPerformed
        // TODO add your handling code here:
        Cuadro rr=new Cuadro();
        rr.setVisible(true);
        rr.setLocationRelativeTo(null);
        this.hide();
    }//GEN-LAST:event_newtonActionPerformed

    private void pintofijoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pintofijoActionPerformed
       mtPuntoFijo r=new mtPuntoFijo();
       r.setVisible(true);
       r.setLocationRelativeTo(null);
      
    }//GEN-LAST:event_pintofijoActionPerformed

    private void secanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_secanteActionPerformed
      Metod4 y=new Metod4();
      y.setVisible(true);
       y.setLocationRelativeTo(null);
     
    }//GEN-LAST:event_secanteActionPerformed

   
    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Inicio PROGRAMA=new Inicio();
                PROGRAMA.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem biseccion;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JMenuItem newton;
    private javax.swing.JMenuItem pintofijo;
    private javax.swing.JMenuItem secante;
    // End of variables declaration//GEN-END:variables

   
}

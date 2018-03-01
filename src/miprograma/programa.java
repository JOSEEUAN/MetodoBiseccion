/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package miprograma;

import static com.sun.media.jfxmediaimpl.MediaUtils.error;
import java.awt.event.InputMethodEvent;
import java.util.ArrayList;
import java.util.InputMismatchException;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import miprograma.MiPrograma;

public class programa extends javax.swing.JFrame{

//    int n;
//    int x1;
//
//    public int getX1() {
//        return x1;
//    }
//
//    public void setX1(int x1) {
//        this.x1 = x1;
//    }
//
//    public int getN() {
//        return n;
//    }
//    double Xi;
//    double Xs;
//    double Xr;
//    double FXi;
//    double FXr;
//    double FXiFXr;
//    double ERR;
    
//ArrayList<MiPrograma>lista =new ArrayList<MiPrograma>();
private DatosTable jj=new DatosTable();
    public programa() {
        super("INTERACCION");
        initComponents();
        
    
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        nombre = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jPanel1 = new javax.swing.JPanel();
        INTERVALO = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        intervaloXi = new javax.swing.JTextField();
        intervaloXs = new javax.swing.JTextField();
        iteracion = new javax.swing.JTextField();
        jScrollPane5 = new javax.swing.JScrollPane();
        tablaProblema = new javax.swing.JTable();
        calcular = new javax.swing.JButton();
        imprimir = new javax.swing.JButton();
        borrarLimpiar = new javax.swing.JButton();
        inicioSalie = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel1.setText("METODO NUMERICO");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.CROSSHAIR_CURSOR));
        setIconImage(getIconImage());
        setIconImages(getIconImages());
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setIcon(new javax.swing.ImageIcon("C:\\Users\\Toshiba\\Pictures\\iconos\\archivo-de-matematicas-icono-5558-128.png")); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 120, -1));

        nombre.setFont(new java.awt.Font("Californian FB", 0, 24)); // NOI18N
        nombre.setText("Metodo De Biseccion ");
        getContentPane().add(nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 32, -1, -1));

        jSeparator1.setForeground(new java.awt.Color(51, 51, 255));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 226, 643, -1));

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jTextArea1.setText("Objetivo: \nObtener una solución de f(x)=0 dado que f es continua\n en [a,b] y f(a)  y f(b) tienen signos opuestos\nEcuacion de la aproximacion:\nX3 +4x2-10=0\n\n");
        jScrollPane2.setViewportView(jTextArea1);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 70, 460, 110));

        INTERVALO.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N
        INTERVALO.setText("INTERVALO");

        jLabel2.setText("CUANTAS INTERACCIONDES DESEA AGREGAR");

        jLabel4.setText("INGRESA EL INTERVALO:Xi");

        jLabel5.setText("INGRESA EL INTERVALO:Xs");

        intervaloXi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                intervaloXiActionPerformed(evt);
            }
        });

        intervaloXs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                intervaloXsActionPerformed(evt);
            }
        });

        iteracion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                iteracionActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(128, 128, 128)
                        .addComponent(INTERVALO))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 167, Short.MAX_VALUE))
                            .addComponent(jLabel2)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(intervaloXi, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(intervaloXs, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(iteracion, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(61, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(INTERVALO)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(iteracion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(intervaloXi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(intervaloXs, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 234, -1, -1));

        tablaProblema.setBackground(new java.awt.Color(153, 153, 153));
        tablaProblema.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tablaProblema.addContainerListener(new java.awt.event.ContainerAdapter() {
            public void componentAdded(java.awt.event.ContainerEvent evt) {
                tablaProblemaComponentAdded(evt);
            }
        });
        jScrollPane5.setViewportView(tablaProblema);

        getContentPane().add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 427, 582, 157));

        calcular.setIcon(new javax.swing.ImageIcon("C:\\Users\\Toshiba\\Pictures\\iconos\\calcular-agt-icono-7128-32.png")); // NOI18N
        calcular.setBorderPainted(false);
        calcular.setContentAreaFilled(false);
        calcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calcularActionPerformed(evt);
            }
        });
        getContentPane().add(calcular, new org.netbeans.lib.awtextra.AbsoluteConstraints(69, 590, 38, -1));

        imprimir.setIcon(new javax.swing.ImageIcon("C:\\Users\\Toshiba\\Pictures\\iconos\\imprimir2.png")); // NOI18N
        imprimir.setBorderPainted(false);
        imprimir.setContentAreaFilled(false);
        getContentPane().add(imprimir, new org.netbeans.lib.awtextra.AbsoluteConstraints(117, 590, 40, -1));

        borrarLimpiar.setIcon(new javax.swing.ImageIcon("C:\\Users\\Toshiba\\Pictures\\iconos\\limpieza-de-borrar-goma-de-borrar-icono-4716-32.png")); // NOI18N
        borrarLimpiar.setBorderPainted(false);
        borrarLimpiar.setContentAreaFilled(false);
        borrarLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                borrarLimpiarActionPerformed(evt);
            }
        });
        getContentPane().add(borrarLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 590, 39, -1));

        inicioSalie.setIcon(new javax.swing.ImageIcon("C:\\Users\\Toshiba\\Pictures\\iconos\\inicio-inicio-icono-6540-32.png")); // NOI18N
        inicioSalie.setBorderPainted(false);
        inicioSalie.setContentAreaFilled(false);
        inicioSalie.setFocusPainted(false);
        inicioSalie.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inicioSalieActionPerformed(evt);
            }
        });
        getContentPane().add(inicioSalie, new org.netbeans.lib.awtextra.AbsoluteConstraints(282, 612, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void calcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calcularActionPerformed
try {

if(iteracion.getText().equals("") & intervaloXi.getText().equals("") & intervaloXs.getText().equals(""))
{
JOptionPane.showMessageDialog(null, "LLene los Campo Solicitados");

}
if(iteracion.getText().equals("") & !intervaloXi.getText().equals("") & !intervaloXs.getText().equals(""))
{
JOptionPane.showMessageDialog(null, "Igrese un Numero Valido");

}
  int it=Integer.parseInt(iteracion.getText());
        int xii=Integer.parseInt(intervaloXi.getText());
        int xss=Integer.parseInt(intervaloXs.getText());
        tablaProblema.setModel(new AbstracModel(jj.getTablaBiseccion(it,xii,xss)));
}catch (NumberFormatException error)
{
  JOptionPane.showMessageDialog(null, "Ingrese un numero Input valido\n"+error.toString());
}
                    
      

        
//        n = Integer.parseInt(iteracion.getText());
//        int[][] Matris = new int[n][n];
//        Matris = this.MatrizMastra(tablaProblema, n);
//        this.mostrarMatriz(Matris, n);
    }//GEN-LAST:event_calcularActionPerformed


    private void inicioSalieActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inicioSalieActionPerformed
        Inicio dd = new Inicio(); 
      dd.setLocationRelativeTo(null);
        dd.setVisible(true);
       
        this.hide();
    }//GEN-LAST:event_inicioSalieActionPerformed

    private void borrarLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_borrarLimpiarActionPerformed
        // TODO add your handling code here:
        
        if (evt.getSource()==borrarLimpiar){
        
        iteracion.setText("");
        intervaloXi.setText("");
        intervaloXs.setText("");
       
        }else{if (borrarLimpiar==null){
        JOptionPane.showInternalMessageDialog(null, "LLena los campos");
        
        }}        
        
        
    }//GEN-LAST:event_borrarLimpiarActionPerformed

    private void intervaloXiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_intervaloXiActionPerformed
        // TODO add your handling code here:
        DatosTable mm=new DatosTable();

    }//GEN-LAST:event_intervaloXiActionPerformed

    private void intervaloXsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_intervaloXsActionPerformed
      DatosTable mm=new DatosTable();

    }//GEN-LAST:event_intervaloXsActionPerformed

    private void iteracionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_iteracionActionPerformed


    }//GEN-LAST:event_iteracionActionPerformed

    private void tablaProblemaComponentAdded(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_tablaProblemaComponentAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_tablaProblemaComponentAdded

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new programa().setVisible(true);
            }
        });
    }

//    public void mostrarMatriz(int Matriz[][], int n) {
//
//        DefaultTableModel mode1 = (DefaultTableModel) tablaProblema.getModel();
//
//        mode1.setRowCount(n);
//        for (int x = 1; x < n; x++) {
//            Matriz[x][x] = x;
//
//        }
//
//    }
//
//    public int[][] MatrizMastra(JTable t, int n) {
//
////int nlimite=n;
////int inicio=0;
//        int matris[][] = new int[n][n];
//       
//
//        Xi = Double.parseDouble(intervaloXi.getText());
//        Xs = Double.parseDouble(intervaloXs.getText());
//
//        String[] columnas = {
//            "Iteración ", "Xi", "Xs", "Xr", "FXi", "FXr", "FXi * FXs", "Er"
//
//        };
//        DefaultTableModel mod = new DefaultTableModel(null, columnas);
//
//        for (x1 = 0; x1 < n; x1++) {
//
//            String[] fila = {"" + x1, "" + Xi, "" + Xs, "" + Xr, "" + FXi, "" + FXr, "" + FXiFXr, "" + ERR};
//            if (x1 == 0) {
//                Xr = (Xi + Xs) / 2;
////2paso
//
//                double s = (Math.pow(Xi, 3));
//                double s2 = Math.pow(Xi, 2);
//                double g = 4 * s2;
//                FXi = s + g - 10;
//
////           formula general
//                int h;
//                double f = (Math.pow(Xr, 3));
//                double f2 = Math.pow(Xr, 2);
//                double c = 4 * f2;
//                FXr = f + c - 10;
//                FXiFXr = FXi * FXr;
//
//                ERR = (Xs - Xr) / Xr;
//// 
//            } else {
//                if (x1 == 1 || x1 != 1) {
//
//                    if (FXiFXr < 0) {
//
//                        Xs = Xr;
//
//                    } else {
//                        if (FXiFXr > 0) {
//                            Xi = Xr;
//
//                        }
//                    }
//
//                    if (FXr < 0) {
//                        FXi = FXr;
//
//                    } else {
//                        FXr = FXr;
//                    }
//                    
//                    Xr = (Xi + Xs) / 2;
//                    double s = (Math.pow(Xi, 3));
//                    double s2 = Math.pow(Xi, 2);
//                    double g = 4 * s2;
//                    FXi = s + g - 10;
//
////           formula general
//                    int h;
//                    double f = (Math.pow(Xr, 3));
//                    double f2 = Math.pow(Xr, 2);
//                    double c = 4 * f2;
//                    FXr = f + c - 10;
//                    FXiFXr = FXi * FXr;
//                    ERR = (Xs - Xr) / Xr;
////                
//                    mod.addRow(fila);
//
//                }
//                t.setModel(mod);
//// ______________________________________________________________________________
//
////        for(int i=inicio+1;i<=nlimite;i++){
////        Matris[i][nlimite]=c++;
////        }
////        for(int i=nlimite-1;i>=inicio;i--){
////        Matris[nlimite][i]=c++;
////        }
////        for(int i=nlimite-1;i>=inicio+1;i--){
////        Matris[i][inicio]=c++;
////        }
////       nlimite=nlimite-1;
////       inicio=inicio+1;
//            }
//        }
//        return matris;
//    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel INTERVALO;
    private javax.swing.JButton borrarLimpiar;
    private javax.swing.JButton calcular;
    private javax.swing.JButton imprimir;
    private javax.swing.JButton inicioSalie;
    public javax.swing.JTextField intervaloXi;
    public javax.swing.JTextField intervaloXs;
    public javax.swing.JTextField iteracion;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JLabel nombre;
    private javax.swing.JTable tablaProblema;
    // End of variables declaration//GEN-END:variables
}

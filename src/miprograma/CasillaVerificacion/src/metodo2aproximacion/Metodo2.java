/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.  
 */
package metodo2aproximacion;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.AbstractTableModel;
/**
 *
 * @author Dext
 */
public class Metodo2 extends JFrame{
    
    
    JLabel txtTitulo=new JLabel("== METODO 2 ==");
    JLabel txtInstruccion= new JLabel("La funcion se iguala a cero y se despeja x");
        ImageIcon imagen1= new ImageIcon("funcion.png");
        ImageIcon imagen2= new ImageIcon("xdespejada.png");
        Icon icono1, icono2;
    JLabel lbimagen1=new JLabel();
    JLabel lbTrans=new JLabel(">>>>>");
    JLabel lbimagen2=new JLabel();
    
    JLabel txtDesdeNum=new JLabel("Numero con el cual se empezaran las iteraciones");
    JTextField esDesdeNum=new JTextField(5);
    JLabel txtIteraciones=new JLabel("Numero de iteraciones");
    JTextField esIteraciones=new JTextField(5);
    JButton bCalcular=new JButton("Calcular");
    JTable tabla= new JTable();
    JScrollPane sp, res;
    
    String [] cabecera={"Iteraciones","x-1","x=g(x)", "Error"};//Se crea la cabecera en un vector
    CalculosMetodo2 calculos=new CalculosMetodo2();
    public Metodo2()
    {
        super ("Metodo 2");
        lbimagen1.setBounds(0,0,100,30);
        lbimagen2.setBounds(0,0,100,30);
        
        icono1= new ImageIcon(imagen1.getImage().getScaledInstance(lbimagen1.getWidth(), lbimagen1.getHeight(), Image.SCALE_DEFAULT));
        lbimagen1.setIcon(icono1);
        
        icono2= new ImageIcon(imagen2.getImage().getScaledInstance(lbimagen2.getWidth(), lbimagen2.getHeight(), Image.SCALE_DEFAULT));
        lbimagen2.setIcon(icono2);
        
        bCalcular.addActionListener(new ActionListener()//Se instancia en el boton la accion de calcular
            {  
                public void actionPerformed(ActionEvent evento) 
                {  
                    try
                    {
                        
                        if(esDesdeNum.getText().equals("") & esIteraciones.getText().equals(""))
                        {
                            JOptionPane.showMessageDialog(null, "Llene los campos solicitados");
                        }
                        if(esDesdeNum.getText().equals("") & !esIteraciones.getText().equals(""))
                        {
                            JOptionPane.showMessageDialog(null, "Ingrese un el numero inicial");
                        }
                        if(!esDesdeNum.getText().equals("") & esIteraciones.getText().equals(""))
                        {
                            JOptionPane.showMessageDialog(null, "Ingrese un el numero de iteraciones");
                        }
                        if(!esDesdeNum.getText().equals("") & !esIteraciones.getText().equals(""))
                        {
                            double nD= Double.parseDouble(esDesdeNum.getText());
                            int nI= Integer.parseInt(esIteraciones.getText());
                            if(nD <0|| nI<0)
                                JOptionPane.showMessageDialog(null, "Ingrese un numero positivo");
                            else
                            {
                                double desde=Double.parseDouble(esDesdeNum.getText());//Se obtiene y se convierte
                                int funci=Integer.parseInt(esIteraciones.getText());//Se obtiene y se convierte
                                //Se crea setea la tabla volvioendo a calcular y obteniendo la lista
                                tabla.setModel(new tablaAbstracta2(calculos.getLisCalcularMetodo2(desde, funci)));
                                sp.setViewportView(tabla);//Creamos un scrol por si es muy grande
                            }
                        }
                    }catch (InputMismatchException error)
                    {
                         JOptionPane.showMessageDialog(null, "Ingrese un numero Input valido\n"+error.toString());
                    }
                    catch (NumberFormatException error)
                    {
                         JOptionPane.showMessageDialog(null, "Ingrese un numero valido\n"+error.toString());
                    }
                    
                    
                } 
            }
        );
        /*/CREAMOS LA TABLA ENVIANDO EL ARRAYlIST CREADO EN "getLisCalcularMetodo2"(en este caso 0,0 porque estara vacia) Y UNA CABECERA
        tabla.setModel(new tablaAbstracta(calculos.getLisCalcularMetodo2(0, 0)));*/
        sp=new JScrollPane();//Creamos un scrol por si es muy grande
        sp.setPreferredSize(new Dimension(400, 150));//Tamaño de la tabla (Ancho, Alto)
        ///
        JPanel pTit =new JPanel();
        pTit.setLayout(new FlowLayout());
        pTit.add(txtTitulo);
        
        JPanel pBot =new JPanel();
        pBot.setLayout(new BorderLayout());
        pBot.add(bCalcular, BorderLayout.SOUTH);
        pBot.setBorder(BorderFactory.createEmptyBorder(25, 25, 70, 25));
        
        JPanel pFlow =new JPanel();
        pFlow.setLayout(new FlowLayout());
        pFlow.add(lbimagen1);
        pFlow.add(lbTrans);
        pFlow.add(lbimagen2);
        
        JPanel pGrid=new JPanel();
        GridLayout g=new GridLayout(6,1);//f,c
        g.setVgap(-12);
        pGrid.setLayout(g);
        pGrid.add(txtInstruccion);
        pGrid.add(pFlow);
        
        pGrid.add(txtDesdeNum);
        pGrid.add(esDesdeNum);
        pGrid.add(txtIteraciones);
        pGrid.add(esIteraciones);
        pGrid.setBorder(BorderFactory.createEmptyBorder(0, 25, 25, 25));
                
        JPanel pGeneral=new JPanel();
        BorderLayout bord=new BorderLayout();
        pGeneral.setLayout(bord);
        pGeneral.add(pGrid, BorderLayout.CENTER);
        pGeneral.add(pBot,BorderLayout.EAST);
        pGeneral.add(sp, BorderLayout.SOUTH);//Se crea la tabla y se retorna
        
        pGeneral.setBorder(BorderFactory.createEmptyBorder(25, 25, 25, 25));//Borde de las ventanas
        
        Container cont= getContentPane(); 
        cont.add(pGeneral);
        
        setLayout(new FlowLayout());
        setSize(500,460);
        setVisible(true);
    }
    //Se implemente la sub clase de "AbstractTableModel"
    public class tablaAbstracta2 extends AbstractTableModel
    {
        String [] cabecera={"Iteraciones","x-1","x=g(x)", "Error"};//Se crea la cabecera en un vector
        private ArrayList<Iteracionesm2> listaDatos=new ArrayList<>();
        
        public tablaAbstracta2(ArrayList listaD)
        {
            listaDatos=listaD;
        }
        public int getRowCount()//Devuelve el numero de filas
        {
            return listaDatos.size();
        }

        public int getColumnCount() //Devuelve el numero de columnas
        {
            return cabecera.length;
        }

        public Object getValueAt(int filas, int columnas) {
            switch(columnas)
            {
                case 0:
                    return listaDatos.get(filas).getIteraciones();
                case 1:
                    return listaDatos.get(filas).getXiMenosUno();
                case 2:
                    return listaDatos.get(filas).getXfuncion();
                case 3:
                    return listaDatos.get(filas).getError();
            }
            return null;
        }
        public String getColumnName(int colm)
        {
            return cabecera[colm];//Retonra el nomrbe de la columna
        }
    }
}

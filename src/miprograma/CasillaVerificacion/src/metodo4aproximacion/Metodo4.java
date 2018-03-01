/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metodo4aproximacion;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.table.AbstractTableModel;
import javax.swing.table.DefaultTableModel;
import metodo2aproximacion.IteracionesM2;
import metodo2aproximacion.Metodo2;
/**
 *
 * @author Dext
 */
public class Metodo4 extends JFrame{
    
    
    JLabel txtTitulo=new JLabel("== METODO 4 ==");
    JLabel txtInstruccion= new JLabel("        Funcion:");
        ImageIcon imagen1= new ImageIcon("funcion.png");
        ImageIcon imagen2= new ImageIcon("raizm4.png");
        Icon icono1, icono2;
    JLabel lbimagen1=new JLabel();
    JLabel lbTrans=new JLabel("     ");
    JLabel lbimagen2=new JLabel();
    
    JLabel txtDesdeNum=new JLabel("Numero inicial");
    JTextField esDesdeNum=new JTextField(5);
    JLabel txtHastaNum=new JLabel("Numero final");
    JTextField esHastaNum=new JTextField(5);
    JLabel txtIteraciones=new JLabel("Numero de iteraciones");
    JTextField esIteraciones=new JTextField(5);
    JButton bCalcular=new JButton("Calcular");
    JTable tabla = new JTable();
    JScrollPane sp, res;
    
    String [] cabecera={"Iteraciones","x-1","xi", "f(xi-1)", "f(xi)", "xi+1(Raiz)", "Error"};//Se crea la cabecera en un vector
    CalculosMetodo4 calculos=new CalculosMetodo4();
    public Metodo4()
    {
        super ("Metodo 4");
        lbimagen1.setBounds(0,0,100,40);
        lbimagen2.setBounds(0,0,170,40);
        
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
                            double nH= Double.parseDouble(esHastaNum.getText());
                            int nI= Integer.parseInt(esIteraciones.getText());
                            if(nD <0|| nI<0|| nH<0)
                                JOptionPane.showMessageDialog(null, "Ingrese un numero positivo");
                            else
                            {
                                double desde=Double.parseDouble(esDesdeNum.getText());//Se obtiene y se convierte
                                int funci=Integer.parseInt(esIteraciones.getText());//Se obtiene y se convierte
                                double hasta=Double.parseDouble(esHastaNum.getText());
                                //Se crea setea la tabla volvioendo a calcular y obteniendo la lista
                                tabla.setModel(new tablaAbstracta4(calculos.getLisCalcularMetodo4(desde, funci, hasta)));
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
        JPanel pTit =new JPanel();
        pTit.setLayout(new FlowLayout());
        pTit.add(txtTitulo);
        
        JPanel pBot =new JPanel();
        pBot.setLayout(new BorderLayout());
        pBot.add(bCalcular, BorderLayout.SOUTH);
        pBot.setBorder(BorderFactory.createEmptyBorder(0, 0, 50, 200));
        
        JPanel pFlow =new JPanel();
        GridLayout gd=new GridLayout(2,2);
        gd.setHgap(-300);
        pFlow.setLayout(gd);
        pFlow.add(txtInstruccion);
        pFlow.add(lbimagen1);
        //pFlow.add(lbTrans);
        pFlow.add(new JLabel("        Formula de la Raiz:"));
        pFlow.add(lbimagen2);
        
        JPanel pGrid=new JPanel();
        GridLayout g=new GridLayout(8,1);//f,c
        pGrid.setLayout(g);
        //pGrid.add(txtInstruccion);
        //pGrid.add(new JLabel("Formula de la Raiz:"));
        //pGrid.add(pFloww);
        pGrid.add(txtDesdeNum);
        pGrid.add(esDesdeNum);
        pGrid.add(txtHastaNum);
        pGrid.add(esHastaNum);
        pGrid.add(txtIteraciones);
        pGrid.add(esIteraciones);
        pGrid.setBorder(BorderFactory.createEmptyBorder(20, 25, 0, 150));
        
        //CREAMOS LA TABLA ENVIANDOLES UNA MATRIZ(en este caso 0,0 porque estara vacia) Y UNA CABECERA
        sp=new JScrollPane(tabla);//Creamos un scrol por si es muy grande
        sp.setPreferredSize(new Dimension(600, 150));//Tamaño de la tabla (Ancho, Alto)
        ////
        JPanel pTabla=new JPanel();
        pTabla.add(sp);
        pTabla.setBorder(BorderFactory.createEmptyBorder(-5, 25, 25, 25));
                
        JPanel pGeneral=new JPanel();
        BorderLayout bord=new BorderLayout();
        pGeneral.setLayout(bord);
        
        pGeneral.add(pFlow,BorderLayout.NORTH);
        pGeneral.add(pGrid, BorderLayout.CENTER);
        pGeneral.add(pBot,BorderLayout.EAST);
        pGeneral.add(pTabla, BorderLayout.SOUTH);//Se crea la tabla y se retorna
        
        pGeneral.setBorder(BorderFactory.createEmptyBorder(25, 25, 25, 25));//Borde de las ventanas
        
        Container cont= getContentPane(); 
        cont.add(pGeneral);
        
        setLayout(new FlowLayout());
        setSize(700,500);
        setVisible(true);
    }
     //Se implemente la sub clase de "AbstractTableModel"
    public class tablaAbstracta4 extends AbstractTableModel
    {
        String [] cabecera={"Iteraciones","x-1","xi", "f(xi-1)","f(xi)","x+1","Error"};//Se crea la cabecera en un vector
        private ArrayList<IteracionesMtd4> listaDatos=new ArrayList<>();
        
        public tablaAbstracta4(ArrayList listaD)
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
                    return listaDatos.get(filas).getXi();
                case 3:
                    return listaDatos.get(filas).getFunXiMenosUno();
                case 4:
                    return listaDatos.get(filas).getFunXi();
                case 5:
                    return listaDatos.get(filas).getRaiz();
                case 6:
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

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package casillaverificacion;

import metodo4aproximacion.Metodo4;
import metodo2aproximacion.mtPuntoFijo;
import javax.swing.*;
import java.awt.*;// se impoertan todas las interfaces 
import java.awt.event.*; // se importan todos los eventos (click y todo eso keypush)


/**
 *
 * @author Dext
 */
public class CasillaVerificacion  extends JFrame
{
    //Declaracion de los miembros(atributos) de la clase
    //Variable globales a la clase
    JTextField txtCampo, campo1, campo2, campo3;
    JCheckBox chkNegrita, chkCursiva, chkSubrayar;
    JButton cmdImprimir, cmdSalir, metodo2, metodo4;
    JLabel lblEtiqueta = new JLabel();// se crea una etiqueta jlabel
    JPopupMenu popup = new JPopupMenu();//Se crea el menu de click derecho
    JMenuItem menuPopImprimir =new JMenuItem("Imprimir");//Se crean las opciones del menu
    JMenuItem menuPopBorrar =new JMenuItem("Borrar");
    
    public CasillaVerificacion()//Constructor
    {
        super("Titulo de la ventana"); //Titulo de la ventana
        
        //CREANDO LOS CONTROLES GRAFICOS
        campo1= new JTextField(10);
        campo2 = new JTextField(10);
        campo3 = new JTextField(10);
        txtCampo = new JTextField(10);//Se crea un campo de texto(el tamaño de escritura es de 10 caracteres, ejem: 1234567890, lo demas no se ve)
        chkNegrita = new JCheckBox("Negrita");//Se crea  el checkbox
        chkCursiva = new JCheckBox("Cursiva");//se crea el checkbox
        cmdImprimir = new JButton("IMPRIMIR");
        metodo2= new JButton("Metodo 2");
        metodo4= new JButton("Metodo 4");
        cmdSalir= new JButton("SALIR");
        
        //EVENTO EN CLASE PRIVADA ANONIMA
        cmdSalir.addActionListener
        ( new ActionListener()
          {
            public void actionPerformed(ActionEvent evento)
            {   JOptionPane.showMessageDialog(null, "Saliendo");
                System.exit(0);
            } 
          }
        );
        
        
        //ASOCIAMOS LOS CONTROLES A SU MANEJADOR DE EVENTOS
        ManejadorCheckBox manejaEvento = new ManejadorCheckBox();
        chkNegrita.addItemListener(manejaEvento);
        chkCursiva.addItemListener(manejaEvento);
        
        ManejadorBoton manejaBotones = new ManejadorBoton();
        cmdImprimir.addActionListener(manejaBotones);
        metodo2.addActionListener(manejaBotones);
        metodo4.addActionListener(manejaBotones);
        
        UsandoTeclado k =new UsandoTeclado();
        txtCampo.addKeyListener(k);
        
        UsandoMouse mouse =new UsandoMouse();
        txtCampo.addMouseListener(mouse);
        
        
    
        // CONTRUCCION DEL MENU JPOPMENU e ingresando la funcion de cada opcion
        menuPopImprimir.addActionListener(new ActionListener()//Se instancia en el boton la accion de imprimir
            {  
                public void actionPerformed(ActionEvent evento) 
                {  
                    lblEtiqueta.setText(txtCampo.getText());  
                } 
            }
        );
        menuPopBorrar.addActionListener(new ActionListener()//Se instancia en el boton la accion de borrar
           {   public void actionPerformed(ActionEvent evento)   {  txtCampo.setText("");  }  }
        );
        popup.add(menuPopImprimir);
        popup.add(menuPopBorrar);
        txtCampo.setComponentPopupMenu(popup);//Agregamos al txtfield el popup con las opciones
        ///
        
        Container contenedor = getContentPane(); //Obtenemos acceso a toda la ventana (300*200)
        contenedor.setLayout(new FlowLayout());//El flow ordena de Izq a Der
        //AGREGAMOS LOS CONTROLES AL CONTENEDOR QUE TIENE EL PANEL DE CONTENIDO
        contenedor.add(txtCampo);//se agregan las cosas creadas en el papel en blanco de 300*200
        contenedor.add(chkNegrita);//En el orden que se van agregando se va prdenando en el papel(container)
        contenedor.add(chkCursiva);
        contenedor.add(cmdImprimir);
        contenedor.add(lblEtiqueta);
        contenedor.add(cmdSalir);
        contenedor.add(metodo2);
        contenedor.add(metodo4);
        
        
        setSize(300,200); //Tamaño de la ventana
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//Para que se cierre
        setVisible(true);//Para que la ventana este visible
    }//Fin del constructor
    
    public static void main(String[] args)
    {
        CasillaVerificacion app = new CasillaVerificacion();//Se instancia la clase y se manda directo al constructor para EJECUTAR TODO
    }
    
    //Debajo del main y antes de la llave de cierre de la clase se escribe...
    //CLASE PRIVADA INTERNA PARA MANEJO DE EVENTOS DE TIPO ITEMLISTENER
    private class ManejadorCheckBox implements ItemListener//implementando Interfaz
    {
        private int valNegrita = Font.PLAIN; // Texto plano sin formato
        private int valCursiva = Font.PLAIN;
        
        public void itemStateChanged(ItemEvent evento)//Se tiene que sobreEscribir el metodo para los eventos
        {
            if(evento.getSource() == chkNegrita)//Font.BOLD: letra negrita
            {//              condicion                 si es cierto                                        
                valNegrita = chkNegrita.isSelected() ? Font.BOLD : Font.PLAIN;      //Se retorna en "valNegrita"
            }//                                    signo           si no es cierto    
            
            if(evento.getSource() == chkCursiva)//Font.ITALIC: letra cursiva
            {
                valCursiva = chkCursiva.isSelected() ? Font.ITALIC : Font.PLAIN;
            }
            
            //                 tipo de texto - si es negrita y cursiva - el tamaño de letra
            txtCampo.setFont(new Font("Serif", valNegrita + valCursiva , 14));//   se establece la fuente y si es negrita o cursiva o los dos 
        }//Fin del metodo item
    }//Fin de la clase privada ManejadorchechBox
    
    
    //CLASE PRIVADA INTERNA PARA MANEJO DE EVENTOS DE TIPO ActionListener(botones)
    private class ManejadorBoton implements ActionListener
    {
        public void actionPerformed(ActionEvent evento)
        {
            if(evento.getSource() == cmdImprimir)//Si se da click en el boton imprimir
            {
                lblEtiqueta.setText(txtCampo.getText());//La etiqueta aparece con el texto escrito en el campo "txtCampo"
            }
            if(evento.getSource() == metodo2)//Si se da click en el boton imprimir
            {
                System.out.println("Metodo2");
                mtPuntoFijo m2=new mtPuntoFijo();
            }
            if(evento.getSource() == metodo4)//Si se da click en el boton imprimir
            {
                System.out.println("Metodo4");
                Metodo4 m4=new Metodo4();
                
            }
        }
    }
    
    
    //CLASE PRIVADA INTERNA PARA MANEJO DE EVENTOS DE TIPO KeyListener(teclado)
    private class UsandoTeclado implements KeyListener//Se crea key listener para poder apretar tecla y suceda algo
    {  
        public void keyPressed(KeyEvent ev){}
        public void keyTyped(KeyEvent ev){}
        public void keyReleased(KeyEvent ev)
        {
            String cadena= (txtCampo.getText()).toUpperCase();//Con upperCase se obtiene el texto y se pone en mayuscula y se guarda en "cadena"
            txtCampo.setText(cadena);//simple set rapido
        }
    }//Fin clase Keylistener
    
    //CLASE PRIVADA INTERNA PARA MANEJO DE EVENTOS DE TIPO MouseListener(mouse)
    private class UsandoMouse implements MouseListener
    {
        public void mouseExited(MouseEvent me){}
        public void mouseEntered(MouseEvent me){}
        public void mouseReleased(MouseEvent me){}
        public void mousePressed(MouseEvent me){}
        public void mouseClicked(MouseEvent me)
        {
            if (me.isMetaDown() )//Click derecho
            {
                popup.setLocation(me.getLocationOnScreen());// Localizamos el popMenu en el puntero
                popup.setVisible(true);//Hacemos visible el popMenu
            }
            if(!me.isShiftDown())//click izquierdo
            {
                System.out.println("izq ");
            }
        }
    }//Fin del mouse  listener
    
}//Fin de la clase publica CasillaVerificacion
    


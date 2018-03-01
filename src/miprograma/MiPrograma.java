
package miprograma;

import metodo2aproximacion.mtPuntoFijo;
import metodo4aproximacion.Metodo4;
import java.awt.event.ActionEvent;
import java.io.Serializable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import miprograma.Inicio;
import miprograma.programa;


public class MiPrograma {
 double Iteraccion;
 double Xi;
 double Xs;
 double Xr;
 double FXi;
 double FXr;
 double FXiFXr;
 double ERR;
double n;
   



    public MiPrograma(double Iteraccion, double Xi, double Xs, double Xr, double FXi, double FXr, double FXiFXr, double ERR) {
        this.Iteraccion = Iteraccion;
        this.Xi = Xi;
        this.Xs = Xs;
        this.Xr = Xr;
        this.FXi = FXi;
        this.FXr = FXr;
        this.FXiFXr = FXiFXr;
        this.ERR = ERR;
       
    }

    

  
    public static void main(String[] args) {
    Inicio jj=new Inicio(); 
    jj.setLocationRelativeTo(null);
     jj.setVisible(true);
    
    
    }

    

    

    public double getIteraccion() {
        return Iteraccion;
        
    }

    public double getXi() {
        return Xi;
    }

    public double getXs() {
        return Xs;
    }

    public double getXr() {
        return Xr;
    }

    public double getFXi() {
        return FXi;
    }

    public double getFXr() {
        return FXr;
    }

    public double getFXiFXr() {
        return FXiFXr;
    }

    public double getERR() {
        return ERR;
    }
}



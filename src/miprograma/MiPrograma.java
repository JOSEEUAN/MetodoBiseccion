
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
int Iteraccion;
 double Xi;
 double Xs;
 double Xr;
 double FXi;
 double FXr;
 double FXiFXr;
 double ERR;
double n;
   



    public MiPrograma(int Iteraccion, double Xi,double Xs, double Xr, double FXi, double FXr, double FXiFXr, double ERR) {
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

    public int getIteraccion() {
        return Iteraccion;
    }

    public void setIteraccion(int Iteraccion) {
        this.Iteraccion = Iteraccion;
    }

    public double getXi() {
        return Xi;
    }

    public void setXi(int Xi) {
        this.Xi = Xi;
    }

    public double getXs() {
        return Xs;
    }

    public void setXs(int Xs) {
        this.Xs = Xs;
    }

    public double getXr() {
        return Xr;
    }

    public void setXr(double Xr) {
        this.Xr = Xr;
    }

    public double getFXi() {
        return FXi;
    }

    public void setFXi(double FXi) {
        this.FXi = FXi;
    }

    public double getFXr() {
        return FXr;
    }

    public void setFXr(double FXr) {
        this.FXr = FXr;
    }

    public double getFXiFXr() {
        return FXiFXr;
    }

    public void setFXiFXr(double FXiFXr) {
        this.FXiFXr = FXiFXr;
    }

    public double getERR() {
        return ERR;
    }

    public void setERR(double ERR) {
        this.ERR = ERR;
    }

    public double getN() {
        return n;
    }

    public void setN(double n) {
        this.n = n;
    }
    

    

    

    
}



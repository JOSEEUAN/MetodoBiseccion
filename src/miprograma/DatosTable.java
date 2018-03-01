/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package miprograma;

import java.util.ArrayList;
import java.util.List;
import miprograma.MiPrograma;
import miprograma.programa;
public class DatosTable {
   
double Iteraccion;
 double Xi;
 double Xs;
 double Xr;
 double FXi;
 double FXr;
 double FXiFXr;
 double ERR;
int i;
int n;

    public double getXi() {
        return Xi;
    }

    public void setXi(double Xi) {
        this.Xi = Xi;
    }

    public double getXs() {
        return Xs;
    }

    public void setXs(double Xs) {
        this.Xs = Xs;
    }

    public int getN() {
        return n;
    }

   

    public List<MiPrograma> biseccion = new ArrayList<>();
  
  


    public DatosTable() {

    }
    
    public List<MiPrograma> getTablaBiseccion(int ite, int xii,int xss) {
        
        
       n=ite;
       Xi=xii;
       Xs=xss;
 for ( i = 1; i<  n; i++) {
           
         
            if (i== 0) {
                Xr = (Xi + Xs) / 2;
//2paso

                double s = (Math.pow(Xi, 3));
                double s2 = Math.pow(Xi, 2);
                double g = 4 * s2;
                FXi = s + g - 10;
//FXi = (Math.pow(Xi, 2))-0.9*Xi-1.2;
//FXi = 1.4*(Math.pow(10, -5))*(Math.pow(Xi, 1.5))+1.15*(Math.pow(10, -5))*(Math.pow(Xi, 2));
                System.out.println("");
//                int h;
                double f = (Math.pow(Xr, 3));
                double f2 = Math.pow(Xr, 2);
                double c = 4 * f2;
                FXr = f + c - 10;
//FXr =(Math.pow(Xr, 2))-(0.9*Xr)-1.2;
//FXr = 1.4*(Math.pow(10, -5))*(Math.pow(Xr, 1.5))+1.15*(Math.pow(10, -5))*(Math.pow(Xr, 2));
                FXiFXr = FXi * FXr;

                ERR = (Xr - Xs) / Xr;
// 
            } else {
                if (i== 1 || i != 1) {

                    if (FXiFXr < 0) {

                        Xs = Xr;

                    } else {
                        if (FXiFXr > 0) {
                            Xi = Xr;

                        }
                    }

                    if (FXr < 0) {
                        FXi = FXr;

                    } else {
                        FXr = FXr;
                    }
                    
                    Xr = (Xi + Xs) / 2;
                    double s = (Math.pow(Xi, 3));
                    double s2 = Math.pow(Xi, 2);
                    double g = 4 * s2;
                    FXi = s + g - 10;
//
////           formula general
//                    int h;
                    double f = (Math.pow(Xr, 3));
                    double f2 = Math.pow(Xr, 2);
                    double c = 4 * f2;
                    FXr = f + c - 10;
                    FXiFXr = FXi * FXr;
                    ERR = (Xs - Xr) / Xr;
//                
//programa ejercicio FXi = 1.4*(Math.pow(Xi, 2))-0.9*Xi-1.2;
//formula
//FXi = 1.4*(Math.pow(10, -5))*(Math.pow(Xi, 1.5))+1.15*(Math.pow(10, -5))*(Math.pow(Xi, 2));
////                ejercio FXr =(Math.pow(Xr, 2))-(0.9*Xr)-1.2;
////                FXiFXr = FXi * FXr;
//FXr = 1.4*(Math.pow(10, -5))*(Math.pow(Xr, 1.5))+1.15*(Math.pow(10, -5))*(Math.pow(Xr, 2));
                ERR = (Xr - Xs) / Xr;

                }
                 biseccion.add(new MiPrograma(i,Xi,Xs,Xr,FXi,FXr,FXiFXr,ERR));
        }

       
    }
   
    return biseccion;
    }  

}

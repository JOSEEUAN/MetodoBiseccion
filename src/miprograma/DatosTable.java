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

    int Iteraccion;
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

    public List<MiPrograma> getTablaBiseccion(int ite, double xii, double xss) {

        n = ite;
        Xi = xii;
        Xs = xss;

        for (i = 1; i < n; i++) {

            if (i < 1) {
                Xr = (Xi + Xs) / 2;

//2paso
                double s = (Math.pow(Xi, 3));
                double s2 = Math.pow(Xi, 2);
                double g = 4 * s2;
//  FXi= Math.tan(Xi)-3.5;
//
//FXr=Math.tan(Xr)-3.5;   
//                FXi = s + g - 10;
//                FXi = (Math.pow(Xi, 2)) - 0.9 * Xi - 1.52;
//
//                FXr = (Math.pow(Xr, 2)) - 0.9 * Xr - 1.52;
//                FXi = Xi * (Math.sin(Xi)) - 0.1;
//                FXr = Xr * (Math.sin(Xr)) - 0.1;
//                int h;
                double f = (Math.pow(Xr, 3));
                double f2 = Math.pow(Xr, 2);
                double c = 4 * f2;
                FXr = f + c - 10;
                FXiFXr = FXi * FXr;
                ERR = Xr;
//                ERR = (Xr - Xi) / Xr;

// 
            } else {
                if (i > 0) {

                    if (FXiFXr < 0) {

                        Xs = Xr;

                    } else {
                        if (FXiFXr > 0) {
                            Xi = Xr;

                        }
                    }

//                    if (FXr < 0) {
//                        FXi = FXr;
//
//                    } else {
//                        FXr = FXr;
//                    }
                    Xr = (Xi + Xs) / 2;
                    double s = (Math.pow(Xi, 3));
                    double s2 = Math.pow(Xi, 2);
                    double g = 4 * s2;
                    FXi = s + g - 10;
////
//////           formula general
////                    int h;
                    double f = (Math.pow(Xr, 3));
                    double f2 = Math.pow(Xr, 2);
                    double c = 4 * f2;
                    FXr = f + c - 10;
//         FXi= Math.tan(Xi)-3.5;
//
//FXr=Math.tan(Xr)-3.5;         

//                
//                    FXi = (Math.pow(Xi, 2)) - 0.9 * Xi - 1.52;
//
//                    FXr = (Math.pow(Xr, 2)) - 0.9 * Xr - 1.52;
//                    FXi = Xi * (Math.sin(Xi)) - 0.1;
//                    FXr = Xr * (Math.sin(Xr)) - 0.1;
                    FXiFXr = FXi * FXr;

                    ERR = (Xr - Xi) / Xr;
                }

                biseccion.add(new MiPrograma(i, Xi, Xs, Xr, FXi, FXr, FXiFXr, ERR));
            }

        }

        return biseccion;
    }

}

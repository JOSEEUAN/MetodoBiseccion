/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metodo4aproximacion;

import java.util.ArrayList;
import metodo2aproximacion.Iteracionesm2;

/**
 *
 * @author Dext
 */
public class CalculoMetodo4 {
    public ArrayList getLisCalcularMetodo4(double desdeNumero, int numeroIteraciones, double hastaNumero)
    {
        double dNum =desdeNumero;
        int numI=numeroIteraciones;
        int numIter=0;
        double hNum=hastaNumero;
        ArrayList<IteracionesMtd4> datosList4=new ArrayList<>();
        
        while(numIter < numI){
            if(numIter!=0)
            {
                dNum=datosList4.get(numIter-1).getXi();
                hNum=datosList4.get(numIter-1).getRaiz();
            }
            
            numIter++;
            IteracionesMtd4 fila = new IteracionesMtd4();
            
            fila.setIteraciones(numIter);//Iteraciones
            fila.setXiMenosUno(dNum);//x menos uno
            fila.setXi(hNum);
            fila.setFunXiMenosUno((Math.pow(euler(),-dNum))-dNum);
            fila.setFunXi((Math.pow(euler(),-hNum))-hNum);
            
            double fxi= fila.getFunXi();
            double fxi1= fila.getFunXiMenosUno();
            fila.setRaiz(hNum-((fxi*(dNum-hNum))/(fxi1-fxi)));
            
            double raiz= fila.getRaiz();
            double error= ((raiz-hNum)/raiz);
            if(error<0)
                error=error*-1;
            fila.setError(error);
            
            
            datosList4.add(fila);//Se agrega el objeto fila al arrayList 
        }
        /*
        for(int f=0; f<numI; f++)
        {//Se crea un nuevo objeto(Iteraciones) para cada fila(cada fila u objeto tendra sus atributos(cada columna))
            datosList4.add(new IteracionesM4());
            if(f>0)
            {
                dNum=datosList4.get(f-1).getXi();
                hNum=datosList4.get(f-1).getRaiz();
            }
            for(int c=0; c<7; c++)
            {//f,c
                if(c==0)
                {
                    datosList4.get(f).setIteraciones(f+1);
                }
                if(c==1)
                {
                    datosList4.get(f).setXiMenosUno(dNum);
                }
                if(c==2)
                {
                    datosList4.get(f).setXi(hNum);
                }
                if(c==3)
                {
                    datosList4.get(f).setFunXiMenosUno((Math.pow(euler(),-dNum))-dNum);
                }
                if(c==4)
                {
                    datosList4.get(f).setFunXi((Math.pow(euler(),-hNum))-hNum);
                }
                if(c==5)
                {
                    double fxi= datosList4.get(f).getFunXi();
                    double fxi1= datosList4.get(f).getFunXiMenosUno();
                    datosList4.get(f).setRaiz(hNum-((fxi*(dNum-hNum))/(fxi1-fxi)));
                }
                if(c==6)
                {
                    double raiz= datosList4.get(f).getRaiz();
                    double error= ((raiz-hNum)/raiz);
                    if(error<0)
                        error=error*-1;
                    datosList4.get(f).setError(error);
                    
                }
            }
        }*/
        return datosList4;
    }
    public double euler()
    {
        double e=0;//Sacar euler
        for(int i=1; i<50; i++)
        {
            e= e+1/(double)(factorial(i));
        }
        return e;
    }
    public static long factorial(int x)//Factorial de un numero
    {
        long temp=1;
        for(int i=1; i<x; i++)
        {
            temp= temp*i;
        }
        return temp;
    }//Fin factorial
}

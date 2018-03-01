/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metodo2aproximacion;
import java.util.*;
/**
 *
 * @author Dext
 */
public class CalculosMetodo2 {
    public ArrayList getLisCalcularMetodo2(double desdeNumero, int numeroIteraciones)
    {
        double dNum =desdeNumero;
        int numI=numeroIteraciones;
        ArrayList<IteracionesM2> datosList2=new ArrayList<>();//Se crea el arraylist
        
        for(int f=0; f<numI; f++)
        {//Se crea un nuevo objeto(Iteraciones) para cada fila(cada fila u objeto tendra sus atributos(cada columna))
            datosList2.add(new IteracionesM2());
            if(f>0)
                dNum=datosList2.get(f-1).getXfuncion();
            for(int c=0; c<4; c++)
            {//f,c
                if(c==0)
                {
                    datosList2.get(f).setIteraciones(f+1);
                }
                if(c==1)
                {
                    datosList2.get(f).setXiMenosUno(dNum);
                }
                if(c==2)
                {
                    datosList2.get(f).setXfuncion(Math.pow(euler(),-dNum));
                }
                if(c==3)
                {
                    double res=(datosList2.get(f).getXfuncion()-datosList2.get(f).getXiMenosUno())/datosList2.get(f).getXfuncion();
                    if(res < 0)
                        res=res*-1;
                    datosList2.get(f).setError(res);
                }
            }
        }
        return datosList2;
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

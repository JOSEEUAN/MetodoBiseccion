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
public class CalculoMetodo2 {
    
    public ArrayList getLisCalcularMetodo2(double desdeNumero, int numeroIteraciones )
    {
        double dNum =desdeNumero;
        int numI=numeroIteraciones;
        int numIter=0;
        
        ArrayList<Iteracionesm2> datosList2=new ArrayList<>();//Se crea el arraylist
        
        while(numIter < numI){
            if(numIter!=0)
            {
                dNum=datosList2.get(numIter-1).getXfuncion();
            }
            
            numIter++;
            Iteracionesm2 fila = new Iteracionesm2();
            
            fila.setIteraciones(numIter);//Iteraciones
            fila.setXiMenosUno(dNum);//x menos uno
            fila.setXfuncion(Math.pow(euler(),-dNum));//Funcion x
            double err=(fila.getXfuncion()-fila.getXiMenosUno())/fila.getXfuncion();//Error
            if(err < 0)
                err=err*-1;
            fila.setError(err);
            
            datosList2.add(fila);//Se agrega el objeto fila al arrayList 
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

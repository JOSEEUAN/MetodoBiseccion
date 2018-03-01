
 
package metodo3;
import java.awt.*;
import java.awt.List;
import java.util.ArrayList;

public class OperacionTabla {


   int iter;int x;
public ArrayList<METODO3> newton =new ArrayList<>();
 
public OperacionTabla(){


}
public ArrayList<METODO3> getTablaNewton(int i, double xii){
    double xiii=xii;
    int it=i;
    int vueltas=0;
    
//poner las operaciones

        /*System.out.print(x+""+fx+""+dev+""+xi1+""+error);
        fx=(Math.pow(euler(), -xi)-xi);
        dev=Math.pow(-euler(), -xi)-1;
        xi1=fx/dev;
        error=(xi1-xi)/xi1;
        System.out.print(x+""+fx+""+dev+""+xi1+""+error);
           */
    while(vueltas < it)
    {
        METODO3 m3 =new METODO3();
        if(vueltas!=0)
        {
            xiii=newton.get(vueltas-1).getXi1();
        }
        vueltas++;
        m3.setI(vueltas);
        m3.setXi(xiii);
        m3.setFX(Math.pow(euler(), -xiii)-xiii);
        m3.setFXD((-1*(Math.pow(euler(),-xiii)))-1);
        m3.setXi1(m3.getXi()-(m3.getFX()/m3.getFXD()));
        double error=((m3.getXi1()-m3.getXi())/m3.getXi1());
        if(error<0)
            error=error*-1;
        m3.setError(error);
        System.out.print(m3.getXi()+" "+m3.getFX()+" "+m3.getFXD()+" "+m3.getXi1()+" deedde "+m3.getError());
        
        newton.add(m3);
    }
    /*else{if(x==1 || x!=1){
            xi=xi1;
            fx=Math.pow(euler(), -xi)-xi;
        dev=Math.pow(-euler(), -xi)-1;
        xi1=fx/dev;
        error=(xi1-xi)/xi1;
               
        }
    newton.add(new METODO3(x, xi, fx, dev, xi1, error ));
    }*/

return newton;
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


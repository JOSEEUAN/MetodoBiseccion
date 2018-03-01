/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package miprograma;

import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Toshiba
 */
public class AbstracModel extends AbstractTableModel{
private List<MiPrograma> biseccion;


 private String[] columna={
                "Iteración ", "Xi", "Xs", "Xr", "FXi", "FXr", "FXi * FXs", "Er"
            };
public AbstracModel(List<MiPrograma> biseccion){

this.biseccion=biseccion;
}
    @Override
    public int getRowCount() {
     return biseccion.size();
    }

    @Override
    public int getColumnCount() {
     return columna.length;
    }

    @Override
    public Object getValueAt(int i, int i1) {
        
        switch(i1){
            case 0:
               return biseccion.get(i).getIteraccion();
            case 1:
                return biseccion.get(i).getXi();
            case 2: 
                return biseccion.get(i).getXs();
            case 3: 
                return biseccion.get(i).getXr();
            case 4: 
                return biseccion.get(i).getFXi();
            case 5:
                return 
                        biseccion.get(i).getFXr();
            case 6:
                return biseccion.get(i).getFXiFXr();
            case 7: 
                return biseccion.get(i).getERR();
            
        }
        
       return null;  
       
    }
    
   public String getColumnName(int column) {
return columna[column];
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ecuaciondos;

/**
 *
 * @author prg
 */
public class EcuacionLineal {
    private double a, b;
    private double solucion ;
    //private boolean tieneSolucion; 
    
    public boolean tieneSolucion(){
        if (a==0) return false;
        else return true;
        
    }
    public EcuacionLineal(double a, double b){
        this.a = a;
        this.b = b;
        if(tieneSolucion())
             solucion = -b/a;
        
     }
    public double getSolucion(){
        return solucion;
    }
}

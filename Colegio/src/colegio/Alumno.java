/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colegio;

/**
 *
 * @author prg
 */
public class Alumno {

    private String nombre;
    private double nota;
    
    
    public Alumno(){
    }
    
    public Alumno(String nombre, double nota){
        this.nombre = nombre;
        this.nota = nota;
      
    }
    
    
    public Alumno(String nombre){
        this.nombre = nombre;
        this.nota = 0;
      
    }
    

    public boolean aprobado() {
        return (nota >= 5) ;
        
    }
/*public boolean aprobado() {
        if (nota >= 5) {
            return true;
        } else {
            return false;
        }
    }
  */  
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        if ((nota <0) || (nota>10)) 
            this.nota = 0;
        else  this.nota = nota;
        
      /*   if ((nota>=0) && (nota<=10)) 
            this.nota = nota;
        else  this.nota = 0;
*/
    }

  

    
    
    
    
}

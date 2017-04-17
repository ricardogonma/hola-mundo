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
public class Colegio {

    /**
     * @param args the command line arguments
     */

    public static void main(String[] args) {
               
        
        Alumno alumno1, alumno2, alumno3;
        
        
        
        alumno1 = new Alumno();
         alumno1.setNombre("pepe");
         alumno1.setNota(7.5);
         System.out.println("Nota: "+alumno1.getNota());
         if (alumno1.aprobado()) System.out.println("Aprobado");
         else System.out.println("suspenso"); 
         
         alumno2 = new Alumno("pepe",4);
         System.out.println("Nota: "+alumno2.getNota());
         if (alumno2.aprobado()) System.out.println("Aprobado");
         else System.out.println("suspenso"); 
         
         alumno3 = new Alumno("juan");
         System.out.println("Nota: "+alumno3.getNota());
         if (alumno3.aprobado()) System.out.println("Aprobado");
         else System.out.println("suspenso"); 
       
                
         
    }
    
}

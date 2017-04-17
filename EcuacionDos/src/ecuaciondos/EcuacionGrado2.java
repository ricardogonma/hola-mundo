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
public class EcuacionGrado2 {
     private double a, b, c;
    private double discriminante;
    private int numeroDeSoluciones;
    private double sol1, sol2;

    public int getNumeroDeSoluciones() {
        return numeroDeSoluciones;
    }

    public double getSol1() {
        return sol1;
    }

    public double getSol2() {
        return sol2;
    }

    public EcuacionGrado2() {
    }

    public EcuacionGrado2(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
        //discriminante = calculaDiscriminante();
        discriminante = (b * b - 4 * a * c);

        if (a == 0) {  //bx+c = 0
            if (b != 0) {
                sol1 = -c / b;
                numeroDeSoluciones = 1;
            }
            EcuacionLineal ecl = new EcuacionLineal(b,c);
            if (ecl.tieneSolucion()){
                sol1=ecl.getSolucion();
                numeroDeSoluciones =1;
            }
            else {
                
                 numeroDeSoluciones =0;
            }
            

        } else if (discriminante > 0) {

            sol1 = calculaSol1();
            sol2 = calculaSol2();
            numeroDeSoluciones = 2;

        } else if (discriminante == 0) {
            sol1 = calculaSol1();
            numeroDeSoluciones = 1;
        } else {
            numeroDeSoluciones = 0;
        }
    }

    private double calculaDiscriminante() {
        return (b * b - 4 * a * c);
    }

    private double calculaSol1() {
        return (-b - Math.sqrt(discriminante)) / (2 * a);
    }

    private double calculaSol2() {
        return (-b + Math.sqrt(discriminante)) / (2 * a);
    }

    
}

package metodoResiduos;

import javax.swing.*;

public class Residuos {
    private double x6;
    private double x5;
    private double x4;
    private double x3;
    private double x2;
    private double x;
    private double c;
    private double a;
    private double b;

    JTable tabla;

    public Residuos(double x6, double x5, double x4, double x3, double x2, double x, double c, double a, double b) {
        this.x6 = x6;
        this.x5 = x5;
        this.x4 = x4;
        this.x3 = x3;
        this.x2 = x2;
        this.x = x;
        this.c = c;
        this.a = a;
        this.b = b;
    }

    public Residuos(JTable tabla){
        this.tabla = tabla;
    }


    public double encontrarvalor(){
        //calcular la funcion con el valor de x
        double resultado = 0;
        resultado = (a*Math.pow(x,6))+(b*Math.pow(x,5))+(c*Math.pow(x,4))+(x3*Math.pow(x,3))+(x2*Math.pow(x,2))+(x*x)+c;
        return resultado;
    }



    /*
    *
    * metodo para hacer el calculo de ruffini
    *  donde se toma el valor de las x
    *
    * */

    //calcular metodo de los residuos





}

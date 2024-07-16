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


    public double encontrarvalor() {
        //calcula el valor de una funcion fx
        return (x6 * Math.pow(a, 6)) + (x5 * Math.pow(a, 5)) + (x4 * Math.pow(a, 4)) + (x3 * Math.pow(a, 3)) + (x2 * Math.pow(a, 2)) + (x * Math.pow(a, 1)) + c;
    }
    public double encontrarvalorb(){
        //calcula el valor de una funcion fx
        double resultado = 0;
        resultado = (x6*Math.pow(b,6))+(x5*Math.pow(b,5))+(x4*Math.pow(b,4))+(x3*Math.pow(b,3))+(x2*Math.pow(b,2))+(x*b)+c;
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

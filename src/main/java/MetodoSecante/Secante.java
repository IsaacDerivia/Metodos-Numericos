package MetodoSecante;

import java.math.BigDecimal;
import java.math.RoundingMode;
//import para llenar una Jtable
import javax.swing.table.DefaultTableModel;


public class Secante {
    //crear variables para el metodo de las secantes
    private double x6;
    private double x5;
    private double x4;
    private double x3;
    private double x2;
    private double x1;
    private double x0;
    private double xia;
    private double xi;
    private double error;
    private int deciamles;

    //constructor de la clase

    public Secante(double x6, double x5, double x4, double x3, double x2, double x1, double x0, double xia, double xi, double error, int deciamles) {
        this.x6 = x6;
        this.x5 = x5;
        this.x4 = x4;
        this.x3 = x3;
        this.x2 = x2;
        this.x1 = x1;
        this.x0 = x0;
        this.xia = xia;
        this.xi = xi;
        this.error = error;
        this.deciamles = deciamles;
    }

    public void calcular(DefaultTableModel modelo){
        //crear variables para el metodo de las secantes
        BigDecimal fxi;
        BigDecimal fxia;
        BigDecimal xi1;
        double errorCalculado;
        int i = 0;
        //ciclo para calcular las iteraciones
        do{
            //calcular fxi
            fxi = BigDecimal.valueOf(x6).multiply(BigDecimal.valueOf(xi).pow(6))
                    .add(BigDecimal.valueOf(x5).multiply(BigDecimal.valueOf(xi).pow(5)))
                    .add(BigDecimal.valueOf(x4).multiply(BigDecimal.valueOf(xi).pow(4)))
                    .add(BigDecimal.valueOf(x3).multiply(BigDecimal.valueOf(xi).pow(3)))
                    .add(BigDecimal.valueOf(x2).multiply(BigDecimal.valueOf(xi).pow(2)))
                    .add(BigDecimal.valueOf(x1).multiply(BigDecimal.valueOf(xi)))
                    .add(BigDecimal.valueOf(x0));
            //calcular fxia
            fxia = BigDecimal.valueOf(x6).multiply(BigDecimal.valueOf(xia).pow(6))
                    .add(BigDecimal.valueOf(x5).multiply(BigDecimal.valueOf(xia).pow(5)))
                    .add(BigDecimal.valueOf(x4).multiply(BigDecimal.valueOf(xia).pow(4)))
                    .add(BigDecimal.valueOf(x3).multiply(BigDecimal.valueOf(xia).pow(3)))
                    .add(BigDecimal.valueOf(x2).multiply(BigDecimal.valueOf(xia).pow(2)))
                    .add(BigDecimal.valueOf(x1).multiply(BigDecimal.valueOf(xia)))
                    .add(BigDecimal.valueOf(x0));
            //calcular xi1
            xi1 = BigDecimal.valueOf(xi).subtract((fxi.multiply(BigDecimal.valueOf(xia).subtract(BigDecimal.valueOf(xi)))).divide(fxia.subtract(fxi), deciamles, RoundingMode.HALF_UP));
            //calcular errorrelativo
            errorCalculado = Math.abs((xi1.doubleValue()-xi)/xi1.doubleValue())*100;
            //agregar los resultados a la tabla
            modelo.addRow(new Object[]{i, Redondear(deciamles, xi1.doubleValue()), Redondear(deciamles, errorCalculado)});
            //actualizar las variables
            xia = xi;
            xi = xi1.doubleValue();
            i++;
        }while(errorCalculado>error || i<200);
    }


    /**
     * Este método se utiliza para redondear un número decimal a un número específico de decimales.
     *
     * @param decimales El número de decimales a los que se debe redondear el número. Debe ser un entero no negativo.
     * @param numero El número que se va a redondear. Puede ser cualquier número de punto flotante.
     * @return El número redondeado a la cantidad especificada de decimales. El redondeo se realiza utilizando el modo HALF_UP,
     * lo que significa que si la siguiente cifra decimal es >= 5, el último dígito se redondea hacia arriba.
     */
    public double Redondear(int decimales, double numero) {
        BigDecimal bd = new BigDecimal(Double.toString(numero));
        bd = bd.setScale(decimales, RoundingMode.HALF_UP);
        return bd.doubleValue();
    }

}

package metodoResiduos;

import java.util.ArrayList;

public class Biseccion {
    private Polinomio polinomio;
    private double errorPermitido;

    public Biseccion(Polinomio polinomio, double errorPermitido) {
        this.polinomio = polinomio;
        this.errorPermitido = errorPermitido;
    }

    public ArrayList<ResultadoBiseccion> encontrarRaices(double a, double b) {
        ArrayList<ResultadoBiseccion> resultados = new ArrayList<>();
        int iteracion = 0;
        double errorRelativo = Double.MAX_VALUE;
        double aproximacionAnterior = 0;

        while (errorRelativo > errorPermitido) {
            double c = (a + b) / 2;
            double fa = polinomio.evaluar(a);
            double fc = polinomio.evaluar(c);

            if (iteracion > 0) {
                errorRelativo = Math.abs((c - aproximacionAnterior) / c)*100;
            }
            aproximacionAnterior = c;

            resultados.add(new ResultadoBiseccion(iteracion, c, errorRelativo));

            if (fc == 0.0) {
                break;
            } else if (fa * fc < 0) {
                b = c;
            } else {
                a = c;
            }
            iteracion++;
        }
        return resultados;
    }
}

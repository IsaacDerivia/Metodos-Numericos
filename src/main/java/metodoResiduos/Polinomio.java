package metodoResiduos;

public class Polinomio {
    private double[] coeficientes;

    public Polinomio(double... coeficientes) {
        this.coeficientes = coeficientes;
    }

    // Método de Horner para evaluar el polinomio en un punto x
    public double evaluar(double x) {
        double resultado = coeficientes[0];
        for (int i = 1; i < coeficientes.length; i++) {
            resultado = resultado * x + coeficientes[i];
        }
        return resultado;
    }
}

package metodoResiduos;

import java.util.ArrayList;

public class encontrarIntervalos {
    private double a;

    /**
     * Constructor de la clase encontrarIntervalos.
     *
     * @param a El número para el cual se buscarán los divisores.
     */
    public encontrarIntervalos(double a) {
        this.a = a;
    }

    /**
     * Encuentra y retorna un arreglo de todos los divisores de 'a', primero los negativos y luego los positivos.
     *
     * Este método busca todos los divisores positivos del número 'a' proporcionado al constructor de la clase.
     * Posteriormente, crea un arreglo que contiene primero todos los divisores negativos y luego todos los positivos.
     *
     * @return Un arreglo de doubles que contiene primero todos los divisores negativos y luego los positivos de 'a'.
     */
    public double[] encontrarIntervalos() {
        ArrayList<Double> divisoresList = new ArrayList<>();
        // Encontrar divisores positivos
        for (int i = 1; i <= a; i++) {
            if (a % i == 0) {
                divisoresList.add((double) i);
            }
        }

        // Crear arreglo para almacenar primero divisores negativos y luego positivos
        double[] intervalos = new double[divisoresList.size() * 2];
        int index = 0;
        // Agregar primero los negativos
        for (Double divisor : divisoresList) {
            intervalos[index++] = -divisor;
        }
        // Luego agregar los positivos
        for (Double divisor : divisoresList) {
            intervalos[index++] = divisor;
        }

        // Imprimir intervalos
        System.out.println("Intervalos: ");
        for (double intervalo : intervalos) {
            System.out.println(intervalo);
        }
        return intervalos;
    }

}
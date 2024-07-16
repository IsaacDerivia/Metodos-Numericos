package metodoResiduos;

public class ResultadoBiseccion
{
    public int iteracion;
    public double aproximacion;
    public double errorRelativo;

    public ResultadoBiseccion(int iteracion, double aproximacion, double errorRelativo) {
        this.iteracion = iteracion;
        this.aproximacion = aproximacion;
        this.errorRelativo = errorRelativo;
    }

}

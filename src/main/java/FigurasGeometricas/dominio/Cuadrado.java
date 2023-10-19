package FigurasGeometricas.dominio;

public class Cuadrado extends Figuras{
    protected double lado;

    public Cuadrado(String nombre, double lado) {
        super(nombre);
        this.lado = lado;
    }

    public double getLado() {
        return lado;
    }
}

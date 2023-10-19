package FigurasGeometricas.dominio;

public class Triangulo extends Figuras{
    protected double base;
    protected double altura;

    public Triangulo(String nombre, double base, double altura) {
        super(nombre);
        this.base = base;
        this.altura = altura;
    }

    public double getBase() {
        return base;
    }

    public double getAltura() {
        return altura;
    }
}

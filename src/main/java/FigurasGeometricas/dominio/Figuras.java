package FigurasGeometricas.dominio;

public class Figuras {
    protected String nombre;

    public Figuras(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
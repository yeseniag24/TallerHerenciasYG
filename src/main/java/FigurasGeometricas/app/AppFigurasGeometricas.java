package FigurasGeometricas.app;
import FigurasGeometricas.dominio.Circulo;
import FigurasGeometricas.dominio.Cuadrado;
import FigurasGeometricas.dominio.Triangulo;
import FigurasGeometricas.dominio.Figuras;

import java.util.ArrayList;
import java.util.List;

public class AppFigurasGeometricas {
    public static void main(String[] args){

        List<Figuras> figuras = new ArrayList<>(); // Cambiado el nombre de la lista para seguir las convenciones de nomenclatura

        Circulo circulo = new Circulo("Circulo", 3.14);
        Cuadrado cuadrado = new Cuadrado("Cuadrado", 4.14);
        Triangulo triangulo = new Triangulo("Triangulo", 3, 1.5);

        figuras.add(circulo);
        figuras.add(cuadrado);
        figuras.add(triangulo);

        for (Figuras figura : figuras) {
            if (figura instanceof Circulo) {
                System.out.println("Esta figura es un círculo");
            } else if (figura instanceof Cuadrado) {
                System.out.println("Esta figura es un cuadrado");
            } else if (figura instanceof Triangulo) {
                System.out.println("Esta figura es un triángulo");
            } else {
                System.out.println("Esta figura no es reconocida");
            }
        }
    }
}



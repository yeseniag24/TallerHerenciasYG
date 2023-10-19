package FigurasGeometricas.dominio;

    public class Circulo extends Figuras{
        protected double radio;

        public Circulo(String nombre, double radio) {
            super();
            this.radio = radio;
        }

        public double getRadio() {
            return radio;
        }

    }


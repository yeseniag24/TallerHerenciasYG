package Celular.dominio;

public class Smartphone extends Celular{
    protected String color;

    public Smartphone(int serial, String marca, String color) {
        super(serial, marca);
        this.color = color;
    }

    public String getColor() {
        return color;
    }
    public void setColor(String color){
        this.color = color;
    }
}

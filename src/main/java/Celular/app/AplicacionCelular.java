package Celular.app;

import Celular.dominio.Celular;
import Celular.dominio.Smartphone;

import java.util.ArrayList;
import java.util.List;

public class AplicacionCelular {

    public static void main(String[] args){
        List<Celular> Celular = new ArrayList<>();
        Smartphone Smartphone = new Smartphone(15256, "Xiaomi", "Azul");
        Smartphone Smartphone2 = new Smartphone(25746, "Apple", "Gris");

        Celular.add(Smartphone);
        Celular.add(Smartphone2);

        ((Smartphone) Smartphone).getColor();
        if (Smartphone instanceof Smartphone){
            System.out.println("El equipo es un Smartphone");
        }else{
            System.out.println("EL equipo no corresponde a un Smartphone");
        }
    }
}



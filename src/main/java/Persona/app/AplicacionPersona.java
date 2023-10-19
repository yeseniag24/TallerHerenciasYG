package Persona.app;
import Persona.dominio.Persona;
import Persona.dominio.Estudiante;
import Persona.dominio.Profesor;

import java.util.ArrayList;
import java.util.List;

public class AplicacionPersona {

    public static void main(String[] args){
        List<Persona> persona = new ArrayList<>();
        Profesor profe = new Profesor(10369, "Ruben", 57, "Hombre", "Profesional",
                "20 Años", "Programacion");
        Estudiante estudiante1 = new Estudiante(002, "Camilo", 32, "Hombre", 8,
                4.7);
        persona.add(profe);
        persona.add(estudiante1);

        ((Profesor) profe).setExperienciaLaboral("3 Años");
        if (profe instanceof Profesor){
            System.out.println(profe.getNombre() + " es un Profesor de " + profe.getEspecialidad());
        }else{
            System.out.println(estudiante1.getNombre() + " es un estudiante");
        }

    }
}


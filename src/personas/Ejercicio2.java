package personas;

import java.util.ArrayList;
import java.util.List;

public class Ejercicio2 {
    public static void main(String[] args) {
        List<Persona> personas = new ArrayList<>();
        Persona p = new Persona("Carlos", "Buceag", "1965");
        personas.add(p);

        p = new Persona("Jean", "Apata", "1980");
        personas.add(p);

        ApellidoPorA(personas);
    }

        public static void
        ApellidoPorA(List < Persona > personas) {
             personas.stream().filter(persona -> persona.getApellidos().startsWith("A"))

                    .forEach(persona -> System.out.println(persona.getApellidos()));
        }
    }



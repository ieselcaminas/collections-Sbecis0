package personas;

import java.util.ArrayList;
import java.util.List;

public class Problema1 {
    public static void main(String[]args) {
        List<Persona> personas = new ArrayList<>();
        Persona p = new Persona("Carlos", "Buceag", "1965");
        personas.add(p);

        p = new Persona("Jean", "Zapata", "1980");
        personas.add(p);

        Menor(personas);
    }
    public static void
    Menor(List < Persona > personas) {
//        personas.stream().filter(Persona -> Persona.getCumple() < 1970).count();
        System.out.println();
    }


    }




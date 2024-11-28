import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Telefono2 {
    public static void main(String[] args) {
        Map<String, ArrayList<String>> agenda = new HashMap<>();
        ArrayList<String> telefonos = new ArrayList<>();
        telefonos.add("123456789");
        telefonos.add("634267486");
        agenda.put("Carlos", telefonos);

        telefonos = new ArrayList<>();
        telefonos.add("987654321");
        telefonos.add("238947289");
        agenda.put("Jeandeivid", telefonos);


        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un nombre: ");
        String nombre = sc.nextLine();
        System.out.println("El telefono de " + nombre + " es " + agenda.get(nombre));
    }
}

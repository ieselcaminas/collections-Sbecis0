import java.util.Map;
import java.util.HashMap;
import java.util.Scanner;

public class Telefono {
    public static void main(String[] args) {
        Map<String, String>telefonos = new HashMap<String, String>();
        telefonos.put("Pepe", "123456789");
        telefonos.put("Luis", "987654321");
        telefonos.put("Maria", "5555555552");
        telefonos.put("Ana", "444444444");

        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un nombre: ");
        String nombre = sc.nextLine();
        System.out.println("El telefono de " + nombre + " es " + telefonos.get(nombre));
    }
}

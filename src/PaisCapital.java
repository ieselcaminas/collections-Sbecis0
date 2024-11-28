import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;

public class PaisCapital {
    public static void main(String[] args) {
        Map<String, String> mapa1 = new HashMap<String, String>();
        mapa1.put("Argentina", "Buenos Aires");
        mapa1.put("Brasil", "Brasilia");
        mapa1.put("Colombia", "Bogota");
        mapa1.put("Bulgaria", "Sofia");
        mapa1.put("España", "Madrid");


        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce un pais: ");
        String pais = scanner.nextLine();

        if (mapa1.containsKey(pais)) {
            System.out.println("La capital de " + pais + " es " + mapa1.get(pais));
        } else {
            System.out.println("El pais " + pais + " no esta en el diccionario");

        }
    }
}

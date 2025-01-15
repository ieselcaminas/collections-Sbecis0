import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class LastNameFrequecy {
    public static Map<String, String> frecuenciaApellidos() throws IOException {
        Map<String, String> apellidos = new HashMap<>();
        BufferedReader reader = new BufferedReader(new FileReader("files/LastnameFrequencies.csv"));
        String linea;


        while ((linea = reader.readLine()) != null) {
            String[] partes = linea.split(",");
            if (partes.length != 2) continue;
            String apellido = partes[0];
            String frecuencia = partes[1];
            String cont = apellidos.get(apellido);
            if (cont == null) {
                apellidos.put(apellido, frecuencia);
            }
        }
        return apellidos;
    }

    public static void main(String[] args) throws IOException {
        Map<String, String> nombres = frecuenciaApellidos();
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un apellido: ");
        String apellido = sc.nextLine();
        String frecuencia = nombres.get(apellido);
        if (frecuencia == null) {
            System.out.println("No existe el apellido");
        } else {
            System.out.println("El apellido " + apellido + " aparece " + frecuencia + " veces");
        }
    }
}

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;


public class CountCountries {
    public static Map<String, Integer> contarPaises() throws IOException {
        Map<String, Integer> paises = new HashMap<>();
        BufferedReader reader = new BufferedReader(new FileReader("files/Colfuturo-Seleccionados.csv"));
        String linea;
        String pais;
        String [] campos;
        Integer cont;
        reader.readLine();
        while ((linea = reader.readLine()) != null) {
            campos = linea.split(",");
            pais = campos[6];
            cont = paises.get(pais);
            if (cont == null) {
                paises.put(pais, 1);
            } else {
                paises.put(pais, cont + 1);
            }
        }
        return paises;
    }
    public static void main(String[] args) throws IOException {
        Map<String, Integer> paises = contarPaises();
        for (Map.Entry<String, Integer> entrada : paises.entrySet()) {
            System.out.println(entrada.getKey() + " : " + entrada.getValue());
        }
    }
}


import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class mediaArray {
    public static void main(String[] args) {

        ArrayList<Integer> numeros = new ArrayList<>();
        double suma = 0;

        numeros.add(5);
        numeros.add(2);
        numeros.add(3);
        numeros.add(2);

        for (int i = 0; i < numeros.size(); i++) {
            suma += numeros.get(i);

        }
        System.out.println(suma / numeros.size());
        Collections.sort(numeros);




    }
}

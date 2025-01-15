package personas;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PromblemaEj4 {
    public static void main(String[] args) {

        List<Integer> numeros = new ArrayList<>();
        numeros.add(6);
        numeros.add(-2);
        numeros.add(2);

        numeros.stream().filter(n-> n >= 1 && n <= 5)
                .forEach( n -> System.out.println(n));


    }
}

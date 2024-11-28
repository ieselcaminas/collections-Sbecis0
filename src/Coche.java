import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Coche {
    public static void main(String[] args) {
        ArrayList<String> coches = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        String marca;
        do{
            marca = sc.nextLine();
            if (marca.isEmpty()) break;
            coches.add(marca);
        }while(true);

        Collections.sort(coches);
        for (int i = 0; i < coches.size(); i++) {
            System.out.println(coches.get(i));

        }
    }
}

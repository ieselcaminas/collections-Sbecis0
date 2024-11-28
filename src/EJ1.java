import java.util.ArrayList;

public class EJ1 {
    public static void main(String[] args) {
        ArrayList<String> coches = new ArrayList<String>();
        coches.add("Ferrari");
        coches.add("Lamborghini");
        coches.add("Fiat");
        coches.add("Mercedes");
        coches.add("Audi");

        for (int i = 0; i < coches.size(); i++) {
            System.out.println(coches.get(i));

        }
        coches.remove(0);
        System.out.println("_____");
        for (int i = 0; i < coches.size(); i++) {
            System.out.println(coches.get(i));

        }
        if(coches.isEmpty()){
            System.out.println("La lista esta vacia");
        }
    }
}

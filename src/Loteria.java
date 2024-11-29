import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

public class Loteria {
    public static void main(String[] args) {
        System.out.println(terminaciones(new String[]{"00004", "03847", "39804"}));
    }

    public static Map<Character, Integer> terminaciones(String[] boletos) {
        Map<Character, Integer> terminaciones = new HashMap<>();
        Character ultimo;
        Integer cont ;
        for (int i = 0; i < boletos.length; i++) {
            ultimo = boletos[i].charAt(boletos.length -1);
        }

        for(String boleto: boletos){
            ultimo = boleto.charAt(boleto.length()-1);
            cont = terminaciones.get(ultimo);
            if(cont == null){
                terminaciones.put(ultimo, 1);
            }else{
                terminaciones.put(ultimo, cont + 1);
            }
    }return terminaciones;
    }
}






import java.util.HashMap;
import java.util.Map;


public class Frecuencia {


    public static void main(String[] args) {
        System.out.println(terminaciones(new String[]{"uno", "dos", "dos", "dos", "tres"}));
    }


    public static Map<String, Integer> terminaciones(String[] boletos) {
        Map<String, Integer> terminaciones = new HashMap<>();
        String ultimo;
        Integer cont ;
        for (int i = 0; i < boletos.length; i++) {
            ultimo = boletos[i];
        }

        for(String boleto: boletos){
            ultimo = boleto;
            cont = terminaciones.get(ultimo);
            if(cont == null){
                terminaciones.put(ultimo, 1);
            }else{
                terminaciones.put(ultimo, cont + 1);
            }
        }return terminaciones;
    }
}




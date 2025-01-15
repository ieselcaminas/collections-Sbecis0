import java.util.HashMap;

public class Refuerzo4 {
    public static int moda(int[] numeros) {
        HashMap<Integer, Integer> frecuencia = new HashMap<>();
        int maxFrecuencia = 0;
        int moda = numeros [0];

        for (int numero : numeros) {
            frecuencia.put(numero, frecuencia.getOrDefault(numero, 0) + 1);
            if (frecuencia.get(numero) > maxFrecuencia) {
                maxFrecuencia = frecuencia.get(numero);
                moda = numero;
            }
        }
        return moda;
    }

    public static void main(String[] args) {
        int[] numeros = {1, 2, 3, 4, 4};
        System.out.println("La moda es: " + moda(numeros));

    }
}

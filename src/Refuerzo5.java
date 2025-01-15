import java.util.Arrays;

public class Refuerzo5 {
    public static double mediana (int[] numeros) {
        double mediana ;
        Arrays.sort(numeros);
        if (numeros.length % 2 == 0) {
            mediana = (numeros[numeros.length / 2] + numeros[numeros.length / 2 - 1]) / 2.0;

        } else {
            mediana = numeros[numeros.length / 2];
        }
        return mediana;
    }

    public static void main(String[] args) {
        int[] numeros = {1, 6, 4, 7, 5};
        System.out.println("La mediana es: " + mediana(numeros));

    }
}

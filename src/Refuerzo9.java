public class Refuerzo9 {
    public static void main(String[] args) {
        int dividendeo = 8;
        int divisor = 5;
        System.out.println("El resultado es: " + dividirFactorial(dividendeo, divisor));
    }

    public static int dividirFactorial(int dividendo, int divisor) {
        int resultado = 1;
        for (int i = divisor + 1; i <= dividendo; i++) {

           resultado  *= i;
        }
            return resultado;

    }

}


//si el divisor es 5 se empieza en 6 ----> +1
//acaba hasta que alcanze el valor del dividendo//cada que gira i sube
//1 * 6 = 6   6 * 7 = 42 etc..
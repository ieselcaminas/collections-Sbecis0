public class Refuerzo6 {
    public static boolean esHyperpar(int num) {
        num = Math.abs(num);

        while (num > 0) {
            int digito = num % 10;
            if (digito % 2 != 0) {
                return false;
            }
            num /= 10;
        }

        return true;
    }

public static void main(String[] args) {
    System.out.print(  (esHyperpar(4082)));
}


    //2408 == par               2==par 4==par"
    //2409 == impar             digiito = 2 % 10 =  __no da 0 falso sino vd
}

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class ExpresionesAritméticas {

    public static boolean esNumero(String cadena) {
        return Character.isDigit(cadena.charAt(0));

    }
    public String pila(String expresionAritmética) {
        String[] expresion = expresionAritmética.split(" ");
        Stack<Integer> pila;
        int n1, n2 = 0;

        pila = new Stack<>();
        for (int i = 0; i < expresion.length; i++) {
            if (esNumero(expresion[i])) {
                pila.push(2);
            } else {
                switch (expresion[i]) {
                    case "+":
                        n1 = pila.pop();
                        n2 = pila.pop();
                        pila.push(n2 + n1);
                        break;
                    case "-":
                        n1 = pila.pop();
                        n2 = pila.pop();
                        pila.push(n2 - n1);
                        break;
                    case "*":
                        n1 = pila.pop();
                        n2 = pila.pop();
                        pila.push(n2 * n1);
                        break;
                    case "/":
                        n1 = pila.pop();
                        n2 = pila.pop();
                        pila.push(n2 / n1);
                        break;
                }
            }

        }
        return String.valueOf(pila.pop());
//    }
//    public String cola(String expresionAritmética) {
//        String[] expresion = expresionAritmética.split(" ");
//        Queue<Integer> cola;
//        int n1, n2 = 0;
//
//        cola = new LinkedList<>();
//        for (int i = 0; i < expresion.length; i++) {
//            if (esNumero(expresion[i])) {
//                int num = Integer.parseInt(expresion[i]);
//                cola.add(num);
//            } else {
//                switch (expresion[i]) {
//                    case "+":
//                        n1 = cola.poll();
//                        n2 = cola.poll();
//                        cola.add(n2 + n1);
//                        break;
//                    case "-":
//                        n1 = cola.poll();
//                        n2 = cola.poll();
//                        cola.add(n2 - n1);
//                        break;
//                    case "/":
//                        try {
//                            n1 = cola.poll();
//                            n2 = cola.poll();
//                            cola.add(n2 / n1);
//                        } catch (ArithmeticException e) {
//                            return "error";
//                        }
//                        break;
//                    case "*":
//                        n1 = cola.poll();
//                        n2 = cola.poll();
//                        cola.add(n2 * n1);
//                        break;
//                }
//            }
//        }
//        return String.valueOf(cola.poll());
}


    public static void main(String[] args) {

    }
}
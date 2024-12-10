import java.util.Stack;
public class Parentesis {
    public static boolean esBalanceado(String cadena){
        boolean balanced;
        char character;
        Stack<Character> pila = new Stack<>();
        
        for (char c : cadena.toCharArray()){
            
            if (c == '(' || c == '[' || c == '{'){
            pila.push(c);
            } else if (c == ')' || c == ']' || c == '}') {
                if (pila.isEmpty()){
                    return false;
                }
                char apertura = pila.pop();
                if (!coinciden(apertura, c)){
                    return false;
                }
                
            }
        }
        return pila.isEmpty();
    }
    private static boolean coinciden(char apertura, char cierre){
        return (apertura == '(' && cierre == ')') ||
                (apertura == '[' && cierre == ']')||
                (apertura == '{' && cierre == '}');
    }

    public static void main(String[] args) {
        String cadena1 = "[{[]()}]";
        String cadena2 = "[{](}]";
        String cadena3 = "[{()}]";

        System.out.println("Cadena 1 balanceada: " + esBalanceado(cadena1));
        System.out.println("Cadena 2 balanceada: " + esBalanceado(cadena2));
        System.out.println("Cadena 3 balanceada: " + esBalanceado(cadena3));

    }
}

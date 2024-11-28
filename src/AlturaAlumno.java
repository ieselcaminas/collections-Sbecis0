import java.util.ArrayList;
import java.util.Scanner;

public class AlturaAlumno {
    public static void main(String[] args) {
        System.out.println("Números de alumnos");
        int numAlumnos = numeroAlumnos();
        double media;
        int alumnoSuperior;
        int alumnoInferior;
        ArrayList<Double> alturas = new ArrayList<>();
        System.out.println(numAlumnos);
        System.out.println("Introduzca las alturas de los alumnos");

        alturas = leerAlturas(alturas, numAlumnos);

        media = calcularMedia(alturas);
        System.out.println("La media es: " + media);
        alumnoSuperior = buscarAlumnoSuperior(alturas, media);
        System.out.println("Hay " + alumnoSuperior + " alumnos con altura superior a la media");
        alumnoInferior = buscarAlumnoInferior(alturas, media);
        System.out.println("Hay " + alumnoInferior + " alumnos con altura inferior a la media");
    }
    public static int numeroAlumnos() {
        Scanner sc = new Scanner(System.in);
            return sc.nextInt();
    }
    public static ArrayList<Double> leerAlturas(ArrayList<Double> alturas, int numAlumnos) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < numAlumnos; i++) {
            alturas.add(sc.nextDouble());
        }
            return alturas;
    }
    public static double calcularMedia(ArrayList<Double> alturas) {
        double media = 0;
        for (int i = 0; i < alturas.size(); i++) {
            media += alturas.get(i);
        }
            return media / alturas.size();
    }
    public static int buscarAlumnoSuperior(ArrayList<Double> alturas, double media) {
        int alumnoSuperior = 0;
        for (int i = 0; i < alturas.size(); i++) {
            if (alturas.get(i) > media) {
                alumnoSuperior++;
            }
        }
            return alumnoSuperior;
    }
    public static int buscarAlumnoInferior(ArrayList<Double> alturas, double media) {
        int alumnoInferior = 0;
        for (int i = 0; i < alturas.size(); i++) {
            if (alturas.get(i) < media) {
                alumnoInferior++;
            }
        }
            return alumnoInferior;
    }
}
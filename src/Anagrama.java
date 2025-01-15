import java.io.*;
import java.util.*;

public class Anagrama {
    public static void main(String[] args) throws IOException {

        Map<String, ArrayList<String>> anagramMap = new HashMap<>();


        BufferedReader reader = new BufferedReader(new FileReader("Files/spanish.txt"));
        String line;
        while ((line = reader.readLine()) != null) {

            String[] words = line.split("\\s+");
            for (String word : words) {

                String key = alphabetize(word);


                anagramMap.computeIfAbsent(key, k -> new ArrayList<>()).add(word);
            }
        }
        reader.close();


        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce el tamaño mínimo del grupo de anagramas : ");
        int minGroupSize = scanner.nextInt();


        for (Map.Entry<String, ArrayList<String>> entry : anagramMap.entrySet()) {
            ArrayList<String> anagrams = entry.getValue();
            if (anagrams.size() >= minGroupSize) {
                System.out.println("Clave: " + entry.getKey() + " --> Anagramas: " + anagrams);
            }
        }
    }


    private static String alphabetize(String s) {
        char[] a = s.toCharArray();
        Arrays.sort(a);
        return new String(a);
    }

}

import java.util.*;

public class Botin {
    public static void main(String[] args) {
        Map<Integer, String> reparto = repartir(2, new String[]{"10", "20", "100", "50", "200"});;

    }
    public static Map<Integer, String> repartir(int numLadrones, String[] billetes){
        Map<Integer, String> reparto = new HashMap<>();
        int leTocaA;
        String billete;
        String botin;

        for (int i = 0; i < billetes.length; i++) {
            billete = billetes[i]; //reparto cicular
            leTocaA = i % numLadrones;
            botin = reparto.get(leTocaA);
            if (botin == null){
                reparto.put(leTocaA, billete);
            }else{
                reparto.put(leTocaA, botin + " " + billete);
            }
            reparto.put(leTocaA, botin + " " + billete);

        }
//        reparto.put(reparto.getOrDefault(leTocaA, billete) + " " + billete);

        return reparto;
    }

}







//        Scanner sc = new Scanner(System.in);
//
//        while(true){
//            int numBilletes = sc.nextInt();
//            int numPiratas = sc.nextInt();
//
//            if(numBilletes == 0 && numPiratas == 0){
//                break;
//            }
//
//            int billetes[] = new int[numBilletes];
//            for(int i = 0; i < numBilletes; i++){
//                billetes[i] = sc.nextInt();
//            }
//            List<List<Integer>> reparto = new ArrayList<>();
//            for (int i = 0; i < numPiratas; i++) {
//                reparto.add(new ArrayList<>());
//
//            }
//            int[] sumas = new int[numPiratas];
//            for (int i = 0; i < numBilletes; i++) {
//                int pirata = i % numPiratas;
//                reparto.get(pirata).add(billetes[i]);
//                sumas[pirata] += billetes[i];
//            }
//
//            for (int i = 0; i < numPiratas; i++) {
//                System.out.println(sumas[i] + " : ");
//                for (int billete : reparto.get(i)) {
//                    System.out.print( " " + billete );
//
//                }
//                System.out.println();
//            }
//            System.out.println("----");
//        }
//        sc.close();

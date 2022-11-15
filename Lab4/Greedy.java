import java.util.Scanner;

public class Greedy {
    public static void main(String[] args) {

        //ALGORYTMY ZACHŁANNE

        //Problem wydawania reszty

        Scanner input = new Scanner(System.in);

        final int[] nominals = {500, 200, 100, 50, 20, 10, 5, 2, 1};
        int[] amounts = new int[9];
        int[] remaining = {2, 1, 2, 1, 0, 1, 3, 2, 4}; //14.83zl

        System.out.print("Wprowadz reszte: ");
        double rest = input.nextDouble();
        rest = (int)(rest*100);
        System.out.println("Wprowadzona reszta to " + (int)rest + " gr.");

        for (int i=0;i<nominals.length;i++) {
            for (int j=0;j<remaining[i];j++) {
                if (rest-nominals[i] >= 0) {
                    amounts[i]++;
                    rest -= nominals[i];
                }
            }
        }

        System.out.println("\nWydana reszta:");
        for (int i=0;i<nominals.length;i++) System.out.println(((double)nominals[i]/100 + " \t" + amounts[i]));

        if (rest==0) System.out.println("Cala reszta zostala wydana.");
        else if (rest==1) System.out.println("Bede winna grosika :)");
        else System.out.println("Nie udalo sie wydac calej reszty. Zabraklo " + (double)rest/100 + " zl.");

    }
}

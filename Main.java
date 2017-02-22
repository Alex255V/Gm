import java.util.Random;
import java.util.Scanner;

/**
 * Created by Роман on 21.02.2017.
 *
 */
public class Main {

    private static int n1;
    private static int n2;
    private static int f;
    private static String mnm;
    private static int nm;
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);
        randomN();
        randomS();

        for(int i = 0; i < 3;) {
//            System.out.print("= ");
            while (true) {

                mnm = sc.nextLine();
                try {
                    nm = Integer.parseInt(mnm);
                    break;
                } catch (Exception ex) {
                    System.out.print("Enter correct number: ");
                }
            }

            if (nm == f) {
                System.out.println("true");
                i ++;
                if (i == 3) break;
                randomN();
                randomS();
            } else {
                System.err.println("fail \ntrue = " + f);
                randomN();
                randomS();
            }
        }
    }

    private static void randomN() {
        Random rnd = new Random();
        n1 = 100+rnd.nextInt(999-100);
        n2 = 100+rnd.nextInt(999-100);
    }
    private static void randomS() {
        Random rPoM = new Random();
        int RoM = rPoM.nextInt(1);
        if (RoM == 0) {
            f = n1 + n2;
            System.out.print(n1 + " + " + n2 + " = ");
        }
        if (RoM == 1) {
            f = n1 - n2;
            System.out.print(n1 + " - " + n2 + " = ");
        }
    }
}

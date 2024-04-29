import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double yaricap;
        Scanner input = new Scanner(System.in);
        System.out.println("Dairenin yarıçapını giriniz");
        yaricap = input.nextInt();

        double daireAlan = 3.14 * yaricap * yaricap;
        double daireCevre = 2 * 3.14 * yaricap;

        System.out.println("Dairenin alanı -> "+daireAlan);
        System.out.println("Dairenin çevresi -> "+daireCevre);
    }
}

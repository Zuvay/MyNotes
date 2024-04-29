import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Üçgenin dik kenarlarını giriniz");
        int kenar_a,kenar_b,hipotenusKare;
        double hipotenus;

        kenar_a = input.nextInt();
        kenar_b = input.nextInt();
        hipotenusKare = ((kenar_a*kenar_a)+(kenar_b*kenar_b));
        hipotenus = Math.sqrt(hipotenusKare);

        double ucgenAlan = (kenar_a * kenar_b) /2;
        double ucgenCevre = kenar_a + kenar_b + hipotenus;

        System.out.println("Dik üçgenin hipotenüsü -> :"+hipotenus);
        System.out.println("Dik üçgenin alanı -> "+ucgenAlan);
        System.out.println("Dik üçgenin çevresi -> "+ucgenCevre);

    }
}

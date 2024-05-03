import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int toplamSayi = 0;

        System.out.println("Pozitif Sayı giriniz :");
        double sayi = input.nextDouble();
        while (sayi <0) {
            System.out.println("Sayı pozitif olmalıdır");
            sayi = input.nextDouble();
        }

        for (int i = 0; i <= sayi; i++) {
            if (i % 3 == 0 || i % 4 == 0) {
                toplamSayi +=i;
            }
        }

        double ortalama = (double)toplamSayi / sayi;
        System.out.println(ortalama);
    }
}

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Sayıyı giriniz :");

        int sayi = input.nextInt();
        int geciciSayi = sayi;
        int toplam=0;

        while(geciciSayi!=0){
            int i= geciciSayi%10;
            toplam +=i;
            geciciSayi/=10;
        }
        System.out.println("Basamakların toplamı ->"+toplam);
    }
}

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double sayi;
        double toplam=0;

        do {
            System.out.println("Sayı giriniz :");
            sayi = input.nextDouble();
            if (sayi%4==0 && sayi%2==0){
                toplam+=sayi;
            }
        }while(sayi>0);
        System.out.println("Toplam -> " +toplam);
    }
}
/*Java döngüler ile negatif bir değer girilene kadar kullanıcıdan girişleri kabul eden ve
girilen değerlerden tek sayıları toplayıp ekrana basan programı yazıyoruz.
Ödev
Java döngüler ile tek bir sayı girilene kadar kullanıcıdan girişleri kabul eden ve
girilen değerlerden çift ve 4'ün katları olan sayıları toplayıp ekrana basan programı yazıyoruz.*/

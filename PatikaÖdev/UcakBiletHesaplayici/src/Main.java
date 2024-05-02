import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double kmMiktari, kmBasinaFiyat;
        int yas;

        kmBasinaFiyat = 0.10;

        // 12 yaşından küçükse yüzde 50
        // 12-24 arası yüzde 10
        // 65+ ise yüzde 30
        // Gidiş dönüş biletler yüzde 20 indirim

        // Km miktarını belirle ve hesaplamalara başla
        System.out.print("Yolculuk kaç Kilometre? : ");
        kmMiktari = input.nextDouble();
        while (kmMiktari <= 0) {
            System.out.println("Negatif değer geçersizdir. Yeniden Giriniz: ");
            kmMiktari = input.nextDouble();
        }

        System.out.println("Kaç yaşındasınız? :");
        yas = input.nextInt();
        while (yas <= 0) {
            System.out.println("Negatif değer geçersizdir. Yeniden Giriniz: ");
            yas = input.nextInt();
        }

        double normalTutar = kmMiktari * kmBasinaFiyat;

        System.out.println("Yolculuk tipini seçiniz:\n1-Tek gidiş 2-Gidiş-Dönüş");
        int yolculukTipi = input.nextInt();
        while (yolculukTipi != 1 && yolculukTipi != 2) {
            System.out.println("Geçersiz seçim yapıldı\n Yeniden giriniz");
            yolculukTipi = input.nextInt();
        }

        double biletFiyati = 0;
        // Bilet hesaplamaları
        double indirimliFiyat = normalTutar - yasaGoreIndirimMiktari(yas, normalTutar);
        if (yolculukTipi == 1) {
            biletFiyati = indirimliFiyat;
        } else if (yolculukTipi == 2) {
            biletFiyati = 2 * (indirimliFiyat - (indirimliFiyat * 0.20));
        }

        System.out.println("Bilet fiyatınız :" + biletFiyati);
    }

    public static double yasaGoreIndirimMiktari(int yas, double normalTutar) {
        if (yas < 12) {
            return normalTutar * 0.50;
        } else if (yas < 24) {
            return normalTutar * 0.10;
        } else if (yas >= 65) {
            return normalTutar * 0.30;
        } else {
            return 0;
        }
    }
}

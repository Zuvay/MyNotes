import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int baslangicFiyati,minimumTutar;
        double kmBasinaTutar;

        baslangicFiyati = 10;
        minimumTutar = 20;
        kmBasinaTutar = 2.20;

        Scanner input = new Scanner(System.in);
        System.out.println("Kaç KM gidildi :");
        double gidilenKm = input.nextDouble();

        double toplamTutar = baslangicFiyati + (gidilenKm * kmBasinaTutar);
        if (toplamTutar < minimumTutar) {
            System.out.println("Toplam tutar minimum tutar olarak hesaplanacak: " + minimumTutar);
        }else{
            System.out.println("Toplam tutar: " + toplamTutar);
        }
    }
}

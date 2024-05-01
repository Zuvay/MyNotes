import java.util.Scanner;

public class Main {
    //Switch case kullanılmadan
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Doğum gününüzü giriniz (örneğin: 15)");
        int gun = input.nextInt();
        System.out.println("Doğum ayınızı giriniz (örneğin: 5)");
        int ay = input.nextInt();

        String burc = findBurc(gun, ay);
        System.out.println("Burcunuz: " + burc);
    }

    public static String findBurc(int gun, int ay) {
        if ((ay == 3 && gun >= 21) || (ay == 4 && gun <= 20)) {
            return "Koç Burcu";
        } else if ((ay == 4 && gun >= 21) || (ay == 5 && gun <= 21)) {
            return "Boğa Burcu";
        } else if ((ay == 5 && gun >= 22) || (ay == 6 && gun <= 22)) {
            return "İkizler Burcu";
        } else if ((ay == 6 && gun >= 23) || (ay == 7 && gun <= 22)) {
            return "Yengeç Burcu";
        } else if ((ay == 7 && gun >= 23) || (ay == 8 && gun <= 22)) {
            return "Aslan Burcu";
        } else if ((ay == 8 && gun >= 23) || (ay == 9 && gun <= 22)) {
            return "Başak Burcu";
        } else if ((ay == 9 && gun >= 23) || (ay == 10 && gun <= 22)) {
            return "Terazi Burcu";
        } else if ((ay == 10 && gun >= 23) || (ay == 11 && gun <= 21)) {
            return "Akrep Burcu";
        } else if ((ay == 11 && gun >= 22) || (ay == 12 && gun <= 21)) {
            return "Yay Burcu";
        } else if ((ay == 12 && gun >= 22) || (ay == 1 && gun <= 21)) {
            return "Oğlak Burcu";
        } else if ((ay == 1 && gun >= 22) || (ay == 2 && gun <= 19)) {
            return "Kova Burcu";
        } else if ((ay == 2 && gun >= 20) || (ay == 3 && gun <= 20)) {
            return "Balık Burcu";
        } else {
            return "Geçersiz tarih!";
        }
    }
}

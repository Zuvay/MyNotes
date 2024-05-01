import java.util.Scanner;

public class Main {
    /*Koşullar :

    Sıcaklık 5'dan küçük ise "Kayak" yapmayı öner.
    Sıcaklık 5 ve 15 arasında ise "Sinema" etkinliğini öner.
    Sıcaklık 15 ve 25 arasında ise "Piknik" etkinliğini öner.
    Sıcaklık 25'ten büyük ise "Yüzme" etkinliğini öner.*/

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Hava sıcaklığını söyle sana etkinlik önereyim\n Hava sıcaklığı(derece) :");
        double heat = input.nextDouble();

        if (heat <= 5 ) {
            System.out.println("Kayak yapmalısın");
        } else if (heat>5 && heat<15) {
            System.out.println("Hava tam sinemaya gitmelik");
        }else if (heat>=15 && heat<25) {
            System.out.println("Hava güzel tam pikniğe çıkmalık");
        }else if (heat>=25) {
            System.out.println("Bu havada yüzmeyeceksin de ne yapacaksın");
        }
    }
}

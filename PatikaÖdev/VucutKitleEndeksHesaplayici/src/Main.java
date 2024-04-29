import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double boy,kilo;
        Scanner input = new Scanner(System.in);
        System.out.println("Boyunuzu metre cinsinden giriniz :");
        boy = input.nextDouble();

        System.out.println("Kilonuzu giriniz");
        kilo = input.nextDouble();

        double VKI = kilo / (boy*boy);
        System.out.println("Vücut kitle endeksiniz -> " + VKI);

        //1.84 boy ve 102 kilo için 30.1276 endeks
    }
}

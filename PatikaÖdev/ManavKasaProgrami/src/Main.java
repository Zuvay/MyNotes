import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double Armut = 2.14;
        double Elma =3.67;
        double Domates = 1.11;
        double Muz = 0.95;
        double Patlican = 5.00;
        Scanner input = new Scanner(System.in);

        System.out.print("Kaç kilo Armut?: ");
        double ArmutKilo = input.nextDouble();

        System.out.println("Kaç kilo Elma?: ");
        double ElmaKilo = input.nextDouble();

        System.out.println("Kaç kilo Domates?: ");
        double DomatesKilo = input.nextDouble();

        System.out.println("Kaç kilo Muz?: ");
        double MuzKilo = input.nextDouble();

        System.out.println("Kaç kilo Patlıcan?: ");
        double PatlicanKilo = input.nextDouble();

        double toplamTutar = (Armut*ArmutKilo)+(Elma*ElmaKilo)+(Domates*DomatesKilo)+(Muz*MuzKilo)+(Patlican*PatlicanKilo);
        System.out.println("Toplam Tutar: " + toplamTutar);

    }
}

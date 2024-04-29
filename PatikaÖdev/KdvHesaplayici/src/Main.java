import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double KDV = 0.18;
        System.out.println("Fiyat giriniz");
        double price = input.nextInt();
        double newPrice;
        if (price < 1000) {
            newPrice = price +(price * KDV);
            System.out.println("%18 KDV'li fiyatı " + newPrice);
        }else{
            newPrice = price + (price * (0.08));
            System.out.println("%8 KDV'li fiyatı " + newPrice);
        }
    }
}

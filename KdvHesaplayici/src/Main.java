import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
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
            newPrice = price + (price * (0.8));
            System.out.println("%8 KDV'li fiyatı " + newPrice);
        }
    }
}
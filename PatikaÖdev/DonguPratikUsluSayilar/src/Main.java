import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir sayı girin: ");
        int sayi = scanner.nextInt();

        for (int i = 1; i <= sayi; i++) {
            int kuvvet4 = (int) Math.pow(4, i);
            int kuvvet5 = (int) Math.pow(5, i);
            System.out.println("4'ün " + i + ". kuvveti: " + kuvvet4);
            System.out.println("5'in " + i + ". kuvveti: " + kuvvet5);
        }
    }
}

//Java döngüler ile girilen sayıya kadar olan 4 ve 5'in kuvvetlerini ekrana yazdıran programı yazıyoruz.



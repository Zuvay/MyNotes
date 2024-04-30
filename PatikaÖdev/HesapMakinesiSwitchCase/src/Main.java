import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double sayi1, sayi2;
        int select;

        System.out.println("İlk sayıyı giriniz :");
        sayi1 = input.nextDouble();
        System.out.println("İkinci sayıyı giriniz :");
        sayi2 = input.nextDouble();

        System.out.println("1-Toplama\n2-Çıkarma\n3-Çarpma\n4-Bölme");
        select = input.nextInt();

        switch (select) {
            case 1:
                System.out.println(sayi1 + sayi2);
                break;
            case 2:
                System.out.println(sayi1 - sayi2);
                break;
            case 3:
                System.out.println(sayi1 * sayi2);
                break;
            case 4:
                System.out.println(sayi1 / sayi2);
                break;
        }
    }
}

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    int mat, fizik, kimya, turkce, tarih,muzik;
        System.out.println("Matematik notunuz :");
        mat = input.nextInt();

        System.out.println("Kimya notunuz :");
        kimya = input.nextInt();

        System.out.println("Türkçe notunuz : ");
        turkce = input.nextInt();

        System.out.println("Tarih notunuz : ");
        tarih = input.nextInt();

        System.out.println("Müzik Notunuz");
        muzik = input.nextInt();

        int toplam = mat + kimya + turkce + tarih + muzik;
        double ortalama = toplam / 5;

        if (ortalama < 60) {
            System.out.println("Sınıfta kaldı");
        }else{
            System.out.println("Sınıfı geçti");
        }
    }
}
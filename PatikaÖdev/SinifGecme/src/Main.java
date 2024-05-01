import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int mat, fizik, kimya, turkce, tarih,muzik;
        System.out.println("Matematik notunuz :");
        mat = input.nextInt();
        if (mat < 0 || mat > 100) {
            System.out.println("Geçerli not girmelisiniz");
            mat = input.nextInt();
        }

        System.out.println("Kimya notunuz :");
        kimya = input.nextInt();
        if (kimya < 0 || kimya > 100) {
            System.out.println("Geçerli not girmelisiniz");
            kimya = input.nextInt();
        }

        System.out.println("Türkçe notunuz : ");
        turkce = input.nextInt();
        if (turkce < 0 || turkce > 100) {
            System.out.println("Geçerli not girmelisiniz");
            turkce = input.nextInt();
        }

        System.out.println("Tarih notunuz : ");
        tarih = input.nextInt();
        if (tarih < 0 || tarih > 100) {
            System.out.println("Geçerli not girmelisiniz");
            tarih = input.nextInt();
        }

        System.out.println("Müzik Notunuz");
        muzik = input.nextInt();
        if (muzik < 0 || muzik > 100) {
            System.out.println("Geçerli not girmelisiniz");
            muzik = input.nextInt();
        }

        int toplam = mat + kimya + turkce + tarih + muzik;
        double ortalama = toplam / 5;

        if (ortalama < 55) {
            System.out.println("Sınıfta kaldı. Ortalama :"+ortalama);
        }else{
            System.out.println("Sınıfı geçti. Ortalama: "+ortalama);
        }
    }
}
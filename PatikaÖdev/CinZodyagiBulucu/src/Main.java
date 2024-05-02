import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Çin Zodyağı bulucu
        //Çin zodyağı hesaplanırken kişinin doğum yılının 12 ile bölümünde kalana göre bulunur.
        Scanner input = new Scanner(System.in);

        System.out.print("Doğum yılınızı giriniz : ");
        int dogumYili=input.nextInt();
        while (dogumYili<=0){
            System.out.println("Doğum yılı negatif veya 0 olamaz");
            dogumYili=input.nextInt();
        }

        int dogumYilindanKalan = dogumYili % 12;

        switch (dogumYilindanKalan){
            case 0:
                System.out.println("Çin zodyağı burcunuz -> Maymun");
                break;
            case 1:
                System.out.println("Çin zodyağı brucunuz -> Horoz");
                break;
            case 2:
                System.out.println("Çin zodyağı brucunuz -> Köpek");
                break;
            case 3:
                System.out.println("Çin zodyağı brucunuz -> Domuz");
                break;
            case 4:
                System.out.println("Çin zodyağı brucunuz -> Fare");
                break;
            case 5:
                System.out.println("Çin zodyağı brucunuz -> Öküz");
                break;
            case 6:
                System.out.println("Çin zodyağı brucunuz -> Kaplan");
                break;
            case 7:
                System.out.println("Çin zodyağı brucunuz -> Tavşan");
                break;
            case 8:
                System.out.println("Çin zodyağı brucunuz -> Ejderha");
                break;
            case 9:
                System.out.println("Çin zodyağı brucunuz -> Yılan");
                break;
            case 10:
                System.out.println("Çin zodyağı brucunuz -> At");
                break;
            case 11:
                System.out.println("Çin zodyağı brucunuz -> Koyun");
                break;
        }

    }
}

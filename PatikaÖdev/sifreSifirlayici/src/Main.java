import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String oldPassword = "123456";
        System.out.println("Şifrenizi giriniz");
        Scanner input = new Scanner(System.in);
        String password = input.nextLine();

        if (password.equals(oldPassword)) {
            System.out.println("Giriş yapıldı");
        } else {
            System.out.println("Şifreniz yanlış! Şifre değiştirilsin mi?\n1-Değiştir 2-Değiştirme");
            int choice = input.nextInt();
            input.nextLine();
            if (choice == 1) {
                System.out.println("Yeni şifrenizi giriniz");
                String newPassword = input.nextLine();
                oldPassword = newPassword;
                System.out.println("Yeni şifreniz oluşturulmuştur " + newPassword);
            } else {
                System.out.println("Program sonlanmıştır");
            }
        }
    }
}

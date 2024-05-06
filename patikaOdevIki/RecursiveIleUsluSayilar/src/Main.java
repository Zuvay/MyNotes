import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Taban değerini giriniz: ");
        int tabanSayisi = input.nextInt();
        System.out.println("Üs değerini giriniz: ");
        int usSayisi = input.nextInt();
        System.out.println(usAl(tabanSayisi,usSayisi));
    }
    public static int usAl(int tabanSayisi, int usSayisi){
        if(usSayisi == 0){
            return 1;
        }else if(usSayisi == 1){
            return tabanSayisi;
        }else if(usSayisi <0){
            return usAl(tabanSayisi,usSayisi+1)/tabanSayisi;
        }else{
            return tabanSayisi * usAl(tabanSayisi,usSayisi-1);
        }
    }
}
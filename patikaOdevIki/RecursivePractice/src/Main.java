import java.util.Scanner;
/*
Kural : Girilen sayı 0 veya negatif olduğu yere kadar girilen sayıdan 5 rakamını çıkarın.
Her çıkarma işlemi sırasında ekrana son değeri yazdırın.
Sayı negatif veya 0 olduktan sonra tekrar 5 ekleyin.
Yine her ekleme işleminde sayının son değerini ekrana yazdırın.
 */
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int userInput = input.nextInt();

        int process = recursiveMinus(userInput);
        recursivePlus(process,userInput);

    }
    public static int recursivePlus(int process,int userInput){
        if (userInput>=process){
            System.out.println(process);
            return recursivePlus(process+5,userInput);
        }

        return 0;
    }
    public static int recursiveMinus(int process){
        if(process<=0){
            return process;
        }
        System.out.println(process);
        return recursiveMinus(process-5);
    }
}
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number");
        int number = input.nextInt();

        if(isPrime(number,2)){
            System.out.println("Prime number");
        }else {
            System.out.println("Not Prime number");
        }
    }
    public static boolean isPrime(int number,int divisor){
        if(number== divisor){
            return true;
        }
        if(number%divisor == 0){
            return false;
        }
        return isPrime(number,divisor+1);
    }
}
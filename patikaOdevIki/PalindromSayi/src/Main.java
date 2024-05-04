public class Main {

    public static boolean isPalindrome(int number) {
        int originalNumber = number;
        int reverseNumber = 0;

        while (number != 0) {
            int remainder = number % 10;
            reverseNumber = reverseNumber * 10 + remainder;
            number /= 10;
        }

        return originalNumber == reverseNumber;
    }

    public static void main(String[] args) {
        int number = 12321;
        if (isPalindrome(number)) {
            System.out.println(number + " bir palindromdur.");
        } else {
            System.out.println(number + " bir palindrom değildir.");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        // 1 1 2 3 5 8 13
        //f(n) = f(n-1) + f(n-2)
        //f(1) ve f(2) =1
        System.out.println(fibonacci(6));
    }
    public static int fibonacci(int n) {
        if (n==1||n==2) {
            return 1;
        }else{
            return fibonacci(n-1) + fibonacci(n-2);
        }
    }
}
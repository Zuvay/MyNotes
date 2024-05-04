public class Main {
    public static void main(String[] args) {
        int basamakSayisi = 10;

        for(int i=basamakSayisi;i>0;i--){
            for(int j=0;j<i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

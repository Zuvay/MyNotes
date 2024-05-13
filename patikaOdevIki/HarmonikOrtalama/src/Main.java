public class Main {
    public static void main(String[] args) {
        //Dizilerde harmonik ortalama bulan program
        //Harmonik seri 1+(1/2)+(1/3)...(1/n)
        //Harmonik ortalama = eleman sayısı / harmonik dizi
        int[] seri = {1,2,3,4,5,6,7,8};
        double toplam = 0;


        for (double i :seri){
            toplam = toplam +(1/i);
        }

        System.out.println(seri.length / toplam);

    }
}
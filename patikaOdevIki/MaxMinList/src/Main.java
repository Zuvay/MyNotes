public class Main {
    public static void main(String[] args) {
//Dizideki elemanların girilen sayıdan
// küçük en yakın sayıyı ve en büyük en yakın sayıyı bulan programı yazınız.

        int[] series = {15, 12, 788, 1, -1, -778, 2, 0, 3};
        int enterNumber = 5;

        int minNumber = series[3];
        int maxNumber = series[0];

        for (int i : series) {
            if (enterNumber > i) {
                if (i > minNumber) {
                    minNumber = i;
                }
            }

            if (enterNumber < i) {
                if (i < maxNumber) {
                    maxNumber = i;
                }
            }
        }
        System.out.println("5'ten küçük en büyük sayı " + minNumber);
        System.out.println("5'ten büyük en küçük sayı " + maxNumber);

    }
}
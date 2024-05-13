public class Main {
    public static void main(String[] args) {

        int[] array = {1, 3, 4, 5, 2, 8, 7, 9, 6};
        int n = array.length;

        // Bubble Sort algoritması
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    // Swap işlemi
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }

        // Sıralanmış diziyi yazdırma
        for (int num : array) {
            System.out.print(num + " ");
        }
    }
}

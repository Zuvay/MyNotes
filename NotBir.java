public class NotBir {
    public static void main(String[] args) {
        //Stack-Heap mantığı
        //referance type ve value type farkı

        int sayi_a = 10;
        int sayi_b = 20;
        sayi_b = sayi_a;
        sayi_a = 30;
        System.out.println(sayi_b); //cevap 10 olarak döndürüldü
        /*AÇIKLAMA:
         * Değer sayıları (value type) stack içerisinde değerlenir. sayi b'yi a ile eşitlediğimizde 
         * sayi b'nin yeni değeri 10 olarak değiştirildi ve öyle kaldı sonrasında a sayısını değiştirdiğimizde
         * b sayısı da değişmedi.
         */

        
         int [] sayilar_a = {1,2,3};
         int [] sayilar_b = {4,5,6};
         sayilar_a = sayilar_b;
         sayilar_a[0] = 15;
         System.out.println(sayilar_b[0]); //cevap 15 olarak döndürüldü
         /* AÇIKLAMA:
          * Referans sayıları stack'teki nesnenin heap'teki verileri işaret etmesi gibi düşünülebilir.
          * a sayiları heap'te 1,2,3 sayılarını içeren dizeyi işaret ediyordu.
          *sonrasında b sayılarının da aynı dizeyi işaret etmesini sağladık bu yüzden artık b sayiları da
          *a sayıları gibi davranmaya ve o dizedeki güncellemeleri almaya başladı.
          *bu bağlamda heap'teki eski b sayıları yani 4,5,6 sayılarını işaret eden hiçbir nesne kalmadı
          */
    }
}

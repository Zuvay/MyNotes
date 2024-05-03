public class Main {
    public static void main(String[] args) {

        Ogretmen ogretmenBir = new Ogretmen();
        ogretmenBir.isim = "Ömer Faruk";
        ogretmenBir.soyIsim = "Yavuz";
        ogretmenBir.email = "omer.yavuz@gmail.com";
        ogretmenBir.yas = 23;
        ogretmenBir.kilo = 95.8;
        ogretmenBir.telefon = "0555555555";
        ogretmenBir.verilenDers = "Matematik";
        System.out.println("Birinci öğretmenin ismi :"+ogretmenBir.isim);

        Ogrenci ogrenciBir = new Ogrenci();
        ogrenciBir.isim = "Mahmut";
        ogrenciBir.soyIsim = "Yavuz";
        ogrenciBir.email = "mahmut.yavuz@gmail.com";
        ogrenciBir.yas = 23;
        ogrenciBir.kilo = 95.8;
        ogrenciBir.telefon = "23423423234";
        ogrenciBir.ogrenciNo = 285;
        ogrenciBir.notOrtalamasi = 73.4;
        ogrenciBir.devamsizlikMiktari = 12;
        System.out.println("Birinci öğrencinin not ortalaması :"+ogrenciBir.notOrtalamasi);

        Personel personelBir = new Personel();
        personelBir.isim = "Ali";
        personelBir.soyIsim = "Sağlam";
        personelBir.telefon ="123123213";
        personelBir.yas = 29;
        personelBir.kilo = 80.3;
        personelBir.departman = "Güvenlik";
        System.out.println("Birinci personelin departmanı :"+personelBir.departman);

        MudurYardimcisi mudurYardimcisiBir = new MudurYardimcisi();
        mudurYardimcisiBir.isim = "Kerem";
        mudurYardimcisiBir.soyIsim = "Yeşil";
        mudurYardimcisiBir.telefon = "79595679";
        mudurYardimcisiBir.email = "kerem.yesil@gmail.com";
        mudurYardimcisiBir.yas = 32;
        mudurYardimcisiBir.kilo = 98.3;
        mudurYardimcisiBir.brans="Fizik";
        mudurYardimcisiBir.egitimDuzeyi = "Yüksek Lisans";
        System.out.println("Birinci müdür yardımcısının eğitim düzeyi :"+mudurYardimcisiBir.egitimDuzeyi);

        Derslik derslikBir = new Derslik();
        derslikBir.derslikKodu = "15-A";
        derslikBir.verilenDers = "Tarih";
        derslikBir.ekstraEkipman = "Projeksiyon cihazı";
        derslikBir.katNo = 2;
        derslikBir.kapasite = 65;
        System.out.println("Birinci derslikte verilen ders :"+derslikBir.verilenDers);

    }
}

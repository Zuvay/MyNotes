import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
//1- compareTo(): İki stringin alfabetik olarak karşılaştırır.
        //Eğer ilk string ikinci stringden önce geliyorsa (alfabetik olarak), sonuç negatif bir tam sayı olur. Eğer iki string eşitse, sonuç 0 olur. Eğer ilk string ikinci stringden sonra geliyorsa, sonuç pozitif bir tam sayı olur.
        String kelime1 = "elma";
        String kelime2 = "armut";
        int karsilastirma = kelime1.compareTo(kelime2);
        System.out.println("Karşılaştırma sonucu: " + karsilastirma);

//2- concat(): İki stringi birleştirir.
        String ad = "Ömer";
        String soyad = "Yavuz";
        String tamAd = ad.concat(" ").concat(soyad);
        System.out.println("Tam ad: " + tamAd);

//3- contains(): Bir stringin belirli bir stringi içerip içermediğini kontrol eder.
        String cumle = "Hızlı kahverengi tilki tembel köpeğin üstünden atlar";
        boolean iceriyorMu = cumle.contains("tilki");
        System.out.println("'Tilki' içeriyor mu: " + iceriyorMu);

//4- endsWith(): Bir stringin sonunun belirtilen parametre ile bitip bitmediğini kontrol eder
        String dosyaAdi = "belge.docx";
        boolean uzantiIleBitiyorMu = dosyaAdi.endsWith(".docx");
        System.out.println("'.docx' ile bitiyor mu: " + uzantiIleBitiyorMu);

//5- equals(): Eşitlik ölçer
        String sifre1 = "sifre";
        String sifre2 = "sifre";
        boolean esitMi = sifre1.equals(sifre2);
        System.out.println("Şifreler eşit mi: " + esitMi);

//6- format(): Stringi belirtilen formata göre biçimlendirir
        String bicimlendirilmisString = String.format("İsim: %s, Yaş: %d","Ahmet", 30);
        System.out.println("Biçimlendirilmiş string: " + bicimlendirilmisString);

//7- indexOf(): Belirli bir karakter dizisinin ilk indeksini bulur.
        String indeksCumlesi = "Merhaba dünya";
        int indeksDunya = indeksCumlesi.indexOf("dünya");
        System.out.println("'Dünya'ın indeksi: " + indeksDunya);

//8- isEmpty(): stringin boş olup olmadığına bakar
        String bosString = "";
        boolean bosMu = bosString.isEmpty();
        System.out.println("Boş mu: " + bosMu);

//9- join(): Belirtilen ayraç ile iki stringi birleştirir
        String[] kelimeler = {"Merhaba", "dünya", "!"};
        String birlestirilmisString = String.join(" ", kelimeler);
        System.out.println("Birleştirilmiş string: " + birlestirilmisString);

//10- length(): Stringin uzunluğunu ölçer
        String kelime = "Merhaba";
        int uzunluk = kelime.length();
        System.out.println("Stringin uzunluğu: " + uzunluk);

//11- matches(): Bir stringin formatını belirtilen biçime göre ölçer
        String email = "ornek@ornek.com";
        boolean emailGecerliMi = email.matches("^[\\w.-]+@[\\w.-]+\\.[a-zA-Z]{2,}$");
        System.out.println("Email geçerli mi: " + emailGecerliMi);

//12- replace(): Bir string içindeki belirli bir karakter dizisini başka bir karakter dizisiyle değiştirir.
        String degistirilecekCumle = "Kedileri severim";
        String degistirilmisCumle = degistirilecekCumle.replace("kedileri", "köpekleri");
        System.out.println("Değiştirilmiş cümle: " + degistirilmisCumle);

//13- split(): Bir stringi belirli bir ayraçla böler ve bir diziye dönüştürür.
        String bolunecekCumle = "Hızlı kahverengi tilki";
        String[] bolunmusKelimeler = bolunecekCumle.split(" ");
        System.out.println("Kelimeler: " + Arrays.toString(kelimeler));

//14- substring(): Bir stringin belirli bir aralığını alır.
        String indexIleAyrilacakCumle = "Merhaba dünya";
        String altString = indexIleAyrilacakCumle.substring(6); //6. indexten sonrasını döndürecek
        System.out.println("Alt string: " + altString);

//15- toLowerCase(): Bir stringi küçük harflere dönüştürür.
        String kucultulecekKelime = "MERHABA";
        String kucukHarf = kucultulecekKelime.toLowerCase();
        System.out.println("Küçük harf: " + kucukHarf);

//16- toUpperCase(): Bir stringi büyük harflere dönüştürür.
        String buyultulecekKelime = "merhaba";
        String buyukHarf = buyultulecekKelime.toUpperCase();
        System.out.println("Büyük harf: " + buyukHarf);

//17- trim(): Bir stringin başındaki ve sonundaki boşlukları kaldırır.
        String boslukSilme = "   Merhaba   ";
        String temizKelime = boslukSilme.trim();
        System.out.println("Temizlenmiş string: " + temizKelime);

//18- valueOf(): Farklı tipleri string olarak döndürür.
        int sayi = 123;
        String sayiString = String.valueOf(sayi);
        System.out.println("Sayının string değeri: " + sayiString);
/* ÇIKTILAR
1-Karşılaştırma sonucu: 4
2-Tam ad: Ömer Yavuz
3-'Tilki' içeriyor mu: true
4-'.docx' ile bitiyor mu: true
5-Şifreler eşit mi: true
6-Biçimlendirilmiş string: İsim: Ahmet, Yaş: 30
7-'Dünya'ın indeksi: 8
8-Boş mu: true
9-Birleştirilmiş string: Merhaba dünya !
10-Stringin uzunluğu: 7
11-Email geçerli mi: true
12-Değiştirilmiş cümle: Kedileri severim
13-Kelimeler: [Merhaba, dünya, !]
14-Alt string: a dünya
15-Küçük harf: merhaba
16-Büyük harf: MERHABA
17-Temizlenmiş string: Merhaba
18-Sayının string değeri: 123
 */
    }
}

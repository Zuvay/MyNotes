package calculator;
public class Calc {
    public int Topla(int... sayilar){
        int toplam = 0;
        for(int sayi:sayilar){
            toplam +=sayi;
        }
        return toplam;
    }

    public int Cikar(int... sayilar){
        int toplam = sayilar[0] - sayilar[1];
        int index = 2;
        
        for(int i=0;i<(sayilar.length - 2);i++){
            toplam = toplam - sayilar[index];
            index+=1;
        }
        return toplam;
    }
    public int Carp(int... sayilar){
        int toplam = 1;
        for(int sayi:sayilar){
            toplam = toplam * sayi;
        }
        return toplam;
    }
    public int Bol(int... sayilar){
        int start = sayilar[0];
        int index = 1;
        for(int i=0;(i<sayilar.length-1);i++){
            start = start / sayilar[index];
            index +=1;
        }
        return start;
    }

}

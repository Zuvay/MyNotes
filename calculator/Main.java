package calculator;
public class Main {
  public static void main(String[] args) {
    Calc dortIslem = new Calc();

    int toplanmis = dortIslem.Topla(3, 4,5,6); //3+4+5+6 = 18
    System.out.println(toplanmis);
    
    int cikarilmis = dortIslem.Cikar(123, 1,1,1);//123-1-1-1 = 120 (negatif sayı ile de başlanabilir)
    System.out.println(cikarilmis);

    int carpilmis = dortIslem.Carp(3, 4,5,6); //3*4*5*6 = 360
    System.out.println(carpilmis);

    int bolunmus = dortIslem.Bol(30,2,5,3); // 30/2/5/3 = 1 (0 kullanılcak kod yazılmadı)
    System.out.println(bolunmus);

  }
}

public class Main {
    public static void main(String[] args) {
        System.out.println("MAÇ BAŞLIYOR");
        Fighter omer = new Fighter("Ömer", 15 , 100, 90,5);
        Fighter kerem = new Fighter("Kerem" , 20 , 115, 100,25);
        Ring ring = new Ring(omer,kerem , 90 , 100);
        ring.fight();
    }
}

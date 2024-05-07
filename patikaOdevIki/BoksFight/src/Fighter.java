public class Fighter {
    String name;
    int damage,health,weight;
    double dodge;

    public Fighter(String name, int damage, int health, int weight,double dodge) {
        this.name = name;
        this.damage = damage;
        this.health = health;
        this.weight = weight;
        this.dodge = dodge;
    }

    public void hit(Fighter fighter) {
        System.out.println("******");
        System.out.println(this.name + " " + fighter.name + " adlı dövüşçüye " + this.damage + " kadar hasar verdi");

        if (fighter.dodge()) {
            System.out.println(fighter.name + " gelen hasarı savurdu.");
        } else {
            fighter.health -= this.damage;
            System.out.println(fighter.name + " " + this.damage + " hasar aldı.");
        }
    }


    public boolean dodge(){
        double randomValue = Math.random()*100;
        return randomValue <= this.dodge;
    }
}

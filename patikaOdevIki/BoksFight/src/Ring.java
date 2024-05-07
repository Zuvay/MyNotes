public class Ring {
    Fighter enemyFighter;
    Fighter allyFighter;
    int minWeight,maxWeight;

    public Ring ( Fighter allyFighter,Fighter enemyFighter,int minWeight, int maxWeight) {
        this.allyFighter=allyFighter;
        this.enemyFighter=enemyFighter;
        this.minWeight = minWeight;
        this.maxWeight = maxWeight;
    }

    public boolean checkWeight(){
        //Koşul sağlandığında true dönecek
        return (allyFighter.weight <= maxWeight && allyFighter.weight >= minWeight) &&
                (enemyFighter.weight >= minWeight && enemyFighter.weight <= maxWeight);
    }

    public boolean isWin(){
        if (enemyFighter.health<=0){
            System.out.println(allyFighter.name + " dövüşü kazandı");
            return true;
        }else if (allyFighter.health<=0){
            System.out.println(enemyFighter.name+ " dövüşü kazandı");
            return true;
        }
        return false;
    }

    public void printScore(){
        System.out.println("------------");
        System.out.println(enemyFighter.name + " Kalan Can \t:" + enemyFighter.health);
        System.out.println(allyFighter.name + " Kalan Can \t:" + allyFighter.health);
    }

    public void fight(){
        if (checkWeight()){
            int count = 1;
            while (allyFighter.health > 0 && enemyFighter.health >0){
                System.out.println("Round "+ count);
                allyFighter.hit(enemyFighter);
                if (isWin()){
                    break;
                }
                enemyFighter.hit(allyFighter);
                    if (isWin()) {
                        break;
                    }

                count++;
                printScore();
            }
        }else{
            System.out.println("Dövüşçülerin sikletleri uyuşmuyor");
        }
    }
}

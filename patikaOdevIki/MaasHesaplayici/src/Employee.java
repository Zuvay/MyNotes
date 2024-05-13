public class Employee {
    private String name;
    private double salary;
    private int workHour;
    private int hireYear;
    private int currentYear = 2021;

    public Employee(String name, double salary, int workHour, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHour = workHour;
        this.hireYear = hireYear;
    }

    public double tax(double salary) {
        //1000 altındaysa vergi yok üstündeyse maaşın %3'ü
        double totalTax = 0;
        if (salary >= 1000) {
            totalTax = salary * 3 / 100;
        }
        return totalTax;
    }

    public int bonus(int workHour){
        int extraHour = workHour - 40;
        int bonusMoney = 0;
        if (workHour>=40){
            bonusMoney = extraHour*30;
        }
        return bonusMoney;
    }

    public double raiseSalary(int hireYear){
        double raiseTotal = 0;
        if (currentYear-hireYear >= 19){
            raiseTotal = (salary*15/100);
        }else if (currentYear-hireYear < 20 && currentYear-hireYear >= 5){
            raiseTotal =  (salary*10/100);
        }else if (currentYear - hireYear <= 10){
            raiseTotal =  (salary*5/100);
        }
        return raiseTotal;
    }

    public String infoAboutEmployee(){
        String isim = "Çalışan ismi :"+ name;
        String maas = "Çalışanın maaşı :" + salary;
        String saat = "Çalışma saati :" + workHour;
        String iseGiris= "Çalışmaya başladığı yıl :" + hireYear;
        String vergi = "Vergi miktarı :" + tax(this.salary);
        String bonus = "Bonus miktarı :" + bonus(this.workHour);
        String maasArtisi = "Maaş artışı :" + raiseSalary(this.hireYear);
        double totalMaas = this.salary - tax(this.salary) + bonus(this.workHour) + raiseSalary(this.hireYear);
        String totalMaasStr = "Toplam Maaş :" + totalMaas;


        return isim + "\n" + maas + "\n" + saat + "\n" + iseGiris + "\n" + vergi + "\n" + bonus + "\n" + maasArtisi + "\n" + totalMaasStr;
    }
}

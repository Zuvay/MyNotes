public class Student {
    String name;
    Course fizik,mat,kimya;
    int studentNo,classes;
    double average;
    boolean isPass;

    public Student(String name,int studentNo,int classes, Course fizik,Course mat,Course kimya){
        this.name=name;
        this.studentNo=studentNo;
        this.classes=classes;
        this.fizik=fizik;
        this.mat=mat;
        this.kimya=kimya;
        this.average=average;
        this.isPass=isPass;
    }

    public void addExamNote(int fizik,int mat ,int kimya){
        if (fizik >0 && fizik <=100){
            this.fizik.note=fizik;
        }
        if (mat >0 && mat <=100){
            this.mat.note=mat;
        }
        if (kimya >0 && kimya <=100){
            this.kimya.note=kimya;
        }
    }
    public void CalculateAverage() {
        this.average = (this.fizik.note + this.mat.note + this.kimya.note) /3;
    }
    public boolean isCheckPass() {
        CalculateAverage();
        return this.average>55;
    }
    public void printNote(){
        System.out.println("=========================");
        System.out.println("Öğrenci : " + this.name);
        System.out.println("Matematik Notu : " + this.mat.note);
        System.out.println("Fizik Notu : " + this.fizik.note);
        System.out.println("Kimya Notu : " + this.kimya.note);
    }
    public void isPass(){
        if (fizik.note==0||mat.note==0||kimya.note==0){
            System.out.println("Notlar tam olarak girilmemiş olabilir");
        }else{
            this.isPass=isCheckPass();
            printNote();
            System.out.println("Ortalama : " + this.average);
            if (this.isPass) {
                System.out.println("Sınıfı Geçti. ");
            } else {
                System.out.println("Sınıfta Kaldı.");
            }

        }
    }
}

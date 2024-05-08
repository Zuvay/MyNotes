public class Main {
    public static void main(String[] args) {

        Teacher berat = new Teacher("Berat","berat@gmail.com","MAT");
        Teacher muco = new Teacher("Mücahit","muco@gmail.com","FZK");
        Teacher hakan = new Teacher("Hakan","hakan@gmail.com","KMY");

        Course matematik = new Course("Matematik","MAT101","MAT");
        matematik.addTeacher(berat);

        Course fizik = new Course("Fizik","FZK101","FZK");
        fizik.addTeacher(muco);

        Course kimya = new Course("Kimya","KMY101","KMY");
        kimya.addTeacher(hakan);


        Student omer = new Student("Ömer",285,4,fizik,matematik,kimya);
        omer.addExamNote(76,56,98);
        omer.isPass();

        Student kerem = new Student("Kerem",582,3,fizik,matematik,kimya);
        kerem.addExamNote(13,23,32);
        kerem.isPass();

        Student mahmut = new Student("Mahmut",888,2,fizik,matematik,kimya);
        mahmut.addExamNote(69,86,68);
        mahmut.isPass();

        System.out.println("***************");

        fizik.printTeacher();
        kimya.printTeacher();
        matematik.printTeacher();
    }
}

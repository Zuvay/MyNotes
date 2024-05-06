public class Course {
    Teacher courseTeacher;
    String name,code,prefix;
    int note;

    public Course(String name,String code,String prefix) {
        this.name = name;
        this.code = code;
        this.prefix = prefix;
        this.note = note;
    }

    public void addTeacher(Teacher teacher) {
        if(this.prefix.equals(teacher.branch)){
            this.courseTeacher = teacher;
            System.out.println("Öğretmen ataması yapıldı");
        }else {
            System.out.println("Atama yapılamadı");
        }
    }

    public void printTeacher(){
        if(this.courseTeacher != null){
            System.out.println(this.name + " dersinin Akademisyeni : " + courseTeacher.name);
        }else{
            System.out.println(this.name + " derinse akademisyen atanmamıştır");
        }
    }
}

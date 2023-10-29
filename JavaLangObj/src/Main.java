public class Main extends Object{
    public static void main(String[] args) {
        Student student = new Student("Max" , 19);
        System.out.println(student);
        primarySchoolStudent primarySchoolStudent = new primarySchoolStudent("George",14,"Max");
        System.out.println(primarySchoolStudent);
    }
}
class Student
{
    private String name;
    private int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return name + " is " + age;
    }
}
class primarySchoolStudent extends Student
{
    private String parentName;
    public primarySchoolStudent(String name, int age, String parentName) {
        super(name, age);
        this.parentName = parentName;
    }

//    @Override
//    public String toString() {
//        return "primarySchoolStudent{" +
//                "parentName='" + parentName + '\'' +
//                "} " + super.toString();
//    }

    @Override
    public String toString() {
        return parentName+"'s kid , "+ super.toString();
    }
}
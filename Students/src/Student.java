public class Student {
    private String name;
    private int iD;
    private int dateOfBirth;
    private String classList;
    public Student(String name, int iD, int dateOfBirth, String classList) {
        this.name = name;
        this.iD = iD;
        this.dateOfBirth = dateOfBirth;
        this.classList = classList;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", iD=" + iD +
                ", dateOfBirth=" + dateOfBirth +
                ", classList='" + classList + '\'' +
                '}';
    }
}

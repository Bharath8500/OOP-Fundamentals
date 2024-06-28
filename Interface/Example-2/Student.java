public class Student implements Identification {
    public String name;
    public int age;
    public int DOB;
    public String gender;
    public String college;

    Student(String name, int age, int DOB, String gender, String college) {
        this.name = name;
        this.age = age;
        this.DOB = DOB;
        this.gender = gender;
        this.college = college;
    }

    public void identificationMarks() {
        System.out.println("On lower lip");
    }

    public void detailsOfStudent() {
        System.out
                .println("Name of the Student: " + name + "\nAge of the student: " + age + "\n Date of Birth: " + DOB);
    }

    public static void main(String[] args) {
        Student s1 = new Student("Bharath", 25, 1998, "M", "MSU");
        s1.identificationMarks();
        s1.detailsOfStudent();
    }
}
public class Dog implements Identification {
    public String name;
    public int age;
    public int DOB;
    public String gender;

    public Dog(String name, int age, int DOB, String gender) {
        this.name = name;
        this.age = age;
        this.DOB = DOB;
        this.gender = gender;
    }

    public void identificationMarks() {
        System.out.println("On feet");
    }

    public void details() {
        System.out.println("Name: " + name + "\nage: " + age);
    }

    public static void main(String[] args) {
        Dog d = new Dog("Kalyan", 22, 1995, "F");
        d.identificationMarks();
        d.details();
    }
}
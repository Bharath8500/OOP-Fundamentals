public class Person implements Humans, Animal {
    public void animalBehaviour() {
        System.out.println("The animal behaviour implemented in the class person");
    }

    public void humanBehaviour() {
        System.out.println("Human Behaviour implemented in the class person");
    }

    public static void main(String[] args) {
        Person p = new Person();
        p.animalBehaviour();
        p.humanBehaviour();
    }
}
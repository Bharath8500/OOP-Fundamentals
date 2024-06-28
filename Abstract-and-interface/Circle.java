public class Circle extends Shape implements Drawable {
    public double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double calculatedArea() {
        return Math.PI * (radius * radius);
    }

    public void draw() {
        System.out.println("This is the method in the Circle class implementing the interface method draw");
        System.out.println("Drawing a circle with radius: " + radius);
    }

    public static void main(String args[]) {
        Circle c1 = new Circle(5.0);
        c1.display();
        c1.draw();
        double area = c1.calculatedArea();
        System.out.println("The area of the circle: " + area);
    }
}
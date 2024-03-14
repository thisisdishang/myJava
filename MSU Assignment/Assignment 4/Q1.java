/* Write a Java program to create an interface Shape with the getArea() method. Create three classes Rectangle, Circle, and Triangle
that implement the Shape interface. Implement the getArea() method for each of the three classes. */

interface Shape {
    double getArea();
}

class Rectangle implements Shape {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double getArea() {
        return length * width;
    }
}

class circle implements Shape {
    private double radius;

    public circle(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return 3.14 * radius;
    }
}

class triangle {
    private double b;
    private double h;

    public triangle(double b, double h) {
        this.b = b;
        this.h = h;
    }

    public double getArea() {
        return 1 / 2 * b * h;
    }
}

class Q1 {
    public static void main(String[] args) {
        Rectangle r = new Rectangle(10, 25);
        circle c = new circle(10);
        triangle t = new triangle(10, 52);

        System.out.println(r.getArea());
        System.out.println(c.getArea());
        System.out.println(t.getArea());
    }
}
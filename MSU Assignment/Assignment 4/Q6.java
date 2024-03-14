/* Write a Java program to create an interface Drawable with a method draw() that takes no arguments and returns void. Create three
classes Circle, Rectangle, and Triangle that implement the Drawable interface and override the draw() method to draw their respective
shapes. */

interface Drawable {
    void draw();
}

class circle implements Drawable {
    public void draw() {
        System.out.println("this is circle");
    }
}

class Rectangle implements Drawable {
    public void draw() {
        System.out.println("this is rectangle");
    }
}

class triangle implements Drawable {
    public void draw() {
        System.out.println("this is triangle");
    }
}

public class Q6 {
    public static void main(String[] args) {
        Rectangle r = new Rectangle();
        circle c = new circle();
        triangle t = new triangle();

        t.draw();
        r.draw();
        c.draw();
    }
}
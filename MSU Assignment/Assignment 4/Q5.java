/* Write a Java program to create an interface Resizable with methods resizeWidth(int width) and resizeHeight(int height) that allow
an object to be resized. Create a class Rectangle that implements the Resizable interface and implements the resize methods. */

interface resizeable {
    void resizewidth(int width);
    void resizeheight(int height);
}

class Rectangle implements resizeable {
    private int w;
    private int h;

    public Rectangle(int w, int h) {
        this.w = w;
        this.h = h;
    }

    public void resizewidth(int w) {
        this.w = w;
        System.out.println("resized to " + w);
    }

    public void resizeheight(int h) {
        this.h = h;
        System.out.println("resized to " + h);
    }

    public void display() {
        System.out.println("the width is " + w + " the height is " + h);
    }
}

public class Q5 {
    public static void main(String[] args) {
        Rectangle r = new Rectangle(10, 5);
        r.display();
        r.resizeheight(5);
        r.resizewidth(10);
        r.display();
    }
}
/* Write a Java program to create an interface Playable with a method play() that takes no arguments and returns void. Create
three classes Football, Volleyball, and Basketball that implement the Playable interface and override the play() method to play
the respective sports. */

interface Playable {
    void play();
}

class Football implements Playable {
    public void play() {
        System.out.println("this is Football");
    }
}

class Volleyball implements Playable {
    public void play() {
        System.out.println("this is Vollyball");
    }
}

class Basketball implements Playable {
    public void play() {
        System.out.println("this is Basketball");
    }
}

class Q8 {
    public static void main(String[] args) {
        Playable b = new Basketball();
        Playable v = new Volleyball();
        Playable f = new Football();

        b.play();
        v.play();
        f.play();
    }
}
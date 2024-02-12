import MyPackage.greeting;
import MyPackage.talk;

public class UsePackage {
    public static void main(String[] args) {
        greeting s1 = new greeting();
        s1.display();
        talk t1 = new talk();
        t1.display();
    }
}
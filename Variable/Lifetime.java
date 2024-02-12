public class Lifetime {
    public static void main(String[] args) {
        for(int j=0;j<2;j++){
            int k=-1;
            System.out.println("k is "+k);
            
            k=100;
            System.out.println("k is "+k);
        }
    }
}

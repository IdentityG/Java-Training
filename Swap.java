public class Swap {
    public static void Swap(String[] args) {
        int a = 10;
        int b = 15;

        System.out.println("a:" + a + ", b:" + b);

        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("a:" + a + ", b:" + b);
    
    }
}

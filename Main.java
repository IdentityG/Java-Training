public class Main {
    public static void main(String[] args) {
        int a = 10;
        double b = 20.5;
        char c = 'A';
        boolean isTrue = true;
        String name = "Egnuma Gelana";

        double sum = a + b;
        System.out.println("Sum:" + sum);

        if (a>b) {
            System.out.println("a is greater than b");
        } else {
            System.out.println("b is greater than a");
        }

        System.out.println("name:" + name);
        System.out.println("Character:" + c);
        System.out.println("Boolean:" + isTrue);


        int d = 10;
        int e = 15;

        System.out.println("a:" + d + ", b:" + e);

        d = d + e;
        e = d - e;
        d = d - e;

        System.out.println("a:" + d + ", b:" + e);

    }
}
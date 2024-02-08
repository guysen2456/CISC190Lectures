package edu.sdccd.cisc190;

public class Main {
    public static void main(String[] args) {
        int integerDemo = 1;
        System.out.println(integerDemo);
        integerDemo++;
        System.out.println(integerDemo);

        long longDemo = 99999999999L;
        System.out.println(longDemo);
        System.out.println(longDemo + 200);
        System.out.println(longDemo - 200);
        System.out.println(longDemo / 5);
        System.out.println(longDemo * 25);

        float floatDemo = 1.5f;
        System.out.println(integerDemo * integerDemo);

        System.out.println(longDemo / 25);
        System.out.println(longDemo / 25.0);

        // byte
        // long
        // float
        // double
        char charDemo = 'h';
        System.out.println(charDemo);
        String hello = "hello";
        String world = "world";
        System.out.println(hello);
        System.out.println(hello + "world!");
        System.out.println(hello + " " + world);

        System.out.println("This is the end of main()");
    }
}

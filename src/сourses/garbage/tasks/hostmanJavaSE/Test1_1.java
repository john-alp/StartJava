package сourses.garbage.tasks.hostmanJavaSE;

import java.util.Random;

public class Test1_1 {
    static int digit = 8;

    public static void main(String[] args) {
        System.out.println("Hello Hostmann".length());
        Random random = new Random();
        System.out.println(random.nextInt());
        System.out.println(random.nextInt());
        System.out.println(Integer.min(digit, digit + 10) + Integer.MIN_VALUE);
        System.out.println("\u263A");

        double f = 123456789;
        //f = 400140;
        System.out.println(f);

//        double x = 3.75;
//        int y = (int) Math.round(x);
//        System.out.println(y);

        long x = 3_000_000_000_000L;
        int s = Math.toIntExact(x);

      //  String.format()

//        final int DAYS_IN_FEBRUARY;
//        if (leapYear) {
//            DAYS_IN_FEBRUARY = 29;
//        } else {
//            DAYS_IN_FEBRUARY = 28;
//        }
    }
}

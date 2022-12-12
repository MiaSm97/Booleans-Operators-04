package exercise.operators;

public class Start {
    public static void main(String[] args) {

        /*
           d = 3
           c = 3
           d / c >= b ---> true
           (c + b - c / a == 3) ---> true
           !true ---> false
           true || false ---> true
           result: true
         */

        int a = 1;
        int b = 3;
        int c = a * b;
        int d = c;
        System.out.println((d / c + 2) >= b || !(c + b - c / a == 3));


        /*
           (5 * 5) - (6 * 6 / 2) != 12 ---> true
           !t && f ---> true
           true || true ---> true
           result: true
         */
        
        int x = 5;
        int y = 6;
        boolean t = false;
        boolean f = true;
        System.out.println((x * x - y * y / 2 != 12) || !t && f);

    }
}
   /* Try to solve on paper the following boolean algebra operations:

        [A]: considering that a=1, b=3, c=a*b, d=c: (d / c + 2) >= b || !(c + b - c / a == 3)
        [B]: considering that x=5, y=6, t=false and f=true: (x * x - y * y / 2 != 12) || !t && f
        Then compare your solutions with a Java program that tests the validity of your assumptions.*/
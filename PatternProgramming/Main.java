package PatternProgramming;

import java.util.Scanner;

public class Main {
    public static final Scanner scanner = new Scanner(System.in);

    public static final int n = 5;
    public static void main(String[] args) {

//        pattern1();
//        pattern2();
//        pattern3();
//        pattern4();
//        pattern5();
//        pattern6();
//        pattern7();
//        pattern8();
//        pattern9();
//        pattern10();
//        pattern11();
        pattern12();

    }

    public static void pattern1(){
        for( int i = 0; i < n; i++) {
            for( int j = 0; j < n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void pattern2() {
        for( int i = 0; i < n; i++) {
            for( int j = 0 ; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void pattern3() {
        for ( int i = n ; i > 0; i--) {
            for ( int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void  pattern4() {
        for(int i = 1; i <= n; i++) {
            for( int j = 1; j <= i; j++) {
                System.out.print(j +" ");
            }
            System.out.println();
        }
    }

    public static void pattern5() {
        for (int i = 0 ; i < n; i++) {
            for(int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i = n - 1; i > 0; i--) {
            for(int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void pattern6() {
        for( int i = 1; i <= n; i++) {
            for(int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for(int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void pattern7() {
        for (int i = n; i > 0; i--) {
            for(int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void pattern8() {
        for(int i = 1; i <= n; i++) {
            for(int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for(int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void pattern9() {
        for(int i = n ; i > 0; i--) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }

    public static void pattern10() {
        for(int i = 1; i <= n; i++) {
            for(int j = 1; j <= n - i;j++) {
                System.out.print(" ");
            }

            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void pattern11() {
        for(int i = n; i > 0; i--) {
            for(int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1 ; j <= i; j++) {
                System.out.print("* ");
            }

            System.out.println();
        }
    }

    public static void pattern12() {
        for(int i = n ; i > 0; i--) {
            for(int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for(int j = 1 ; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for(int i = 1; i <= n; i++) {
            for(int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1 ; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}



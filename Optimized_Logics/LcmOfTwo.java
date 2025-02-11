package Optimized_Logics;

import java.util.Scanner;

public class LcmOfTwo {
    public static int Lcm(int a, int b)
    {
        return (a*b)/GcdOrHcd.gcd(a,b);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter two numbers : ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        System.out.println(Lcm(a, b));
        scanner.close();
    }
}
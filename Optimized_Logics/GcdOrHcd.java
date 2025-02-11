package Optimized_Logics;

import java.util.Scanner;

public class GcdOrHcd {
    public static int gcd(int a , int b)
    {
        if(b==0) return a;
        else
        {
            return gcd(b, a%b);
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Number : ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        System.out.println("Gcd : "+ gcd(Math.max(a, b), Math.min(a, b)));
        scanner.close();

    }
}

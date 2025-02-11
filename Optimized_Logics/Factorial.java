package Optimized_Logics;

import java.util.Scanner;

public class Factorial {
    public static int fact(int n)
    {
        if(n<=1) return 1;
        else return n * fact(n - 1); 
    }

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Number : ");
        int N = scanner.nextInt();
        System.out.println("\nFactorial : "+fact(N));
        scanner.close();
    }
}

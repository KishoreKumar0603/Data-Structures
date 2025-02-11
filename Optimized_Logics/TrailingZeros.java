package Optimized_Logics;

import java.util.Scanner;

public class TrailingZeros {
    public static int trailingZeros(int n)
    {
        int res =0;
        int powOf5 = 5;
        while (n >= powOf5) {
            res = res + (n / powOf5);
            powOf5 *= 5;

        }

        return res;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Number : ");
        int n = scanner.nextInt();
        System.out.println(trailingZeros(n));
        scanner.close();
    }
}

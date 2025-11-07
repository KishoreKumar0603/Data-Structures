package Kunal.Recursion;

public class PatternRecursion {
    public static void main(String[] args) {
        pattern1(4,0);
    }
    public static void pattern1(int n, int j) {
        if(n == 0) return;
        if(j < n){
            System.out.print("*");
            pattern1(n, j + 1);
        }
        else {
            System.out.println();
            pattern1(n - 1,0);
        }
    }
}

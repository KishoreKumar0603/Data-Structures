package Kunal.Recursion;

public class nTo1 {
    public static void main(String[] args) {
//        fun(8);
//        System.out.println();
//        funReverse(10);

//        int n = 6;
//        System.out.println("Factorial " + n + " : "+ fact(n));
//        int number =  1124;
//        System.out.println("Sum of Digit of "+number +" is "+sumOfDigit(number));
//        int n = 1233;
//        System.out.println("product of Digit : "+productOfDigit(n));

//        int n = 1234;
//        System.out.println("reverse the Number of "+n +" : "+reverseNumber(n));

        int num = 14;
        System.out.println(numberOfSteps(num));
    }
    public static int numberOfSteps(int num) {
        return helper(num , 0);
    }

    private static int helper(int num, int steps) {
        if (num  == 0){
            return steps;
        }
        if(num % 2 == 0){
            return helper(num / 2, steps + 1);
        }
        return helper(num - 1, steps + 1);
    }

    static  int reverseNumber(int n){

        if(n == 0){
            return 0;
        }
        return (n % 10) * 10 + reverseNumber(n / 10);
    }

    static int productOfDigit(int n){
        if( n  == 0 ) return 1;
        return  (n % 10) * productOfDigit(n / 10);
    }

    static int sumOfDigit(int n){
        if(n == 0){
            return 0;
        }
        return  n % 10 + sumOfDigit(n /10);
    }

    static void fun(int n){
        if( n == 1){
            System.out.print(n);
            return;
        }

        System.out.print(n + " ");
        fun(n - 1);
    }
    static void funReverse(int n){
        if( n == 0){
            return;
        }
        funReverse(n - 1);
        System.out.print(n + " ");
    }

    static  int fact(int n){
        if(n == 1){
            return 1;
        }
        return n * fact(n - 1);
    }
}

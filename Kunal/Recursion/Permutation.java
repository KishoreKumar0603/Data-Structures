package Kunal.Recursion;

public class Permutation {
    public static void main(String[] args) {
        permutations("","abc");
    }
    static void permutations(String p, String up) {
        if(up.isEmpty()) {
            System.out.println(p);
            return;
        }

        char ch = up.charAt(0);
        for(int i = 0; i <= p.length(); i++) {
            String first = p.substring(0,i);
            String second = p.substring(i, p.length());
            String newString = first + ch + second;
            permutations(newString, up.substring(1));
        }
    }
}

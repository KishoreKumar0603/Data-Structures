package Kunal.BackTracking;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.HashMap;

//https://leetcode.com/problems/letter-combinations-of-a-phone-number/description/?envType=problem-list-v2&envId=backtracking
public class LeetLetterCombination {
    public  static List<String> result = new ArrayList<>();

    public static void main(String[] args) {

        List<String> combinations = letterCombinations("23");

        for(int i = 0; i < combinations.size(); i++) {
            System.out.println(combinations.get(i));
        }
    }
    public static List<String> letterCombinations(String digits) {

        Map<Character, String> mapping = new HashMap<>();
        mapping.put('2', "abc");
        mapping.put('3', "def");
        mapping.put('4', "ghi");
        mapping.put('5', "jkl");
        mapping.put('6', "mno");
        mapping.put('7', "pqrs");
        mapping.put('8', "tuv");
        mapping.put('9', "wxyz");
        backTrack(digits, 0, mapping, new StringBuilder());
        return result;
    }
    public static void backTrack(String digits, int index, Map<Character, String> mapping, StringBuilder currentCombination) {
        if(index == digits.length()) {
            result.add(currentCombination.toString());
            return;
        }

        char digit = digits.charAt(index);
        String letterString = mapping.get(digit);

        for(char ch : letterString.toCharArray()) {
            currentCombination.append(ch);
            backTrack(digits, index + 1, mapping, currentCombination);
            currentCombination.deleteCharAt(currentCombination.length() - 1);
        }
    }
}

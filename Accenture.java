import java.util.HashSet;
import java.util.Set;

public class Accenture {
    public static void main(String[] args) {
        int[] arr = {1,2,3,2,4,5,2};
        int index = isDuplicate(arr, 0);
        System.out.println(index);
        int form = (int) Math.ceil((float) (index + 1) / 3);
        System.out.println(form);

    }
    public static int isDuplicate(int[] arr, int start) {
        Set<Integer> set = new HashSet<>();

        for(int i = arr.length  - 1; i >= 0; i--) {
            if(!set.contains(arr[i])) {
                set.add(arr[i]);
            } else {
                return i;
            }
        }

        return -1;
    }

}

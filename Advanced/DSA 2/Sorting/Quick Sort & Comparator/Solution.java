import java.util.ArrayList;
import java.util.Collections;

public class Solution {
    public String largestNumber(ArrayList<Integer> A) {

        Collections.sort(A, (Integer a, Integer b) -> {

            String s1 = String.valueOf(b) + String.valueOf(a);
            String s2 = String.valueOf(a) + String.valueOf(b);
            return s1.compareTo(s2);
        });

        StringBuilder sb = new StringBuilder();

        for (int val : A)
            sb.append(val + "");

        if (sb.charAt(0) == '0')
            return "0";

        return sb.toString();
    }
}

import java.util.ArrayDeque;
import java.util.Queue;

public class unique_letter {

    public String solve(String A) {

        if (A == null || A.length() == 0)
            return "";

        Queue<Character> q = new ArrayDeque<>();
        StringBuilder sb = new StringBuilder();

        int[] count = new int[26]; // Assuming only lowercase letters are used

        for (char ch : A.toCharArray()) {
            count[ch - 'a']++;
            q.add(ch);

            while (!q.isEmpty() && count[q.peek() - 'a'] > 1) {
                q.remove();
            }

            if (q.isEmpty()) {
                sb.append('#');
            } else {
                sb.append(q.peek());
            }
        }

        return sb.toString();
    }
}

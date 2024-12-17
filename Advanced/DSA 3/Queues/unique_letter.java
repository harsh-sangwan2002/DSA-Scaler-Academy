import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Queue;

public class unique_letter {

    public String solve(String A) {

        HashMap<Character, Integer> map = new HashMap<>();
        Queue<Character> q = new ArrayDeque<>();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < A.length(); i++) {

            char ch = A.charAt(i);
            q.add(ch);
            map.put(ch, map.getOrDefault(ch, 0) + 1);

            while (q.size() != 0 && map.get(q.peek()) > 1)
                q.remove();

            if (q.size() == 0)
                sb.append('#');

            else
                sb.append(q.peek());
        }

        return sb.toString();
    }
}

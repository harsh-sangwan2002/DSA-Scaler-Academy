import java.util.HashMap;

public class sol {

    public int solve(String A, String B) {

        HashMap<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < A.length(); i++) {

            char ch = A.charAt(i);

            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        for (int i = 0; i < B.length(); i++) {

            char ch = B.charAt(i);

            if (map.containsKey(ch) && map.get(ch) > 0) {
                map.put(ch, map.get(ch) - 1);
            }

            else
                return 0;
        }

        return 1;
    }
}

import java.util.HashMap;

// TC -> O(N)
// SC -> O(N)
public class CheckAnagrams {

    public int solve(String A, String B) {

        if (A.length() != B.length())
            return 0;

        HashMap<Character, Integer> map = new HashMap<>();

        for (char ch : A.toCharArray())
            map.put(ch, map.getOrDefault(ch, 0) + 1);

        for (char ch : B.toCharArray()) {

            if (!map.containsKey(ch) || map.get(ch) <= 0)
                return 0;

            map.put(ch, map.get(ch) - 1);
        }

        return 1;
    }
}

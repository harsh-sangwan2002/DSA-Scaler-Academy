import java.util.ArrayList;

public class find_seats {

    public int seats(String A) {

        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < A.length(); i++) {
            if (A.charAt(i) == 'x') {
                list.add((i));
            }
        }

        int ans = 0;
        for (int i = 0; i < list.size(); i++) {
            int start = list.get(i);
            int end = list.get(list.size() / 2) - (list.size() / 2) + i;
            ans = (ans + Math.abs(end - start)) % 10000003;

        }
        return ans % 10000003;
    }
}

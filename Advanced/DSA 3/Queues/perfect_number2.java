import java.util.ArrayDeque;
import java.util.Queue;

public class perfect_number2 {

    public String solve(int A) {

        if (A == 1) {
            return "11";
        }

        if (A == 2) {
            return "22";
        }

        Queue<String> q = new ArrayDeque<>();
        q.add("1");
        q.add("2");

        String res = "";
        int ins = 2;

        while (true) {
            StringBuilder str = new StringBuilder(q.remove());

            for (int p = 1; p <= 2; p++) {
                StringBuilder temp = new StringBuilder(str).append(p);
                q.add(temp.toString());
                ins++;

                if (ins == A) {
                    res = temp.toString() + temp.reverse().toString();
                    return res;
                }
            }
        }
    }
}

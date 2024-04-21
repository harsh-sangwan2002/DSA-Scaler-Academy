import java.util.ArrayDeque;
import java.util.Queue;

public class perfect_numbers {

    public String solve(int A) {

        Queue<String> q = new ArrayDeque<>();
        StringBuilder sb = new StringBuilder();
        q.add("1");
        q.add("2");
        int count = 2;

        for (int k = 1; k <= A; k++) {

            String str = q.remove();
            StringBuilder temp = new StringBuilder(str);
            StringBuilder curr = new StringBuilder(temp);
            curr.append(temp.reverse());
            sb = curr;

            for (int i = 1; i <= 2; i++) {

                if (count < A)
                    q.add(str + i);

                count++;
            }
        }

        return sb.toString();
    }
}

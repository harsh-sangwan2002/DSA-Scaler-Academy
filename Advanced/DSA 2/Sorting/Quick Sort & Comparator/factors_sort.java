import java.util.ArrayList;
import java.util.Collections;

public class factors_sort {

    private int factors(int n) {

        int count = 0;

        for (int i = 2; i <= Math.sqrt(n); i++) {

            if (n % i == 0) {

                if (i * i == n)
                    count++;

                else
                    count += 2;
            }
        }

        return count + 2;
    }

    public ArrayList<Integer> solve(ArrayList<Integer> A) {

        Collections.sort(A, (Integer a, Integer b) -> {

            int f1 = factors(a);
            int f2 = factors(b);

            if (f1 < f2)
                return -1;

            else if (f2 < f1)
                return 1;

            return a - b;
        });

        return A;
    }
}

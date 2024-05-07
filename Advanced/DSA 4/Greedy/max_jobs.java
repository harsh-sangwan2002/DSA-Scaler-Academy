import java.util.Arrays;

public class max_jobs {

    static class Pair {

        int st;
        int et;

        Pair(int st, int et) {
            this.st = st;
            this.et = et;
        }
    }

    public int solve(int[] A, int[] B) {

        Pair[] pairs = new Pair[A.length];

        for (int i = 0; i < pairs.length; i++)
            pairs[i] = new Pair(A[i], B[i]);

        Arrays.sort(pairs, (p1, p2) -> p1.et - p2.et);

        int prevEt = pairs[0].et;
        int jobs = 1;

        for (int i = 1; i < pairs.length; i++) {

            Pair p = pairs[i];

            if (p.st >= prevEt) {
                jobs++;
                prevEt = p.et;
            }
        }

        return jobs;
    }
}

public class continuous_sum_query {

    public int[] solve(int A, int[][] B) {

        int[] res = new int[A];

        for (int i = 0; i < B.length; i++) {

            int st = B[i][0] - 1, et = B[i][1], val = B[i][2];
            res[st] += val;

            if (et < A)
                res[et] -= val;
        }

        for (int i = 1; i < res.length; i++)
            res[i] += res[i - 1];

        return res;
    }
}

public class max_and_pair {

    private boolean checkBit(int n, int pos) {

        if ((n & (1 << pos)) != 0)
            return true;

        return false;
    }

    public int solve(int[] A) {

        int res = 0;

        for (int i = 31; i >= 0; i--) {

            int count = 0;
            for (int j = 0; j < A.length; j++) {

                if (checkBit(A[j], i))
                    count++;
            }

            if (count >= 2) {
                res += (1 << i);

                for (int j = 0; j < A.length; j++) {

                    if (!checkBit(A[j], i))
                        A[j] = 0;
                }
            }
        }

        return res;
    }
}

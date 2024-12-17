public class single_number2 {

    // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY

    private boolean checkBit(int n, int pos) {

        if ((n & (1 << pos)) == 0)
            return false;

        return true;
    }

    public int singleNumber(final int[] A) {

        int res = 0;

        for (int i = 0; i < 32; i++) {

            int count = 0;

            for (int j = 0; j < A.length; j++) {

                if (checkBit(A[j], i))
                    count++;
            }

            if (count % 3 != 0)
                res += (1 << i);
        }

        return res;
    }
}
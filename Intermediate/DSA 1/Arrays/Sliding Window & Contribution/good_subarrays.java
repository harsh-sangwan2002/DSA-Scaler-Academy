public class good_subarrays {

    public int solve(int[] A, int B) {

        int count = 0;

        for (int i = 0; i < A.length; i++) {

            int sum = 0, len = 0;
            for (int j = i; j < A.length; j++) {

                sum += A[j];
                len++;

                if (len % 2 == 0 && sum < B)
                    count++;

                if (len % 2 != 0 && sum > B)
                    count++;
            }
        }

        return count;
    }
}

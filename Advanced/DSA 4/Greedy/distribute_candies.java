public class distribute_candies {

    public int candy(int[] A) {

        int[] candy = new int[A.length];

        for (int i = 0; i < candy.length; i++)
            candy[i] = 1;

        for (int i = 1; i < A.length; i++) {

            if (A[i] > A[i - 1])
                candy[i] = candy[i - 1] + 1;
        }

        for (int i = A.length - 2; i >= 0; i--) {

            if (A[i] > A[i + 1]) {

                if (candy[i] <= candy[i + 1])
                    candy[i] = candy[i + 1] + 1;
            }
        }

        int sum = 0;

        for (int val : candy)
            sum += val;

        return sum;
    }
}

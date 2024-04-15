public class buy_sell_stock {

    // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
    public int maxProfit(final int[] A) {

        if (A == null || A.length <= 1)
            return 0;

        int min = A[0], ans = 0;

        for (int i = 1; i < A.length; i++) {

            min = Math.min(min, A[i]);
            int curr = A[i] - min;
            ans = Math.max(ans, curr);
        }

        return ans;
    }
}

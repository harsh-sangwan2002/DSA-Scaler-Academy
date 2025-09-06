// TC -> O(N)
// SC -> O(N)

public class PickFromBothSides {

    public int solve(int[] A, int B) {

        int n = A.length;
        int[] pre = new int[n], suf = new int[n];

        for (int i = 0; i < n; i++) {

            if (i == 0)
                pre[i] = A[i];

            else
                pre[i] = pre[i - 1] + A[i];
        }

        for (int i = n - 1; i >= 0; i--) {

            if (i == n - 1)
                suf[i] = A[i];

            else
                suf[i] = suf[i + 1] + A[i];
        }

        int max = Math.max(pre[B - 1], suf[n - B]);

        for (int i = 1; i < B; i++) {
            int sum = pre[i - 1] + suf[n - B + i];
            max = Math.max(max, sum);
        }

        return max;
    }
}

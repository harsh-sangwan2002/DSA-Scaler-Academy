// TC -> O(N^2)
// SC -> O(1)
public class sol {

    public int solve(int[] A, int B) {

        int n = A.length;

        for (int i = 0; i < n; i++) {

            for (int j = i + 1; j < n; j++) {

                if (A[i] + A[j] == B)
                    return 1;
            }
        }

        return 0;
    }
}

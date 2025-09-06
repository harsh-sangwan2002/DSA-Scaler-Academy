// TC -> O(N)
// SC -> O(1)

public class LinearSearch {

    public int solve(int[] A, int B) {

        int count = 0;

        for (int val : A) {

            if (val == B)
                count++;
        }

        return count;
    }
}

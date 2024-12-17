public class linear_search {

    public int solve(int[] A, int B) {

        int count = 0;

        for (int val : A) {

            if (val == B)
                count++;
        }

        return count;
    }
}

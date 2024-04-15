import java.util.Arrays;

public class aggressive_cows {

    private boolean isValid(int[] arr, int cows, int mid) {

        int count = 1;
        int placed = arr[0];

        for (int i = 1; i < arr.length; i++) {

            if (arr[i] - placed >= mid) {

                count++;

                if (count == cows)
                    return true;

                placed = arr[i];
            }
        }

        return false;
    }

    public int solve(int[] A, int B) {

        Arrays.sort(A);

        int s = 1, e = (int) (1e9 + 7), ans = 1;

        while (s <= e) {

            int mid = s + (e - s) / 2;

            if (isValid(A, B, mid)) {
                ans = mid;
                s = mid + 1;
            }

            else
                e = mid - 1;
        }

        return ans;
    }
}

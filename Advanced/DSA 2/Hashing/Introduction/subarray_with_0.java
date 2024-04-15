import java.util.HashSet;

public class subarray_with_0 {

    // Do not write code to include libraries, main() function or accept any input
    // from the console.
    // Initialization code is already written and hidden from you. Do not write code
    // for it again.
    public int solve(int[] A) {
        // Just write your code below to complete the function. Required input is
        // available to you as the function arguments.
        // Do not print the result or any output. Just return the result via this
        // function.
        HashSet<Long> set = new HashSet<>();
        long[] pre = new long[A.length];

        for (int i = 0; i < A.length; i++) {

            if (i == 0)
                pre[i] = (long) A[i];

            else
                pre[i] = pre[i - 1] + A[i];

            if (pre[i] == 0)
                return 1;
        }

        for (long val : pre) {

            if (set.contains(val))
                return 1;

            set.add(val);
        }

        return 0;
    }
}

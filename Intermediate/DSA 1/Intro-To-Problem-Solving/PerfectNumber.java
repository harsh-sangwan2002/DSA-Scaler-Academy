// TC -> O(sqrt(N))
// SC -> O(1)
public class PerfectNumber {

    public int solve(int A) {

        if (A == 1)
            return 0;

        int sum = 1;

        for (int i = 2; i * i <= A; i++) {

            if (A % i == 0) {

                if (i * i == A)
                    sum += i;

                else
                    sum += i + (A / i);
            }
        }

        return sum == A ? 1 : 0;
    }
}

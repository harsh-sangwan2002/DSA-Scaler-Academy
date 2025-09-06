// TC -> O(sqrt(N))
// SC -> O(1)
public class IsPrime {

    public int solve(int A) {

        if (A == 1)
            return 0;

        for (int num = 2; num * num <= A; num++) {

            if (A % num == 0)
                return 0;
        }

        return 1;
    }
}

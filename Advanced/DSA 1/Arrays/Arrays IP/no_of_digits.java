public class no_of_digits {

    public int solve(int A) {

        if (A <= 0) {
            return 0;
        }

        int count = 0;
        int multiplier = 1;
        int n = A;

        while (n > 0) {
            int digit = n % 10;
            n /= 10;

            count += (n * multiplier);

            if (digit == 1) {
                count += (A % multiplier) + 1;
            } else if (digit > 1) {
                count += multiplier;
            }

            multiplier *= 10;
        }

        return count;
    }
}

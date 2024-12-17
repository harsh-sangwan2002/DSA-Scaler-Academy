public class GCD {

    public int gcd(int A, int B) {

        if (A == 0)
            return B;
        if (B == 0)
            return A;

        return gcd(B, A % B);
    }
}

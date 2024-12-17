public class fibonacci {

    public int findAthFibonacci(int A) {

        if (A == 0 || A == 1)
            return A;

        return findAthFibonacci(A - 1) + findAthFibonacci(A - 2);
    }
}

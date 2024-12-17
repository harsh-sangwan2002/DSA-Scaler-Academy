public class sol2 {

    public int solve(int[] A) {

        if (A.length == 1)
            return -1;

        int max = Integer.MIN_VALUE, smax = Integer.MIN_VALUE;

        for (int val : A) {

            if (val > max) {

                smax = max;
                max = val;
            }

            else if (val > smax && val != max)
                smax = val;
        }

        if (smax == Integer.MIN_VALUE || smax == max)
            return -1;

        return smax;
    }
}

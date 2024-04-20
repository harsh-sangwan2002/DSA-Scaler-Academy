import java.util.List;

public class sol {
    // DO NOT MODIFY BOTH THE LISTS
    public double findMedianSortedArrays(final List<Integer> a, final List<Integer> b) {

        if (a.size() > b.size())
            return findMedianSortedArrays(b, a);

        int lo = 0, hi = a.size(), te = a.size() + b.size();

        while (lo <= hi) {

            int aleft = (lo + hi) / 2;
            int bleft = (te + 1) / 2 - aleft;

            int alm1 = (aleft == 0) ? Integer.MIN_VALUE : a.get(aleft - 1);
            int al = (aleft == a.size()) ? Integer.MAX_VALUE : a.get(aleft);
            int blm1 = (bleft == 0) ? Integer.MIN_VALUE : b.get(bleft - 1);
            int bl = (bleft == b.size()) ? Integer.MAX_VALUE : b.get(bleft);

            // valid mark
            if (alm1 <= bl && blm1 <= al) {

                double median = 0.0;

                if (te % 2 == 0) {
                    int lmax = Math.max(alm1, blm1);
                    int rmin = Math.min(al, bl);
                    median = (lmax + rmin) / 2.0;
                }

                else {
                    int lmax = Math.max(alm1, blm1);
                    median = lmax;
                }

                return median;
            }

            else if (alm1 > bl)
                hi = aleft - 1;

            else if (blm1 > al)
                lo = aleft + 1;
        }

        return -1;
    }
}

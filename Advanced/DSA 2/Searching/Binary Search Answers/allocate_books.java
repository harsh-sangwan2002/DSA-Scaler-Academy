public class allocate_books {

    private int[] findMinMax(int[] books) {

        int min = Integer.MAX_VALUE, max = 0;

        for (int val : books) {

            min = Math.min(val, min);
            max += val;
        }

        return new int[] { min, max };
    }

    private boolean valid(int[] books, int mid, int students) {

        int pages = 0, k = 1;

        for (int i = 0; i < books.length; i++) {

            if (pages + books[i] <= mid)
                pages += books[i];

            else {

                k++;

                if (k > students || books[i] > mid)
                    return false;

                pages = books[i];
            }
        }

        return true;
    }

    public int books(int[] books, int B) {

        if (B > books.length)
            return -1;

        int[] minMax = findMinMax(books);
        int lo = minMax[0], hi = minMax[1], ans = -1;

        while (lo <= hi) {

            int mid = lo + (hi - lo) / 2;

            if (valid(books, mid, B)) {
                ans = mid;
                hi = mid - 1;
            }

            else
                lo = mid + 1;
        }

        return ans;
    }
}

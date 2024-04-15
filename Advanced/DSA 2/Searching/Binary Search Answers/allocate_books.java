public class allocate_books {

    private boolean isValid(int[] arr, int count, int mid) {

        int student = 1;
        int pages = 0;

        for (int i = 0; i < arr.length; i++) {

            if (pages + arr[i] <= mid)
                pages += arr[i];

            else {

                student++;

                if (student > count || arr[i] > mid)
                    return false;

                pages = arr[i];
            }
        }

        return true;
    }

    public int books(int[] A, int B) {

        if (B > A.length)
            return -1;

        int s = 0, e = (int) (1e9 + 7), ans = -1;

        while (s <= e) {

            int mid = s + (e - s) / 2;

            if (isValid(A, B, mid)) {
                ans = mid;
                e = mid - 1;
            }

            else
                s = mid + 1;
        }

        return ans;
    }
}

import java.util.ArrayList;

public class sort_color {

    public ArrayList<Integer> sortColors(ArrayList<Integer> A) {

        int i = 0, j = 0, k = A.size() - 1;

        while (i <= k) {

            int val = A.get(i);
            if (val == 0) {
                swap(A, i, j);
                i++;
                j++;
            }

            else if (val == 1)
                i++;

            else {
                swap(A, i, k);
                k--;
            }
        }

        return A;
    }

    private void swap(ArrayList<Integer> list, int x, int y) {

        int temp = list.get(x);
        list.set(x, list.get(y));
        list.set(y, temp);
    }
}

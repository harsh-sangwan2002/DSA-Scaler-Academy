import java.util.ArrayList;
import java.util.Collections;

public class wave_array {

    private void swap(ArrayList<Integer> list, int x, int y) {

        int temp = list.get(x);
        list.set(x, list.get(y));
        list.set(y, temp);
    }

    public ArrayList<Integer> wave(ArrayList<Integer> A) {

        if (A.size() == 1)
            return A;

        Collections.sort(A);

        swap(A, 0, 1);

        for (int i = 2; i <= A.size() - 2; i += 2)
            swap(A, i, i + 1);

        return A;
    }
}

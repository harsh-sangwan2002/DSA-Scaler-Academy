import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

// TC -> O(log(N))
// SC -> O(N)
public class ColorfulNumber {

    public int colorful(int A) {

        List<Integer> list = new ArrayList<>();

        while (A != 0) {
            int ld = A % 10;
            list.add(ld);
            A /= 10;
        }

        Set<Integer> set = new HashSet<>();

        for (int i = 0; i < list.size(); i++) {

            int pr = 1;
            for (int j = i; j < list.size(); j++) {

                pr *= list.get(j);

                if (set.contains(pr))
                    return 0;

                set.add(pr);
            }
        }

        return 1;
    }
}

import java.util.HashSet;

public class check_pair {

    public int solve(int A, int[] B) {

        HashSet<Integer> set = new HashSet<>();

        for(int val : B){

            int comp = A-val;

            if(set.contains(comp))
            return 1;

            set.add(val);
        }

        return 0;
    }
}

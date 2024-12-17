public class prefix_sum {
    
    public int[] solve(int[] A) {

        for(int i=1; i<A.length; i++)
        A[i] += A[i-1];

        return A;
    }
}

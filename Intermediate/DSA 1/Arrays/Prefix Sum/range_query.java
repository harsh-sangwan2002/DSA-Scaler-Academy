public class range_query {
    
    public long[] rangeSum(int[] A, int[][] B) {

        long[] pre = new long[A.length];
        pre[0] = A[0]*1L;

        for(int i=1; i<A.length; i++)
        pre[i] = pre[i-1]+A[i];

        long[] res = new long[B.length];

        for(int i=0; i<B.length; i++){

            int st = B[i][0], et = B[i][1];

            if(st==0)
            res[i] = pre[et];

            else 
            res[i] = pre[et]-pre[st-1];
        }

        return res;
    }
}

// TC -> O(N)
// SC -> O(N)

public class RangeSumQuery {

    public long[] rangeSum(int[] A, int[][] B) {

        int n = A.length;
        long[] pre = new long[n], res = new long[B.length];

        for(int i=0; i<n; i++){

            if(i==0)
            pre[i] = (long)A[i];

            else 
            pre[i] = pre[i-1]+A[i];
        }

        for(int i=0; i<B.length; i++){

            int st = B[i][0], et = B[i][1];

            if(st==0)
            res[i] = pre[et];

            else
            res[i] = pre[et] - pre[st-1];
        }

        return res;
    }
}

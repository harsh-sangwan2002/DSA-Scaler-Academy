public class max_subarray_sum {
    
    // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
    public int maxSubArray(final int[] A) {

        int max = Integer.MIN_VALUE, currsum = 0;

        for(int val : A){

            currsum += val;
            max = Math.max(currsum,max);

            if(currsum<0)
            currsum = 0;
        }

        return max;
    }
}

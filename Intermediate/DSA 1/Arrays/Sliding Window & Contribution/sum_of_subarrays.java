public class sum_of_subarrays {
    
    public long subarraySum(int[] A) {

        long res = 0;

        for(int i=0; i<A.length; i++){

            long freq = (i+1)*1L*(A.length-i);
            long contri = A[i]*1L*freq;
            res = (res+contri);
        }

        return res;
    }
}

public class rain_water_trapped {
    
    // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
    public int trap(final int[] A) {

        int[] left = new int[A.length];
        int[] right = new int[A.length];

        for(int i=0; i<A.length; i++){

            if(i==0)
            left[i] = A[i];

            else 
            left[i] = Math.max(left[i-1],A[i]);
        }

        for(int i=A.length-1; i>=0; i--){

            if(i==A.length-1)
            right[i] = A[i];

            else 
            right[i] = Math.max(right[i+1],A[i]);
        }

        int water = 0;

        for(int i=1; i<A.length-1; i++){

            int block = Math.min(left[i],right[i]);
            int curr = block - A[i];

            if(curr>0)
            water += curr;
        }

        return water;
    }
}

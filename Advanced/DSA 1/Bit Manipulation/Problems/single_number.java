public class single_number {
    
    // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
    public int singleNumber(final int[] A) {

        int res = 0;

        for(int val : A)
        res ^= val;

        return res;
    }
}

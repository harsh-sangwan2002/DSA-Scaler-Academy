public class search_in_range {
    // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY

    private int firstIndex(int[] arr, int tar){

        int ans = -1, lo = 0, hi = arr.length-1;

        while(lo<=hi){

            int mid = lo+(hi-lo)/2;

            if(arr[mid]==tar){

                ans = mid;
                hi = mid-1;
            }

            else if(arr[mid]>tar)
            hi = mid-1;

            else
            lo = mid+1;
        }

        return ans;
    }

    private int lastIndex(int[] arr, int tar){

        int ans = -1, lo = 0, hi = arr.length-1;

        while(lo<=hi){

            int mid = lo+(hi-lo)/2;

            if(arr[mid]==tar){

                ans = mid;
                lo = mid+1;
            }

            else if(arr[mid]>tar)
            hi = mid-1;

            else
            lo = mid+1;
        }

        return ans;

    }

    public int[] searchRange(final int[] A, int B) {

        int fi = firstIndex(A,B);
        int li = lastIndex(A,B);

        int[] res = new int[2];
        res[0] = fi; res[1] = li;

        return res;
    }
}
public class consecutive_one {
    
    public int solve(String A) {

        int countOne = 0;

        for(int i=0; i<A.length(); i++){

            char ch = A.charAt(i);

            if(ch=='1')
            countOne++;
        }

        if(countOne==A.length())
        return countOne;

        int ans = 0;

        for(int i=0; i<A.length(); i++){

            char ch = A.charAt(i);

            if(ch=='0'){

                int left = 0, right = 0, j = i-1;

                while(j>=0 && A.charAt(j)=='1'){
                    left++;
                    j--;
                }

                j = i+1;

                while(j<A.length() && A.charAt(j)=='1'){
                    right++;
                    j++;
                }

                if(left+right==countOne)
                ans = Math.max(ans,left+right);

                else 
                ans = Math.max(ans,left+right+1);
            }
        }

        return ans;
    }
}

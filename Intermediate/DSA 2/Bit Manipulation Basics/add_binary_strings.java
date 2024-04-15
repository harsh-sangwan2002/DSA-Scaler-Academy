public class add_binary_strings {
    
    public String addBinary(String A, String B) {

        int carry = 0, i = A.length()-1, j = B.length()-1;
        String res = "";

        while(i>=0 || j>=0 || carry!=0){

            int d1 = i>=0?Integer.parseInt(A.charAt(i)+""):0;
            int d2 = j>=0?Integer.parseInt(B.charAt(j)+""):0;

            int sum = d1+d2+carry;
            int digit = sum%2;
            carry = sum/2;

            res = digit+res;

            i--;
            j--;
        }

        return res;
    }
}

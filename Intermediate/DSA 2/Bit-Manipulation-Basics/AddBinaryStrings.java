// TC -> O(Max(N,M))
// SC -> O(Max(N,M))

public class AddBinaryStrings {

    public String addBinary(String A, String B) {

        StringBuilder sb = new StringBuilder();
        int i = A.length() - 1, j = B.length() - 1;
        int carry = 0;

        while (i >= 0 || j >= 0 || carry != 0) {

            int d1 = i >= 0 ? Integer.parseInt(A.charAt(i) + "") : 0;
            int d2 = j >= 0 ? Integer.parseInt(B.charAt(j) + "") : 0;
            int sum = d1 + d2 + carry;

            int digit = sum % 2;
            carry = sum / 2;

            sb.insert(0, digit);
            i--;
            j--;
        }

        return sb.toString();
    }
}

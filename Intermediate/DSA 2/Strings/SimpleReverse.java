// TC -> O(N)
// SC -> O(N)

public class SimpleReverse {

    public String solve(String A) {

        StringBuilder sb = new StringBuilder();

        for (int i = A.length() - 1; i >= 0; i--)
            sb.append(A.charAt(i));

        return sb.toString();
    }
}

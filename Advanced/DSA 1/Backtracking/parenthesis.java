import java.util.ArrayList;

public class parenthesis {

    private void helper(int n, String str, int open, int close, ArrayList<String> res) {

        if (str.length() == 2 * n) {

            res.add(str);
            return;
        }

        if (open < n)
            helper(n, str + "(", open + 1, close, res);

        if (close < open)
            helper(n, str + ")", open, close + 1, res);
    }

    public String[] generateParenthesis(int A) {

        ArrayList<String> res = new ArrayList<>();

        helper(A, "", 0, 0, res);

        String[] arr = new String[res.size()];
        int idx = 0;

        for (String str : res)
            arr[idx++] = str;

        return arr;
    }
}

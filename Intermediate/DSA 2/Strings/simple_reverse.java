public class simple_reverse {

    public String solve(String A) {

        StringBuilder sb = new StringBuilder(A);
        int lo = 0, hi = sb.length() - 1;

        while (lo <= hi) {

            char ch = sb.charAt(lo);
            sb.setCharAt(lo, sb.charAt(hi));
            sb.setCharAt(hi, ch);

            lo++;
            hi--;
        }

        return sb.toString();
    }
}

import java.util.Arrays;

public class two_missing {

    private boolean checkBit(int n, int pos) {

        if ((n & (1 << pos)) == 0)
            return false;

        return true;
    }

    public int[] solve(int[] A) {

        int[] arr = new int[2];
        int xor = 0;

        for (int i = 1; i <= A.length + 2; i++)
            xor ^= i;

        for (int val : A)
            xor ^= val;

        int pos = 0;
        while (xor != 0) {

            if (checkBit(xor, 0))
                break;

            xor = xor >> 1;
            pos++;
        }

        int set = 0, unset = 0;
        for (int val : A) {

            if (checkBit(val, pos))
                set ^= val;

            else
                unset ^= val;
        }

        for (int i = 0; i <= A.length + 2; i++) {

            if (checkBit(i, pos))
                set ^= i;

            else
                unset ^= i;
        }

        arr[0] = set;
        arr[1] = unset;
        Arrays.sort(arr);
        return arr;
    }
}

import java.util.Arrays;

public class single_number3 {

    private boolean checkBit(int n, int pos) {

        if ((n & (1 << pos)) == 0)
            return false;

        return true;
    }

    public int[] solve(int[] A) {

        int[] arr = new int[2];
        int xor = 0;

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

        arr[0] = set;
        arr[1] = unset;
        Arrays.sort(arr);
        return arr;
    }
}

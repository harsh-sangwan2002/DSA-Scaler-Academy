public class set_bits {

    private boolean checkBit(int n) {

        if ((n & 1) == 0)
            return false;

        return true;
    }

    public int numSetBits(int A) {

        int count = 0;

        while (A != 0) {

            if (checkBit(A))
                count++;

            A = A >> 1;
        }

        return count;
    }
}

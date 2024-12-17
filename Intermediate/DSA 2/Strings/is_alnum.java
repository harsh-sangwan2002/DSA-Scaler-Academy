public class is_alnum {

    public int solve(char[] A) {

        for (int i = 0; i < A.length; i++) {

            char ch = A[i];

            if (ch >= 'a' && ch <= 'z')
                continue;

            else if (ch >= 'A' && ch <= 'Z')
                continue;

            else if (ch >= '0' && ch <= '9')
                continue;

            else
                return 0;
        }

        return 1;
    }
}

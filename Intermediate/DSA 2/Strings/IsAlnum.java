// TC -> O(N)
// SC -> O(1)

public class IsAlnum {

    public int solve(char[] A) {

        for (char ch : A) {

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

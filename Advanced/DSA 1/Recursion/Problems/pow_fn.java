// Do not write code to include libraries, main() function or accept any input from the console.
// Initialization code is already written and hidden from you. Do not write code for it again.
public class pow_fn {

    public int pow(int A, int B, int C) {
        // Just write your code below to complete the function. Required input is
        // available to you as the function arguments.
        // Do not print the result or any output. Just return the result via this
        // function.
        if (A == 0)
            return 0;
        if (B == 0)
            return 1;

        long ans = (pow(A, B / 2, C) * 1L) % C;
        ans = (ans * ans) % C;

        if (B % 2 != 0)
            ans = (ans * A) % C;

        if (ans < 0)
            ans = (ans + C) % C;

        return (int) ans;
    }
}

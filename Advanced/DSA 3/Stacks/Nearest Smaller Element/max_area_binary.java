import java.util.Stack;

public class max_area_binary {

    private int[] left(int[] A) {

        Stack<Integer> st = new Stack<>();
        int[] res = new int[A.length];

        for (int i = 0; i < A.length; i++) {

            while (st.size() != 0 && A[st.peek()] >= A[i])
                st.pop();

            if (st.size() == 0)
                res[i] = -1;

            else
                res[i] = st.peek();

            st.push(i);
        }

        return res;
    }

    private int[] right(int[] A) {

        Stack<Integer> st = new Stack<>();
        int[] res = new int[A.length];

        for (int i = A.length - 1; i >= 0; i--) {

            while (st.size() != 0 && A[st.peek()] >= A[i])
                st.pop();

            if (st.size() == 0)
                res[i] = A.length;

            else
                res[i] = st.peek();

            st.push(i);
        }

        return res;
    }

    public int largestRectangleArea(int[] A) {

        int[] nsl = left(A);
        int[] nsr = right(A);

        int area = Integer.MIN_VALUE;

        for (int i = 0; i < A.length; i++) {

            int width = nsr[i] - nsl[i] - 1;
            int curr = A[i] * width;

            area = Math.max(area, curr);
        }

        return area;
    }

    public int maximalRectangle(int[][] A) {

        int[] heights = new int[A[0].length];

        for (int j = 0; j < A[0].length; j++)
            heights[j] = A[0][j];

        int area = largestRectangleArea(heights);

        for (int i = 1; i < A.length; i++) {

            for (int j = 0; j < heights.length; j++) {

                if (A[i][j] == 1)
                    heights[j]++;

                else
                    heights[j] = 0;
            }

            area = Math.max(area, largestRectangleArea(heights));
        }

        return area;
    }
}

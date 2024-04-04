import java.util.Stack;

public class balanced_parenthesis {
    
    public int solve(String A) {

        Stack<Character> st = new Stack<>();
        boolean flag = true;

        for(int i=0; i<A.length(); i++){

            char ch = A.charAt(i);

            if(ch=='(' || ch=='{' || ch=='[')
            st.push(ch);

            else if(ch==')'){

                flag = isValid(st,'(');

                if(!flag)
                return 0;
            }

            else if(ch=='}'){

                flag = isValid(st,'{');

                if(!flag)
                return 0;
            }

            else if(ch==']'){

                flag = isValid(st,'[');

                if(!flag)
                return 0;
            }
        }

        return st.isEmpty()?1:0;
    }

    private boolean isValid(Stack<Character> st, char ch){

        if(st.isEmpty() || st.peek()!=ch)
        return false;

        st.pop();

        return true;
    }
}

public class unset_bits {

    private boolean check(long n, int pos){

        if((n&(1<<pos))!=0)
        return true;

        return false;
    }

    private long toggle(long n, int pos){

        return (n^(1<<pos));
    }

    public long solve(long A, int B) {

        for(int i=0; i<B; i++){

            if(check(A,i))
            A = toggle(A,i);
        }

        return A;
    }
}

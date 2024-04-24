public class perfect_number {
    
    public int solve(int A) {

        if(A==1)
        return 0;

        int sum = 0;

        for(int i=1; i<=Math.sqrt(A); i++){

            if(A%i==0){

                if(i*i==A || i==1)
                sum += i;

                else 
                sum += i+A/i;
            }
        }

        return sum==A?1:0;
    }
}

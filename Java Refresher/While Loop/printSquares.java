import java.util.Scanner;

public class printSquares {

    public static void main(String[] args) {
        
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int count = 1;
        while(count*count<=n){

            System.out.println(count*count);
            count++;
        }
        
        scn.close();
    }
    
}

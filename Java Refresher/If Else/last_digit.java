import java.util.Scanner;

public class last_digit{

    public static void main(String[] args){

        Scanner scn = new Scanner(System.in);

        int num = scn.nextInt();
        System.out.println(num%10);

        scn.close();
    }
}
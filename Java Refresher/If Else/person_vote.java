import java.util.Scanner;

public class person_vote {

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        int age = scn.nextInt();

        if (age >= 18)
            System.out.println("Person can vote");

        else
            System.out.println("Person cannot vote");

        scn.close();
    }
}
import java.util.Scanner;

public class check_temp {

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        Double d = scn.nextDouble();

        if (d < 98.2)
            System.out.println("Low");

        else if (d >= 98.2 && d <= 98.8)
            System.out.println("Normal");

        else
            System.out.println("High");

        scn.close();
    }
}

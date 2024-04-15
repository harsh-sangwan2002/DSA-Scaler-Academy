import java.util.Scanner;

public class electricity_bill {

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        int bill = scn.nextInt();

        if (bill >= 1 && bill <= 50)
            System.out.println(bill);

        else if (bill <= 100)
            System.out.println(50 + (bill - 50) * 2);

        else
            System.out.println(150 + (bill - 100) * 4);

        scn.close();
    }
}
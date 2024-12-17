import java.util.*;

public class substrings {

    public static void print(String str) {

        for (int i = 0; i < str.length(); i++) {

            for (int j = i; j < str.length(); j++) {

                System.out.println(str.substring(i, j + 1));
            }
        }
    }

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();

        print(str);
        scn.close();
    }

}

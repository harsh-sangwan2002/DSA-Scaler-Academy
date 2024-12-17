public class excel_column_title {

    public String convertToTitle(int A) {

        String str = "";

        while (A != 0) {

            char ch = (char) ((A - 1) % 26 + 'A');
            str = ch + str;
            A = (A - 1) / 26;
        }

        return str;
    }
}

import java.util.Scanner;

public class NestedLogic {
    public static final int DAY_FINE_TAX = 15;
    public static final int MONTH_FINE_TAX = 500;
    public static final int YEAT_FIX_FINE = 10000;

    int mFine = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int dayReturned, monthReturned, yearReturned;
        int dayExpected, monthExpected, yearExpected;

        //Returned
        dayReturned = sc.nextInt();
        monthReturned = sc.nextInt();
        yearReturned = sc.nextInt();

        //Expected
        dayExpected = sc.nextInt();
        monthExpected = sc.nextInt();
        yearExpected = sc.nextInt();

        sc.close();

        if (yearReturned > yearExpected) {

        }
    }
}

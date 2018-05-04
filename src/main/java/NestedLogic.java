import java.util.Scanner;

public class NestedLogic {
    public static final int DAY_FINE_TAX = 15;
    public static final int MONTH_FINE_TAX = 500;
    public static final int YEAR_FIX_FINE = 10000;

    static int mFine;

    public static void main(String[] args) {
        mFine = 0;
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
            mFine = YEAR_FIX_FINE;
        } else if (monthReturned > monthExpected && yearReturned == yearExpected) {
            mFine = MONTH_FINE_TAX * (monthReturned - monthExpected);
        } else if (dayReturned > dayExpected && yearReturned == yearExpected && monthReturned == monthExpected) {
            mFine = DAY_FINE_TAX * (dayReturned - dayExpected);
        }

        System.out.println(mFine);
    }
}

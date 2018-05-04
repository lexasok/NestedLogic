import java.util.Scanner;

public class NestedLogic {


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
    }
}

import java.util.Scanner;

public class NestedLogic {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BookReturnDate actual = new BookReturnDate(sc.nextInt(), sc.nextInt(), sc.nextInt());
        BookReturnDate expected = new BookReturnDate(sc.nextInt(), sc.nextInt(), sc.nextInt());

        int fine = 0;
        if (actual.year == expected.year) {
            if (actual.month > expected.month) {
                fine = (actual.month - expected.month) * 500;
            } else if (actual.month == expected.month && actual.day > expected.day) {
                fine = (actual.day - expected.day) * 15;
            }
        } else if (expected.year < actual.year) {
            fine = 10000;
        }
        System.out.println(fine);
    }
}

class BookReturnDate {
    int day;
    int month;
    int year;

    public BookReturnDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }
}


import java.util.Scanner;

public class NestedLogic {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BookReturnDate actual = new BookReturnDate(sc.nextInt(), sc.nextInt(), sc.nextInt());
        BookReturnDate expexted = new BookReturnDate(sc.nextInt(), sc.nextInt(), sc.nextInt());

        int fine = 0;
        if (actual.year == expexted.year) {
            if (actual.month > expexted.month) {
                fine = (actual.month - expexted.month) * 500;
            } else if (actual.month == expexted.month && actual.day > expexted.day) {
                fine = (actual.day - expexted.day) * 15;
            }
        } else if (expexted.year < actual.year) {
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


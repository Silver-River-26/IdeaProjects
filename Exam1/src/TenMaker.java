import java.util.Scanner;

public class TenMaker {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter your first value");
        int val1 = in.nextInt();
        System.out.println("Please enter your second value");
        int val2 = in.nextInt();
        int isTen = makes10(val1, val2);
        if (isTen == 1) {
            System.out.print("These numbers equal Ten!");
        } else if (isTen == 0) {
            System.out.print("These numbers do not equal Ten.");
        } else {
            System.out.print("There was an error"); // I was having issues this was for my own use
        }
    }

    public static int makes10(int val1, int val2) {
        int sum = val1 + val2;
        if (sum == 10) {
            return 1;
        } else {
            return 0;
        }
    }
}

import java.util.Scanner;

public class Summer {
    public static void main(String[] args) {
        System.out.println(" continue to add your numbers to sum them, enter 0 when done.");
        Scanner in = new Scanner(System.in);
        boolean stop = false;
        int sum = 0;
        int nextVal = in.nextInt();
        System.out.println("add another value or enter 0");
        while (!stop) {
            if (nextVal != 0) {
                sum += nextVal;
                nextVal = in.nextInt();
                System.out.println("add another value or enter 0");
            }
            else if (nextVal == 0){
                stop = true;
            }
        }
        System.out.print("The sum is " + sum);
    }
}

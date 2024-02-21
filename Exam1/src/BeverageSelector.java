import java.util.Scanner;

public class BeverageSelector {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter the number of the beverage you would like- Water(1), Coke(2), or Coffee(3)");
        int beverage = in.nextInt();
        if (beverage == 1) {
            System.out.print("You have selected Water!");
        } else if (beverage == 2) {
            System.out.print("You have selected Coke!");
        } else if (beverage == 3) {
            System.out.print("You have selected Coffee!");
        } else {System.out.print("please select an available beverage");}

    }
}

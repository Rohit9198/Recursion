package Switch;

import java.util.Scanner;

public class fruits {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String fruit = in.next();

        switch (fruit) {
            case "Mango":
                System.out.println("King of Fruits");
                break;
            case "Apple":
                System.out.println("A sweet red fruits");
                break;
            case "orange":
                System.out.println("Round fruits");
                break;
            case "Grapes":
                System.out.println("Small fruit");
            default:
                System.out.println("Please enter a valid fruit");
        }
    }
}

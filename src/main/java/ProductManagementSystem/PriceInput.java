package ProductManagementSystem;

import java.util.Scanner;

public class PriceInput implements UserInput{

    @Override
    public String input() {
        System.out.print("Enter price (1-1000): ");
        String price =sc.nextLine();
        if(!price.matches("^(1000|[1-9][0-9]{0,2})$")){
            System.out.println("Invalid or over the price limit. Enter again.");
            return input();
        }

        return price;

    }
    public String input(Scanner sc) {
        System.out.print("Enter price (1-1000): ");
        String price =sc.next();
        if(!price.matches("^([1-9]|[1-9][0-9]{1,2}|1000)$")){
            System.out.println("Invalid or over the price limit. Enter again.");
            return input();
        }

        return price;

    }


}

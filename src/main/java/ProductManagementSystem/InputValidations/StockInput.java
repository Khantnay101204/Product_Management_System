package ProductManagementSystem.InputValidations;

import ProductManagementSystem.UserInput;

public class StockInput implements UserInput {

    @Override
    public String input() {
        System.out.print("Enter stock (1-1000): ");
        String stock =sc.nextLine();
        if(!stock.matches("^(1000|[1-9][0-9]{0,2})$")){
            System.out.println("Invalid or over the stock limit. Enter again.");
            return input();
        }

        return stock;

    }

}
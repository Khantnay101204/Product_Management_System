package ProductManagementSystem.InputValidations;

import ProductManagementSystem.UserInput;

public class NameInput implements UserInput {

    @Override
    public String input() {
        System.out.print("Enter Name: ");
        String name =sc.nextLine();
        if(!name.matches("^[A-Z][\\s\\S]{1,40}$")){
            System.out.println("Invalid name. Enter again.");
            return input();
        }

        return name;

    }

}

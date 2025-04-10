package ProductManagementSystem;

import java.util.Scanner;

public class DescriptionInput implements UserInput{

    @Override
    public String input() {
        System.out.print("Enter Description: ");
        String description =sc.next();
        if(!description.matches("[A-Z][a-z]{1,60}")){
            System.out.println("Invalid description. Enter again.");
            return input();
        }

        return description;

    }
    public String input(Scanner sc) {
        System.out.print("Enter Description: ");
        String description =sc.next();
        if(!description.matches("[A-Z][a-z]{1,60}")){
            System.out.println("Invalid description. Enter again.");
            return input();
        }

        return description;

    }

}

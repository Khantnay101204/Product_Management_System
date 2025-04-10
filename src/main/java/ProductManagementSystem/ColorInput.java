package ProductManagementSystem;

public class ColorInput implements UserInput{

    @Override
    public String input() {
        System.out.print("Enter color: ");
        String color =sc.nextLine();
        if(!color.matches("[A-Z][a-z]{1,30}")){
            System.out.println("Invalid input. Enter again.");
            return input();
        }

        return color;

    }

}


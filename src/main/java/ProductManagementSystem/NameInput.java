package ProductManagementSystem;

public class NameInput implements UserInput{

    @Override
    public String input() {
        System.out.print("Enter Name: ");
        String name =sc.next();
        if(!name.matches("[A-Z][a-z]{1,40}")){
            System.out.println("Invalid name. Enter again.");
            return input();
        }

        return name;

    }

}

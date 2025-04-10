package ProductManagementSystem;

public class BrandInput implements UserInput{

    @Override
    public String input() {
        System.out.print("Enter Brand: ");
        String brand =sc.nextLine();
        if(!brand.matches("^[A-Z][\\s\\S]{1,40}$")){
            System.out.println("Invalid brand. Enter again.");
            return input();
        }

        return brand;

    }

}

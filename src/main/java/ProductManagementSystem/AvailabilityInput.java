package ProductManagementSystem;

public class AvailabilityInput implements UserInput {
    @Override
    public String input() {
        String availability="";
        System.out.println("1. In stock\n2. Out of stock\n3. Limited stock\n4.Backorder\n5. Preorder\n6. Discontinued");
        System.out.print("Choose an option above (1-6): ");
        String option=sc.nextLine();
        switch (option){
            case "1": availability="in_stock";
            break;
            case "2": availability="out_of_stock";
            break;
            case "3": availability="limited_stock";
            break;
            case "4": availability="backorder";
            break;
            case "5": availability="pre_order";
            break;
            case "6": availability="discontinued";
            break;
            default:
                System.out.println("Invalid input. Please try again");return input();

        }
        return availability;

    }

    public static void main(String[] args) {
        AvailabilityInput a=new AvailabilityInput();
        String str=a.input();
        System.out.println(str);
    }
}

package ProductManagementSystem;

import ProductManagementSystem.InputValidations.*;

public class UserInputOptionsMaker {
    private static UserInputOptionsMaker instance;
    private UserInput name;
    private UserInput description;
    private UserInput brand;
    private UserInput category;
    private UserInput price;
    private UserInput stock;
    private UserInput color;
    private UserInput size;
    private UserInput availability;

    private UserInputOptionsMaker() {
        name = new NameInput();
        description = new DescriptionInput();
        brand = new BrandInput();
        category = new CategoryInput();
        price = new PriceInput();
        stock = new StockInput();
        color = new ColorInput();
        size = new SizeInput();
        availability = new AvailabilityInput();
    }

    public static UserInputOptionsMaker getInstance() {
        if (instance == null) { // Initialize only if null
            instance = new UserInputOptionsMaker();
        }
        return instance;
    }

    public String getName() {
        return name.input();
    }

    public String getDescription() {
        return description.input();
    }

    public String getBrand() {
        return brand.input();
    }

    public String getCategory() {
        return category.input();
    }

    public String getPrice() {
        return price.input();
    }

    public String getStock() {
        return stock.input();
    }

    public String getColor() {
        return color.input();
    }

    public String getSize() {
        return size.input();
    }

    public String getAvailability() {
        return availability.input();
    }

//    public static void main(String[] args) {
//        UserInputOptions uin=UserInputOptions.getInstance();
//        String name= uin.getName();
//
//    }
}

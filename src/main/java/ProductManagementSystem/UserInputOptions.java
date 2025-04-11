package ProductManagementSystem;

import ProductManagementSystem.InputValidations.*;

public class UserInputOptions {
    private static UserInputOptions instance;
    UserInput name;
    UserInput description;
    UserInput brand;
    UserInput category;
    UserInput price;
    UserInput stock;
    UserInput color;
    UserInput size;
    UserInput availability;

    private UserInputOptions() {
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

    public static UserInputOptions getInstance() {
        if (instance == null) { // Initialize only if null
            instance = new UserInputOptions();
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

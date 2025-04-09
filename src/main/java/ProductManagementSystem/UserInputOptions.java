package ProductManagementSystem;

public class UserInputOptions {
    UserInput name;
    UserInput description;
    UserInput brand;
    UserInput category;
    UserInput price;
    UserInput stock;
    UserInput color;
    UserInput size;
    UserInput availability;

    public UserInputOptions(){
        name =new NameInput();
        description = new DescriptionInput();
        brand = new BrandInput();
        category =new CategoryInput();
        price =new PriceInput();
        stock =new StockInput();
        color= new ColorInput();
        size = new SizeInput();
        availability= new AvailabilityInput();
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

}

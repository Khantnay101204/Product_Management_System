package ProductManagementSystem;

public interface Report {
    UserInputOptions uin=UserInputOptions.getInstance();
    SearchProduct se= SearchProduct.getInstance();
       void report();
}


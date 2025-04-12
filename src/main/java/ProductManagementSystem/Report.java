package ProductManagementSystem;

public interface Report {
    UserInputOptionsMaker uin= UserInputOptionsMaker.getInstance();
    SearchProduct se= SearchProduct.getInstance();
       void report();
}


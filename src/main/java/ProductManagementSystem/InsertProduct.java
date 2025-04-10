package ProductManagementSystem;

import java.util.LinkedList;

public class InsertProduct extends ProductCSVHandler{

    public InsertProduct(String filePath) {
        super(filePath);
    }

    @Override
    void executeOperation(LinkedList<Product> productList) {
        int internalID = (int) (Math.random() * 99) + 1;
        String name= uin.getName();
        String category= uin.getCategory();
        if (search.searchByName_and_Category(productList,name,category)>=0){
            System.out.println("Product already exists");
            executeOperation(productList);
            return;
        }

        String description = uin.getDescription();
        String brand = uin.getBrand();
        String price = uin.getPrice();
        String stock = uin.getStock();
        String color = uin.getColor();
        String size = uin.getSize();
        String availability = uin.getAvailability();
        productList.add(new Product(name, description, brand, category, Integer.parseInt(price), "USD", Integer.parseInt(stock), color, size, availability, internalID));
        System.out.println("Product Inserted Successfully");
        System.out.println(productList.size());

    }

//    public static void main(String[] args) {
//        String csv="Data/products dataset.csv";
//        ProductCSVHandler Inproduct= new InsertProduct(csv);
//        Inproduct.process();
//
//    }
}

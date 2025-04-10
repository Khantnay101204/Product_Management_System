package ProductManagementSystem;

import java.util.LinkedList;

public class UpdateProduct extends ProductCSVHandler{
    public UpdateProduct(String filePath) {
        super(filePath);
    }

    @Override
    void executeOperation(LinkedList<Product> productList) {
        String name= uin.getName();
        String category= uin.getCategory();
        int idx=search.searchByName_and_Category(productList,name,category);
        if (idx<0){
            System.out.println("Product does not exist");
            executeOperation(productList);
            return;
        }
        Product oldProduct = productList.get(idx);
        updateMenu(oldProduct);




    }

    public static void updateMenu(Product product){
        System.out.println("1. Price\n2. Stock\n3. Availability\n4. Exit");
        System.out.print("Choose an option: ");
        String op=sc.nextLine();
        switch (op){
            case "1":{
                String price=uin.getPrice();
                product.setPrice(Integer.parseInt(price));
                System.out.println("Successfully edited" );
                updateMenu(product);
                break;
            }

            case "2":{
                String stock=uin.getStock();
                product.setStock(Integer.parseInt(stock));
                System.out.println("Successfully edited" );
                updateMenu(product);
                break;
            }

            case "3":{
                String availability=uin.getAvailability();
                product.setAvailability(availability);
                System.out.println("Successfully edited" );
                updateMenu(product);
                break;
            }
            case "4":{
                return;

            }
            default:
                System.out.println("Invalid option. Please try again.");
                updateMenu(product);
                break;


        }

    }

//    public static void main(String[] args) {
//        String csv="Data/products dataset.csv";
//        ProductCSVHandler Update= new UpdateProduct(csv);
//        Update.process();
//    }


}

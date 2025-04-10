package ProductManagementSystem;

import java.util.LinkedList;

public class DeleteProduct extends ProductCSVHandler {

    public DeleteProduct(String filePath) {
        super(filePath);
    }

    @Override
    void executeOperation(LinkedList<Product> productList) {
        String name= uin.getName();
        String category= uin.getCategory();
        int idx=search.searchByName_and_Category(productList,name,category);
        System.out.println(idx);
        if (idx<0){
            System.out.println("Product does not exist");
            executeOperation(productList);
        }
        productList.remove(idx);
        System.out.println("Product deleted successfully");
        System.out.println(productList.size());



    }
    public static void main(String[] args) {
        String csv="Data/products dataset.csv";
        ProductCSVHandler DeProduct= new DeleteProduct(csv);
        DeProduct.process();

    }
}

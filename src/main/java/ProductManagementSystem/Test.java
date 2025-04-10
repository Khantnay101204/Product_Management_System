package ProductManagementSystem;

import java.util.LinkedList;

public class Test {
    public static void main(String[] args) {
        String csv="Data/products dataset.csv";
        LinkedList<Product> productList=new LinkedList<>();
        ProductCSVHandler Inproduct= new InsertProduct(csv);
        Inproduct.process();


    }
}

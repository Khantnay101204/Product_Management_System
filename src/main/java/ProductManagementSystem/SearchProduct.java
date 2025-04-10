package ProductManagementSystem;

import java.util.LinkedList;

public class SearchProduct {
    private static SearchProduct instance;
    private SearchProduct(){}

    public static SearchProduct getInstance(){
        if (instance == null) {
            instance = new SearchProduct();
        }
        return instance;
    }

    public int searchByName_and_Category(LinkedList<Product> productList,String name, String category){

        int idx=0;
        for (Product product: productList){
            if (product.getName().equalsIgnoreCase(name) && product.getCategory().equalsIgnoreCase(category)){
                return idx;
            }
            idx++;
        }
        return -1;

    }


}

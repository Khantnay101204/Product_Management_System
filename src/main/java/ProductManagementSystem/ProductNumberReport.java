package ProductManagementSystem;

import de.vandermeer.asciitable.AsciiTable;
import de.vandermeer.skb.interfaces.transformers.textformat.TextAlignment;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public class ProductNumberReport implements Report{
    LinkedList<Product> productList;
    public ProductNumberReport (LinkedList<Product> productList){
        this.productList=productList;
    }
    @Override
    public void report() {
        HashMap<String,Integer> map=new HashMap<>();
        for (Product product: productList){
            if (!map.containsKey(product.getCategory())){
                map.put(product.getCategory(),1);
            }
            else {
                map.replace(product.getCategory(), map.get(product.getCategory())+1);
            }
        }
        AsciiTable table =new AsciiTable();
        table.addRule();
        table.addRow(Arrays.asList("Category Name","Number of Products"));
        table.addRule();
        for(Map.Entry<String,Integer> entry: map.entrySet()){
            table.addRow(Arrays.asList(entry.getKey(),entry.getValue()));
            table.addRule();
        }
        table.setTextAlignment(TextAlignment.CENTER);
        System.out.println(table.render());

    }
//    public static void main(String[] args) {
//        String csv="Data/products dataset.csv";
//        LinkedList<Product> productlist=new LinkedList<>();
//       productlist=ProductCSVHandler.readCSV(csv);
//       ProductNumberReport report=new ProductNumberReport(productlist);
//       report.report();
//    }

}

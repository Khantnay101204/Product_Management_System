package ProductManagementSystem;

import de.vandermeer.asciitable.AsciiTable;
import de.vandermeer.asciitable.CWC_LongestLine;
import de.vandermeer.skb.interfaces.transformers.textformat.TextAlignment;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;

public class SelectedCategoryReport implements Report {
    LinkedList<Product> productList;

    public SelectedCategoryReport(LinkedList<Product> productList) {
        this.productList = productList;
    }

    @Override
    public void report() {
    String category=uin.getCategory();
    LinkedList<Product> products= new LinkedList<>();
    for (Product product: productList){
        if (category.equals(product.getCategory())){
            products.add(product);
        }
    }
    products.sort(Collections.reverseOrder(Comparator.comparing(Product::getPrice)));
    System.out.println("________Products of "+category+" category________");
        AsciiTable table = new AsciiTable();
        table.addRule();
        table.addRow(Arrays.asList("Name", "Description", "Brand", "Category", "Price", "Currency", "Stock", "Color", "Size", "Availability", "InternalID"
        ));
        table.addRule();
        for (Product product: products){
            table.addRow(Arrays.asList(product.getName(), product.getDescription(), product.getBrand(),
                    product.getCategory(), product.getPrice(), product.getCurrency(),
                    product.getStock(), product.getColor(), product.getSize(),
                    product.getAvailability(),product.getInternalID()));
            table.addRule();
        }

        table.setTextAlignment(TextAlignment.CENTER);
        CWC_LongestLine cwc=new CWC_LongestLine();
        cwc.add(0,15);
        cwc.add(0,15);
        cwc.add(0,15);
        cwc.add(0,15);
        cwc.add(0,15);
        cwc.add(0,15);
        cwc.add(0,15);
        cwc.add(0,15);
        cwc.add(0,15);
        cwc.add(0,15);
        cwc.add(0,15);
       table.getRenderer().setCWC(cwc);
        System.out.println(table.render());
    }

//    public static void main(String[] args) {
//        String csv="Data/products dataset.csv";
//        LinkedList<Product> productlist=new LinkedList<>();
//       productlist=ProductCSVHandler.readCSV(csv);
//       SelectedCategoryReport report=new SelectedCategoryReport(productlist);
//       report.report();
//    }
}

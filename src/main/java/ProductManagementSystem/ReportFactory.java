package ProductManagementSystem;

import java.util.LinkedList;
import java.util.Scanner;

public class ReportFactory {
    Scanner sc=new Scanner(System.in);
    public Report getReport(String filePath){
        LinkedList<Product> productList= ProductCSVHandler.readCSV(filePath);
        System.out.println("1. Product records of the Category sorting from highest price to the lowest.");
        System.out.println("2. The total number of products in each Category");
        System.out.println("3. Counting different Brand in each Category");
        System.out.print("Option: ");
        String op=sc.nextLine();
        switch (op){
            case "1":
            return new SelectedCategoryReport(productList);

            case "2":
            return new ProductNumberReport(productList);

            case "3":
                return new BrandCountReport(productList);

            default:
                System.out.println("Invalid option. Please try again.");
                return getReport(filePath);
        }
    }
}

package ProductManagementSystem;

import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvValidationException;

import java.io.*;
import java.util.LinkedList;
import java.util.Scanner;

public abstract class ProductCSVHandler {
    protected LinkedList<Product> productList=new LinkedList<>();
    protected String filePath;
    protected static UserInputOptions uin=UserInputOptions.getInstance();
    protected static SearchProduct search=SearchProduct.getInstance();
    protected static Scanner sc=new Scanner(System.in);

    public ProductCSVHandler(String filePath) {
        this.filePath = filePath;
    }
    public final void process(){
        readCSV();
        executeOperation(productList);
        writeCSV();
    }



    private void readCSV(){
        FileReader fr = null;
        try {
            fr = new FileReader(filePath);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        CSVReader csvReader = new CSVReader(fr);
        String[] str;
        while (true) {
            try {
                if ((str = csvReader.readNext()) == null) break;
            } catch (IOException | CsvValidationException e) {
                throw new RuntimeException(e);
            }
            productList.add(new Product(
                    str[0],                    // name
                    str[1],                    // description
                    str[2],                    // brand
                    str[3],                    // category
                    Integer.parseInt(str[4]),   // price (Fixed)
                    str[5],                    // currency
                    Integer.parseInt(str[6]),   // stock (Fixed)
                    str[7],                    // color
                    str[8],                    // size
                    str[9],                    // availability
                    Integer.parseInt(str[10])   // internalID
            ));

        }
        try {
            csvReader.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        try {
            fr.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    abstract void executeOperation(LinkedList<Product> productList);

    private void writeCSV() {
        FileWriter fw= null;

        try {
            fw = new FileWriter(filePath,false);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        PrintWriter pw=new PrintWriter(fw);

        for(Product product: productList){
            pw.println(product.getName() + "," + product.getDescription() + "," + product.getBrand() + "," +
                    product.getCategory() + "," + product.getPrice() + "," + product.getCurrency() + "," +
                    product.getStock() + "," + product.getColor() + "," + product.getSize() + "," +
                    product.getAvailability() + "," + product.getInternalID());
        }

        pw.close();
        try {
            fw.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }


}

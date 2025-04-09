package ProductManagementSystem;

import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvValidationException;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;


public class ReadingData {

    private static ReadingData instance;
    private static LinkedList<Product> productList = new LinkedList<>();

    private ReadingData() {}


    public static ReadingData getInstance() {
        if (instance == null) {
            synchronized (ReadingData.class) {
                if (instance == null) {
                    instance = new ReadingData();
                }
            }
        }
        return instance;
    }


    public  LinkedList<Product> readData(String fileName) {
        FileReader fr = null;
        try {
            fr = new FileReader(fileName);
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
        return productList;

    }

    public static void main(String[] args) {
        ReadingData rd= ReadingData.getInstance();
        LinkedList<Product>list =rd.readData("Data/products dataset.csv");



    }
}

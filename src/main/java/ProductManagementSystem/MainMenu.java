package ProductManagementSystem;

import java.util.LinkedList;
import java.util.Scanner;

public class MainMenu {
    private static MainMenu instance;
    static Scanner sc=new Scanner(System.in);
    private MainMenu(){}
    public static MainMenu getInstance(){
        if (instance == null) {
            instance = new MainMenu();
        }
        return instance;
    }

    private static void displayMenu(){
        System.out.println("1. Insert a product to existing dataset");
        System.out.println("2. Update a product from existing dataset");
        System.out.println("3. Delete a product from existing dataset");
        System.out.println("4. Reports");
        System.out.println("5. Exit");
    }
    private static String getMenuNo(){
        System.out.print("Option: ");
        String input=sc.nextLine();
        if (!input.matches("[1-5]")) {
            System.out.println("Invalid option. Enter valid option");
            input = getMenuNo();
        }
        return input;
    }
    public void menu(String filePath){
        displayMenu();
        switch (getMenuNo()){
            case "1": ProductCSVHandler insert=new InsertProduct(filePath);
            insert.process();
            menu(filePath);
            break;
            case "2": ProductCSVHandler update=new UpdateProduct(filePath);
            update.process();
            menu(filePath);
            break;
            case "3": ProductCSVHandler delete= new DeleteProduct(filePath);
            delete.process();
            menu(filePath);
            break;
            case "5": return;
            default: menu(filePath);
            break;


        }
    }

}

package ProductManagementSystem;

import java.util.LinkedList;

public class Test {
    public static void main(String[] args) {
        String csv="Data/products dataset.csv";
        MainMenu main= MainMenu.getInstance();
        main.menu(csv);

    }
}

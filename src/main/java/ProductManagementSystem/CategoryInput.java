package ProductManagementSystem;

import java.util.Scanner;

public class CategoryInput implements UserInput {
    Scanner sc = new Scanner(System.in); // Initialize scanner for user input

    @Override
    public String input() {
        String[] categories = {
                "Makeup", "Camping & Hiking", "Books & Stationery", "Men's Clothing", "Skincare", "Furniture",
                "Health & Wellness", "Cleaning Supplies", "Laptops & Computers", "Automotive", "Smartphones",
                "Bedding & Bath", "Shoes & Footwear", "Fitness Equipment", "Home & Kitchen", "Cameras & Accessories",
                "Beauty & Personal Care", "Toys & Games", "Smartwatches", "Haircare", "Accessories (Bags  Hats  Belts)",
                "Cycling", "Headphones & Earbuds", "Women's Clothing", "Office Supplies", "Kitchen Appliances",
                "Sports & Outdoors", "Kids' Clothing", "Fishing & Hunting", "Grooming Tools", "Fragrances",
                "Home Decor", "Team Sports", "Clothing & Apparel"
        };
        int maxLength = 0;
        for (String category : categories) {
            if (category.length() > maxLength) {
                maxLength = category.length();
            }
        }


        for (int i = 0; i < categories.length; i += 2) {
            String category1 = categories[i];
            String category2 = (i + 1 < categories.length) ? categories[i + 1] : "";

            System.out.printf("%d.%-" + (maxLength + 5) + "s%d.%s%n", i + 1, category1, i + 2, category2);
        }


        System.out.print("Choose one of the above categories (1-34): ");
        String option = sc.next();


        if (!option.matches("^(3[0-4]|[1-2]?[1-9])$")) {
            System.out.println("Invalid option. Enter again.");
            return input();
        }


        return categories[Integer.parseInt(option) - 1];
    }

    public static void main(String[] args) {
        CategoryInput categoryInput = new CategoryInput();
        String selectedCategory = categoryInput.input();
        System.out.println("You selected: " + selectedCategory);
    }
}

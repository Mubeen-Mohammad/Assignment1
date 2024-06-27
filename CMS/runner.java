import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;


public class runner {

    public static void main(String[] args) throws IOException {

        ArrayList<Item> items = new ArrayList<>();
        console con = new console();
        Scanner sc = new Scanner(System.in);
        
        while (true) {
            
            System.out.println("\nWarehouse Management System");
            System.out.println("1. Add Item");
            System.out.println("2. View Items");
            System.out.println("3. Update Item Quantity");
            System.out.println("4. Update Items");
            System.out.println("5. Remove Item");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");

            int choice = sc.nextInt();

            switch(choice) {
                case 1:
                    con.addItem();
                    break;
                case 2:
                    con.viewItems();
                    break;
                case 3:
                    con.updateItemQuantity();
                    break;
                case 4:
                    con.updateItem();
                    break;
                case 5:
                    con.removeItem();
                    break;
                case 6:
                    System.out.println("Thank you for using cart management system");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }  
}         
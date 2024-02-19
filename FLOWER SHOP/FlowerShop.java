/**
 * Program Description: to create an inventory for Floral Bliss
 * Programmer: mell
 * Date: 19/2/2024
 */
import java.util.Scanner;

public class FlowerShop {
    // Changing MAX_FLOWERS to 1 to make it less likely for the inventory to be filled
    private static final int MAX_FLOWERS = 10;
    // Creating an array of Flower objects with a size of MAX_FLOWERS
    private Flower[] inventory = new Flower[MAX_FLOWERS];

    public static void main(String[] args) {
        FlowerShop flowerShop = new FlowerShop();
        flowerShop.createInventory();
        flowerShop.displayInventory();
        flowerShop.calculateTotalValue();
        flowerShop.searchFlowerByName();
        flowerShop.restockFlower();
    }

    // Asking user input and creating an array of Flower objects
    public void createInventory() {
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < MAX_FLOWERS; i++) {
            System.out.println("Enter flower name:");
            String name = scanner.nextLine();
            System.out.println("Enter flower color:");
            String color = scanner.nextLine();
            System.out.println("Enter flower price:");
            double price = scanner.nextDouble();
            System.out.println("Enter flower quantity:");
            int quantity = scanner.nextInt();

            inventory[i] = new Flower(name, color, price, quantity);
        }
    }

    // Displaying the inventory details
    public void displayInventory() {
        for (Flower flower : inventory) {
            System.out.println(flower.toString());
        }
    }
    
    // Calculating the total value of the inventory
    public void calculateTotalValue() {
        double totalValue = 0.0;

        for (Flower flower : inventory) {
            totalValue += flower.getPrice() * flower.getQuantity();
        }

        System.out.println("Total value of the inventory: " + totalValue);
    }

    // Searching for a flower by name
    public void searchFlowerByName() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the flower name to search:");
        String name = scanner.nextLine();

        for (Flower flower : inventory) {
            if (flower.getName().equalsIgnoreCase(name)) {
                System.out.println("Found flower: " + flower.toString());
                break;
            }
        }
    }

    // Restocking a specific flower in the inventory
    public void restockFlower() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the flower name to restock:");
        String name = scanner.nextLine();

        System.out.println("Enter the quantity to restock:");
        int quantityToAdd = scanner.nextInt();

        for (int i = 0; i < MAX_FLOWERS; i++) {
            if (inventory[i].getName().equalsIgnoreCase(name)) {
                inventory[i].setQuantity(inventory[i].getQuantity() + quantityToAdd);
                System.out.println("Flower restocked successfully.");
                break;
            }
        }
    }
}
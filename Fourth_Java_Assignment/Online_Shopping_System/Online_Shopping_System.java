//ONline Shopping System 


package Online_Shopping_System;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// Interface for products
interface InProduct {
    double getPrice();
    String getName();
}

// Abstract class for different product categories
abstract class Product implements InProduct {
    private String name;
    private double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double getPrice() {
        return price;
    }
}

// Concrete classes for specific product categories
class ElectronicProduct extends Product {
    public ElectronicProduct(String name, double price) {
        super(name, price);
    }
}

class ClothingProduct extends Product {
    public ClothingProduct(String name, double price) {
        super(name, price);
    }
}

// Customer class with encapsulation for secure customer data
class Customer {
    private String customerId;
    private String name;
    private String email;

    public Customer(String customerId, String name, String email) {
        this.customerId = customerId;
        this.name = name;
        this.email = email;
    }

    // Getter methods

    public String getCustomerId() {
        return customerId;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }
}

// Shopping cart class
class ShoppingCart {
    private Customer customer;
    private List<Product> items;

    public ShoppingCart(Customer customer) {
        this.customer = customer;
        this.items = new ArrayList<>();
    }

    public void addItem(Product item) {
        items.add(item);
    }

    public void removeItem(Product item) {
        items.remove(item);
    }

    public double calculateTotal() {
        double total = 0;
        for (Product item : items) {
            total += item.getPrice();
        }
        return total;
    }

    public void processOrder() {
        // Logic for processing the order
        double total = calculateTotal();
        System.out.println("Order processed for customer: " + customer.getName());
        System.out.println("Total amount: $" + total);
    }

    public List<Product> getItems() {
        return items;
    }
}

// Main class to demonstrate the usage
public class Online_Shopping_System {
    public static void main(String[] args) {

        ElectronicProduct hp = new ElectronicProduct("HP", 100000);
        ElectronicProduct dell = new ElectronicProduct("Dell", 2000000);

        ClothingProduct hm = new ClothingProduct("H&M", 1000);
        ClothingProduct zara = new ClothingProduct("Zara", 2000);

        Scanner scanner = new Scanner(System.in);

        // Create customer
        System.out.println("Enter customer ID:");
        String customerId = scanner.nextLine();
        System.out.println("Enter customer name:");
        String customerName = scanner.nextLine();
        System.out.println("Enter customer email:");
        String customerEmail = scanner.nextLine();
        Customer customer = new Customer(customerId, customerName, customerEmail);

        // Create shopping cart
        ShoppingCart cart = new ShoppingCart(customer);

        while (true) {
            System.out.println("Choose an option:");
            System.out.println("1. View Available Products");
            System.out.println("2. Add Product to Cart");
            System.out.println("3. Remove Product from Cart");
            System.out.println("4. Process Order");
            System.out.println("5. View Cart Items");
            System.out.println("6. Exit");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                System.out.println("Available Products:");
                System.out.println("1. " + hp.getName() + " - $" + hp.getPrice());
                System.out.println("2. " + dell.getName() + " - $" + dell.getPrice());
                System.out.println("3. " + hm.getName() + " - $" + hm.getPrice());
                System.out.println("4. " + zara.getName() + " - $" + zara.getPrice());
                break;

                case 2:
                    System.out.println("Enter the product number to add to cart:");
                    int productNumber = scanner.nextInt();
                    switch (productNumber) {
                        case 1:
                            cart.addItem(hp);
                            break;
                        case 2:
                            cart.addItem(dell);
                            break;
                        case 3:
                            cart.addItem(hm);
                            break;
                        case 4:
                            cart.addItem(zara);
                            break;
                        default:
                            System.out.println("Invalid product number.");
                    }
                    System.out.println("Product added to cart.");
                    break;
                case 3:
                System.out.println("Enter product name to remove:");
                String productToRemove = scanner.next();
                Product productToRemoveObj = null;
                for (Product item : cart.getItems()) {
                    if (item.getName().equalsIgnoreCase(productToRemove)) {
                        productToRemoveObj = item;
                        break;
                    }
                }
                if (productToRemoveObj != null) {
                    cart.removeItem(productToRemoveObj);
                    System.out.println("Product removed from cart.");
                } else {
                    System.out.println("Product not found in the cart.");
                }
                break;

                case 4:
                    cart.processOrder();
                    break;

                case 5:
                    System.out.println("Cart items:");
                    for (Product item : cart.getItems()) {
                        System.out.println(item.getName() + " - $" + item.getPrice());
                    }
                    break;

                case 6:
                    System.out.println("Exiting the program.");
                    scanner.close();
                    System.exit(0);

                default:
                    System.out.println("Invalid choice. Please choose a valid option.");
            }
        }
    }
}
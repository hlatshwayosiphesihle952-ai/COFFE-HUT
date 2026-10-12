
import java.util.Scanner;
// Interface
interface IBeverage {
    String getBeverageType();
    String getCity();
    int getTotalSales();
}

// Abstract class implementing IBeverage
abstract class Beverage implements IBeverage {
    private String beverageType;
    private String city;
    private int totalSales;

    // Constructor
    public Beverage(String beverageType, String city, int totalSales) {
        this.beverageType = beverageType;
        this.city = city;
        this.totalSales = totalSales;
    }

    // Getters
    @Override
    public String getBeverageType() {
        return beverageType;
    }

    @Override
    public String getCity() {
        return city;
    }

    @Override
    public int getTotalSales() {
        return totalSales;
    }
}

// Subclass extending Beverage
class BeverageSales extends Beverage {
    public BeverageSales(String beverageType, String city, int totalSales) {
        super(beverageType, city, totalSales);
    }

    // Print report method
    public void printReport() {
        System.out.println("Beverage Type: " + getBeverageType());
        System.out.println("City: " + getCity());
        System.out.println("Total Sales: " + getTotalSales());
        System.out.println("-----------------------------------");
    }
}

// Main application class
public class RunApplication {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("=== Number 1 Coffee Hut Sales Report ===");

        // Allow user input
        System.out.print("Enter beverage type: ");
        String beverageType = input.nextLine();

        System.out.print("Enter city: ");
        String city = input.nextLine();

        System.out.print("Enter total sales: ");
        int totalSales = input.nextInt();

        // Create object
        BeverageSales sale = new BeverageSales(beverageType, city, totalSales);

        // Print report
        System.out.println("\n--- Report ---");
        sale.printReport();

        input.close();
    }
}

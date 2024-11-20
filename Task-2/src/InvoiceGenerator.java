import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class InvoiceGenerator {


    public static void generateInvoice(Order order, String fileName) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
            writer.write("Ice Cream Shop Invoice\n");
            writer.write("=======================\n");


            List<OrderItem> items = order.getItems();
            for (OrderItem item : items) {
                writer.write(item.getDescription() + "\n");
            }


            writer.write(String.format("Subtotal: $%.2f\n", order.calculateSubtotal()));
            writer.write(String.format("Tax: $%.2f\n", order.calculateTax()));
            writer.write(String.format("Total Amount Due: $%.2f\n", order.calculateTotal()));

            System.out.println("Invoice saved successfully to: " + fileName);
        } catch (IOException e) {
            System.err.println("Error writing invoice to file: " + e.getMessage());
        }
    }
}

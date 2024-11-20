import java.io.IOException;
import java.util.Arrays;

public class EyesCream {
    public static void main(String[] args) {

        Order order = new Order(new WaffleCone());


        order.addItem(new OrderItem(new ChocolateFudge(), 1, Arrays.asList(new ChocolateChips(), new FreshStrawberries())));
        order.addItem(new OrderItem(new MintChocolateChip(), 1, Arrays.asList()));


//        try {
//            InvoiceGenerator.generateInvoice(order, "invoice.txt");
//            System.out.println("Invoice generated successfully.");
//        } catch (IOException e) {
//            System.out.println("Failed to generate invoice.");
//        }

        order.getOrderDetails();

    }
}
import java.io.IOException;
import java.util.Arrays;

public class EyesCream {
    public static void main(String[] args) {

        Order order = new Order(new WaffleCone());


        order.addItem(new OrderItem(new ChocolateFudge(), 1, Arrays.asList(new ChocolateChips(), new FreshStrawberries())));
        order.addItem(new OrderItem(new MintChocolateChip(), 1, Arrays.asList()));


        InvoiceGenerator.generateInvoice(order, "invoice.txt");

        order.getOrderDetails();

    }
}
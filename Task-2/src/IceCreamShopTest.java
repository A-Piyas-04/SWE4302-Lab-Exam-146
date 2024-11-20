import org.junit.Test;
//import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.Arrays;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.io.IOException;

public class IceCreamShopTest {

    @Test
    public void testSingleFlavorNoToppings() {
        Order order = new Order(new PaperCup());
        order.addItem(new OrderItem(new ChocolateFudge(), 2, Arrays.asList()));

        double expectedSubtotal = 3.00 * 2; // 2 scoops of Chocolate Fudge
        double expectedTax = expectedSubtotal * 0.08;
        double expectedTotal = expectedSubtotal + expectedTax;

        assertEquals(expectedSubtotal, order.calculateSubtotal(), 0.01);
        assertEquals(expectedTax, order.calculateTax(), 0.01);
        assertEquals(expectedTotal, order.calculateTotal(), 0.01);
    }


}
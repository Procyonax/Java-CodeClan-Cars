import org.junit.Before;
import shop.Customer;

public class CustomerTest {

    Customer customer;

    @Before
    public void before() {
        customer = new Customer(100000.00);
    }
}

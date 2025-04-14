package za.ca.cput.adp3capstone.repository;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import za.ca.cput.adp3capstone.domain.Order;
import za.ca.cput.adp3capstone.factory.OrderFactory;

import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder(MethodOrderer.MethodName.class)
class OrderRepositoryTest {

    private static IOrderRepository repository = OrderRepository.getRepository();

    private Order order1 = OrderFactory.createOrder(12345,98765,1029384756,"Completed",350.00
            ,"Cash","Paid","Delivery","12 Plum Street", 150.00);

    @Test
    void b_read() {
        Order read = repository.read(order1.getOrderId());
        assertNotNull(read);
        System.out.println(read.toString());
    }

    @Test
    void a_create() {
        Order created = repository.create(order1);
        assertNotNull(created);
        System.out.println(created.toString());
    }

    @Test
    void c_update() {
        Order newOrder = new Order.Builder().copy(order1).setShippingAddress("85 Bridge Street")
                .build();
        Order updated = repository.update(newOrder);
        assertNotNull(updated);
        System.out.println(updated.toString());
    }

    @Test
    void d_delete() {
         assertTrue(repository.delete(order1));
    }

    @Test
    void e_getAll() {
        System.out.println(repository.getAll());
    }
}
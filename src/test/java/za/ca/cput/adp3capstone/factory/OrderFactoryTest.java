package za.ca.cput.adp3capstone.factory;

/* Order.java
Order Factory Test Class
Author: Brezano Liebenberg (230463886)
Date:8 April 2025
*/

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import za.ca.cput.adp3capstone.domain.Order;

import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)

class OrderFactoryTest {

    private static Order order1 = OrderFactory.createOrder(12345,98765,1029384756,"completed"
            ,350.00,"Cash","Paid","Delivered","12 Plum street",150.00);

    private static Order order2 = OrderFactory.createOrder(12234,14235,242164613,"Delayed",0.0
            ,"EFT","Paid","Delivered","30 Kool street", 0);


    @Test
    public void testCreateOrder() {
        assertNotNull(order1);
        System.out.println(order1.toString());
    }

    @Test
    public void testCreateOrderThatFails(){
        fail();

        assertNotNull(order2);
        System.out.println(order2.toString());
    }

}
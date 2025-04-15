package za.ca.cput.adp3capstone.repository;
/* Order.java
Order Repository Interface
Author: Brezano Liebenberg (230463886)
Date: 7 April 2025
 */

import za.ca.cput.adp3capstone.domain.Order;

import java.util.HashMap;

public interface IOrderRepository extends IRepository<Order, Integer>{
    HashMap<Integer, Order> getAll();
}

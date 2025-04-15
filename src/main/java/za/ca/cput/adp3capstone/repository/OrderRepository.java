package za.ca.cput.adp3capstone.repository;

/* Order.java
Order Repository Class
Author: Brezano Liebenberg (230463886)
Date: 7 April 2025
 */

import za.ca.cput.adp3capstone.domain.Order;

import java.util.HashMap;

public class OrderRepository implements IOrderRepository {

    public static IOrderRepository repository = null;
    private HashMap<Integer, Order> orders;

    private OrderRepository() {orders = new HashMap<>();}

    public static IOrderRepository getRepository() {
        if(repository == null) {
            repository = new OrderRepository();
        }
        return repository;
    }

    @Override
    public Order read(Integer orderId) {
        Order order = orders.get(orderId);
        if(order == null) {
            return null;
        }
        return order;
    }

    @Override
    public Order create(Order order) {
        if(order == null) {
            return null;
        }
        orders.put(order.getOrderId(), order);
        return order;
    }

    @Override
    public Order update(Order order) {
        Order foundId = orders.get(order.getOrderId());
        if(foundId == null){
            return null;
        }
        orders.put(order.getOrderId(), order);
        return foundId;
    }

    @Override
    public boolean delete(Order order) {
        if(order == null){
            return false;
        }
        orders.remove(order.getOrderId());
        return true;
    }

    @Override
    public HashMap<Integer, Order> getAll() {
        return orders;
    }
}

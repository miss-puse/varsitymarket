package za.ca.cput.adp3capstone.repository;

import za.ca.cput.adp3capstone.domain.Order;

import java.util.HashMap;

public interface IOrderRepository extends IRepository<Order, Integer>{
    HashMap<Integer, Order> getAll();
}

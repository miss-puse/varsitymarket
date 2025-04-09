package za.ca.cput.adp3capstone.repository;

import za.ca.cput.adp3capstone.domain.Product;

import java.util.HashMap;

/* Product.java
Product model class
Author: Ethan Le Roux (222622172)
Date:3 April 2025
*/
public interface IProductRepository extends IRepository<Product, Long>{
    HashMap<Long, Product> getAll();
}

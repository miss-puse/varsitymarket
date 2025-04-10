package za.ca.cput.adp3capstone.repository;
/* Product.java
Product model class
Author: Ethan Le Roux (222622172)
Date:3 April 2025
*/
import org.junit.jupiter.api.*;
import za.ca.cput.adp3capstone.domain.Category;
import za.ca.cput.adp3capstone.domain.Product;
import za.ca.cput.adp3capstone.factory.ProductFactory;

import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class ProductRepositoryTest {

    private static IProductRepository productRepository = ProductRepository.getRepository();
    private Product product = ProductFactory.createProduct(99999,"2 Year Old 2GB 50GB Thinkpad", Category.TECHNOLOGY,"Its an old celeron laptop.","https://varsitymarket.co.za/products/99999","Celeron",5999.99);

    @Test
    @Order(1)
    void create() {
        productRepository.create(product);
        assertNotNull(product);
        System.out.println(product);
    }

    @Test
    @Order(2)
    void read() {
       Product product = productRepository.read(99999L);
       assertNotNull(product);
        System.out.println(product);
    }

    @Test
    @Order(3)
    void update() {
        Product newProduct = new Product.Builder().copy(product).setProductName("Brand New 16 GB Lenovo Laptop")
                .build();
        Product updatedProduct = productRepository.update(newProduct);
        assertNotNull(updatedProduct);
        System.out.println(updatedProduct.toString());
    }

    @Test
    @Disabled
    @Order(4)
    void delete() {
        assertTrue(productRepository.delete(product));
        System.out.println("Successfully deleted product.");
    }

    @Test
    @Order(5)
    void getAll(){
        System.out.println(productRepository.getAll());
    }
}
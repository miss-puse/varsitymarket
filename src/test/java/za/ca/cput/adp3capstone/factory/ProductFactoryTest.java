package za.ca.cput.adp3capstone.factory;
/* Product.java
Product model class
Author: Ethan Le Roux (222622172)
Date:3 April 2025
*/
import org.junit.jupiter.api.Test;
import za.ca.cput.adp3capstone.domain.Category;
import za.ca.cput.adp3capstone.domain.Product;

import static org.junit.jupiter.api.Assertions.*;

class ProductFactoryTest {
    private Product product = ProductFactory.createProduct(99999,"2 Year Old 2GB 50GB Thinkpad", Category.TECHNOLOGY,"Its an old celeron laptop.","https://varsitymarket.co.za/products/99999","Celeron",5999.99);

    @Test
    void createProduct() {
        assertNotNull(product);
        System.out.println(product.toString());
    }
}
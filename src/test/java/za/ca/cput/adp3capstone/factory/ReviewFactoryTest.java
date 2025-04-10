package za.ca.cput.adp3capstone.factory;
/* Product.java
Product model class
Author: Ethan Le Roux (222622172)
Date:3 April 2025
*/
import org.junit.jupiter.api.Test;
import za.ca.cput.adp3capstone.domain.Category;
import za.ca.cput.adp3capstone.domain.Product;
import za.ca.cput.adp3capstone.domain.Review;
import za.ca.cput.adp3capstone.domain.User;

import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.*;

class ReviewFactoryTest {
    User user = new User();
    private Product product = ProductFactory.createProduct(99999,"2 Year Old 2GB 50GB Thinkpad", Category.TECHNOLOGY,"Its an old celeron laptop.","https://varsitymarket.co.za/products/99999","Celeron",5999.99);
    private Review review = ReviewFactory.createReview(98901L,user,"This pc works!","I like it. good value for money", LocalDateTime.now(),5,product);

    @Test
    void createReview() {
        assertNotNull(review);
        System.out.println(review.toString());
    }
}
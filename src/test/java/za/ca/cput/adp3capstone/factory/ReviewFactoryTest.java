package za.ca.cput.adp3capstone.factory;
/* Product.java
Product model class
Author: Ethan Le Roux (222622172)
Date:3 April 2025
*/
import org.junit.jupiter.api.Test;
import za.ca.cput.adp3capstone.domain.Category;
import za.ca.cput.adp3capstone.domain.Review;
import za.ca.cput.adp3capstone.domain.User;
import za.ca.cput.adp3capstone.domain.products.Product;
import za.ca.cput.adp3capstone.factory.products.LaptopFactory;

import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.*;

class ReviewFactoryTest {
    User user = new User();
    private Product product = null;
    //private Product product = LaptopFactory.createLaptop(" ",);
    private Review review = ReviewFactory.createReview(98901L,user,"This pc works!","I like it. good value for money", LocalDateTime.now(),5,product);

    @Test
    void createReview() {
        assertNotNull(review);
        System.out.println(review.toString());
    }
}
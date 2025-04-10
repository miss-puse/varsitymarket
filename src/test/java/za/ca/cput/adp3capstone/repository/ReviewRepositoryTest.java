package za.ca.cput.adp3capstone.repository;
/* Product.java
Product model class
Author: Ethan Le Roux (222622172)
Date:3 April 2025
*/
import org.junit.jupiter.api.*;
import za.ca.cput.adp3capstone.domain.Category;
import za.ca.cput.adp3capstone.domain.Product;
import za.ca.cput.adp3capstone.domain.Review;
import za.ca.cput.adp3capstone.domain.User;
import za.ca.cput.adp3capstone.factory.ProductFactory;
import za.ca.cput.adp3capstone.factory.ReviewFactory;

import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class ReviewRepositoryTest {
    private static IReviewRepository reviewRepository = ReviewRepository.getRepository();
    User user = new User();
    private Product product = ProductFactory.createProduct(99999,"2 Year Old 2GB 50GB Thinkpad", Category.TECHNOLOGY,"Its an old celeron laptop.","https://varsitymarket.co.za/products/99999","Celeron",5999.99);
    private Review review = ReviewFactory.createReview(98901L,user,"This pc works!","I like it. good value for money", LocalDateTime.now(),5,product);

    @Test
    @Order(1)
    void create() {
        reviewRepository.create(review);
        assertNotNull(review);
        System.out.println(review);
    }

    @Test
    @Order(2)
    void read() {
        Review review = reviewRepository.read(98901L);
        assertNotNull(review);
        System.out.println(review);
    }

    @Test
    @Order(3)
    void update() {
        Review newReview = new Review.Builder().copy(review).setReviewRating(2)
                .build();
        Review updatedReview = reviewRepository.update(newReview);
        assertNotNull(updatedReview);
        System.out.println(updatedReview.toString());
    }

    @Test
    @Disabled
    @Order(4)
    void delete() {
        assertTrue(reviewRepository.delete(review));
        System.out.println("Successfully deleted product.");
    }

    @Test
    @Order(5)
    void getAll(){
        System.out.println(reviewRepository.getAll());
    }
}
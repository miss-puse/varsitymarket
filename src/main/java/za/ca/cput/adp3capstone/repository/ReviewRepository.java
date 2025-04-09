package za.ca.cput.adp3capstone.repository;

import za.ca.cput.adp3capstone.domain.Product;
import za.ca.cput.adp3capstone.domain.Review;

import java.util.HashMap;

/* Product.java
Product model class
Author: Ethan Le Roux (222622172)
Date:3 April 2025
*/
public class ReviewRepository implements IReviewRepository {
    private static IReviewRepository repository = null;
    private HashMap<Long, Review> reviews;

    private ReviewRepository(){
        reviews = new HashMap<>();
    }

    public static IReviewRepository getRepository() {
        if (repository == null) {
            repository = new ReviewRepository();
        }
        return repository;
    }

    @Override
    public HashMap<Long, Review> getAll() {
        return reviews;
    }

    @Override
    public Review read(Long aLong) {
        return null;
    }

    @Override
    public Review create(Review review) {
        return null;
    }

    @Override
    public Review update(Review review) {
        return null;
    }

    @Override
    public boolean delete(Review review) {
        return false;
    }
}

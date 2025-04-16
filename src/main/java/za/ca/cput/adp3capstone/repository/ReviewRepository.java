package za.ca.cput.adp3capstone.repository;

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
    public Review read(Long id) {
        Review review = reviews.get(id);
        if(review == null){
            return null;
        }
        return review;
    }

    @Override
    public Review create(Review review) {
        if(review == null){
            return null;
        }
        reviews.put(review.getReviewId(), review);
        return review;
    }

    @Override
    public Review update(Review review) {
        Review foundReview = reviews.get(review.getReviewId());
        if(foundReview==null){
            return null;
        }
        reviews.put(review.getReviewId(), review);
        return foundReview;
    }

    @Override
    public boolean delete(Review review) {
        if(review==null){
            return false;
        }
        reviews.remove(review.getReviewId());
        return true;
    }
}

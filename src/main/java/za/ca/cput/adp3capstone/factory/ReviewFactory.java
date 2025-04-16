package za.ca.cput.adp3capstone.factory;

import za.ca.cput.adp3capstone.domain.Review;
import za.ca.cput.adp3capstone.domain.User;
import za.ca.cput.adp3capstone.domain.products.Product;

import java.time.LocalDateTime;

import static za.ca.cput.adp3capstone.util.Helper.*;

/* Product.java
Product model class
Author: Ethan Le Roux (222622172)
Date:3 April 2025
*/
public class ReviewFactory {
    public static Review createReview(long reviewId, User reviewer, String reviewTitle, String reviewContent,
                                      LocalDateTime reviewDate, int reviewRating, Product product){
        if (
                isIntZero((int)reviewId) &&
                isObjectNull(reviewer) &&
                isStringNullOrEmpty(reviewTitle) &&
                isStringNullOrEmpty(reviewContent) &&
                isObjectNull(reviewDate) &&
                isIntNegative(reviewRating) &&
                isObjectNull(product))
        {
            return null;
        }
         return new Review.Builder()
                 .setReviewId(reviewId)
                 .setReviewer(reviewer)
                 .setReviewTitle(reviewTitle)
                 .setReviewContent(reviewContent)
                 .setReviewDate(reviewDate)
                 .setReviewRating(reviewRating)
                 .setProduct(product)
                 .build();
    }
}

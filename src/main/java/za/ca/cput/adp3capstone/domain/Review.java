package za.ca.cput.adp3capstone.domain;

import java.time.LocalDateTime;

/* Review.java
Review model class
Author: Ethan Le Roux (222622172)
Date:3 April 2025
*/
public class Review {
    private long reviewId;
    private User reviewer;
    private String reviewTitle;
    private String reviewContent;
    private LocalDateTime reviewDate;
    private int reviewRating;
    private Product product;

    private Review(Builder builder){
        product = builder.product;
        reviewer = builder.reviewer;
        reviewTitle = builder.reviewTitle;
        reviewContent = builder.reviewContent;
        reviewDate = builder.reviewDate;
        reviewRating = builder.reviewRating;
    }

    public long getReviewId() {
        return reviewId;
    }

    public User getReviewer() {
        return reviewer;
    }

    public String getReviewTitle() {
        return reviewTitle;
    }

    public String getReviewContent() {
        return reviewContent;
    }

    public LocalDateTime getReviewDate() {
        return reviewDate;
    }

    public int getReviewRating() {
        return reviewRating;
    }

    public Product getProduct() {
        return product;
    }

    public static class Builder{
        private long reviewId;
        private User reviewer;
        private String reviewTitle;
        private String reviewContent;
        private LocalDateTime reviewDate;
        private int reviewRating;
        private Product product;

        public Builder setReviewId(long reviewId) {
            this.reviewId = reviewId;
            return this;
        }

        public Builder setReviewer(User reviewer) {
            this.reviewer = reviewer;
            return this;
        }

        public Builder setReviewTitle(String reviewTitle) {
            this.reviewTitle = reviewTitle;
            return this;
        }

        public Builder setReviewContent(String reviewContent) {
            this.reviewContent = reviewContent;
            return this;
        }

        public Builder setReviewDate(LocalDateTime reviewDate) {
            this.reviewDate = reviewDate;
            return this;
        }

        public Builder setReviewRating(int reviewRating) {
            this.reviewRating = reviewRating;
            return this;
        }

        public Builder setProduct(Product product) {
            this.product = product;
            return this;
        }

        public Builder copy(Review review){
            this.reviewId = review.reviewId;
            this.reviewer = review.reviewer;
            this.reviewTitle = review.reviewTitle;
            this.reviewContent = review.reviewContent;
            this.reviewDate = review.reviewDate;
            this.reviewRating = review.reviewRating;
            this.product = review.product;
            return this;
        }

        public Review build(){
            return new Review(this);
        }
    }
}

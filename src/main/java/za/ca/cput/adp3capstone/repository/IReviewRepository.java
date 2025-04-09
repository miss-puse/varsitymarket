package za.ca.cput.adp3capstone.repository;

import za.ca.cput.adp3capstone.domain.Review;

import java.util.HashMap;

/* Product.java
Product model class
Author: Ethan Le Roux (222622172)
Date:3 April 2025
*/
public interface IReviewRepository extends IRepository<Review, Long> {
    HashMap<Review,Long>  getAll();
}

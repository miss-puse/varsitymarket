package za.ca.cput.adp3capstone.factory;

import za.ca.cput.adp3capstone.domain.Category;
import za.ca.cput.adp3capstone.domain.Product;

import static za.ca.cput.adp3capstone.util.Helper.*;

/* Product.java
Product model class
Author: Ethan Le Roux (222622172)
Date:3 April 2025
*/
public class ProductFactory {
    public static Product createProduct(long productId, String productName, Category category,
                                        String description, String imageUrl, String brand, double price){
                if(
                        isIntNull((int) productId) ||
                        isIntNegative((int) productId) ||
                        isIntZero((int) productId) ||
                        isStringNullOrEmpty(productName) ||
                        category == null ||
                        isStringNullOrEmpty(description) ||
                        isStringNullOrEmpty(imageUrl) ||
                        isStringNullOrEmpty(brand) ||
                        isDoubleNull(price))
                {
                        return null;
                }
                return new Product.Builder()
                        .setProductId(productId)
                        .setProductName(productName)
                        .setCategory(category)
                        .setDescription(description)
                        .setImageUrl(imageUrl)
                        .setBrand(brand)
                        .setPrice(price)
                        .build();
    }
}

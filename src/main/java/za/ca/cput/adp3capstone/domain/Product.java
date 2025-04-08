package za.ca.cput.adp3capstone.domain;

/* Product.java
Product model class
Author: Ethan Le Roux (222622172)
Date:3 April 2025
*/
public class Product {
    private long productId;
    private String productName;
    private Category category;
    private String description;
    private String imageUrl;
    private String brand;
    private double price;

    private Product(Builder builder){
        this.productId = builder.productId;
        this.productName = builder.productName;
        this.category = builder.category;
        this.description = builder.description;
        this.imageUrl = builder.imageUrl;
        this.brand = builder.brand;
        this.price = builder.price;
    }

    public long getProductId() {
        return productId;
    }

    public String getProductName() {
        return productName;
    }

    public Category getCategory() {
        return category;
    }

    public String getDescription() {
        return description;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public String getBrand() {
        return brand;
    }

    public double getPrice() {
        return price;
    }

    public static class Builder{
        private long productId;
        private String productName;
        private Category category;
        private String description;
        private String imageUrl;
        private String brand;
        private double price;

        public Builder setProductId(long productId) {
            this.productId = productId;
            return this;
        }
        public Builder setProductName(String productName) {
            this.productName = productName;
            return this;
        }

        public Builder setCategory(Category category) {
            this.category = category;
            return this;
        }

        public Builder setDescription(String description) {
            this.description = description;
            return this;
        }

        public Builder setImageUrl(String imageUrl){
            this.imageUrl = imageUrl;
            return this;
        }

        public Builder setBrand(String brand) {
            this.brand = brand;
            return this;
        }

        public Builder setPrice(double price) {
            this.price = price;
            return this;
        }

        public Builder copy(Product product){
            this.productName = product.productName;
            this.category = product.category;
            this.description = product.description;
            this.imageUrl = product.imageUrl;
            this.brand = product.brand;
            this.price = product.price;
            return this;
        }

        public Product build(){
            return new Product(this);
        }
    }
}

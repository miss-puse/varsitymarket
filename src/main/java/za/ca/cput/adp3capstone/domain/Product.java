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
    private String brand;
    private double price;

    private Product(Builder builder){
        this.productName = builder.productName;
        this.category = builder.category;
        this.description = builder.description;
        this.brand = builder.brand;
        this.price = builder.price;
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

    public String getBrand() {
        return brand;
    }

    public double getPrice() {
        return price;
    }

    public static class Builder{
        private String productName;
        private Category category;
        private String description;
        private String brand;
        private double price;

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
            this.brand = product.brand;
            this.price = product.price;
            return this;
        }

        public Product build(){
            return new Product(this);
        }
    }
}

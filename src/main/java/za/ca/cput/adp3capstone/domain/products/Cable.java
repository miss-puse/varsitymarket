package za.ca.cput.adp3capstone.domain.products;

public class Cable {
    private int cableId;
    private String cableType;
    private String brand;
    private double length;
    private double price;
    private int stockQuantity;

    private Cable() {}

    public Cable(Builder builder) {
        this.cableId = builder.cableId;
        this.cableType = builder.cableType;
        this.brand = builder.brand;
        this.length = builder.length;
        this.price = builder.price;
        this.stockQuantity = builder.stockQuantity;
    }

    public int getCableId() {
        return cableId;
    }

    public String getCableType() {
        return cableType;
    }

    public String getBrand() {
        return brand;
    }

    public double getLength() {
        return length;
    }

    public double getPrice() {
        return price;
    }

    public int getStockQuantity() {
        return stockQuantity;
    }

    @Override
    public String toString() {
        return "Cables{" +
                "cableId=" + cableId +
                ", cableType='" + cableType + '\'' +
                ", brand='" + brand + '\'' +
                ", length=" + length +
                ", price=" + price +
                ", stockQuantity=" + stockQuantity +
                '}';
    }

    public static class Builder {
        private int cableId;
        private String cableType;
        private String brand;
        private double length;
        private double price;
        private int stockQuantity;

        public Builder setCableId(int cableId) {
            this.cableId = cableId;
            return this;
        }

        public Builder setCableType(String cableType) {
            this.cableType = cableType;
            return this;
        }

        public Builder setBrand(String brand) {
            this.brand = brand;
            return this;
        }

        public Builder setLength(double length) {
            this.length = length;
            return this;
        }

        public Builder setPrice(double price) {
            this.price = price;
            return this;
        }

        public Builder setStockQuantity(int stockQuantity) {
            this.stockQuantity = stockQuantity;
            return this;
        }

        public Builder copy(Cable cable) {
            this.cableId = cable.cableId;
            this.cableType = cable.cableType;
            this.brand = cable.brand;
            this.length = cable.length;
            this.price = cable.price;
            this.stockQuantity = cable.stockQuantity;
            return this;
        }

        public Cable build() {
            return new Cable(this);
        }
    }
}

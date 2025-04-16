package za.ca.cput.adp3capstone.domain.products;

/* Product.java
Desktop model class
Author: Hope Kgomokaboya (222152672
Date:3 April 2025
*/

public class Desktop {
    private int desktopId;
    private String model;
    private String manufacture;
    private String processType;
    private int ram;
    private int storageCapacity;
    private String storageType;
    private double price;
    private int stockQuantity;
    private int warrantyPeriod;

    private Desktop() {}

    public Desktop(Builder builder) {
        this.desktopId = builder.desktopId;
        this.model = builder.model;
        this.manufacture = builder.manufacture;
        this.processType = builder.processType;
        this.ram = builder.ram;
        this.storageCapacity = builder.storageCapacity;
        this.storageType = builder.storageType;
        this.price = builder.price;
        this.stockQuantity = builder.stockQuantity;
        this.warrantyPeriod = builder.warrantyPeriod;
    }

    public int getDesktopId() {
        return desktopId;
    }

    public String getModel() {
        return model;
    }

    public String getManufacture() {
        return manufacture;
    }

    public String getProcessType() {
        return processType;
    }

    public int getRam() {
        return ram;
    }

    public int getStorageCapacity() {
        return storageCapacity;
    }

    public String getStorageType() {
        return storageType;
    }

    public double getPrice() {
        return price;
    }

    public int getStockQuantity() {
        return stockQuantity;
    }

    public int getWarrantyPeriod() {
        return warrantyPeriod;
    }

    @Override
    public String toString() {
        return "Desktop{" +
                "desktopId=" + desktopId +
                ", model='" + model + '\'' +
                ", manufacture='" + manufacture + '\'' +
                ", processType='" + processType + '\'' +
                ", ram=" + ram +
                ", storageCapacity=" + storageCapacity +
                ", storageType='" + storageType + '\'' +
                ", price=" + price +
                ", stockQuantity=" + stockQuantity +
                ", warrantyPeriod=" + warrantyPeriod +
                '}';
    }

    public static class Builder {
        private int desktopId;
        private String model;
        private String manufacture;
        private String processType;
        private int ram;
        private int storageCapacity;
        private String storageType;
        private double price;
        private int stockQuantity;
        private int warrantyPeriod;

        public Builder setDesktopId(int desktopId) {
            this.desktopId = desktopId;
            return this;
        }

        public Builder setModel(String model) {
            this.model = model;
            return this;
        }

        public Builder setManufacture(String manufacture) {
            this.manufacture = manufacture;
            return this;
        }

        public Builder setProcessType(String processType) {
            this.processType = processType;
            return this;
        }

        public Builder setRam(int ram) {
            this.ram = ram;
            return this;
        }

        public Builder setStorageCapacity(int storageCapacity) {
            this.storageCapacity = storageCapacity;
            return this;
        }

        public Builder setStorageType(String storageType) {
            this.storageType = storageType;
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

        public Builder setWarrantyPeriod(int warrantyPeriod) {
            this.warrantyPeriod = warrantyPeriod;
            return this;
        }

        public Builder copy(Desktop desktop) {
            this.desktopId = desktop.desktopId;
            this.model = desktop.model;
            this.manufacture = desktop.manufacture;
            this.processType = desktop.processType;
            this.ram = desktop.ram;
            this.storageCapacity = desktop.storageCapacity;
            this.storageType = desktop.storageType;
            this.price = desktop.price;
            this.stockQuantity = desktop.stockQuantity;
            this.warrantyPeriod = desktop.warrantyPeriod;
            return this;
        }

        public Desktop build() {
            return new Desktop(this);
        }
    }
}

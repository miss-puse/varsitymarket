package za.ca.cput.adp3capstone.domain;

import java.time.LocalDate;

public class Order {
    private int orderId;
    private LocalDate orderDate;
    private long productId;
    private int customerId;
    private String orderStatus;
    private double totalPrice;
    private String paymentMethod;
    private String paymentStatus;
    private String shippingMethod;
    private String shippingAddress;
    private double shippingCost;

    public Order(Builder builder) {
        this.orderId = builder.orderId;
        this.orderDate = builder.orderDate;
        this.productId = builder.productId;
        this.customerId = builder.customerId;
        this.orderStatus = builder.orderStatus;
        this.totalPrice = builder.totalPrice;
        this.paymentMethod = builder.paymentMethod;
        this.paymentStatus = builder.paymentStatus;
        this.shippingMethod = builder.shippingMethod;
        this.shippingAddress = builder.shippingAddress;
        this.shippingCost = builder.shippingCost;
    }

    public int getOrderId() {
        return orderId;
    }

    public LocalDate getOrderDate() {
        return orderDate;
    }

    public long getProductId() {
        return productId;
    }

    public int getCustomerId() {
        return customerId;
    }

    public String getOrderStatus() {
        return orderStatus;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }

    public String getPaymentStatus() {
        return paymentStatus;
    }

    public String getShippingMethod() {
        return shippingMethod;
    }

    public String getShippingAddress() {
        return shippingAddress;
    }

    public double getShippingCost() {
        return shippingCost;
    }

    public static class Builder{
        private int orderId;
        private LocalDate orderDate;
        private long productId;
        private int customerId;
        private String orderStatus;
        private double totalPrice;
        private String paymentMethod;
        private String paymentStatus;
        private String shippingMethod;
        private String shippingAddress;
        private double shippingCost;

        public Builder setOrderId(int orderId) {
            this.orderId = orderId;
            return this;
        }

        public Builder setOrderDate(LocalDate orderDate) {
            this.orderDate = orderDate;
            return this;
        }

        public Builder setProductId(long productId) {
            this.productId = productId;
            return this;
        }

        public Builder setCustomerId(int customerId) {
            this.customerId = customerId;
            return this;
        }

        public Builder setOrderStatus(String orderStatus) {
            this.orderStatus = orderStatus;
            return this;
        }

        public Builder setTotalPrice(double totalPrice) {
            this.totalPrice = totalPrice;
            return this;
        }

        public Builder setPaymentMethod(String paymentMethod) {
            this.paymentMethod = paymentMethod;
            return this;
        }

        public Builder setPaymentStatus(String paymentStatus) {
            this.paymentStatus = paymentStatus;
            return this;
        }

        public Builder setShippingMethod(String shippingMethod) {
            this.shippingMethod = shippingMethod;
            return this;
        }

        public Builder setShippingAddress(String shippingAddress) {
            this.shippingAddress = shippingAddress;
            return this;
        }

        public Builder setShippingCost(double shippingCost) {
            this.shippingCost = shippingCost;
            return this;
        }

        public Builder copy(Order order){
            this.orderId = order.getOrderId();
            this.orderDate = order.getOrderDate();
            this.customerId = order.getCustomerId();
            this.orderStatus = order.getOrderStatus();
            this.totalPrice = order.getTotalPrice();
            this.paymentMethod = order.getPaymentMethod();
            this.paymentStatus = order.getPaymentStatus();
            this.shippingMethod = order.getShippingMethod();
            this.shippingAddress  = order.shippingAddress;
            this.shippingCost = order.getShippingCost();
            return this;
        }

        public Order build() {return new Order(this);}
    }

}
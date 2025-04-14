package za.ca.cput.adp3capstone.factory;
/* Order.java
Order Factory Class
Author: Brezano Liebenberg (230463886)
Date: 5 April 2025
 */

import za.ca.cput.adp3capstone.domain.Order;
import za.ca.cput.adp3capstone.util.Helper;

import java.time.LocalDate;

public class OrderFactory {
    public static Order createOrder(int orderID, int customerId, long productId, String orderStatus, double totalPrice,
                                    String paymentMethod, String paymentStatus, String shippingMethod, String shippingAddress, double shippingCost) {
        if (Helper.isIntNull(orderID) || Helper.isIntNull(customerId) || Helper.isIntNull((int) productId)|| Helper.isStringNullOrEmpty(orderStatus) || Helper.isDoubleNull(totalPrice)
                || Helper.isStringNullOrEmpty(paymentMethod) || Helper.isStringNullOrEmpty(paymentStatus) || Helper.isStringNullOrEmpty(shippingMethod) ||Helper.isStringNullOrEmpty(shippingAddress)||Helper.isDoubleNull(shippingCost)) {
            return null;}

        LocalDate orderDate = LocalDate.now();

        return new Order.Builder().setOrderId(orderID)
                .setOrderDate(orderDate)
                .setProductId(productId)
                .setCustomerId(customerId)
                .setOrderStatus(orderStatus)
                .setTotalPrice(totalPrice)
                .setPaymentMethod(paymentMethod)
                .setPaymentStatus(paymentStatus)
                .setShippingMethod(shippingMethod)
                .setShippingAddress(shippingAddress)
                .setShippingCost(shippingCost)
                .build();
    }
}
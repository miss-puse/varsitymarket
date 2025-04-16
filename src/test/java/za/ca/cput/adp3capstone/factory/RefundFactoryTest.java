package za.ca.cput.adp3capstone.factory;

/* Refund.java
Refund Factory Test
Author: Hope Kgomokaboya (222152672)
Date:3 April 2025
*/

import org.junit.jupiter.api.Test;
import za.ca.cput.adp3capstone.domain.Refund;
import static org.junit.jupiter.api.Assertions.*;

class RefundFactoryTest {

    @Test
    void testCreateRefundSuccess() {
        Refund refund = RefundFactory.createRefund(
                "REF001",
                "INV001",
                200.00,
                "Damaged goods"
        );

        assertNotNull(refund);
        assertEquals("REF001", refund.getRefundId());
        assertEquals("INV001", refund.getInvoiceId());
        assertEquals(200.00, refund.getRefundAmount(), 0.001);
        System.out.println("Refund created successfully: " + refund);
    }

    @Test
    void testCreateRefundWithNullId() {
        Refund refund = RefundFactory.createRefund(
                null,
                "INV002",
                150.00,
                "Wrong item shipped"
        );

        assertNull(refund);
        System.out.println("Test passed: Refund with null ID correctly returns null");
    }

    @Test
    void testCreateRefundWithInvalidInvoice() {
        Refund refund = RefundFactory.createRefund(
                "REF003",
                "",
                50.00,
                "Late delivery"
        );

        assertNull(refund);
        System.out.println("Test passed: Refund with empty invoice ID correctly returns null");
    }

    @Test
    void testCreateRefundWithZeroAmount() {
        Refund refund = RefundFactory.createRefund(
                "REF004",
                "INV003",
                0.00,
                "Customer cancellation"
        );

        assertNull(refund);
        System.out.println("Test passed: Refund with zero amount correctly returns null");
    }

    @Test
    void testCreateRefundWithNoReason() {
        Refund refund = RefundFactory.createRefund(
                "REF005",
                "INV004",
                75.00,
                null
        );

        assertNull(refund);
        System.out.println("Test passed: Refund with null reason correctly returns null");
    }

    @Test
    void testRefundEquality() {
        Refund refund1 = RefundFactory.createRefund(
                "REF006",
                "INV005",
                100.00,
                "Duplicate order"
        );

        Refund refund2 = RefundFactory.createRefund(
                "REF006",
                "INV005",
                100.00,
                "Duplicate order"
        );

        assertEquals(refund1.getRefundId(), refund2.getRefundId());
        System.out.println("Test passed: Refunds with same ID are equal");
    }
}
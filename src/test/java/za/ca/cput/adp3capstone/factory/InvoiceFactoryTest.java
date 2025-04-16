package za.ca.cput.adp3capstone.factory;

/* Invoice.java
Invoice Factory Test
Author: Hope Kgomokaboya (222152672)
Date:3 April 2025
*/

import org.junit.jupiter.api.Test;
import za.ca.cput.adp3capstone.domain.Invoice;
import static org.junit.jupiter.api.Assertions.*;

class InvoiceFactoryTest {

    @Test
    void testCreateInvoiceSuccess() {
        Invoice invoice = InvoiceFactory.createBasicInvoice(
                "INV001",
                "Hope",
                "Kgomokaboya",
                1000.00
        );

        assertNotNull(invoice);
        assertEquals("INV001", invoice.getInvoiceId());
        assertEquals("Hope", invoice.getCustomerFirstName());
        assertEquals(1000.00, invoice.getTotalAmount(), 0.001);
        System.out.println("Invoice created successfully: " + invoice);
    }

    @Test
    void testCreateInvoiceWithNullId() {
        Invoice invoice = InvoiceFactory.createBasicInvoice(
                null,
                "Puseletso",
                "Ramohale",
                500.00
        );

        assertNull(invoice);
        System.out.println("Test passed: Invoice with null ID correctly returns null");
    }

    @Test
    void testCreateInvoiceWithEmptyName() {
        Invoice invoice = InvoiceFactory.createBasicInvoice(
                "INV002",
                "",
                "Mohale",
                750.00
        );

        assertNull(invoice);
        System.out.println("Test passed: Invoice with empty first name correctly returns null");
    }

    @Test
    void testCreateInvoiceWithNegativeAmount() {
        Invoice invoice = InvoiceFactory.createBasicInvoice(
                "INV003",
                "Kamogelo",
                "Makgatho",
                -100.00
        );

        assertNull(invoice);
        System.out.println("Test passed: Invoice with negative amount correctly returns null");
    }

    @Test
    void testInvoiceEquality() {
        Invoice invoice1 = InvoiceFactory.createBasicInvoice(
                "INV004",
                "Mpho",
                "Mongwai",
                200.00
        );

        Invoice invoice2 = InvoiceFactory.createBasicInvoice(
                "INV004",
                "Lindy",
                "Adams",
                200.00
        );

        assertEquals(invoice1.getInvoiceId(), invoice2.getInvoiceId());
        System.out.println("Test passed: Invoices with same ID are equal");
    }
}
package za.ca.cput.adp3capstone.factory;

/* Invoice.java
Invoice Factory Class
Author: Hope Kgomokaboya (222152672)
Date: 5 April 2025
 */
import za.ca.cput.adp3capstone.domain.Invoice;
import za.ca.cput.adp3capstone.util.Helper;
import java.time.LocalDate;

public class InvoiceFactory {
    public static Invoice createBasicInvoice(String invoiceId,
                                             String customerFirstName,
                                             String customerLastName,
                                             double totalAmount) {
        if (Helper.isStringNullOrEmpty(invoiceId) ||
                Helper.isStringNullOrEmpty(customerFirstName) ||
                Helper.isStringNullOrEmpty(customerLastName) ||
                totalAmount <= 0) {
            return null;
        }

        return new Invoice.Builder()
                .setInvoiceId(invoiceId)
                .setCustomerFirstName(customerFirstName)
                .setCustomerLastName(customerLastName)
                .setIssueDate(LocalDate.now())
                .setDueDate(LocalDate.now().plusDays(7))
                .setTotalAmount(totalAmount)
                .setTaxAmount(totalAmount * 0.15)
                .setPaymentStatus("Pending")
                .build();
    }

    public static Invoice createCustomInvoice(String invoiceId,
                                              String customerFirstName,
                                              String customerLastName,
                                              LocalDate issueDate,
                                              LocalDate dueDate,
                                              double totalAmount,
                                              double taxAmount,
                                              String paymentStatus) {
        if (Helper.isStringNullOrEmpty(invoiceId) ||
                Helper.isStringNullOrEmpty(customerFirstName) ||
                Helper.isStringNullOrEmpty(customerLastName) ||
                issueDate == null ||
                dueDate == null ||
                totalAmount <= 0 ||
                taxAmount < 0 ||
                Helper.isStringNullOrEmpty(paymentStatus)) {
            return null;
        }

        return new Invoice.Builder()
                .setInvoiceId(invoiceId)
                .setCustomerFirstName(customerFirstName)
                .setCustomerLastName(customerLastName)
                .setIssueDate(issueDate)
                .setDueDate(dueDate)
                .setTotalAmount(totalAmount)
                .setTaxAmount(taxAmount)
                .setPaymentStatus(paymentStatus)
                .build();
    }
}

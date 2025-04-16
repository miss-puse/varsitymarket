package za.ca.cput.adp3capstone.domain;

/* Invoice.java
Invoice Domain
Author: Hope Kgomokaboya (222152672)
Date:3 April 2025
*/

import java.time.LocalDate;

public class Invoice {
    private String invoiceId;
    private String customerFirstName;
    private String customerLastName;
    private LocalDate issueDate;
    private LocalDate dueDate;
    private double totalAmount;
    private double taxAmount;
    private String paymentStatus;

    private Invoice() {
    }

    public Invoice(Builder builder) {
        this.invoiceId = builder.invoiceId;
        this.customerFirstName = builder.customerFirstName;
        this.customerLastName = builder.customerLastName;
        this.issueDate = builder.issueDate;
        this.dueDate = builder.dueDate;
        this.totalAmount = builder.totalAmount;
        this.taxAmount = builder.taxAmount;
        this.paymentStatus = builder.paymentStatus;
    }

    public String getInvoiceId() {
        return invoiceId;
    }

    public String getCustomerFirstName() {
        return customerFirstName;
    }

    public String getCustomerLastName() {
        return customerLastName;
    }

    public LocalDate getIssueDate() {
        return issueDate;
    }

    public LocalDate getDueDate() {
        return dueDate;
    }

    public double getTotalAmount() {
        return totalAmount;
    }

    public double getTaxAmount() {
        return taxAmount;
    }

    public String getPaymentStatus() {
        return paymentStatus;
    }

    @Override
    public String toString() {
        return "Invoice{" +
                "invoiceId='" + invoiceId + '\'' +
                ", customerFirstName='" + customerFirstName + '\'' +
                ", customerLastName='" + customerLastName + '\'' +
                ", issueDate=" + issueDate +
                ", dueDate=" + dueDate +
                ", totalAmount=" + totalAmount +
                ", taxAmount=" + taxAmount +
                ", paymentStatus='" + paymentStatus + '\'' +
                '}';
    }

    public static class Builder {
        private String invoiceId;
        private String customerFirstName;
        private String customerLastName;
        private LocalDate issueDate;
        private LocalDate dueDate;
        private double totalAmount;
        private double taxAmount;
        private String paymentStatus;

        public Builder setInvoiceId(String invoiceId) {
            this.invoiceId = invoiceId;
            return this;
        }

        public Builder setCustomerFirstName(String customerFirstName) {
            this.customerFirstName = customerFirstName;
            return this;
        }

        public Builder setCustomerLastName(String customerLastName) {
            this.customerLastName = customerLastName;
            return this;
        }

        public Builder setIssueDate(LocalDate issueDate) {
            this.issueDate = issueDate;
            return this;
        }

        public Builder setDueDate(LocalDate dueDate) {
            this.dueDate = dueDate;
            return this;
        }

        public Builder setTotalAmount(double totalAmount) {
            this.totalAmount = totalAmount;
            return this;
        }

        public Builder setTaxAmount(double taxAmount) {
            this.taxAmount = taxAmount;
            return this;
        }

        public Builder setPaymentStatus(String paymentStatus) {
            this.paymentStatus = paymentStatus;
            return this;
        }

        public Builder copy(Invoice invoice) {
            this.invoiceId = invoice.invoiceId;
            this.customerFirstName = invoice.customerFirstName;
            this.customerLastName = invoice.customerLastName;
            this.issueDate = invoice.issueDate;
            this.dueDate = invoice.dueDate;
            this.totalAmount = invoice.totalAmount;
            this.taxAmount = invoice.taxAmount;
            this.paymentStatus = invoice.paymentStatus;
            return this;
        }

        public Invoice build() {
            return new Invoice(this);
        }
    }
}
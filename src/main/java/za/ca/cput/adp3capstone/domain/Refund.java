package za.ca.cput.adp3capstone.domain;

/* Refund.java
Refund Domain
Author: Hope Kgomokaboya (222152672)
Date:3 April 2025
*/

import java.time.LocalDate;

public class Refund {
    private String refundId;
    private String invoiceId;
    private LocalDate requestDate;
    private double refundAmount;
    private String refundReason;
    private String refundStatus;
    private String approvedBy;

    private Refund() {
    }

    public Refund(Builder builder) {
        this.refundId = builder.refundId;
        this.invoiceId = builder.invoiceId;
        this.requestDate = builder.requestDate;
        this.refundAmount = builder.refundAmount;
        this.refundReason = builder.refundReason;
        this.refundStatus = builder.refundStatus;
        this.approvedBy = builder.approvedBy;
    }

    public String getRefundId() {
        return refundId;
    }

    public String getInvoiceId() {
        return invoiceId;
    }

    public LocalDate getRequestDate() {
        return requestDate;
    }

    public double getRefundAmount() {
        return refundAmount;
    }

    public String getRefundReason() {
        return refundReason;
    }

    public String getRefundStatus() {
        return refundStatus;
    }

    public String getApprovedBy() {
        return approvedBy;
    }

    @Override
    public String toString() {
        return "Refund{" +
                "refundId='" + refundId + '\'' +
                ", invoiceId='" + invoiceId + '\'' +
                ", requestDate=" + requestDate +
                ", refundAmount=" + refundAmount +
                ", refundReason='" + refundReason + '\'' +
                ", refundStatus='" + refundStatus + '\'' +
                ", approvedBy='" + approvedBy + '\'' +
                '}';
    }

    public static class Builder {
        private String refundId;
        private String invoiceId;
        private LocalDate requestDate;
        private double refundAmount;
        private String refundReason;
        private String refundStatus;
        private String approvedBy;

        public Builder setRefundId(String refundId) {
            this.refundId = refundId;
            return this;
        }

        public Builder setInvoiceId(String invoiceId) {
            this.invoiceId = invoiceId;
            return this;
        }

        public Builder setRequestDate(LocalDate requestDate) {
            this.requestDate = requestDate;
            return this;
        }

        public Builder setRefundAmount(double refundAmount) {
            this.refundAmount = refundAmount;
            return this;
        }

        public Builder setRefundReason(String refundReason) {
            this.refundReason = refundReason;
            return this;
        }

        public Builder setRefundStatus(String refundStatus) {
            this.refundStatus = refundStatus;
            return this;
        }

        public Builder setApprovedBy(String approvedBy) {
            this.approvedBy = approvedBy;
            return this;
        }

        public Builder copy(Refund refund) {
            this.refundId = refund.refundId;
            this.invoiceId = refund.invoiceId;
            this.requestDate = refund.requestDate;
            this.refundAmount = refund.refundAmount;
            this.refundReason = refund.refundReason;
            this.refundStatus = refund.refundStatus;
            this.approvedBy = refund.approvedBy;
            return this;
        }

        public Refund build() {
            return new Refund(this);
        }
    }
}
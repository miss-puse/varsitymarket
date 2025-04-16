package za.ca.cput.adp3capstone.factory;

/* Refund.java
Refund Factory Class
Author: Hope Kgomokaboya (222152672)
Date: 5 April 2025
 */

import za.ca.cput.adp3capstone.domain.Refund;
import za.ca.cput.adp3capstone.util.Helper;
import java.time.LocalDate;

public class RefundFactory {
    public static Refund createRefund(String refundId, String invoiceId,
                                      double refundAmount, String refundReason) {
        if (Helper.isStringNullOrEmpty(refundId) ||
                Helper.isStringNullOrEmpty(invoiceId) ||
                refundAmount <= 0 ||
                Helper.isStringNullOrEmpty(refundReason)) {
            return null;
        }

        return new Refund.Builder()
                .setRefundId(refundId)
                .setInvoiceId(invoiceId)
                .setRequestDate(LocalDate.now())
                .setRefundAmount(refundAmount)
                .setRefundReason(refundReason)
                .setRefundStatus("Pending")
                .setApprovedBy("System")
                .build();
    }
}

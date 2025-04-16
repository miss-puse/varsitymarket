package za.ca.cput.adp3capstone.repository;

/* Product.java
Refund Repository class
Author: Hope Kgomokaboya (222152672)
Date:3 April 2025
*/

import za.ca.cput.adp3capstone.domain.Refund;
import java.util.ArrayList;
import java.util.List;

public class RefundRepository implements IRefundRepository {
    private static IRefundRepository repository = null;
    private final List<Refund> refundList = new ArrayList<>();

    private RefundRepository() {

    }

    public static IRefundRepository getRepository() {
        if (repository == null) {
            repository = new RefundRepository();
        }
        return repository;
    }

    @Override
    public Refund create(Refund refund) {
        if (refund != null && read(refund.getRefundId()) == null) {
            refundList.add(refund);
            return refund;
        }
        return null;
    }

    @Override
    public Refund read(String id) {
        return refundList.stream()
                .filter(r -> r.getRefundId().equals(id))
                .findFirst()
                .orElse(null);
    }

    @Override
    public Refund update(Refund refund) {
        Refund oldRefund = read(refund.getRefundId());
        if (oldRefund != null) {
            refundList.remove(oldRefund);
            refundList.add(refund);
            return refund;
        }
        return null;
    }

    @Override
    public boolean delete(Refund refund) {
        return refundList.remove(refund);
    }

    @Override
    public List<Refund> getAll() {
        return new ArrayList<>(refundList);
    }

}

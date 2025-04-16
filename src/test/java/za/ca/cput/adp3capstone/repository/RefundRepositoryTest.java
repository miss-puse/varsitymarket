package za.ca.cput.adp3capstone.repository;

/* Refund.java
Refund Factory Test
Author: Hope Kgomokaboya (222152672)
Date:3 April 2025
*/

import org.junit.jupiter.api.*;
import za.ca.cput.adp3capstone.domain.Refund;
import za.ca.cput.adp3capstone.factory.RefundFactory;

import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder(MethodOrderer.MethodName.class)
class RefundRepositoryTest {
    private static final IRefundRepository repository = RefundRepository.getRepository();
    private static final Refund refund = RefundFactory.createRefund(
            "REF001",
            "INV001",
            200.00,
            "Damaged goods"
    );

    @Test
    void a_create() {
        Refund created = repository.create(refund);
        assertEquals(refund.getRefundId(), created.getRefundId());
        System.out.println("Created: " + created);
    }

    @Test
    void b_read() {
        Refund created = repository.create(refund);  // First create
        Refund read = repository.read(refund.getRefundId());  // Then read
        assertNotNull(read);
        System.out.println("Read: " + read);
    }


}

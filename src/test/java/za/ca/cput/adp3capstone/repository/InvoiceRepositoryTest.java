package za.ca.cput.adp3capstone.repository;

/* Invoice.java
Invoice Repository Test
Author: Hope Kgomokaboya (222152672)
Date:3 April 2025
*/

import org.junit.jupiter.api.*;
import za.ca.cput.adp3capstone.domain.Invoice;
import za.ca.cput.adp3capstone.factory.InvoiceFactory;

import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder(MethodOrderer.MethodName.class)
class InvoiceRepositoryTest {
    private static IInvoiceRepository repository = InvoiceRepository.getRepository();
    private static Invoice invoice = InvoiceFactory.createBasicInvoice(
            "INV001",
            "Hope",
            "Kgomokaboya",
            1000.00
    );

    @Test
    void a_create() {
        Invoice created = repository.create( invoice);
        assertEquals(invoice.getInvoiceId(), created.getInvoiceId());
        System.out.println("Created: " + created);
    }

    @Test
    void b_read() {
        Invoice read = repository.read(invoice.getInvoiceId());
        assertNotNull(read);
        System.out.println("Read: " + read);
    }

    @Test
    void c_update() {
        Invoice updated = new Invoice.Builder()
                .copy(invoice)
                .setCustomerLastName("Mohale")
                .setTotalAmount(1200.00)
                .build();
        assertNotNull(repository.update(updated));
        System.out.println("Updated: " + updated);
    }

    @Test
    @Disabled
    void d_delete() {
        boolean success = repository.delete(invoice);
        assertTrue(success);
        System.out.println("Deleted: " + invoice.getInvoiceId());
    }

    @Test
    void e_getAll() {
        System.out.println("All Invoices: " + repository.getAll());
    }
}

package za.ca.cput.adp3capstone.repository;

/* Invoice.java
Invoice Repository class
Author: Hope Kgomokaboya (222152672)
Date:3 April 2025
*/

import za.ca.cput.adp3capstone.domain.Invoice;
import java.util.List;

public interface IInvoiceRepository extends IRepository<Invoice, String> {
    Invoice create(Invoice invoice);
    Invoice read(String id);
    Invoice update(Invoice invoice);
    boolean delete(String id); // note: delete by id
    List<Invoice> getAll();
}

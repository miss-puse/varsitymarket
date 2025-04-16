package za.ca.cput.adp3capstone.repository;

/* Invoice.java
Invoice Repository class
Author: Hope Kgomokaboya (222152672)
Date:3 April 2025
*/

import za.ca.cput.adp3capstone.domain.Invoice;
import java.util.ArrayList;
import java.util.List;

public class InvoiceRepository implements IInvoiceRepository {

    private static IInvoiceRepository repository = null;
    private final List<Invoice> invoiceList;

    private InvoiceRepository() {
        invoiceList = new ArrayList<>();
    }

    public static IInvoiceRepository getRepository() {
        if (repository == null) {
            repository = new InvoiceRepository();
        }
        return repository;
    }

    @Override
    public Invoice create(Invoice invoice) {
        boolean success = invoiceList.add(invoice);
        return success ? invoice : null;
    }

    @Override
    public Invoice read(String id) {
        return invoiceList.stream()
                .filter(i -> i.getInvoiceId().equals(id))
                .findFirst()
                .orElse(null);
    }

    @Override
    public Invoice update(Invoice invoice) {
        String id = invoice.getInvoiceId();
        Invoice oldInvoice = read(id);

        if (oldInvoice == null) return null;

        if (delete(id)) {
            if (invoiceList.add(invoice)) {
                return invoice;
            }
        }
        return null;
    }

    @Override
    public boolean delete(String id) {
        Invoice invoiceToDelete = read(id);
        return delete(invoiceToDelete); // use the method below
    }

    @Override
    public boolean delete(Invoice invoice) {
        return invoice != null && invoiceList.remove(invoice);
    }

    @Override
    public List<Invoice> getAll() {
        return invoiceList;
    }



}

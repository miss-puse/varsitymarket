package za.ca.cput.adp3capstone.repository;

/* Refund.java
Refund Repository class
Author: Hope Kgomokaboya (222152672)
Date:3 April 2025
*/

import za.ca.cput.adp3capstone.domain.Refund;
import java.util.List;

public interface IRefundRepository extends IRepository<Refund, String> {
    Refund create(Refund refund);
    Refund read(String id);
    Refund update(Refund refund);
    boolean delete(Refund refund);
    List<Refund> getAll();
}
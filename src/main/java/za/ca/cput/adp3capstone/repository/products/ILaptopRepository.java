package za.ca.cput.adp3capstone.repository.products;

import za.ca.cput.adp3capstone.domain.products.Laptop;
import za.ca.cput.adp3capstone.repository.IRepository;

import java.util.HashMap;

/* ILaptopRepository.java
ILaptopRepository abstract class
Author: Ethan Le Roux (222622172)
Date:13 April 2025
*/
public interface ILaptopRepository extends IRepository<Laptop, Long> {
    HashMap<Long, Laptop> getAll();
}

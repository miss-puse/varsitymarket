package za.ca.cput.adp3capstone.repository.products;

import za.ca.cput.adp3capstone.domain.products.Laptop;

import java.util.HashMap;

/* Product.java
Product model class
Author: Ethan Le Roux (222622172)
Date:3 April 2025
*/
public class LaptopRepository implements ILaptopRepository {
    private static ILaptopRepository repository = null;
    private HashMap<Long, Laptop> laptops;

    private LaptopRepository() {
        laptops = new HashMap<>();
    }

    public static ILaptopRepository getRepository() {
        if (repository == null) {
            repository = new LaptopRepository();
        }
        return repository;
    }

    @Override
    public HashMap<Long, Laptop> getAll() {
        if (laptops == null) {
            return null;
        }
        return laptops;
    }

    @Override
    public Laptop read(Long id) {
        Laptop laptop = laptops.get(id);
        if(laptop == null){
            return null;
        }
        return laptop;
    }

    @Override
    public Laptop create(Laptop laptop) {
        if(laptop==null){
            return null;
        }
        return laptops.put(laptop.getProductId(), laptop);
    }

    @Override
    public Laptop update(Laptop laptop) {
        Laptop foundLaptop = laptops.get(laptop.getProductId());
        if(foundLaptop==null){
            return null;
        }
        laptops.put(laptop.getProductId(), laptop);
        return foundLaptop;
    }

    @Override
    public boolean delete(Laptop laptop) {
        if(laptop==null){
            return false;
        }
        laptops.remove(laptop.getProductId());
        return true;
    }
}

package za.ca.cput.adp3capstone.repository;
/* IRepository.java
Product model class
Author: Ethan Le Roux (222622172)
Date:3 April 2025
*/
public interface IRepository<T, Id>{
    public T get(Id id);
    public T create(T t);
    public T update(T t);
    public boolean delete(T t);
}

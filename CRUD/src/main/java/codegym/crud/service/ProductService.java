package codegym.crud.service;

import codegym.crud.model.Product;

import java.util.Optional;


public interface ProductService {
    Iterable<Product> findAll();

    Optional<Product> findById(Long id);

    Product save(Product product);

    void remove(Long id);
}

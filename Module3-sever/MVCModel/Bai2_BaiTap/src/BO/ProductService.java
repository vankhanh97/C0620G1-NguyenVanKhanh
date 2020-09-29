package BO;



import Model.Product;

import java.util.List;

public interface ProductService {
    List<Product> findAll();

    void save(Product product);

    Product findByName(String name);

    Product findById(String id);

    void update(Integer id, Product product);

    void remove(String name);
}
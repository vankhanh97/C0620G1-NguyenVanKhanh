package BO;


import Model.Product;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ProductServiceImpl implements ProductService {

    private static final Map<Integer, Product> products;

    static {
        products = new HashMap<>();
        products.put(1, new Product(1, "Chuối", "1000", "Hanoi","Việt Nam"));
        products.put(2, new Product(2, "Xoài", "2000", "Danang","Việt Nam"));
        products.put(3 ,new Product(3, "Táo", "3000", "Saigon","Việt Nam"));
        products.put(4  ,new Product(4, "Ổi", "4000", "Beijin","Việt Nam"));
        products.put(5 ,new Product(5, "Dâu", "5000", "Miami","Việt Nam"));
        products.put(6 ,new Product(6, "Cam", "6000", "Newyork","Việt Nam"));
    }

    @Override
    public List<Product> findAll() {
        return new ArrayList<>(products.values());
    }

    @Override
    public void save(Product product) {
        products.put(product.getId(), product);
    }

    @Override
    public Product findByName(String name) {
        return products.get(name);
    }

    @Override
    public Product findById(String id) {
        return products.get(id);
    }

    @Override
    public void update(Integer id, Product product) {
        products.put(id, product);
    }

    @Override
    public void remove(String name) {
        products.remove(name);
    }
}
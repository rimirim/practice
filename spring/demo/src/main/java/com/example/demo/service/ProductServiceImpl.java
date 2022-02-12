package com.example.demo.service;

import com.example.demo.entity.bank10.Product;
import com.example.demo.entity.order32.Board;
import com.example.demo.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    ProductRepository repository;

    @Override
    public void register(Product product) {
        repository.create(product);
    }

    @Override
    public List<Product> list() {
        return repository.list();
    }

    @Override
    public Product detail(Integer productNo) {
        return repository.detail(productNo);
    }

    @Override
    public void modify(Product product) {
        repository.update(product);
    }

    @Override
    public void remove(Integer productNo) {
        repository.delete(productNo);
    }

}
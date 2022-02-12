package com.example.demo.service;

import com.example.demo.entity.bank10.Product;
import com.example.demo.entity.order32.Board;

import java.util.List;

public interface ProductService {

    public void register (Product product);
    public List<Product> list ();
    public Product detail (Integer productNo);
    public void modify (Product product);
    public void remove (Integer productNo);

}

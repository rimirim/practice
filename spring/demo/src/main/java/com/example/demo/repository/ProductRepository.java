package com.example.demo.repository;

import com.example.demo.entity.bank10.Product;
import lombok.SneakyThrows;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.List;

@Repository
public class ProductRepository {

        @Autowired
        private JdbcTemplate jdbcTemplate;

        public void create (Product product) {
            String query = "insert into product (name, price, content, provider) values (?, ?, ?, ?)";

            //각각 value ? ? ? 에 들어가게된다.
            jdbcTemplate.update(query, product.getName(), product.getPrice(), product.getContent(), product.getProvider());

        }

        public List<Product> list() {

            List<Product> results = jdbcTemplate.query(
                    "select product_name, product_price from product " +
                            "where product_no > 0 order by product_no desc",

                    // 요놈이 하나씩 넘겨줌
                    new RowMapper<Product>() {
                        @SneakyThrows
                        @Override
                        public Product mapRow(ResultSet rs, int rowNum) throws SQLException {
                            Product product = new Product();

                            product.setProductNo(rs.getInt("product_no"));
                            product.setPrice(rs.getInt("product_price"));
                            product.setContent(rs.getString("content"));
                            product.setProvider(rs.getString("provider"));
                            product.setName(rs.getString("product_name"));

                            return product;
                        }
                    }
            );

            return results;
        }

        public Product detail(Integer productNo) {
            List<Product> results = jdbcTemplate.query(
                    "select * from product " +
                            "where product_no = ?",

                    new RowMapper<Product>() {
                        @SneakyThrows
                        @Override
                        public Product mapRow(ResultSet rs, int rowNum) throws SQLException {
                            Product product = new Product();

                            product.setProductNo(rs.getInt("product_no"));
                            product.setPrice(rs.getInt("product_price"));
                            product.setContent(rs.getString("content"));
                            product.setProvider(rs.getString("provider"));
                            product.setName(rs.getString("product_name"));

                            return product;
                        }
                    }, productNo
            );

            // 정보를 찾지 못했다면 null 있다면 해당 내용 리턴 (0번 인덱스 - 결국 한개)
            return results.isEmpty() ? null : results.get(0);
        }

        public void delete(Integer productNo) {
            String query = "delete from product where product_no = ?";

            jdbcTemplate.update(query, productNo);
        }

        public void update(Product product) {
            String query = "update product set product_name = ?, product_price = ?, content = ? where product_no = ?";

            jdbcTemplate.update(query, product.getName(), product.getPrice(), product.getContent());

        }

    }


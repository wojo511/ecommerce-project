package com.wojtekkorys.ecommerce.dao;

import com.wojtekkorys.ecommerce.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}

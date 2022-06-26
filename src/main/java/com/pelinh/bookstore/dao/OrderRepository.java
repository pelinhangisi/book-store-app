package com.pelinh.bookstore.dao;

import com.pelinh.bookstore.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Integer> {
}

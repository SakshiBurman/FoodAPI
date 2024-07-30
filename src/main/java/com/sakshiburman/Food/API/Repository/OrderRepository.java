package com.sakshiburman.Food.API.Repository;
import com.sakshiburman.Food.API.Entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
package com.giuliano.course.repositories;

import com.giuliano.course.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;


public interface OrderRepository extends JpaRepository<Order, Long> {


}

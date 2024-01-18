package com.giuliano.course.repositories;

import com.giuliano.course.entities.OrderItem;
import com.giuliano.course.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;


public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {


}

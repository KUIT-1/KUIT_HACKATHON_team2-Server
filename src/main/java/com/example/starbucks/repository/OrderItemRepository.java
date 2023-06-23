package com.example.starbucks.repository;

import com.example.starbucks.domain.OrderItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

    @Query("select oi from OrderItem oi " +
            "join fetch oi.member " +
            "where oi.member.id = :memberId ")
    List<OrderItem> findAllByMemberId(@Param("memberId") Long memberId);
}

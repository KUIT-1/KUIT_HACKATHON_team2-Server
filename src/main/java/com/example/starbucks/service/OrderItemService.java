package com.example.starbucks.service;

import com.example.starbucks.domain.OrderItem;
import com.example.starbucks.repository.OrderItemRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
@Slf4j
public class OrderItemService {
    private final OrderItemRepository orderItemRepository;

    public List<OrderItem> findAllOrderItemByMemberId(Long memberId) {
        return orderItemRepository.findAllByMemberId(memberId);
    }
}

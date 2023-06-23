package com.example.starbucks.controller;

import com.example.starbucks.domain.OrderItem;
import com.example.starbucks.dto.orderItem.OrderItemReadResponseDto;
import com.example.starbucks.service.OrderItemService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@Slf4j
public class OrderItemController {

    private final OrderItemService orderItemService;

    @GetMapping("/orderItems")
    public ResponseEntity<List<OrderItemReadResponseDto>> getAllOrderItemByMemberId(@RequestParam(value = "memberId") Long memberId) {
        List<OrderItem> orderItems = orderItemService.findAllOrderItemByMemberId(memberId);
        List<OrderItemReadResponseDto> responseDto = orderItems.stream()
                .map(OrderItemReadResponseDto :: new)
                .toList();
        return new ResponseEntity<>(responseDto, HttpStatus.OK);
    }
}

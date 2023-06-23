package com.example.starbucks.dto.orderItem;

import com.example.starbucks.domain.OrderItem;
import lombok.Data;
import lombok.Getter;

@Getter
@Data
public class OrderItemReadResponseDto {
    private Long id;
    private String temp;
    private String size;
    private String cup;
    private int count;
    private int price;

    public OrderItemReadResponseDto(OrderItem orderItem) {
        this.id = orderItem.getId();
        this.temp = orderItem.getTemp();
        this.size = orderItem.getSize();
        this.count = orderItem.getCount();
        this.cup = orderItem.getCup();
        this.price = orderItem.getPrice();
    }
}

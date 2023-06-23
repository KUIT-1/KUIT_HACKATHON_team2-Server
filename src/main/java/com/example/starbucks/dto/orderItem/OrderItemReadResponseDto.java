package com.example.starbucks.dto.orderItem;

import com.example.starbucks.domain.OptionItem;
import com.example.starbucks.domain.OrderItem;
import com.example.starbucks.domain.OrderItemOption;
import com.example.starbucks.dto.optionItem.OptionItemReadResponseDto;
import lombok.Data;
import lombok.Getter;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Getter
@Data
public class OrderItemReadResponseDto {
    private Long id;
    private String temp;
    private String size;
    private String cup;
    private int count;
    private int price;
    private List<OptionItemReadResponseDto> optionItemReadResponseDtos;

    public OrderItemReadResponseDto(OrderItem orderItem) {
        this.id = orderItem.getId();
        this.temp = orderItem.getTemp();
        this.size = orderItem.getSize();
        this.count = orderItem.getCount();
        this.cup = orderItem.getCup();
        this.price = orderItem.getPrice();
        this.optionItemReadResponseDtos = orderItem.getOrderItemOptions().stream()
                .map(OrderItemOption::getOptionItem)
                .map(OptionItemReadResponseDto :: new)
                .toList();
    }
}

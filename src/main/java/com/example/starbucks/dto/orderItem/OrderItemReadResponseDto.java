package com.example.starbucks.dto.orderItem;


import com.example.starbucks.domain.OrderItem;
import com.example.starbucks.domain.OrderItemOption;
import com.example.starbucks.dto.optionItem.OptionItemReadResponseDto;
import lombok.Data;
import lombok.Getter;

import java.util.List;

@Getter
@Data
public class OrderItemReadResponseDto {
    private Long id;
    private String temp;
    private String size;
    private String cup;
    private int count;
    private int price;
    private String menuImage;
    private String menuName;
    private String menuEngName;
    private int menuPrice;
    private List<OptionItemReadResponseDto> optionItemReadResponseDtos;

    public OrderItemReadResponseDto(OrderItem orderItem) {
        this.id = orderItem.getId();
        this.temp = orderItem.getTemp();
        this.size = orderItem.getSize();
        this.count = orderItem.getCount();
        this.cup = orderItem.getCup();
        this.price = orderItem.getPrice();
        this.menuImage = orderItem.getMenu().getImage();
        this.menuName = orderItem.getMenu().getName();
        this.menuEngName = orderItem.getMenu().getEng_name();
        this.menuPrice = orderItem.getMenu().getPrice();
        this.optionItemReadResponseDtos = orderItem.getOrderItemOptions().stream()
                .map(OrderItemOption::getOptionItem)
                .map(OptionItemReadResponseDto :: new)
                .toList();
    }
}

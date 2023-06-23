package com.example.starbucks.dto.optionItem;

import com.example.starbucks.domain.OptionItem;
import lombok.Data;
import lombok.Getter;

@Getter
@Data
public class OptionItemReadResponseDto {

    private String name;
    private int price;

    public OptionItemReadResponseDto(OptionItem optionItem) {
        this.name = optionItem.getName();
        this.price = optionItem.getPrice();
    }
}

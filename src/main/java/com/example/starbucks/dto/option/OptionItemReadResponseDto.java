package com.example.starbucks.dto.option;

import com.example.starbucks.domain.OptionItem;
import com.example.starbucks.domain.Option_t;
import lombok.Data;
import lombok.Getter;

import java.util.List;

@Getter
@Data
public class OptionItemReadResponseDto {
    private final Long optionItemId;
    private final String name;
    private final int price;

    public OptionItem toEntity() {
        return OptionItem.builder()
                .id(optionItemId)
                .name(name)
                .price(price)
                .build();
    }

    public OptionItemReadResponseDto(OptionItem option) {
        this.optionItemId = option.getId();
        this.name = option.getName();
        this.price = option.getPrice();
    }
}

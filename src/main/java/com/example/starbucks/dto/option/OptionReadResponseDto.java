package com.example.starbucks.dto.option;

import com.example.starbucks.domain.Menu;
import com.example.starbucks.domain.OptionItem;
import com.example.starbucks.domain.Option_t;
import com.example.starbucks.dto.optionItem.OptionItemReadResponseDto;
import lombok.Data;
import lombok.Getter;

import java.util.List;

@Getter
@Data
public class OptionReadResponseDto {
    private final Long optionId;
    private final String name;
    private final List<OptionItemReadResponseDto> optionItems;

    public OptionReadResponseDto(Option_t option) {
        this.optionId = option.getId();
        this.name = option.getName();
        this.optionItems = option.getOptionItems().stream()
                .map(OptionItemReadResponseDto::new)
                .toList();
    }
}

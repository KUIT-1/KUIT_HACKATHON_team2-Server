package com.example.starbucks.dto.option;

import com.example.starbucks.domain.Menu;
import com.example.starbucks.domain.OptionItem;
import com.example.starbucks.domain.Option_t;
import lombok.Data;
import lombok.Getter;

import java.util.List;

@Getter
@Data
public class OptionReadResponseDto {
    private final Long optionId;
    private final String name;
    private final List<OptionItemReadResponseDto> optionItems;

    public Option_t toEntity() {
        return Option_t.builder()
                .id(optionId)
                .name(name)
                .optionItems(optionItems)
                .build();
    }

    public OptionReadResponseDto(Option_t option) {

        this.optionId = option.getId();
        this.name = option.getName();
        this.optionItems = option.getOptionItems();
    }
}

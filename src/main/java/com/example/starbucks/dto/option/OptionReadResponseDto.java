package com.example.starbucks.dto.option;

import com.example.starbucks.domain.Menu;
import com.example.starbucks.domain.Option_t;
import lombok.Data;
import lombok.Getter;

@Getter
@Data
public class OptionReadResponseDto {
    private final Long optionId;
    private final String name;

    public Menu toEntity() {
        return Menu.builder()
                .id(optionId)
                .name(name)
                .build();
    }

    public OptionReadResponseDto(Option_t option) {
        this.optionId = option.getId();
        this.name = option.getName();
    }
}

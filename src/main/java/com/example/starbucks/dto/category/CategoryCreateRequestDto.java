package com.example.starbucks.dto.category;

import com.example.starbucks.domain.Category;
import lombok.Data;
import lombok.Getter;

@Getter
@Data
public class CategoryCreateRequestDto {
    private String image;
    private String name;
    private String eng_name;

    public Category toEntity() {
        return Category.builder()
                .image(image)
                .name(name)
                .eng_name(eng_name)
                .build();
    }
}

package com.example.starbucks.dto.category;

import com.example.starbucks.domain.Category;
import lombok.Getter;

@Getter
public class CategoryCreateResponseDto {

    private Long id;

    public CategoryCreateResponseDto(Category category) {
        id = category.getId();
    }
}

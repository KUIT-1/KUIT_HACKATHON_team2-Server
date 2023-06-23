package com.example.starbucks.dto.category;

import com.example.starbucks.domain.Category;
import lombok.Data;
import lombok.Getter;

@Getter
@Data
public class CategoryReadResponseDto {

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

    public CategoryReadResponseDto(Category category) {
        this.image = category.getImage();
        this.name = category.getName();
        this.eng_name = category.getEng_name();
    }
}

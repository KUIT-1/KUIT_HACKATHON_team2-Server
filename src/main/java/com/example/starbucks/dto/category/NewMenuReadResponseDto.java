package com.example.starbucks.dto.category;

import com.example.starbucks.domain.Menu;
import lombok.Data;
import lombok.Getter;

@Getter
@Data
public class NewMenuReadResponseDto {
    private String image;
    private String name;

    public Menu toEntity() {
        return Menu.builder()
                .image(image)
                .name(name)
                .build();
    }

    public NewMenuReadResponseDto(Menu menu) {
        this.image = menu.getImage();
        this.name = menu.getName();
    }
}

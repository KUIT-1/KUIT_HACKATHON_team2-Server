package com.example.starbucks.dto.category;

import com.example.starbucks.domain.Menu;
import lombok.Data;
import lombok.Getter;

@Getter
@Data
public class NewMenuReadResponseDto {
    private long menuId;
    private String image;
    private String name;

    public Menu toEntity() {
        return Menu.builder()
                .id(menuId)
                .image(image)
                .name(name)
                .build();
    }

    public NewMenuReadResponseDto(Menu menu) {
        this.menuId = menu.getId();
        this.image = menu.getImage();
        this.name = menu.getName();
    }
}

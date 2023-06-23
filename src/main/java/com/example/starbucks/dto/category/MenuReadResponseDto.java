package com.example.starbucks.dto.category;

import com.example.starbucks.domain.Category;
import com.example.starbucks.domain.Menu;
import lombok.Data;
import lombok.Getter;

@Getter
@Data
public class MenuReadResponseDto {
    private String image;
    private String name;
    private String eng_name;
    private String description;
    private int price;

    public Menu toEntity() {
        return Menu.builder()
                .image(image)
                .name(name)
                .eng_name(eng_name)
                .price(price)
                .build();
    }

    public MenuReadResponseDto(Menu menu) {
        this.image = menu.getImage();
        this.name = menu.getName();
        this.eng_name = menu.getEng_name();
        this.description = menu.getDescription();
        this.price = menu.getPrice();
    }


}

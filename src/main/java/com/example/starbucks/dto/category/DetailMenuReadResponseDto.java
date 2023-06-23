package com.example.starbucks.dto.category;

import com.example.starbucks.domain.Menu;
import lombok.Data;
import lombok.Getter;

@Getter
@Data
public class DetailMenuReadResponseDto {
    private long menuId;
    private String image;
    private String name;
    private String eng_name;
    private String description;
    private int price;
    private String menuStatus;

    public Menu toEntity() {
        return Menu.builder()
                .id(menuId)
                .image(image)
                .name(name)
                .eng_name(eng_name)
                .price(price)
                .menuStatus(menuStatus)
                .build();
    }

    public DetailMenuReadResponseDto(Menu menu) {
        this.menuId = menu.getId();
        this.image = menu.getImage();
        this.name = menu.getName();
        this.eng_name = menu.getEng_name();
        this.description = menu.getDescription();
        this.price = menu.getPrice();
        this.menuStatus = menu.getMenuStatus();
    }


}

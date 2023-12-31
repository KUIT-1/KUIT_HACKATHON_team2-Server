package com.example.starbucks.dto.menu;

import com.example.starbucks.domain.Menu;
import lombok.Data;
import lombok.Getter;

@Getter
@Data
public class MenuReadResponseDto {
    private long menuId;
    private String image;
    private String name;
    private String eng_name;
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

    public MenuReadResponseDto(Menu menu) {
        this.menuId = menu.getId();
        this.image = menu.getImage();
        this.name = menu.getName();
        this.eng_name = menu.getEng_name();
        this.price = menu.getPrice();
        this.menuStatus = menu.getMenuStatus();
    }
}

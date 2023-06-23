package com.example.starbucks.controller;

import com.example.starbucks.domain.Category;
import com.example.starbucks.domain.Menu;
import com.example.starbucks.dto.category.CategoryReadResponseDto;
import com.example.starbucks.dto.category.MenuReadResponseDto;
import com.example.starbucks.service.MenuService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/menus")
@RequiredArgsConstructor
@Slf4j
public class MenuController {
    private final MenuService menuService;

    @GetMapping("")
    public ResponseEntity<List<MenuReadResponseDto>> getAllNewMenus(@RequestParam(value="menu-status") String menuStatus){
        List<Menu> newMenus = menuService.findAllNewMenus(menuStatus);
        List<MenuReadResponseDto> responseDto = newMenus.stream()
                .map(MenuReadResponseDto :: new)
                .toList();
        return new ResponseEntity<>(responseDto, HttpStatus.OK);
    }


}

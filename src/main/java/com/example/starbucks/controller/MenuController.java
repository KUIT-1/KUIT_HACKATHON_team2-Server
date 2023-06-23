package com.example.starbucks.controller;

import com.example.starbucks.domain.Menu;
import com.example.starbucks.dto.menu.DetailMenuReadResponseDto;
import com.example.starbucks.dto.menu.MenuReadResponseDto;
import com.example.starbucks.dto.menu.NewMenuReadResponseDto;
import com.example.starbucks.service.MenuService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/menus")
@RequiredArgsConstructor
@Slf4j
public class MenuController {
    private final MenuService menuService;

    @GetMapping("")
    public ResponseEntity<List<NewMenuReadResponseDto>> getAllNewMenus(@RequestParam(value="menu-status") String menuStatus){
        List<Menu> newMenus = menuService.findAllNewMenus(menuStatus);
        List<NewMenuReadResponseDto> responseDto = newMenus.stream()
                .map(NewMenuReadResponseDto :: new)
                .toList();
        return new ResponseEntity<>(responseDto, HttpStatus.OK);
    }

    @GetMapping("/{menuId}")
    public ResponseEntity<List<DetailMenuReadResponseDto>> getAllMenus(@PathVariable("menuId") Long menuId){
        List<Menu> menus = menuService.findAllMenus(menuId);
        List<DetailMenuReadResponseDto> responseDto = menus.stream()
                .map(DetailMenuReadResponseDto:: new)
                .toList();
        return new ResponseEntity<>(responseDto, HttpStatus.OK);
    }

    @GetMapping("/category/{categoryId}")
    public ResponseEntity<List<MenuReadResponseDto>> getAllMenusByCategory(@PathVariable("categoryId") Long categoryId){
        List<Menu> menus = menuService.findAllMenuByCategory(categoryId);
        List<MenuReadResponseDto> responseDto = menus.stream()
                .map(MenuReadResponseDto:: new)
                .toList();
        return new ResponseEntity<>(responseDto, HttpStatus.OK);
    }




}

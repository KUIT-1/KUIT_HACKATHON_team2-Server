package com.example.starbucks.controller;

import com.example.starbucks.domain.Category;
import com.example.starbucks.dto.category.CategoryCreateRequestDto;
import com.example.starbucks.dto.category.CategoryCreateResponseDto;
import com.example.starbucks.dto.category.CategoryReadResponseDto;
import com.example.starbucks.service.CategoryService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/app")
@RequiredArgsConstructor
@Slf4j
public class CategoryController {
    private final CategoryService categoryService;


    @PostMapping("/category")
    public ResponseEntity<CategoryCreateResponseDto> createCategory(@RequestBody CategoryCreateRequestDto dto) {

        CategoryCreateResponseDto responseDto = categoryService.saveCategory(dto);
        return new ResponseEntity<>(responseDto, HttpStatus.OK);
    }

    @GetMapping("/category")
    public ResponseEntity<List<CategoryReadResponseDto>> getAllCategorys() {

        List<Category> categories = categoryService.findAllCategories();
        List<CategoryReadResponseDto> responseDto = categories.stream()
                .map(CategoryReadResponseDto :: new)
                .toList();
        return new ResponseEntity<>(responseDto, HttpStatus.OK);
    }
}

package com.example.starbucks.service;

import com.example.starbucks.domain.Category;
import com.example.starbucks.dto.category.CategoryCreateRequestDto;
import com.example.starbucks.dto.category.CategoryCreateResponseDto;
import com.example.starbucks.repository.CategoryRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
//@Transactional(readOnly = true)
@Slf4j
public class CategoryService {

    private final CategoryRepository categoryRepository;

    public CategoryCreateResponseDto saveCategory(CategoryCreateRequestDto dto) {

        Category category = dto.toEntity();

        categoryRepository.save(category);

        return new CategoryCreateResponseDto(category);
    }

    public List<Category> findAllCategories() {
        return categoryRepository.findAll();
    }
}

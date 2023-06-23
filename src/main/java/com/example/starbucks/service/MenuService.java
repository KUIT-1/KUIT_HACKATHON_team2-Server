package com.example.starbucks.service;

import com.example.starbucks.domain.Category;
import com.example.starbucks.domain.Menu;
import com.example.starbucks.dto.category.MenuReadResponseDto;
import com.example.starbucks.repository.MenuRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
//@Transactional(readOnly = true)
@Slf4j
public class MenuService {
    private final MenuRepository menuRepository;


    public List<Menu> findAllNewMenus(String menuStatus) {
        return menuRepository.findAllByMenuStatus(menuStatus);
    }
}

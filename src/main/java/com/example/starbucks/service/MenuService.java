package com.example.starbucks.service;

import com.example.starbucks.domain.Menu;
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

    public List<Menu> findAllMenus(Long menuId) {
        return menuRepository.findAllById(menuId);
    }

    public List<Menu> findAllMenuByCategory(Long categoryId) {
        return menuRepository.findAllByCategoryId(categoryId);
    }
}

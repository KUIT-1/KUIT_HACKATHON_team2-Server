package com.example.starbucks.repository;

import com.example.starbucks.domain.Category;
import com.example.starbucks.domain.Menu;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MenuRepository extends JpaRepository<Menu, Long> {
    List<Menu> findAllByMenuStatus(String menuStatus);
}

package com.example.starbucks.repository;

import com.example.starbucks.domain.Category;
import com.example.starbucks.domain.Menu;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MenuRepository extends JpaRepository<Menu, Long> {
    List<Menu> findAllByMenuStatus(String menuStatus);
    List<Menu> findAllById(Long menuId);
    @Query("select m from Menu m " +
    "join fetch m.category " +
    "where m.category.id = :categoryId ")
    List<Menu> findAllByCategoryId(@Param("categoryId") Long categoryId);
}

package com.example.starbucks.repository;

import com.example.starbucks.domain.Menu;
import com.example.starbucks.domain.Option_t;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface OptionRepository extends JpaRepository<Option_t, Long> {


    @Query("select ot from Option_t ot "
            +        "WHERE ot.menu.id = :menuId")
    List<Option_t> findAllByMenuId(@Param("menuId") Long menuId);
}

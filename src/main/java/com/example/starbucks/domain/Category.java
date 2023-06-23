package com.example.starbucks.domain;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.hibernate.annotations.ColumnDefault;

import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Builder
@AllArgsConstructor
@RequiredArgsConstructor
public class Category {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "category_id")
    private Long id;

    @Column
    private String image;

    @Column(length = 100)
    private String name;

    @Column(length = 100)
    private String eng_name;

    @ColumnDefault("1")
    private int category_type;

    @OneToMany(mappedBy = "category")
    List<Menu> menus = new ArrayList<>();
}

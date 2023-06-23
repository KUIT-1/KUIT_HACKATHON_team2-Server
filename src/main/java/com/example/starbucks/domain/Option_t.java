package com.example.starbucks.domain;

import com.example.starbucks.dto.optionItem.OptionItemReadResponseDto;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Builder
@AllArgsConstructor
@RequiredArgsConstructor
public class Option_t {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "option_id")
    private Long id;

    @Column(length = 100)
    private String name;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "menu_id")
    private Menu menu;

    @OneToMany(mappedBy = "option", cascade = CascadeType.ALL)
    List<OptionItem> optionItems = new ArrayList<>();
}

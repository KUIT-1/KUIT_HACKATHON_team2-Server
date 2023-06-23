package com.example.starbucks.domain;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Entity
@Getter
@Builder
@AllArgsConstructor
@RequiredArgsConstructor
public class OrderItemOption {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "orderItemOption_id")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "orderItem_id")
    private OrderItem orderItem;

    @ManyToOne
    @JoinColumn(name = "optionItem_id")
    private OptionItem optionItem;
}

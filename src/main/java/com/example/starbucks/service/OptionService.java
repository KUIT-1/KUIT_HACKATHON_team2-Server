package com.example.starbucks.service;

import com.example.starbucks.domain.Menu;
import com.example.starbucks.domain.Option_t;
import com.example.starbucks.repository.OptionRepository;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
//@Transactional
@Slf4j
public class OptionService {
    private final OptionRepository optionRepository;
    public List<Option_t> findAllOptions(Long menuId) {
        return optionRepository.findAllByMenuId(menuId);
    }
}

package com.example.starbucks.controller;

import com.example.starbucks.domain.Option_t;
import com.example.starbucks.dto.option.OptionReadResponseDto;
import com.example.starbucks.service.OptionService;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/options")
@RequiredArgsConstructor
@Slf4j
public class OptionController {
    private final OptionService optionService;

    @GetMapping("")
    @Transactional
    public ResponseEntity<List<OptionReadResponseDto>> getAllNewMenus(@RequestParam(value="menuId") Long menuId){
        List<Option_t> options = optionService.findAllOptions(menuId);
        List<OptionReadResponseDto> responseDto = options.stream()
                .map(OptionReadResponseDto :: new)
                .toList();
        return new ResponseEntity<>(responseDto, HttpStatus.OK);
    }


}

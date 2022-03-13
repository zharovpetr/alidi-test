package ru.zharov.demo.controller;

import static java.util.stream.Collectors.toMap;

import controller.BasketController;
import dto.BasketDto;
import dto.BasketPositionDto;
import dto.ProcessedBasketDto;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.zharov.demo.domain.Basket;
import ru.zharov.demo.mapper.BasketMapper;
import ru.zharov.demo.service.BasketService;

import java.util.Map;

@RestController
@RequestMapping("/basket")
public class BasketControllerImpl implements BasketController {

    private final BasketService basketService;
    private final BasketMapper basketMapper;

    public BasketControllerImpl(BasketService basketService, BasketMapper basketMapper) {
        this.basketService = basketService;
        this.basketMapper = basketMapper;
    }

    @Override
    @PostMapping
    public ProcessedBasketDto postBasket(@RequestBody BasketDto basketDto) {
        Map<Integer, Integer> positionsData = basketDto.getPositions()
                .stream()
                .collect(toMap(BasketPositionDto::getProductId, BasketPositionDto::getProductCount, Integer::sum));

        Basket processedBasket = basketService.process(positionsData);

        return basketMapper.basketToDto(processedBasket);
    }
}

package ru.zharov.demo.service;

import org.springframework.stereotype.Service;
import ru.zharov.demo.domain.Basket;
import ru.zharov.demo.domain.BasketPosition;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Service
public class BasketServiceImpl implements BasketService {

    private final PriceService priceService;

    public BasketServiceImpl(PriceService priceService) {
        this.priceService = priceService;
    }

    public Basket process(Map<Integer, Integer> positionsData) {
        List<BasketPosition> basketPositions = new ArrayList<>();
        for (Map.Entry<Integer, Integer> position : positionsData.entrySet()) {
            float price = priceService.getPrice(position.getKey());
            basketPositions.add(new BasketPosition(position.getKey(), position.getValue(), price));
        }
        return new Basket(basketPositions);
    }

}

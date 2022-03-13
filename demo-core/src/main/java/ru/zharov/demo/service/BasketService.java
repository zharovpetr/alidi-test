package ru.zharov.demo.service;

import ru.zharov.demo.domain.Basket;

import java.util.Map;

public interface BasketService {

    /**
     * Метод обработки корзины.
     *
     * @param positionsData набор данных о
     * @return обработанная корзина.
     */
    Basket process(Map<Integer, Integer> positionsData);
}

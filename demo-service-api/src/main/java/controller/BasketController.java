package controller;

import dto.BasketDto;
import dto.ProcessedBasketDto;

/**
 * Контроллер для обработки полученных данных о корзине.
 */
public interface BasketController {

    /**
     * Метод обработки корзины.
     *
     * @param basketDto "корзина"
     * @return "рассчитанная корзина"
     */
    ProcessedBasketDto postBasket(BasketDto basketDto);
}

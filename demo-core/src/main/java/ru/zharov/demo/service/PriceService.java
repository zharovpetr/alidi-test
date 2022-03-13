package ru.zharov.demo.service;

public interface PriceService {

    /**
     * Метод получения цены по идентификатору продукта.
     *
     * @param productId идентификатор продукта.
     * @return цена продукта.
     */
    float getPrice(int productId);
}

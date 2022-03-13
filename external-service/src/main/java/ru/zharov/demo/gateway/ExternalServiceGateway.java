package ru.zharov.demo.gateway;

import java.util.Optional;

public interface ExternalServiceGateway {

    /**
     * Метод получения цены по идентификатору продукта.
     *
     * @param productId идентификатор продукта.
     * @return цена продукта.
     */
    Optional<Float> getPrice(int productId);
}

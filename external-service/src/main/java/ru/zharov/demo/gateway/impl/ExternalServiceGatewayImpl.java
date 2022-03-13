package ru.zharov.demo.gateway.impl;

import static java.util.Optional.empty;
import static java.util.Optional.ofNullable;

import org.springframework.stereotype.Component;
import ru.zharov.demo.exception.PriceSystemException;
import ru.zharov.demo.gateway.ExternalServiceGateway;

import java.util.Optional;

@Component
public class ExternalServiceGatewayImpl implements ExternalServiceGateway {

    @Override
    public Optional<Float> getPrice(int productId) {
        try {
            switch (productId) {
                case 1:
                    return ofNullable(15.1F);
                case 2:
                    return ofNullable(5.7F);
                case 3:
                    return ofNullable(74.2F);
                default:
                    throw new PriceSystemException();
            }
        } catch (Exception ex) {
            System.out.println("Ошибка при получении данных от внешнего сервиса");
            //Здесь нужно обработать возможные ошибки от внешнего сервиса и сделать так чтобы ошибки не "протекали" из модуля
            //Для упрощения допустим что у всех товаров есть одинаковая цена по умолчанию.
            return empty();
        }
    }
}

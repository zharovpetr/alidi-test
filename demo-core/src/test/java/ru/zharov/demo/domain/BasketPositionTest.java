package ru.zharov.demo.domain;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class BasketPositionTest {

    @Test
    @DisplayName("Корректно считается общая сумма позиции, если заданы количество товаров и цена")
    public void test1() {
        BasketPosition basketPosition = new BasketPosition(1, 5, 48.7f);

        assertEquals(243.5f, basketPosition.calculateAmount());
    }
}
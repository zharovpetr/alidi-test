package ru.zharov.demo.domain;

import java.util.List;

public class Basket {

    private final List<BasketPosition> positions;

    public Basket(List<BasketPosition> positions) {
        this.positions = positions;
    }

    public List<BasketPosition> getPositions() {
        return positions;
    }

    public float calculateTotalAmount() {
        return positions.stream()
                .map(BasketPosition::calculateAmount)
                .reduce(Float::sum)
                .orElse(0f);
    }
}

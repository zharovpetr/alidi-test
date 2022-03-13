package ru.zharov.demo.exception;

public class PriceNotFoundBusinessException extends RuntimeException {
    private final int productId;

    public PriceNotFoundBusinessException(int productId) {
        super();
        this.productId = productId;
    }

    public String getMessage() {
        return String.format("Price not found for product with id = %s", this.productId);
    }
}

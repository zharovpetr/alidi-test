package ru.zharov.demo.domain;

public class BasketPosition {

    private final int productId;
    private final int productCount;
    private final float productPrice;

    public BasketPosition(int productId, int productCount, float productPrice) {
        this.productId = productId;
        this.productCount = productCount;
        this.productPrice = productPrice;
    }

    public int getProductId() {
        return productId;
    }

    public int getProductCount() {
        return productCount;
    }

    public float getProductPrice() {
        return productPrice;
    }

    public float calculateAmount() {
        return productCount * productPrice;
    }
}

package dto;

/**
 * Позиция товара в корзине
 */
public class BasketPositionDto {

    private int productId;
    private int productCount;

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public int getProductCount() {
        return productCount;
    }

    public void setProductCount(int productCount) {
        this.productCount = productCount;
    }
}

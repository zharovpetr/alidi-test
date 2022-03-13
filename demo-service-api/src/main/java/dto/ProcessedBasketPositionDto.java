package dto;

/**
 * Рассчитанная позиция в корзине
 */
public class ProcessedBasketPositionDto {
    private int productId;
    private int productCount;
    private float positionSum;

    public ProcessedBasketPositionDto(int productId, int productCount, float positionSum) {
        this.productId = productId;
        this.productCount = productCount;
        this.positionSum = positionSum;
    }

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

    public float getPositionSum() {
        return positionSum;
    }

    public void setPositionSum(float positionSum) {
        this.positionSum = positionSum;
    }
}

package dto;

import java.util.List;

/**
 * "Рассчитанная корзина"
 */
public class ProcessedBasketDto {
    private List<ProcessedBasketPositionDto> positions;
    private float totalSum;

    public ProcessedBasketDto(List<ProcessedBasketPositionDto> positions, float totalSum) {
        this.positions = positions;
        this.totalSum = totalSum;
    }

    public List<ProcessedBasketPositionDto> getPositions() {
        return positions;
    }

    public void setPositions(List<ProcessedBasketPositionDto> positions) {
        this.positions = positions;
    }

    public float getTotalSum() {
        return totalSum;
    }

    public void setTotalSum(float totalSum) {
        this.totalSum = totalSum;
    }
}

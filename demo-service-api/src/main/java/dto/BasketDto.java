package dto;

import java.util.List;

/**
 * Корзина
 */
public class BasketDto {

    private List<BasketPositionDto> positions;
    private PaymentType paymentType;
    private long addressId;

    public List<BasketPositionDto> getPositions() {
        return positions;
    }

    public void setPositions(List<BasketPositionDto> positions) {
        this.positions = positions;
    }

    public PaymentType getPaymentType() {
        return paymentType;
    }

    public void setPaymentType(PaymentType paymentType) {
        this.paymentType = paymentType;
    }

    public Long getAddressId() {
        return addressId;
    }

    public void setAddressId(Long addressId) {
        this.addressId = addressId;
    }
}

package ru.zharov.demo.mapper;

import dto.ProcessedBasketPositionDto;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import ru.zharov.demo.domain.BasketPosition;

@Mapper(componentModel = "spring")
public interface BasketPositionMapper {

    @Mapping(target = "productId", source = "productId")
    @Mapping(target = "productCount", source = "productCount")
    @Mapping(target = "positionSum", expression = "java(basketPosition.calculateAmount())")
    ProcessedBasketPositionDto mapToDto(BasketPosition basketPosition);
}

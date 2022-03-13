package ru.zharov.demo.mapper;

import static java.util.stream.Collectors.toList;

import dto.BasketPositionDto;
import dto.ProcessedBasketDto;
import dto.ProcessedBasketPositionDto;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Named;
import org.springframework.beans.factory.annotation.Autowired;
import ru.zharov.demo.domain.Basket;
import ru.zharov.demo.domain.BasketPosition;

import java.util.List;

@Mapper(componentModel = "spring")
public abstract class BasketMapper {

    @Autowired
    BasketPositionMapper basketPositionMapper;

    @Mapping(target = "positions", expression = "java(mapBasketPositions(basket.getPositions()))")
    @Mapping(target = "totalSum", expression = "java(basket.calculateTotalAmount())")
    public abstract ProcessedBasketDto basketToDto(Basket basket);

    @Named("mapBasketPositions")
    protected List<ProcessedBasketPositionDto> mapBasketPositions(List<BasketPosition> basketPositions) {
        return basketPositions.stream()
                .map(basketPosition -> basketPositionMapper.mapToDto(basketPosition))
                .collect(toList());
    }
}

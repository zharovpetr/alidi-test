package ru.zharov.demo.service;

import static java.util.Objects.nonNull;

import com.google.common.cache.Cache;
import com.google.common.cache.CacheBuilder;
import org.springframework.stereotype.Service;
import ru.zharov.demo.exception.PriceNotFoundBusinessException;
import ru.zharov.demo.gateway.ExternalServiceGateway;

import java.util.concurrent.TimeUnit;

@Service
public class PriceServiceImpl implements PriceService {

    private final ExternalServiceGateway externalServiceGateway;
    private final Cache<Long, Float> priceCache;

    public PriceServiceImpl(ExternalServiceGateway externalServiceGateway) {
        this.externalServiceGateway = externalServiceGateway;
        this.priceCache = CacheBuilder.newBuilder()
                .expireAfterWrite(1, TimeUnit.DAYS)
                .maximumSize(5)
                .build();
    }

    @Override
    public float getPrice(int productId) {
        Float cacheObject = priceCache.getIfPresent(productId);
        if (nonNull(cacheObject)) {
            return cacheObject;
        }
        return externalServiceGateway.getPrice(productId)
                .orElseThrow(() -> new PriceNotFoundBusinessException(productId));
    }
}

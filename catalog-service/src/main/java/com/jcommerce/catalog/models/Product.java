package com.jcommerce.catalog.models;

import java.math.BigDecimal;
import java.util.UUID;

public record Product(
        Long id,
        UUID sku,
        String name,
        BigDecimal price,
        Long[] categoryIds,
        boolean active
        ) {
}

package com.jcommerce.catalog.entity;

import java.math.BigDecimal;
import java.util.UUID;

public class ProductEntity {

    private Long id;
    private UUID sku;
    private String name;
    private BigDecimal price;
    private Long[] categoryIds;
    private boolean active;
}

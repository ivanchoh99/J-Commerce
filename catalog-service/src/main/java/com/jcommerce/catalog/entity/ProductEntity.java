package com.jcommerce.catalog.entity;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import org.springframework.data.annotation.Id;

import java.math.BigDecimal;
import java.util.UUID;

public class ProductEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    @Column(unique = true, nullable = false)
    private UUID sku;
    @Column(nullable = false)
    private String name;
    @Column(nullable = false)
    private BigDecimal price;
    @Column(nullable = false)
    private Long[] categoryIds;
    @Column(nullable = false)
    private boolean active;
}

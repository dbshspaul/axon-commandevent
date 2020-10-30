package com.axon.event;

import java.util.UUID;

public class ProductCreatedEvent {

    private UUID productId;
    private String name;
    private String description;
    private String code;

    public ProductCreatedEvent(UUID id, String name, String description, String code) {
        this.productId = id;
        this.name = name;
        this.description = description;
        this.code = code;
    }

    public UUID getProductId() {
        return productId;
    }

    public void setProductId(UUID productId) {
        this.productId = productId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
}

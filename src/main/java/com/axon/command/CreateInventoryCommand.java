package com.axon.command;

import org.axonframework.modelling.command.TargetAggregateIdentifier;

import java.util.UUID;


public class CreateInventoryCommand {

    @TargetAggregateIdentifier
    private UUID inventoryId;
    private String productCode;
    private Long qty;

    public CreateInventoryCommand(UUID inventoryId, String productCode, Long qty) {
        this.inventoryId = inventoryId;
        this.productCode = productCode;
        this.qty = qty;
    }

    public UUID getInventoryId() {
        return inventoryId;
    }

    public void setInventoryId(UUID inventoryId) {
        this.inventoryId = inventoryId;
    }

    public String getProductCode() {
        return productCode;
    }

    public void setProductCode(String productCode) {
        this.productCode = productCode;
    }

    public Long getQty() {
        return qty;
    }

    public void setQty(Long qty) {
        this.qty = qty;
    }
}

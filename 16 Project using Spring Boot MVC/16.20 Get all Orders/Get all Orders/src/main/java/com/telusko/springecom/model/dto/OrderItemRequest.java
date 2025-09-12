package com.telusko.springecom.model.dto;

public record OrderItemRequest(
        int productId,
        int quantity
) {}

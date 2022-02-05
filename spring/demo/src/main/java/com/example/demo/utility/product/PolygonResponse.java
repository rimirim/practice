package com.example.demo.utility.product;

import lombok.Data;

@Data
public class PolygonResponse {
    private float area;

    public PolygonResponse(RegularPolygon rp) {
        area = rp.getArea();
    }
}

package com.example.demo.entity.response;

import com.example.demo.entity.RegularPolygon;
import lombok.Data;

@Data
public class PolygonResponse {
    private float area;

    public PolygonResponse(RegularPolygon rp) {
        area = rp.getArea();
    }
}

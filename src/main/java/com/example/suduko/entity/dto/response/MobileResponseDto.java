package com.example.suduko.entity.dto.response;

import com.example.suduko.entity.Mobile;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.io.Serializable;

@Builder
@Data
@AllArgsConstructor
public class MobileResponseDto implements Serializable {

    private int id;
    private String model;

    public static MobileResponseDto of(Mobile m) {
        return MobileResponseDto.builder()
                .id(m.getId())
                .model(m.getModel())
                .build();
    }
}

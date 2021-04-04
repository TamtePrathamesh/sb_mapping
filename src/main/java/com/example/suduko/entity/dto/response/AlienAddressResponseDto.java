package com.example.suduko.entity.dto.response;

import com.example.suduko.entity.AlienAddress;
import lombok.Builder;
import lombok.Data;

import java.io.Serializable;

@Builder
@Data
public class AlienAddressResponseDto implements Serializable {
    private int id;
    private String planet;

    public static AlienAddressResponseDto of(AlienAddress ad) {
        return AlienAddressResponseDto.builder()
                .id(ad.getId())
                .planet(ad.getPlanet())
                .build();
    }
}

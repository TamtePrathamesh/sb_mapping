package com.example.suduko.entity.dto.request;

import com.example.suduko.entity.Alien;
import com.example.suduko.entity.AlienAddress;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Builder
@Data
@AllArgsConstructor
public class AlienAddressRequestDto {

    private int id;
    private String planet;

    public static AlienAddress of(AlienAddressRequestDto adt) {

        return AlienAddress.builder()
                .id(adt.getId())
                .planet(adt.getPlanet())
                .build();
    }
}

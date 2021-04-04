package com.example.suduko.entity.dto.response;

import com.example.suduko.entity.Alien;
import com.example.suduko.entity.AlienAddress;
import lombok.Builder;
import lombok.Data;

import java.io.Serializable;

@Builder
@Data
public class AlienResponseDto implements Serializable {

    private int id;
    private String name;
    private String powers;
    private AlienAddressResponseDto alienAddress;

    public static AlienResponseDto of(Alien a) {
        return AlienResponseDto.builder()
                .id(a.getId())
                .name(a.getName())
                .powers(a.getPowers())
                .alienAddress(AlienAddressResponseDto.of(a.getAlienAddress()))
                .build();
    }

}

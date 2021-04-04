package com.example.suduko.entity.dto.request;


import com.example.suduko.entity.Alien;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Builder
@Data
@AllArgsConstructor
public class AlienRequestDto {

    private int id;
    private String name;
    private String powers;
    private AlienAddressRequestDto alienAddress;

    public static Alien of(AlienRequestDto art) {
        return Alien.builder()
                .id(art.getId())
                .name(art.getName())
                .powers(art.getPowers())
                .alienAddress(AlienAddressRequestDto.of(art.getAlienAddress()))
                .build();
    }

}

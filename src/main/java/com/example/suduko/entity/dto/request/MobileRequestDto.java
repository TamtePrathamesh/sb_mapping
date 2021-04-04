package com.example.suduko.entity.dto.request;

import com.example.suduko.entity.Mobile;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.io.Serializable;

@Builder
@Data
@AllArgsConstructor
public class MobileRequestDto implements Serializable {

    private int id;
    private String model;
    private UserRequestDto users;

    public static Mobile of(MobileRequestDto m) {
        return Mobile.builder()
                .id(m.getId())
                .model(m.getModel())
                .build();
    }
}

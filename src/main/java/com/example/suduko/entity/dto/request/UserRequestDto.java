package com.example.suduko.entity.dto.request;

import com.example.suduko.entity.Mobile;
import com.example.suduko.entity.User;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.io.Serializable;
import java.util.Set;
import java.util.stream.Collectors;

@Builder
@Data
@AllArgsConstructor
public class UserRequestDto implements Serializable  {
    private int id;
    private String fullName;
    private String address;
    private Set<MobileRequestDto> mobiles;

    public static User of(UserRequestDto u) {
        return User.builder()
                .id(u.getId())
                .fullName(u.getFullName())
                .address(u.getAddress())
                .mobiles(u.getMobiles().stream().map(item -> MobileRequestDto.of(item)).collect(Collectors.toSet()))
                .build();
    }
}

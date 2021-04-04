package com.example.suduko.entity.dto.response;
import com.example.suduko.entity.User;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import java.io.Serializable;
import java.util.Set;
import java.util.stream.Collectors;

@Data
@Builder
@AllArgsConstructor
public class UserResponseDto implements Serializable {

    private int id;
    private String fullName;
    private Set<MobileResponseDto> mobiles;

    public static UserResponseDto of(User u) {
        return UserResponseDto.builder().
                id(u.getId())
                .fullName(u.getFullName())
                .mobiles(u.getMobiles().stream().map(item -> MobileResponseDto.of(item)).collect(Collectors.toSet()))
                .build();
    }

}

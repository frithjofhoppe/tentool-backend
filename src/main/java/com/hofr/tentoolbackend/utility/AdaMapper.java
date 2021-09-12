package com.hofr.tentoolbackend.utility;

import com.hofr.tentoolbackend.business.dto.AdaDto;
import com.hofr.tentoolbackend.database.model.Ada;

import java.util.Optional;
import java.util.UUID;

public class AdaMapper {
    public static AdaDto toDto(Ada ada){
        return AdaDto.builder()
                .id(ada.getId().toString())
                .ahvNr(ada.getAhvNr())
                .firstName(ada.getFirstName())
                .lastName(ada.getLastName())
                .role(ada.getRole())
                .build();
    }

    public static Ada toDao(AdaDto adaDto){
        return Ada.builder()
                .id(Optional.ofNullable(adaDto.id).map(id -> UUID.fromString(id)).orElse(null))
                .ahvNr(adaDto.getAhvNr())
                .firstName(adaDto.getFirstName())
                .lastName(adaDto.getLastName())
                .role(adaDto.getRole())
                .build();
    }
}

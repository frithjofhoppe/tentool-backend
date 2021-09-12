package com.hofr.tentoolbackend.business.dto;

import com.hofr.tentoolbackend.database.model.AdaRole;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class AdaDto {
    public String id;
    public String ahvNr;
    public String firstName;
    public String lastName;
    public AdaRole role;
}

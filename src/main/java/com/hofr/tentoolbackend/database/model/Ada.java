package com.hofr.tentoolbackend.database.model;

import lombok.*;

import javax.persistence.*;
import java.util.List;
import java.util.UUID;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Ada {
    @Id
    public UUID id;
    public String ahvNr;
    public String firstName;
    public String lastName;
    @Enumerated(EnumType.ORDINAL)
    public AdaRole role;
    @OneToMany(mappedBy = "ada")
    public List<FormationControl> formationControlList;
}

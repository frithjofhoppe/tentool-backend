package com.hofr.tentoolbackend.database.model;

import javax.persistence.*;
import java.util.UUID;

@Entity
public class FormationControl {
    @Id
    public UUID id;
    public String name;
    public String topic;
    @Enumerated(EnumType.ORDINAL)
    public FormationControlEvaluation evaluation;
    @ManyToOne
    @JoinColumn(name="ada_id")
    public Ada ada;
}

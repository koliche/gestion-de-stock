package com.koliche.gestiondestock.dto;

import lombok.Builder;
import lombok.Data;

import javax.persistence.Column;
import java.time.Instant;

@Data
@Builder
public class VentesDto {
    private Integer id;
    private String code;

    private String commentaire;

    private Instant dateVente;
}

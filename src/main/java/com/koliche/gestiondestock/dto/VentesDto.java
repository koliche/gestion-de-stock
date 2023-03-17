package com.koliche.gestiondestock.dto;

import com.koliche.gestiondestock.model.Ventes;
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

    public VentesDto fromEntity(Ventes ventes){
        if (ventes == null){
            return null;
            // TODO: throw an exception
        }
        return VentesDto.builder()
                .id(ventes.getId())
                .build();
    }
    public Ventes toEntity(VentesDto ventesDto){
        if (ventesDto == null){
            return null;
            // TODO: throw an exception
        }
        Ventes ventes = new Ventes();
        ventes.setId(ventesDto.getId());

        return ventes;
    }
}

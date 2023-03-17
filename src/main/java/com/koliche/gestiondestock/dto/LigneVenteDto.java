package com.koliche.gestiondestock.dto;

import com.koliche.gestiondestock.model.LigneVente;
import lombok.Builder;
import lombok.Data;
import java.math.BigDecimal;

@Data
@Builder
public class LigneVenteDto {
    private Integer id;
    private VentesDto ventes;

    private BigDecimal quantite;

    public LigneVenteDto fromEntity(LigneVente ligneVente){
        if (ligneVente == null){
            return null;
            // TODO: throw an exception
        }
        return LigneVenteDto.builder()
                .id(ligneVente.getId())
                .build();
    }
    public LigneVente toEntity(LigneVenteDto ligneVenteDto){
        if (ligneVenteDto == null){
            return null;
            // TODO: throw an exception
        }
        LigneVente ligneVente = new LigneVente();
        ligneVente.setId(ligneVenteDto.getId());

        return ligneVente;
    }
}

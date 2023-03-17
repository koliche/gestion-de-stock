package com.koliche.gestiondestock.dto;

import com.koliche.gestiondestock.model.LigneCommandClient;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class LigneCommandClientDto {
    private Integer id;
    private ArticleDto article;
    private CommandeClientDto commandeClient;

    public LigneCommandClientDto fromEntity(LigneCommandClient ligneCommandClient){
        if (ligneCommandClient == null){
            return null;
            // TODO: throw an exception
        }
        return LigneCommandClientDto.builder()
                .id(ligneCommandClient.getId())
                .build();
    }
    public LigneCommandClient toEntity(LigneCommandClientDto ligneCommandClientDto){
        if (ligneCommandClientDto == null){
            return null;
            // TODO: throw an exception
        }
        LigneCommandClient ligneCommandClient = new LigneCommandClient();
        ligneCommandClient.setId(ligneCommandClientDto.getId());

        return ligneCommandClient;
    }
}

package com.koliche.gestiondestock.dto;

import com.koliche.gestiondestock.model.Article;
import com.koliche.gestiondestock.model.CommandeFournisseur;
import com.koliche.gestiondestock.model.LigneCommandClient;
import com.koliche.gestiondestock.model.LigneCommandFournisseur;
import lombok.Builder;
import lombok.Data;

import javax.persistence.ManyToOne;
@Data
@Builder
public class LigneCommandFournisseurDto {
    private Integer id;
    private ArticleDto article;
    private CommandeFournisseurDto commandeFournisseur;

    public LigneCommandFournisseurDto fromEntity(LigneCommandFournisseur ligneCommandFournisseur){
        if (ligneCommandFournisseur == null){
            return null;
            // TODO: throw an exception
        }
        return LigneCommandFournisseurDto.builder()
                .id(ligneCommandFournisseur.getId())
                .build();
    }
    public LigneCommandFournisseur toEntity(LigneCommandFournisseurDto ligneCommandFournisseurDto){
        if (ligneCommandFournisseurDto == null){
            return null;
            // TODO: throw an exception
        }
        LigneCommandFournisseur ligneCommandFournisseur = new LigneCommandFournisseur();
        ligneCommandFournisseur.setId(ligneCommandFournisseurDto.getId());

        return ligneCommandFournisseur;
    }
}

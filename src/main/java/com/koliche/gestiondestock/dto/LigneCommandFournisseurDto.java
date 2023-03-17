package com.koliche.gestiondestock.dto;

import com.koliche.gestiondestock.model.Article;
import com.koliche.gestiondestock.model.CommandeFournisseur;
import lombok.Builder;
import lombok.Data;

import javax.persistence.ManyToOne;
@Data
@Builder
public class LigneCommandFournisseurDto {
    private Integer id;
    private ArticleDto article;
    private CommandeFournisseurDto commandeFournisseur;
}

package com.koliche.gestiondestock.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class LigneCommandClientDto {
    private Integer id;
    private ArticleDto article;
    private CommandeClientDto commandeClient;
}

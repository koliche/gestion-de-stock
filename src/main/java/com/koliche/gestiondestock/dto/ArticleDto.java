package com.koliche.gestiondestock.dto;

import lombok.Builder;
import lombok.Data;
import java.math.BigDecimal;

@Builder
@Data
public class ArticleDto {
    private Integer id;
    private String codeArticle;

    private String designation;


    private BigDecimal ptixUnitaireHt;//ptixUnitaireHacheter


    private BigDecimal tauxTva;


    private BigDecimal ptixUnitaireTtc;

    private String photo;

    private CategoryDto category;
}

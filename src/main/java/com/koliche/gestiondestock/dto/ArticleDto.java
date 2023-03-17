package com.koliche.gestiondestock.dto;

import com.koliche.gestiondestock.model.Article;
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

    public ArticleDto fromEntity(Article article){
        if (article == null){
            return null;
            // TODO: throw an exception
        }
        return ArticleDto.builder()
                .id(article.getId())
                .designation(article.getDesignation())
                .codeArticle(article.getCodeArticle())
                .build();
    }
    public Article toEntity(ArticleDto articleDto){
        if (articleDto == null){
            return null;
            // TODO: throw an exception
        }
        Article article = new Article();
        article.setId(articleDto.getId());
        article.setCodeArticle(articleDto.getCodeArticle());
        article.setDesignation(articleDto.getDesignation());

        return article;
    }
}

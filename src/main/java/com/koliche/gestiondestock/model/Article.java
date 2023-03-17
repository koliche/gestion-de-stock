package com.koliche.gestiondestock.model;

import lombok.*;

import javax.persistence.*;
import java.math.BigDecimal;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Entity
@Table
public class Article extends AbstractEntity{
    @Column(name = "codeArticle")
    private String codeArticle;
    @Column(name = "designation")
    private String designation;

    @Column(name = "ptixUnitaireHt")
    private BigDecimal ptixUnitaireHt;//ptixUnitaireHacheter

    @Column(name = "tauxTva")
    private BigDecimal tauxTva;

    @Column(name = "ptixUnitaireTtc")
    private BigDecimal ptixUnitaireTtc;

    @Column(name = "photo")
    private String photo;

    @ManyToOne
    @JoinColumn(name = "idCategory")
    private Category category;
}

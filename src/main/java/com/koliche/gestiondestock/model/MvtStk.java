package com.koliche.gestiondestock.model;

import lombok.*;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.Instant;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Entity
@Table
public class MvtStk extends AbstractEntity{
    // MvtStk : Mouvment de stock
    @Column(name = "dateMvt")
    private Instant dateMvt;
    @Column(name = "quantite")
    private BigDecimal quantite;
    @Column(name = "typeMvStk")
    private TypeMvStk typeMvStk;
    @ManyToOne
    @JoinColumn(name = "idVentes")
    private Ventes ventes;

}

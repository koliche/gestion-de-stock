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
public class LigneVente extends AbstractEntity{
    @ManyToOne
    @JoinColumn(name = "idVentes")
    private Ventes ventes;

    @Column(name = "quantite")
    private BigDecimal quantite;
}

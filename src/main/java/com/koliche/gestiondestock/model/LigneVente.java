package com.koliche.gestiondestock.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

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

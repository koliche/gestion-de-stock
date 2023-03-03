package com.koliche.gestiondestock.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Entity
@Table
public class MvtStk extends AbstractEntity{
    // MvtStk : Mouvment de stock
    @ManyToOne
    @JoinColumn(name = "idVentes")
    private Ventes ventes;

}

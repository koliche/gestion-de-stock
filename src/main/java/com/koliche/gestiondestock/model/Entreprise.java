package com.koliche.gestiondestock.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Entity
@Table
public class Entreprise extends AbstractEntity{
    @Column(name = "nom")
    private String nom;

    @OneToMany(mappedBy = "entreprise")
    private List<Utilisateur> utilisateurs;


}

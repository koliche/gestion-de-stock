package com.koliche.gestiondestock.model;

import lombok.*;

import javax.persistence.*;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Entity
@Table
public class Fournisseur extends AbstractEntity {
    @Column(name = "nom")
    private String nom;
    @Column(name = "prenom")
    private String prenom;
    @Embedded
    private Adresse adresse;

    @Column(name = "photo")
    private String photo;
    @Column(name = "eamil")
    private String email;
    @Column(name = "numTel")
    private String numTel;
    @OneToMany(mappedBy = "fournisseurs")
    private List<CommandeFournisseur> commandeFournisseurs;
}

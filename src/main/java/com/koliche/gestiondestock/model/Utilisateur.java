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
public class Utilisateur extends AbstractEntity{
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
    @Column(name = "dateNaissance")
    private String dateNaissance;

    @ManyToOne
    @JoinColumn(name = "idEntreprise")
    private Entreprise entreprise;

    @ManyToMany(mappedBy = "utilisateur")
    private List<Roles> roles;

}

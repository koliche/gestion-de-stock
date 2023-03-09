package com.koliche.gestiondestock.model;

import lombok.*;

import javax.persistence.*;
import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Entity
@Table
public class Roles extends AbstractEntity{
    @Column(name = "roleName")
    private String roleName;

    @ManyToMany
    @JoinColumn(name = "idUtilisateurs")
    private List<Utilisateur> utilisateur;
}

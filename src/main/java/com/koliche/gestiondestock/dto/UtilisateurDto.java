package com.koliche.gestiondestock.dto;

import com.koliche.gestiondestock.model.Adresse;
import com.koliche.gestiondestock.model.Entreprise;
import com.koliche.gestiondestock.model.Roles;
import lombok.Builder;
import lombok.Data;

import java.util.List;
@Data
@Builder
public class UtilisateurDto {
    private Integer id;
    private String nom;

    private String prenom;

    private AdresseDto adresse;

    private String photo;

    private String email;

    private String dateNaissance;

    private EntrepriseDto entreprise;

    private List<RolesDto> roles;
}

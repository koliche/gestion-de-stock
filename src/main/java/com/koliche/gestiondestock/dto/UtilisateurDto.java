package com.koliche.gestiondestock.dto;

import com.koliche.gestiondestock.model.Adresse;
import com.koliche.gestiondestock.model.Entreprise;
import com.koliche.gestiondestock.model.Roles;
import com.koliche.gestiondestock.model.Utilisateur;
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

    public UtilisateurDto fromEntity(Utilisateur utilisateur){
        if (utilisateur == null){
            return null;
            // TODO: throw an exception
        }
        return UtilisateurDto.builder()
                .id(utilisateur.getId())
                .nom(utilisateur.getNom())
                .prenom(utilisateur.getPrenom())
                .photo(utilisateur.getPhoto())
                .adresse(AdresseDto.fromEntity(utilisateur.getAdresse()))
                .email(utilisateur.getEmail())
                .dateNaissance(utilisateur.getDateNaissance())
                .entreprise(EntrepriseDto.fromEntity(utilisateur.getEntreprise()))
                .build();
    }
    public Utilisateur toEntity(UtilisateurDto utilisateurDto){
        if (utilisateurDto == null){
            return null;
            // TODO: throw an exception
        }
        Utilisateur utilisateur = new Utilisateur();
        utilisateur.setId(utilisateurDto.getId());
        utilisateur.setNom(utilisateurDto.getNom());
        utilisateur.setPrenom(utilisateurDto.getPrenom());
        utilisateur.setPhoto(utilisateurDto.getPhoto());
        utilisateur.setEmail(utilisateurDto.getEmail());
        utilisateur.setDateNaissance(utilisateurDto.getDateNaissance());

        return utilisateur;
    }
}

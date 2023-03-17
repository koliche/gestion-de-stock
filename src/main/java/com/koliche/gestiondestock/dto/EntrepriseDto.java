package com.koliche.gestiondestock.dto;

import com.koliche.gestiondestock.model.Utilisateur;
import lombok.Builder;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.OneToMany;
import java.util.List;
@Data
@Builder
public class EntrepriseDto {
    private Integer id;
    private String nom;
    private String description;
    private String codeFiscal;
    private String photo;
    private String email;
    private String numTel;
    private List<UtilisateurDto> utilisateurs;
}

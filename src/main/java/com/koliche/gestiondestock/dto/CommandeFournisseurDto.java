package com.koliche.gestiondestock.dto;

import com.koliche.gestiondestock.model.Fournisseur;
import com.koliche.gestiondestock.model.LigneCommandFournisseur;
import lombok.Builder;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import java.time.Instant;
import java.util.List;
@Data
@Builder
public class CommandeFournisseurDto {
    private Integer id;
    private String code;
    private Instant dateCommande;
    private FournisseurDto fournisseurs;
    private List<LigneCommandFournisseurDto> ligneCommandFournisseurs;
}
package com.koliche.gestiondestock.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.koliche.gestiondestock.model.Adresse;
import com.koliche.gestiondestock.model.CommandeClient;
import lombok.Builder;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.OneToMany;
import java.util.List;
@Data
@Builder
public class ClientDto {
    private Integer id;
    private String nom;
    private String prenom;
    private AdresseDto adresse;
    private String photo;
    private String email;
    private String numTel;
    @JsonIgnore
    private List<CommandeClientDto> commandeClients;

}

package com.koliche.gestiondestock.dto;

import com.koliche.gestiondestock.model.Client;
import com.koliche.gestiondestock.model.LigneCommandClient;
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
public class CommandeClientDto {
    private Integer id;
    private String code;
    private Instant dateCommande;
    private ClientDto client;
    private List<LigneCommandClientDto> ligneCommandClients;
}

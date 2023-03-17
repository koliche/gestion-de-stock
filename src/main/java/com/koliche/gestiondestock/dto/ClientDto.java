package com.koliche.gestiondestock.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.koliche.gestiondestock.model.Adresse;
import com.koliche.gestiondestock.model.Client;
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

    public ClientDto fromEntity(Client client){
        if (client == null){
            return null;
            // TODO: throw an exception
        }
        return ClientDto.builder()
                .id(client.getId())
                .nom(client.getNom())
                .prenom(client.getPrenom())
                .photo(client.getPhoto())
                .email(client.getEmail())
                .numTel(client.getNumTel())
                .build();
    }
    public Client toEntity(ClientDto clientDto){
        if (clientDto == null){
            return null;
            // TODO: throw an exception
        }
        Client client = new Client();
        client.setId(clientDto.getId());
        client.setNom(clientDto.getNom());
        client.setPrenom(clientDto.getPrenom());
        client.setPhoto(clientDto.getPhoto());
        client.setEmail(clientDto.getEmail());
        client.setNumTel(clientDto.getNumTel());

        return client;
    }

}

package com.koliche.gestiondestock.dto;

import com.koliche.gestiondestock.model.Adresse;
import lombok.Builder;
import lombok.Data;

import javax.persistence.Column;
@Data
@Builder
public class AdresseDto {
    private String adresse1;
    private String adresse2;
    private String ville;
    private String codePostal;
    private String pays;

    public static AdresseDto fromEntity(Adresse adresse){
        if (adresse == null){
            return null;
            // TODO: throw an exception
        }
        return AdresseDto.builder()
                .adresse1(adresse.getAdresse1())
                .adresse2(adresse.getAdresse2())
                .codePostal(adresse.getCodePostal())
                .ville(adresse.getVille())
                .pays(adresse.getPays())
                .build();
    }

    public static Adresse toEntity(AdresseDto adresseDto){
        if (adresseDto == null){
            return null;
            // TODO: throw an exception
        }
        Adresse adresse = new Adresse();
        adresse.setAdresse1(adresseDto.getAdresse1());
        adresse.setAdresse2(adresseDto.getAdresse2());
        adresse.setCodePostal(adresseDto.getCodePostal());
        adresse.setVille(adresseDto.getVille());
        adresse.setPays(adresseDto.getPays());

        return adresse;
    }
}

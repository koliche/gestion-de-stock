package com.koliche.gestiondestock.validator;

import com.koliche.gestiondestock.dto.UtilisateurDto;
import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.List;

public class UtilisateurValidator {
    public static List<String> validate(UtilisateurDto utilisateurDto){
        List<String> errors = new ArrayList<>();
        if (utilisateurDto == null){
            errors.add("Veuillez reneigner les champes d'utilisateur");
            return errors;
        }
        if (!StringUtils.hasLength(utilisateurDto.getNom())){
            errors.add("Veuillez reneigner le nom d'utilisateur");
        }
        if (!StringUtils.hasLength(utilisateurDto.getPrenom())){
            errors.add("Veuillez reneigner le prenom d'utilisateur");
        }
        if (utilisateurDto.getDateNaissance() == null){
            errors.add("Veuillez reneigner la date de naissance d'utilisateur");
        }
        if (!StringUtils.hasLength(utilisateurDto.getAdresse().getAdresse1())){
            errors.add("Veuillez reneigner l' Adresse d'utilisateur");
        }
        if (!StringUtils.hasLength(utilisateurDto.getAdresse().getPays())){
            errors.add("Veuillez reneigner la pays d'utilisateur");
        }
        if (!StringUtils.hasLength(utilisateurDto.getAdresse().getVille())){
            errors.add("Veuillez reneigner la Ville d'utilisateur");
        }
        if (!StringUtils.hasLength(utilisateurDto.getEmail())){
            errors.add("Veuillez reneigner l' Email d'utilisateur");
        }

        return errors;
    }
}

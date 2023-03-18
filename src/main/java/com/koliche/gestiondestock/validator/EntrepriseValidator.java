package com.koliche.gestiondestock.validator;

import com.koliche.gestiondestock.dto.EntrepriseDto;
import com.koliche.gestiondestock.dto.FournisseurDto;
import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.List;

public class EntrepriseValidator {
    public static List<String> validate(EntrepriseDto dto) {
        List<String> errors = new ArrayList<>();

        if (dto == null){
            errors.add("Veuillez reneigner le nom d'Entreprise ");
            errors.add("Veuillez reneigner le prenom d'Entreprise ");
            errors.add("Veuillez reneigner l'email d'Entreprise ");
            errors.add("Veuillez reneigner le numTel d'Entreprise ");
            errors.add("Veuillez reneigner le Code Fiscal d'Entreprise ");
            return errors;
        }

        if (!StringUtils.hasLength(dto.getNom())){
            errors.add("Veuillez reneigner le nom d'Entreprise ");
        }
        if (!StringUtils.hasLength(dto.getEmail())){
            errors.add("Veuillez reneigner l'email d'Entreprise ");
        }
        if (!StringUtils.hasLength(dto.getNumTel())){
            errors.add("Veuillez reneigner le numTel d'Entreprise ");
        }
        if (!StringUtils.hasLength(dto.getCodeFiscal())){
            errors.add("Veuillez reneigner le Code Fiscal d'Entreprise ");
        }
        return errors;
    }
}

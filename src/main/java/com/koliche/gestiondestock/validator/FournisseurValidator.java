package com.koliche.gestiondestock.validator;

import com.koliche.gestiondestock.dto.FournisseurDto;
import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.List;

public class FournisseurValidator {
    public static List<String> validate(FournisseurDto dto) {
        List<String> errors = new ArrayList<>();

        if (dto == null){
            errors.add("Veuillez reneigner le nom de Fournisseur ");
            errors.add("Veuillez reneigner le prenom de Fournisseur ");
            errors.add("Veuillez reneigner l'email de Fournisseur ");
            errors.add("Veuillez reneigner le numTel de Fournisseur ");
            return errors;
        }

        if (!StringUtils.hasLength(dto.getNom())){
            errors.add("Veuillez reneigner le nom de Fournisseur ");
        }
        if (!StringUtils.hasLength(dto.getPrenom())){
            errors.add("Veuillez reneigner le prenom de Fournisseur ");
        }
        if (!StringUtils.hasLength(dto.getEmail())){
            errors.add("Veuillez reneigner l'email de Fournisseur ");
        }
        if (!StringUtils.hasLength(dto.getNumTel())){
            errors.add("Veuillez reneigner le numTel de Fournisseur ");
        }

        return errors;
    }
}

package com.koliche.gestiondestock.validator;

import com.koliche.gestiondestock.dto.ArticleDto;
import com.koliche.gestiondestock.dto.ClientDto;
import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.List;

public class ClientValidator {
    public static List<String> validate(ClientDto dto){
        List<String> errors = new ArrayList<>();

        if (dto == null){
            errors.add("Veuillez reneigner le nom de Client ");
            errors.add("Veuillez reneigner le prenom de Client ");
            errors.add("Veuillez reneigner l'email de Client ");
            errors.add("Veuillez reneigner le numTel de Client ");
            return errors;
        }

        if (!StringUtils.hasLength(dto.getNom())){
            errors.add("Veuillez reneigner le nom de Client ");
        }
        if (!StringUtils.hasLength(dto.getPrenom())){
            errors.add("Veuillez reneigner le prenom de Client ");
        }
        if (!StringUtils.hasLength(dto.getEmail())){
            errors.add("Veuillez reneigner l'email de Client ");
        }
        if (!StringUtils.hasLength(dto.getNumTel())){
            errors.add("Veuillez reneigner le numTel de Client ");
        }

        return errors;
    }
}

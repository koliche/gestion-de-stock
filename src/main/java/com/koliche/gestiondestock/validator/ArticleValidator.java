package com.koliche.gestiondestock.validator;

import com.koliche.gestiondestock.dto.ArticleDto;
import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.List;

public class ArticleValidator {
    public static List<String> validate(ArticleDto dto){
        List<String> errors = new ArrayList<>();

        if (dto == null){
            errors.add("Veuillez reneigner le code d' Article ");
            errors.add("Veuillez reneigner le Designation d' Article ");
            errors.add("Veuillez reneigner le prix unitaire Ht d' Article ");
            errors.add("Veuillez reneigner le prix unitaire Ttc d' Article ");
            errors.add("Veuillez reneigner le taux TVA  d' Article ");
            errors.add("Veuillez reneigner le category d' Article ");
            return errors;
        }

        if (!StringUtils.hasLength(dto.getCodeArticle())){
            errors.add("Veuillez reneigner le code d' Article ");
        }
        if (!StringUtils.hasLength(dto.getDesignation())){
            errors.add("Veuillez reneigner le Designation d' Article ");
        }
        if (dto.getPtixUnitaireHt() == null){
            errors.add("Veuillez reneigner le prix unitaire Ht d' Article ");
        }
        if (dto.getPtixUnitaireTtc() == null){
            errors.add("Veuillez reneigner le prix unitaire Ttc d' Article ");
        }
        if (dto.getTauxTva() == null){
            errors.add("Veuillez reneigner le taux TVA  d' Article ");
        }
        if (dto.getCategory() == null){
            errors.add("Veuillez reneigner le category d' Article ");
        }

        return errors;
    }
}

package com.koliche.gestiondestock.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.koliche.gestiondestock.model.Category;
import lombok.Builder;
import lombok.Data;
import java.util.List;
@Data
@Builder
public class CategoryDto {
    private Integer id;
    private String code;
    private String designation;
    @JsonIgnore
    private List<ArticleDto> articles;

    public CategoryDto fromEntity(Category category){
        if (category == null){
            return null;
            // TODO: throw an exception
        }
        //  Category -> CategoryDto
        return CategoryDto.builder().code(category.getCode())
                .id(category.getId())
                .designation(category.getDesignation())
                .build();

    }

    public Category toEntity(CategoryDto categoryDto){
        if (categoryDto == null){
            return null;
            // TODO: throw an exception
        }
        Category category = new Category();
        category.setId(categoryDto.getId());
        category.setCode(categoryDto.getCode());
        category.setDesignation(categoryDto.getDesignation());
        return category;
    }

}

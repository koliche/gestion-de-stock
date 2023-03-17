package com.koliche.gestiondestock.dto;

import com.koliche.gestiondestock.model.Roles;
import com.koliche.gestiondestock.model.Utilisateur;
import lombok.Builder;
import lombok.Data;

import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import java.util.List;
@Data
@Builder
public class RolesDto {
    private Integer id;
    private String roleName;

    private List<UtilisateurDto> utilisateur;

    public RolesDto fromEntity(Roles roles){
        if (roles == null){
            return null;
            // TODO: throw an exception
        }
        return RolesDto.builder()
                .id(roles.getId())
                .roleName(roles.getRoleName())
                .build();
    }
    public Roles toEntity(RolesDto rolesDto){
        if (rolesDto == null){
            return null;
            // TODO: throw an exception
        }
        Roles roles = new Roles();
        roles.setId(rolesDto.getId());
        roles.setRoleName(rolesDto.getRoleName());

        return roles;
    }
}

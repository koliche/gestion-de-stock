package com.koliche.gestiondestock.dto;

import com.koliche.gestiondestock.model.Ventes;
import lombok.Builder;
import lombok.Data;

import javax.persistence.Column;
import java.math.BigDecimal;

@Data
@Builder
public class LigneVenteDto {
    private Integer id;
    private VentesDto ventes;

    private BigDecimal quantite;
}

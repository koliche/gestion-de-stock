package com.koliche.gestiondestock.dto;

import com.koliche.gestiondestock.model.TypeMvStk;
import com.koliche.gestiondestock.model.Ventes;
import lombok.Builder;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.math.BigDecimal;
import java.time.Instant;
@Data
@Builder
public class MvtStkDto {
    private Integer id;
    private Instant dateMvt;
    private BigDecimal quantite;
    private TypeMvStk typeMvStk;
    private VentesDto ventes;
}

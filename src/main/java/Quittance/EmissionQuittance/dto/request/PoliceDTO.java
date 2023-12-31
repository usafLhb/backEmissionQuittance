package Quittance.EmissionQuittance.dto.request;

import Quittance.EmissionQuittance.entities.*;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.jetbrains.annotations.NotNull;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Calendar;
import java.util.Date;
import java.util.List;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class PoliceDTO {
    private Long id;
    private String codePolice;
    @NotNull
    private Long numClient ;
    @NotNull
    private String raisonSociale ;
    @NotNull
    private String adresse ;
    @JsonFormat(pattern = "dd-MM-yyyy")
    private Date dateEffet;

    private Double primeNette;
    private Double taxe ;
    private Double acce ;
    private Double tauxComm ;
    @JsonFormat(pattern = "dd-MM-yyyy")
    private Date dateTerme ;
    @JsonFormat(pattern = "dd-MM-yyyy")
    private  Date dateEtat;
    private Double ff ;
    private Double mnt_taxe_eve ;
    private Double mnt_taxe_parafiscale ;
    private PrdVersioncommercialeDTO prdVersioncommerciale;
    private RefVilleDTO refVille;
    private RefPoliceDTO refPolice;
 /*   private TermeDTO terme;
    private PeriodiciteDTO periodicite;
    private PrdVersioncommercialeDTO versionCommerciale;*/




}

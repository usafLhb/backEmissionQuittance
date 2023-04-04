package Quittance.EmissionQuittance.models.classes;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.jetbrains.annotations.NotNull;

import java.util.Calendar;
import java.util.List;


@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "Police")
public class PoliceEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(unique = true)
    private String codePolice;
    @NotNull
    private Long numClient ;
    @NotNull
    private String raisonSociale ;
    @NotNull
    private String adresse ;
    @NotNull
    private Calendar dateEffet;

    private Calendar dateEcheance;
    @NotNull
    private Double primeNette;
    private Double taxe ;
    private Double acce ;
    private Double tauxComm ;
    private Calendar dateTerme ;
    private  Calendar dateEtat;
    private Double nbrtete ;
    private Double revenueAnnuel ;
    private Double dureeS ;
    private Double ff ;
    private Double mnt_taxe_eve ;
    private Double mnt_taxe_parafiscale ;

    @OneToMany(mappedBy = "police")
    private List<QtcQuittanceEntity> quittances;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "VersionCommerciale_id")
    private PrdVersioncommercialeEntity versioncommerciale;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "Ville_id")
    private RefVilleEntity ville;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "RefPolice_ID")
    private RefPoliceEntity refPolice;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "Terme_id")
    private TermeEntity terme;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "Periodicite_id")
    private PeriodiciteEntity periodicite;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "Prd_VersionCommerciale_id")
    private PrdVersioncommercialeEntity prd_versionCommerciale;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "RefIntermediaire_id")
    private RefIntermediaireEntity refIntermediaire;


}

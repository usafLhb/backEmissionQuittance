package Quittance.EmissionQuittance.dto.request;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Data
@Table(name = "QTC_REMISE", schema = "CONVERGPARAM", catalog = "")
public class QtcRemiseDTO {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID", nullable = true)
    private Long id;
    @Basic
    @Column(name = "NUMEROREMISE", nullable = true)
    private Object numeroremise;
    @Basic
    @Column(name = "MONTANTREMISE", nullable = true)
    private Object montantremise;
    @Basic
    @Column(name = "SENS", nullable = true)
    private Object sens;
    @Basic
    @Column(name = "ETAT", nullable = true)
    private Object etat;
    @Basic
    @Column(name = "DATEETAT", nullable = true)
    private Object dateetat;
    @Basic
    @Column(name = "MONTANTCONSOMME", nullable = true)
    private Object montantconsomme;
    @Basic
    @Column(name = "DATECOMPTABILISATION", nullable = true)
    private Object datecomptabilisation;
    @Basic
    @Column(name = "IDOPERATIONPRELEVEMENT", nullable = true)
    private Object idoperationprelevement;
    @Basic
    @Column(name = "MONTANTDIFF", nullable = true)
    private Object montantdiff;
    @Basic
    @Column(name = "LETTREPRODUIT", nullable = true)
    private Object lettreproduit;
    @Basic
    @Column(name = "SOLDEINITIAL", nullable = true)
    private Object soldeinitial;


    @Entity
    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    @Table(name = "TERME")
    public static class Terme {
        @Id
        @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "terme_seq")
        private Long id;
        private String terme;

        @OneToMany(mappedBy = "terme")
        private List<PoliceDTO> policeEntities;

    }
}
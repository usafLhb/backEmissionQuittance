package Quittance.EmissionQuittance.entities;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "RefIntermediaire"  )
public class RefIntermediaireEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String libelle ;

    @OneToMany(mappedBy = "refIntermediaire")
    private List<IntermediaireEntity> intermediaire;
}

package tn.esprit.boukhitcyrine.entities;

import jakarta.persistence.*;
import lombok.*;
import java.util.List;
import java.util.Set;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder

public class Agence {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idAgence;

    private String nom;
    private String ville;
    private String adresse;
    private String telephone;

    @OneToMany(mappedBy = "agence", cascade = {CascadeType.PERSIST,CascadeType.REMOVE})
    private Set<Employe> employes;

    @OneToMany(mappedBy = "agence", cascade = {CascadeType.PERSIST,CascadeType.REMOVE})
    private Set<Vehicule> vehicules;
}

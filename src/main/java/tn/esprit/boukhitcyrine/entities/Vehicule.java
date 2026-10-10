package tn.esprit.boukhitcyrine.entities;

import jakarta.persistence.*;
import lombok.*;
import java.math.BigDecimal;
import java.util.List;
import java.util.Set;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Vehicule {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idVehicule;

    private String immatriculation;
    private String marque;
    private String modele;

    @Enumerated(EnumType.STRING)
    private CategorieVehicule categorie;

    private BigDecimal tarifJournalier;

    @Enumerated(EnumType.STRING)
    private StatutVehicule statut;

    @ManyToOne
    private Agence agence;

    @OneToMany(mappedBy = "vehicule", cascade = {CascadeType.PERSIST, CascadeType.REMOVE})
    private Set<Maintenance> maintenances;

    @ManyToMany
    private Set<Equipement> equipements;

    @OneToMany(mappedBy = "vehicule")
    private Set<Reservation> reservations;
}

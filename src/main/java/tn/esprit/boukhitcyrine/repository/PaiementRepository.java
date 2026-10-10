package tn.esprit.boukhitcyrine.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.boukhitcyrine.entities.Paiement;

public interface PaiementRepository extends JpaRepository<Paiement, Long> {
}

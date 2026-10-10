package tn.esprit.boukhitcyrine.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.boukhitcyrine.entities.Contrat;

public interface ContratRepository extends JpaRepository<Contrat, Long> {
}

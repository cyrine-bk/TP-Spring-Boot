package tn.esprit.boukhitcyrine.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.boukhitcyrine.entities.Vehicule;

public interface VehiculeRepository extends JpaRepository<Vehicule, Long> {
}

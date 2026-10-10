package tn.esprit.boukhitcyrine.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.boukhitcyrine.entities.Employe;

public interface EmployeRepository extends JpaRepository<Employe, Long> {
}

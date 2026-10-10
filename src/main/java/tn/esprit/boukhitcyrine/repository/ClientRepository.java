package tn.esprit.boukhitcyrine.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.boukhitcyrine.entities.Client;

public interface ClientRepository extends JpaRepository<Client, Long> {
}

package tn.esprit.boukhitcyrine.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.boukhitcyrine.entities.Reservation;

public interface ReservationRepository extends JpaRepository<Reservation, Long> {
}

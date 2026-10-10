package tn.esprit.boukhitcyrine.services.impl;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import tn.esprit.boukhitcyrine.entities.Reservation;
import tn.esprit.boukhitcyrine.repository.ReservationRepository;
import tn.esprit.boukhitcyrine.services.IReservationService;

import java.util.Set;
import java.util.HashSet;

@Service
@AllArgsConstructor
@Slf4j
public class ReservationServiceImpl implements IReservationService {

    private ReservationRepository reservationRepository;

    @Override
    public Set<Reservation> retrieveAllReservations() {
        return new HashSet<>(reservationRepository.findAll());
    }

    @Override
    public Reservation addReservation(Reservation r) {
        return reservationRepository.save(r);
    }

    @Override
    public Reservation updateReservation(Reservation r) {
        return reservationRepository.save(r);
    }

    @Override
    public Reservation retrieveReservation(Long idReservation) {
        return reservationRepository.findById(idReservation).orElse(null);
    }

    @Override
    public void removeReservation(Long idReservation) {
        reservationRepository.deleteById(idReservation);
    }
}

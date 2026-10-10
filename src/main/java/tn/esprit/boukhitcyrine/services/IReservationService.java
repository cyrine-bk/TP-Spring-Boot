package tn.esprit.boukhitcyrine.services;

import tn.esprit.boukhitcyrine.entities.Reservation;
import java.util.Set;

public interface IReservationService {
    Set<Reservation> retrieveAllReservations();
    Reservation addReservation(Reservation r);
    Reservation updateReservation(Reservation r);
    Reservation retrieveReservation(Long idReservation);
    void removeReservation(Long idReservation);
}

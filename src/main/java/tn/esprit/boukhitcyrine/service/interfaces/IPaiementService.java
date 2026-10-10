package tn.esprit.boukhitcyrine.service.interfaces;

import tn.esprit.boukhitcyrine.entities.Paiement;
import java.util.Set;

public interface IPaiementService {
    Set<Paiement> retrieveAllPaiements();
    Paiement addPaiement(Paiement p);
    Paiement updatePaiement(Paiement p);
    Paiement retrievePaiement(Long idPaiement);
    void removePaiement(Long idPaiement);
}

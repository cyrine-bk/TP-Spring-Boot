package tn.esprit.boukhitcyrine.services;

import tn.esprit.boukhitcyrine.entities.Vehicule;
import java.util.Set;

public interface IVehiculeService {
    Set<Vehicule> retrieveAllVehicules();
    Vehicule addVehicule(Vehicule v);
    Vehicule updateVehicule(Vehicule v);
    Vehicule retrieveVehicule(Long idVehicule);
    void removeVehicule(Long idVehicule);
}

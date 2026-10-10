package tn.esprit.boukhitcyrine.service.interfaces;

import tn.esprit.boukhitcyrine.entities.Equipement;
import java.util.Set;

public interface IEquipementService {
    Set<Equipement> retrieveAllEquipements();
    Equipement addEquipement(Equipement e);
    Equipement updateEquipement(Equipement e);
    Equipement retrieveEquipement(Long idEquipement);
    void removeEquipement(Long idEquipement);
}

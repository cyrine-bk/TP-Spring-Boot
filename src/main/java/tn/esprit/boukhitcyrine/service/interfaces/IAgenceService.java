package tn.esprit.boukhitcyrine.service.interfaces;

import tn.esprit.boukhitcyrine.entities.Agence;
import java.util.Set;

public interface IAgenceService {
    Set<Agence> retrieveAllAgences();
    Agence addAgence(Agence a);
    Agence updateAgence(Agence a);
    Agence retrieveAgence(Long idAgence);
    void removeAgence(Long idAgence);
}

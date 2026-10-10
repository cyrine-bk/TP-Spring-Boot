package tn.esprit.boukhitcyrine.service.interfaces;

import tn.esprit.boukhitcyrine.entities.Contrat;
import java.util.Set;

public interface IContratService {
    Set<Contrat> retrieveAllContrats();
    Contrat addContrat(Contrat c);
    Contrat updateContrat(Contrat c);
    Contrat retrieveContrat(Long idContrat);
    void removeContrat(Long idContrat);
}

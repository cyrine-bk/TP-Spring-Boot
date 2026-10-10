package tn.esprit.boukhitcyrine.service.impl;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import tn.esprit.boukhitcyrine.entities.Contrat;
import tn.esprit.boukhitcyrine.repository.ContratRepository;
import tn.esprit.boukhitcyrine.service.interfaces.IContratService;

import java.util.Set;
import java.util.HashSet;

@Service
@AllArgsConstructor
@Slf4j
public class ContratServiceImpl implements IContratService {

    private ContratRepository contratRepository;

    @Override
    public Set<Contrat> retrieveAllContrats() {
        return new HashSet<>(contratRepository.findAll());
    }

    @Override
    public Contrat addContrat(Contrat c) {
        return contratRepository.save(c);
    }

    @Override
    public Contrat updateContrat(Contrat c) {
        return contratRepository.save(c);
    }

    @Override
    public Contrat retrieveContrat(Long idContrat) {
        return contratRepository.findById(idContrat).orElse(null);
    }

    @Override
    public void removeContrat(Long idContrat) {
        contratRepository.deleteById(idContrat);
    }
}

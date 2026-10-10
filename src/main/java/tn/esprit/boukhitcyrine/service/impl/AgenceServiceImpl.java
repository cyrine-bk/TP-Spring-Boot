package tn.esprit.boukhitcyrine.service.impl;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import tn.esprit.boukhitcyrine.entities.Agence;
import tn.esprit.boukhitcyrine.repository.AgenceRepository;
import tn.esprit.boukhitcyrine.service.interfaces.IAgenceService;

import java.util.Set;
import java.util.HashSet;

@Service
@AllArgsConstructor
@Slf4j
public class AgenceServiceImpl implements IAgenceService {

    private AgenceRepository agenceRepository;

    @Override
    public Set<Agence> retrieveAllAgences() {
        return new HashSet<>(agenceRepository.findAll());
    }

    @Override
    public Agence addAgence(Agence a) {
        return agenceRepository.save(a);
    }

    @Override
    public Agence updateAgence(Agence a) {
        return agenceRepository.save(a);
    }

    @Override
    public Agence retrieveAgence(Long idAgence) {
        return agenceRepository.findById(idAgence).orElse(null);
    }

    @Override
    public void removeAgence(Long idAgence) {
        agenceRepository.deleteById(idAgence);
    }
}

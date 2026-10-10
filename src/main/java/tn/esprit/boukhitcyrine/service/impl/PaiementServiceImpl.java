package tn.esprit.boukhitcyrine.service.impl;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import tn.esprit.boukhitcyrine.entities.Paiement;
import tn.esprit.boukhitcyrine.repository.PaiementRepository;
import tn.esprit.boukhitcyrine.service.interfaces.IPaiementService;

import java.util.Set;
import java.util.HashSet;

@Service
@AllArgsConstructor
@Slf4j
public class PaiementServiceImpl implements IPaiementService {

    private PaiementRepository paiementRepository;

    @Override
    public Set<Paiement> retrieveAllPaiements() {
        return new HashSet<>(paiementRepository.findAll());
    }

    @Override
    public Paiement addPaiement(Paiement p) {
        return paiementRepository.save(p);
    }

    @Override
    public Paiement updatePaiement(Paiement p) {
        return paiementRepository.save(p);
    }

    @Override
    public Paiement retrievePaiement(Long idPaiement) {
        return paiementRepository.findById(idPaiement).orElse(null);
    }

    @Override
    public void removePaiement(Long idPaiement) {
        paiementRepository.deleteById(idPaiement);
    }
}

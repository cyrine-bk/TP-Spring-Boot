package tn.esprit.boukhitcyrine.service.impl;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import tn.esprit.boukhitcyrine.entities.Equipement;
import tn.esprit.boukhitcyrine.repository.EquipementRepository;
import tn.esprit.boukhitcyrine.service.interfaces.IEquipementService;

import java.util.Set;
import java.util.HashSet;

@Service
@AllArgsConstructor
@Slf4j
public class EquipementServiceImpl implements IEquipementService {

    private EquipementRepository equipementRepository;

    @Override
    public Set<Equipement> retrieveAllEquipements() {
        return new HashSet<>(equipementRepository.findAll());
    }

    @Override
    public Equipement addEquipement(Equipement e) {
        return equipementRepository.save(e);
    }

    @Override
    public Equipement updateEquipement(Equipement e) {
        return equipementRepository.save(e);
    }

    @Override
    public Equipement retrieveEquipement(Long idEquipement) {
        return equipementRepository.findById(idEquipement).orElse(null);
    }

    @Override
    public void removeEquipement(Long idEquipement) {
        equipementRepository.deleteById(idEquipement);
    }
}

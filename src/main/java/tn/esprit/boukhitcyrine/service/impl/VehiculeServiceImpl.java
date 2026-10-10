package tn.esprit.boukhitcyrine.service.impl;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import tn.esprit.boukhitcyrine.entities.Vehicule;
import tn.esprit.boukhitcyrine.repository.VehiculeRepository;
import tn.esprit.boukhitcyrine.service.interfaces.IVehiculeService;

import java.util.Set;
import java.util.HashSet;

@Service
@AllArgsConstructor
@Slf4j
public class VehiculeServiceImpl implements IVehiculeService {

    private VehiculeRepository vehiculeRepository;

    @Override
    public Set<Vehicule> retrieveAllVehicules() {
        return new HashSet<>(vehiculeRepository.findAll());
    }

    @Override
    public Vehicule addVehicule(Vehicule v) {
        return vehiculeRepository.save(v);
    }

    @Override
    public Vehicule updateVehicule(Vehicule v) {
        return vehiculeRepository.save(v);
    }

    @Override
    public Vehicule retrieveVehicule(Long idVehicule) {
        return vehiculeRepository.findById(idVehicule).orElse(null);
    }

    @Override
    public void removeVehicule(Long idVehicule) {
        vehiculeRepository.deleteById(idVehicule);
    }
}

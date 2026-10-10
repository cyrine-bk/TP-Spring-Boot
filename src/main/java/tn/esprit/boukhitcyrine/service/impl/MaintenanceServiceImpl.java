package tn.esprit.boukhitcyrine.service.impl;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import tn.esprit.boukhitcyrine.entities.Maintenance;
import tn.esprit.boukhitcyrine.repository.MaintenanceRepository;
import tn.esprit.boukhitcyrine.service.interfaces.IMaintenanceService;

import java.util.Set;
import java.util.HashSet;

@Service
@AllArgsConstructor
@Slf4j
public class MaintenanceServiceImpl implements IMaintenanceService {

    private MaintenanceRepository maintenanceRepository;

    @Override
    public Set<Maintenance> retrieveAllMaintenances() {
        return new HashSet<>(maintenanceRepository.findAll());
    }

    @Override
    public Maintenance addMaintenance(Maintenance m) {
        return maintenanceRepository.save(m);
    }

    @Override
    public Maintenance updateMaintenance(Maintenance m) {
        return maintenanceRepository.save(m);
    }

    @Override
    public Maintenance retrieveMaintenance(Long idMaintenance) {
        return maintenanceRepository.findById(idMaintenance).orElse(null);
    }

    @Override
    public void removeMaintenance(Long idMaintenance) {
        maintenanceRepository.deleteById(idMaintenance);
    }
}

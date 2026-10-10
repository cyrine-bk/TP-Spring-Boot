package tn.esprit.boukhitcyrine.service.interfaces;

import tn.esprit.boukhitcyrine.entities.Maintenance;
import java.util.Set;

public interface IMaintenanceService {
    Set<Maintenance> retrieveAllMaintenances();
    Maintenance addMaintenance(Maintenance m);
    Maintenance updateMaintenance(Maintenance m);
    Maintenance retrieveMaintenance(Long idMaintenance);
    void removeMaintenance(Long idMaintenance);
}

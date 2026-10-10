package tn.esprit.boukhitcyrine.service.interfaces;

import tn.esprit.boukhitcyrine.entities.Employe;
import java.util.Set;

public interface IEmployeService {
    Set<Employe> retrieveAllEmployes();
    Employe addEmploye(Employe e);
    Employe updateEmploye(Employe e);
    Employe retrieveEmploye(Long idEmploye);
    void removeEmploye(Long idEmploye);
}

package tn.esprit.boukhitcyrine.service.impl;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import tn.esprit.boukhitcyrine.entities.Employe;
import tn.esprit.boukhitcyrine.repository.EmployeRepository;
import tn.esprit.boukhitcyrine.service.interfaces.IEmployeService;

import java.util.Set;
import java.util.HashSet;

@Service
@AllArgsConstructor
@Slf4j
public class EmployeServiceImpl implements IEmployeService {

    private EmployeRepository employeRepository;

    @Override
    public Set<Employe> retrieveAllEmployes() {
        return new HashSet<>(employeRepository.findAll());
    }

    @Override
    public Employe addEmploye(Employe e) {
        return employeRepository.save(e);
    }

    @Override
    public Employe updateEmploye(Employe e) {
        return employeRepository.save(e);
    }

    @Override
    public Employe retrieveEmploye(Long idEmploye) {
        return employeRepository.findById(idEmploye).orElse(null);
    }

    @Override
    public void removeEmploye(Long idEmploye) {
        employeRepository.deleteById(idEmploye);
    }
}

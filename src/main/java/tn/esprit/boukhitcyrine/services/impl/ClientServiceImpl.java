package tn.esprit.boukhitcyrine.services.impl;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import tn.esprit.boukhitcyrine.entities.Client;
import tn.esprit.boukhitcyrine.repository.ClientRepository;
import tn.esprit.boukhitcyrine.services.IClientService;

import java.util.Set;
import java.util.HashSet;

@Service
@AllArgsConstructor
@Slf4j
public class ClientServiceImpl implements IClientService {

    private ClientRepository clientRepository;

    @Override
    public Set<Client> retrieveAllClients() {
        return new HashSet<>(clientRepository.findAll());
    }

    @Override
    public Client addClient(Client c) {
        return clientRepository.save(c);
    }

    @Override
    public Client updateClient(Client c) {
        return clientRepository.save(c);
    }

    @Override
    public Client retrieveClient(Long idClient) {
        return clientRepository.findById(idClient).orElse(null);
    }

    @Override
    public void removeClient(Long idClient) {
        clientRepository.deleteById(idClient);
    }
}

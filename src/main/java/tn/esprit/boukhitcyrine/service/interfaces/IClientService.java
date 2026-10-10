package tn.esprit.boukhitcyrine.service.interfaces;

import tn.esprit.boukhitcyrine.entities.Client;
import java.util.Set;

public interface IClientService {
    Set<Client> retrieveAllClients();
    Client addClient(Client c);
    Client updateClient(Client c);
    Client retrieveClient(Long idClient);
    void removeClient(Long idClient);
}

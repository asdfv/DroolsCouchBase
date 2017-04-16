package by.intexsoft.vasili.drools.service;

import by.intexsoft.vasili.drools.model.Client;

import java.util.List;

public interface ClientService {

    void processClients(List<Client> clients);

    List<Client> getClients(int clientsCount, int subsInClientCount);

    Client saveToDB(Client client);
}

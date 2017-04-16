package by.intexsoft.vasili.drools.service.impl;

import by.intexsoft.vasili.drools.model.Client;
import by.intexsoft.vasili.drools.model.Subscriber;
import by.intexsoft.vasili.drools.repository.ClientRepository;
import by.intexsoft.vasili.drools.service.ClientService;
import org.drools.runtime.StatelessKnowledgeSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Service("ClientService")
public class ClientServiceImpl implements ClientService {

    private final ApplicationContext applicationContext;
    private final ClientRepository clientRepository;

    @Autowired
    public ClientServiceImpl(ApplicationContext applicationContext, ClientRepository clientRepository) {
        this.applicationContext = applicationContext;
        this.clientRepository = clientRepository;
    }

    /**
     * Insert list of {@link Client} to drools box
     */
    @Override
    public void processClients(List<Client> clients) {
        StatelessKnowledgeSession statelessKnowledgeSession = (StatelessKnowledgeSession) applicationContext
                .getBean("productSession");
        statelessKnowledgeSession.execute(clients);
    }

    /**
     * Create fake clients
     * @param clientsCount - count of needed clients
     * @param subsInClientCount - count of needed subscribers for each manager
     * @return list of {@link Client}
     */
    @Override
    public List<Client> getClients(int clientsCount, int subsInClientCount) {

        List<Client> clients = new ArrayList<>();

        // Create clients
        for (int index = 0; index < clientsCount; index++) {
            clients.add(new Client(String.valueOf(getRandomInt())));
        }
        // Create subscribers for each client
        for (int index = 0; index < subsInClientCount; index++) {
            clients.forEach(client -> client.addSubscriber(new Subscriber(getRandomInt(), getRandomInt(), client)));
        }
        return clients;
    }

    @Override
    public void deleteAll() {
        clientRepository.deleteAll();
    }

    /**
     * Save {@link Client} to DB
     * @param client - client to save
     * @return saved {@link Client}
     */
    public Client save(Client client) {
        return clientRepository.save(client);
    }

    private int getRandomInt() {
        Random random = new Random();
        return random.nextInt(9999);
    }

}